
# Latihan
# 1. Salah satu cara untuk menumbuhkan pola pikir obyek adalah penggunaan CRC Card. Pelajari dan buat 1 contoh sistem lain.

# Misalkan Perpustakaan  
## 1. Petugas
### Responsibilities
1. Nama 
2. Tambah
3. Kode Petugas
4. Alamat 
### Collborators
1. Anggota
2. Koleksi
3. Transaksi
4. Lokasi

## 2. Anggota
### Responsibilities
1. Nama 
2. Tambah 
3. ID
4. Alamat 
5. Hp
### Collborators
1. Petugas
2. Transaksi

## 3. Koleksi 
### Responsibilities
1. Judul 
2. Jumlah
3. Harga sewa
4. Tambah Koleksi
5. Tampilkan 
### Collborators
1. Petugas
2. Tansaksi

## 4. Transaksi
### Responsibilities
1. Id Transaksi
2. Anggota yang meminjam
2. Order Koleksi
3. Pembayaran
4. Tampilkan
5. Tanggal pinjam
6. Tanggal Kembali
### Collborators
1. Petugas
2. Anggota
3. Koleksi

## 5. Lokasi
### Responsibilities
1. Nama
2. Tambah
3. Pindah
### Collborators
1. Petugas

# 2. Kerjakan Java OOP Concepts Tutorial terutama pada bagian object, class, inheritance, interface. Buat dalam bentuk executable .JAR file, jelaskan dalam README di repo GitHub anda.
Saya membuat class TestHewan dengan code sbb:

```
interface Hewan{
    public void aturUmur(int b);
    public void Tampil();
}

public class TestHewan implements Hewan
{   
    public String name;
    public int umurhewan;

    public TestHewan(String a){
        name=a;
    }

    @Override
    public void aturUmur(int b){
        umurhewan=b;
    }

    @Override
    public void Tampil(){
        System.out.println("Nama : "+ name);
        System.out.println("umur : "+ umurhewan);
    }
    public static void main(String[] args) {
        TestHewan obj=new TestHewan("kambing");
        obj.aturUmur(2);
        obj.Tampil();
    }
}
```
interface digunakan untuk menghimpun method yang dipilih dengan @overide. dengan menambahkan implements di class parent.
kemudian pada terminal 
```
pika@pika-PC:~/praxis-academy/minggu-01/Hari-02/Java-OOP$ javac TestHewan.java
```
untuk membuat TestHewan.class. Selanjutnya, kita coba running sbb:
```
pika@pika-PC:~/praxis-academy/minggu-01/Hari-02/Java-OOP$ java -cp . TestHewan
Nama : kambing
umur : 2
```
class dapat dirunning,

Kemudian kita buat jar dengan cara,
```
pika@pika-PC:~/praxis-academy/minggu-01/Hari-02/Java-OOP$ jar cvfe TestHewan.jar TestHewan TestHewan.class
added manifest
adding: TestHewan.class(in = 951) (out= 549)(deflated 42%)
```
Untuk merunning dengan 
```
pika@pika-PC:~/praxis-academy/minggu-01/Hari-02/Java-OOP$ java -jar TestHewan.jar
Nama : kambing
umur : 2
```
# 3. Struktur dalam membuat paket dijava.
### a. Contoh Package 
Menyimpan Package menggunakan nama file yang sama dengan nama classnya yaitu Kelasku.java . seperti berikut,

    package Paketku;

    public class Kelasku
    {
        public void Nama(String a)
        {
            System.out.println(a);
        }
    }

Berinama package dengan Paketku;
### b. Contoh Pemanggilan Package
Menyimpan file Main menggunakan nama file yang sama dengan nama classnya yaitu Tampil.java. Kemudian pemanggilan menggunakan import Paketku.Kelasku;. Full Code seperti dibawah. 

    import Paketku.Kelasku;

    public class Tampil
    {
        public static void main(String[] args)      {
            String name="Adit";
            Kelasku objek= new Kelasku();
            objek.Nama(name);
        }
    }

Sedangkan
    
    Kelasku objek=new Kelasku();

digunakan untuk declarasi pemanggilan objek dengan "Kelasku" adalah class di packagenya.
# Membuat paket lain menggunakan javac.
Misalkan kita mempunyai code sbb,

    package p1;

    public class C1{
        public void m1(){
            System.out.println("m1 of c1");
        }
        public static void main(String[] args) {
            C1 obj=new C1();
            obj.m1();
        }
    }

