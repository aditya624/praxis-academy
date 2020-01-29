# Gradle
untuk membuat di folder mengggunakan 
```
gradle init
```
untuk meruning menggunakan
```
gradle run
```
kemudian untuk check testing menggunakan
```
gradle build
```

untuk menjalankan jar, tambahkan pada build.gradle sbb,
```
jar{
    manifest{
        attributes 'Main-Class':'namafilegradle.namafilejava'
    }
}
```
Berpindah ke folder build kemudian libs

```
cd build/libs
``` 

kemudian running jar dengan 
```
java -jar Kasus.jar
```

jika ingin build lagi usahakan gunakan ```gradle clean``` dahulu untuk memulai ulang.
## Latihan 1 terdapat pada folder Latihan1 denggan menggunakan gradle
## kasus yang digunakan untuk Testing Bicycle
