# Install MariaDB
1. Download file di https://mariadb.com/downloads/?showall=1&tab=mariadbtx&group=mariadb_server&version=10.4.11
2. Buka README.md file kemudian ikuti proses sbb :
```
sudo su
```
untuk masuk sebagai root,
```
cd /opt
tar -xf /home/pika/mariadb-10.4.11-ubuntu-bionic-amd64-debs.tar
```
untuk ekstrak file
```
mariadb-10.4.11-ubuntu-bionic-amd64-debs.tar/setup_repository
```
untuk menambah file ke repository ubuntu
```
apt-get update && apt-get install mariadb-server
``` 
untuk install mariadb server
```
apt-cache show mariadb-server | grep Version
```
untuk melihat versi yang tersedia nb: cukup pilih satu
```
apt-get install mariadb-server=1:10.1.43-0ubuntu0.18.04.1
```
install proses sesuai versi ubuntu
```
pika@pika-PC:~$ mysql -V
mysql  Ver 15.1 Distrib 10.1.43-MariaDB, for debian-linux-gnu (x86_64) using readline 5.2
```
untuk cek versi mariadb yang terinstall.
untuk mengatur pass gunakan 
```
sudo mysql_secure_installation
```
# Atur di gradle 
atur ```gradle.build``` dengan depedensi sbb,
```
implementation 'org.mariadb.jdbc:mariadb-java-client:2.1.2'
```
# Catatan 
Pada kasus saya terjadi masalah ketika vscode di koneksi kepada mariadb sehingga saya menghapus user ```root``` dan membuat ulang dengan cara,
```
drop user 'root'@'localhost';
```
kemudian membuat ulang tanpa password,
```
create user 'root'@'localhost' identified by '';
```
serta memberi semua hak akses yang ada,
```
grant all privileges on *.* to 'root'@'localhost' with grant option;
```
# Kasus 2 ada di folder Kasus2 untuk menampilkan isi database