Save dengan nama C1.java. kemudian ketik dalam terminal 
    
    pika@pika-PC:~/praxis-academy/minggu-01/Hari-02/Create-Package$ javac C1.java

akan menghasilkan C1.class didalam folder yang sama dengan C1.java. Kemudian untuk

    pika@pika-PC:~/praxis-academy/minggu-01/Hari-02/Create-Package$ javac -d . C1.java

Akan membuat folder dengan nama yang sama dengan nama package yaitu p1, dengan objek didalamnya adalah c1.class. Sedangkan untuk 

    pika@pika-PC:~/praxis-academy/minggu-01/Hari-02/Create-Package$ javac -d .. C1.java

akan membuat folder p1 pada parent direktory. 

Jika diganti nama package dengan,

    package p1,p2;

maka striktur folder adalah

    --Parent
        --p1
            --p2
                --c1.class
        --c1.java

Untuk eksekusi dari c1.class digunakan 

    pika@pika-PC:~/praxis-academy/minggu-01/Hari-02/Create-Package$ java p1.p2.C1
    m1 of c1
    
# 4. Gradle
Untuk install gradle :

    1426  curl -s "https://get.sdkman.io" | bash
    1427  source "/home/pika/.sdkman/bin/sdkman-init.sh"
    1428  sdk version
    1429  sdk install gradle 6.1


Berikut perintah di terminal untuk starting gradle:

        pika@pika-PC:~/praxis-academy/minggu-01/Hari-02/gradle$ cd demo
        pika@pika-PC:~/praxis-academy/minggu-01/Hari-02/gradle/demo$ gradle init
        Starting a Gradle Daemon (subsequent builds will be faster)

        Select type of project to generate:
        1: basic
        2: application
        3: library
        4: Gradle plugin
        Enter selection (default: basic) [1..4] 2

        Select implementation language:
        1: C++
        2: Groovy
        3: Java
        4: Kotlin
        5: Swift
        Enter selection (default: Java) [1..5] 3

        Select build script DSL:
        1: Groovy
        2: Kotlin
        Enter selection (default: Groovy) [1..2] 1

        Select test framework:
        1: JUnit 4
        2: TestNG
        3: Spock
        4: JUnit Jupiter
        Enter selection (default: JUnit 4) [1..4] 1

        Project name (default: demo): demo
        Source package (default: demo): demo

        > Task :init
        Get more help with your project: https://docs.gradle.org/6.1/userguide/tutorial_java_projects.html

        BUILD SUCCESSFUL in 4m 17s
        2 actionable tasks: 2 executed

Untuk Execute build digunakan,
    
    pika@pika-PC:~/praxis-academy/minggu-01/Hari-02/gradle/demo$ ./gradlew build
    Downloading https://services.gradle.org/distributions/gradle-6.1-bin.zip
    .........10%.........20%.........30%..........40%.........50%.........60%..........70%.........80%.........90%.........100%

Setelah download selesai, silahkan cek 

    build/reports/tests/test/index.html.

untuk menampilkan class demo apptest.java .

# 5. Error Handling
Tampilan Error dapat diatasi dengan error handling yaitu try-catch. seperti program berikut:
```
/**
 * Program ini akan mencoba error handling
 */
public class JvException{
    public static void main(String[] args) {
        try {
            // program akan sukses jika a dapat dibagi dengan b.
            int a=9;
            int b=3;
            System.out.println("a dibagi b bernilai "+a/b);
        } catch (Exception e) {
            System.out.println("Error karena hasil tak terdeinisi");
        }
    }
}
```
akan menghasilkan output :
```
a dibagi b bernilai 3
```
sedangkan jika kita ganti
```
int b=3;
```
menjadi 
```
int b=0
```
yang mana berarti 9 dibagi 0 maka dalam matematika hal tersebut menghasilkan bilangan tak terdefinisi yang mengakibatkan running program yang error.

untuk mempercantik tampilan error maka program akan menjalankan sintaksis di catch. yang menghasilkan output sebagai berikut,
```
Error karena hasil tak terdeinisi
```
# Catatan Pagi
### Static type harus di definisikan terlebih dahulu (Java). Sedangkan, Dynamic type tidak wajib.
