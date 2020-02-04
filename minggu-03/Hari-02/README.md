# Latihan 1
## 1. Getting Started
Pada vs code ```ctrl+shift+P``` ketikan ```Create Maven Project``` 

atau agar lebih mudah buka terminal arahkan ke direktory yang akan di buat project ketikan
```
mvn archetype:generate -DarchetypeArtifactId=jersey-quickstart-grizzly2 \
-DarchetypeGroupId=org.glassfish.jersey.archetypes -DinteractiveMode=false \
-DgroupId=com.example -DartifactId=simple-service -Dpackage=com.example \
-DarchetypeVersion=2.30
```
untuk membuat maven project secara instan.

jika gagal install dulu maven di laptop anda dengan 
```
sudo apt update
sudo apt install maven
```
Sehingga menghasilkan projek pada folder ```simpel-service```

## 2. Jalankan Projek
ketikan ```mvn clean test``` akan menghasilkan result sukses
```
[INFO] Scanning for projects...[INFO] 
[INFO] ---------------------< com.example:simple-service >---------------------
[INFO] Building simple-service 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ simple-service ---
[INFO] Deleting /home/pika/praxis-academy/minggu-03/Hari-02/simple-service/target
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ simple-service ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/pika/praxis-academy/minggu-03/Hari-02/simple-service/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:2.5.1:compile (default-compile) @ simple-service ---
[INFO] Compiling 2 source files to /home/pika/praxis-academy/minggu-03/Hari-02/simple-service/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ simple-service ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/pika/praxis-academy/minggu-03/Hari-02/simple-service/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:2.5.1:testCompile (default-testCompile) @ simple-service ---
[INFO] Compiling 1 source file to /home/pika/praxis-academy/minggu-03/Hari-02/simple-service/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ simple-service ---
[INFO] Surefire report directory: /home/pika/praxis-academy/minggu-03/Hari-02/simple-service/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.example.MyResourceTest
Feb 04, 2020 10:57:10 AM org.glassfish.grizzly.http.server.NetworkListener start
INFO: Started listener bound to [localhost:8080]
Feb 04, 2020 10:57:10 AM org.glassfish.grizzly.http.server.HttpServer start
INFO: [HttpServer] Started.
Feb 04, 2020 10:57:10 AM org.glassfish.grizzly.http.server.NetworkListener shutdownNow
INFO: Stopped listener bound to [localhost:8080]
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.851 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.340 s
[INFO] Finished at: 2020-02-04T10:57:11+07:00
[INFO] ------------------------------------------------------------------------
```

kemudian jika dijalankan programnya dengan ```mvn exec:java``` akan menghasilkan 
```
[INFO] Scanning for projects...
[INFO] 
[INFO] ---------------------< com.example:simple-service >---------------------
[INFO] Building simple-service 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] >>> exec-maven-plugin:1.2.1:java (default-cli) > validate @ simple-service >>>
[INFO] 
[INFO] <<< exec-maven-plugin:1.2.1:java (default-cli) < validate @ simple-service <<<
[INFO] 
[INFO] 
[INFO] --- exec-maven-plugin:1.2.1:java (default-cli) @ simple-service ---
Feb 04, 2020 11:00:25 AM org.glassfish.grizzly.http.server.NetworkListener start
INFO: Started listener bound to [localhost:8080]
Feb 04, 2020 11:00:25 AM org.glassfish.grizzly.http.server.HttpServer start
INFO: [HttpServer] Started.
Jersey app started with WADL available at http://localhost:8080/myapp/application.wadl
Hit enter to stop it...
```

Dalam keadaan running seperti itu buka terminal atau di web browser dan ketikan 
```
curl http://localhost:8080/myapp/myresource
Got it!
```
yang artinya program berhasil berjalan 
```
pika@pika-PC:~$ curl -i http://localhost:8080/myapp/myresource
HTTP/1.1 200 OK
Content-Type: text/plain
Content-Length: 7

Got it!
```
untuk lebih detail anda dapat mengecceknya dengan 
```
pika@pika-PC:~$ curl -i http://localhost:8080/myapp/myresource
HTTP/1.1 200 OK
Content-Type: text/plain
Content-Length: 7

Got it!pika@pika-PC:~$ curl -v http://localhost:8080/myapp/myresource
*   Trying 127.0.0.1...
* TCP_NODELAY set
* Connected to localhost (127.0.0.1) port 8080 (#0)
> GET /myapp/myresource HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/7.58.0
> Accept: */*
> 
< HTTP/1.1 200 OK
< Content-Type: text/plain
< Content-Length: 7
< 
* Connection #0 to host localhost left intact
Got it!
```

# 3. GraphQL
## Getting started (Crate Spring Boot app
untuk membuat projek dapan menggunakan https://start.spring.io/
Select:

    Gradle Project
    Java
    Spring Boot 2.1.x

For the project metadata we use:

    Group: com.graphql-java.tutorial
    Artifact: book-details

As dependency, we just select Web. Kemudian klik generate

jika menggunakan gradle silahkan tambahkan depedensinya sbb,
```
dependencies {
    implementation 'com.graphql-java:graphql-java:11.0' // NEW
    implementation 'com.graphql-java:graphql-java-spring-boot-starter-webmvc:1.0' // NEW
    implementation 'com.google.guava:guava:26.0-jre' // NEW
    implementation 'org.springframework.boot:spring-boot-starter-web'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
}
```
buat file baru ```schema.graphqls```di ```src/main/resources```
dengan isi 
```
type Query {
  bookById(id: ID): Book 
}

type Book {
  id: ID
  name: String
  pageCount: Int
  author: Author
}

type Author {
  id: ID
  firstName: String
  lastName: String
}
```
