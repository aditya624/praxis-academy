# NoSQL
1. MongoDB termasuk dalam NoSQL
# NewSQL
1. CockCrouchDB
# Instaling MongoDB
```
$ wget -qO - https://www.mongodb.org/static/pgp/server-4.2.asc | sudo apt-key add -
```
jika outputnya ```ok``` lanjutkan, tetapi jika error maka lakukan
```
$ sudo apt-get install gnupg
$ wget -qO - https://www.mongodb.org/static/pgp/server-4.2.asc | sudo apt-key add -
```
Jika ```ok```
```
$ echo "deb [ arch=amd64 ] https://repo.mongodb.org/apt/ubuntu bionic/mongodb-org/4.2 multiverse" | sudo tee /etc/apt/sources.list.d/mongodb-org-4.2.list
$ sudo apt-get update
```
## Untuk Proses Instalasi 
Diterminal
```
$ sudo apt-get install -y mongodb-org
```
Instalasi Version
```
$ echo "mongodb-org hold" | sudo dpkg --set-selections
$ echo "mongodb-org-server hold" | sudo dpkg --set-selections
$ echo "mongodb-org-shell hold" | sudo dpkg --set-selections
$ echo "mongodb-org-mongos hold" | sudo dpkg --set-selections
$ echo "mongodb-org-tools hold" | sudo dpkg --set-selections
```
## Untuk Service
### Start
```
$ sudo service mongod start
```
### Cek status
```
$ sudo service mongod status
```
### Stop
```
$ sudo service mongod stop
```
### Start
```
$ sudo service mongod restart
```
### Untuk memulai 
arahkan terminal ke /usr/bin/
```
$ mongo
```
### Untuk Uninstall gunakan
```
$ sudo service mongod stop
$ sudo apt-get purge mongodb-org*
$ sudo rm -r /var/log/mongodb
$ sudo rm -r /var/lib/mongodb
```
# Rangkuman
Mongodb sudah tidak menggunakan SQL perbedaan perintahnya sbb,
```
SQL
SELECT * FROM inventory
```
dengan 
```
NoSQL
db.inventory.find( {} )
```

```
SQL
SELECT * FROM inventory WHERE status = "A" AND qty '<' 30
```
dengan
```
NoSQL
db.inventory.find( { status: "A", qty: { $lt: 30 } } )
```

# 4. Gradle 
Untuk penggunaan di gradle tambahkan depedensi sbb,
```
compile 'org.mongodb:mongodb-driver-reactivestreams:1.11.0'
```

# 5. Instaling CockroachDB
## Menggunakan Docker
```
sudo docker pull cockroachdb/cockroach:v19.2.2
```
## Start dengan docker
Untuk mengatasi izin yang ditolak setelah install docker gunakan
```
If you are using Ubuntu Core 16,

Connect the docker:home plug as it's not auto-connected by default:

$ sudo snap connect docker:home

If you are using an alternative snap-compatible Linux distribution ("classic" in snap lingo), and would like to run docker as a normal user:

Create and join the docker group.

$ sudo addgroup --system docker
$ sudo adduser $USER docker
$ newgrp docker

You will also need to disable and re-enable the docker snap if you added the group while it was running.

$ sudo snap disable docker
$ sudo snap enable docker
```
# 6. Getting Started
### FirstNode
```
docker run -d --name=roach1 --hostname=roach1 --net=roachnet -p 26257:26257 -p 8080:8080  -v "${PWD}/cockroach-data/roach1:/cockroach/cockroach-data"  cockroachdb/cockroach:v19.2.2 start --insecure --join=roach1,roach2,roach3
```
### Tambah 2 Node lagi 
```
docker run -d --name=roach2 --hostname=roach2 --net=roachnet -v "${PWD}/cockroach-data/roach2:/cockroach/cockroach-data" cockroachdb/cockroach:v19.2.2 start --insecure --join=roach1,roach2,roach3

docker run -d --name=roach3 --hostname=roach3 --net=roachnet -v "${PWD}/cockroach-data/roach3:/cockroach/cockroach-data" cockroachdb/cockroach:v19.2.2 start --insecure --join=roach1,roach2,roach3 
```
### inisialisasi Cluster
```
docker exec -it roach1 ./cockroach init --insecure
```
### Startup Detail
```
grep 'node starting' cockroach-data/roach1/logs/cockroach.log -A 11
```
## Build SQL
### Start
```
docker exec -it roach1 ./cockroach sql --insecure
```
# Jika menggunakan install menggunaan binary geting started menjadi ,
### FirstNode
```
cockroach start --insecure --store=node1 --listen-addr=localhost:26257 --http-addr=localhost:8080 --join=localhost:26257,localhost:26258,localhost:26259 --background
```
### Tambah 2 Node lagi 
```
cockroach start --insecure --store=node2 --listen-addr=localhost:26258 --http-addr=localhost:8081 --join=localhost:26257,localhost:26258,localhost:26259 --background

cockroach start --insecure --store=node3 --listen-addr=localhost:26259 --http-addr=localhost:8082 --join=localhost:26257,localhost:26258,localhost:26259 --background
```
### inisialisasi Cluster
```
cockroach init --insecure --host=localhost:26257
```
### Startup Detail
```
grep 'node starting' node1/logs/cockroach.log -A 11
```
## Build SQL
### Start
```
cockroach sql --insecure --host=localhost:26257
```
## Jika laptop di restart lakukan
```
cockroach start --insecure --store=node1 --listen-addr=localhost:26257 --http-addr=localhost:8080 --join=localhost:26257,localhost:26258,localhost:26259 --background
```
dan 
```
cockroach sql --insecure --host=localhost:26257
```
untuk masuk ke db lagi
### Run basic Statement 
```
CREATE DATABASE bank;
CREATE TABLE bank.accounts (id INT PRIMARY KEY, balance DECIMAL);
INSERT INTO bank.accounts VALUES (1, 1000.50);
SELECT * FROM bank.accounts;
 id | balance
+----+---------+
   1 | 1000.50
(1 row)
```

### Keluar dari node roach1
```
\q
```
### Masuk dengan node roach2
```
docker exec -it roach1 ./cockroach sql --insecure
```
### Running lagi
```
SELECT * FROM bank.accounts;
  id | balance
+----+---------+
   1 | 1000.50
```
Hasil roach2 sama dengan roach1.
## Untuk simulasi client traffic.
```
docker exec -it roach1 ./cockroach workload init movr 'postgresql://root@roach1:26257?sslmode=disable'
```
sedngkan untuk durasi 5 menit 
```
docker exec -it roach1 ./cockroach workload run movr --duration=5m 'postgresql://root@roach1:26257?sslmode=disable'
```
## Untuk admin UI 
silahkan akses ``` http://localhost:8080 ```
## Untuk stop dan remove 
```
docker stop roach1 roach2 roach3
docker rm roach1 roach2 roach3
```
If you do not plan to restart the cluster, you may want to remove the nodes' data stores:
```
sudo rm -rf cockroach-data
```
# Kasus 
## 1. Buat database, table, atribut serta datanya seperti pada cockroachdb. 
## 2. Buat gradle dengan ```gradle init```
## 3. Pada ```gradle.build``` isi depedensi dengan
```implementation 'org.postgresql:postgresql:42.2.0'```


# CATATAN COCKCROACH MENGGUNAKAN Name = Mydb
