# DOKUMENTAS HARI KE - 1
## 1. Untuk login Sebagai ROOT
        pika@pika-PC:~$ sudo su
## 2. Membuat direktori di /opt/jdk
        root@pika-PC:/home/pika# mkdir /opt/jdk
## 3. Ekstrak File .tar.gz
        root@pika-PC:/home/pika# cd Downloads
        root@pika-PC:/home/pika/Downloads# tar -zxf jdk-8u241-linux-x64.tar.gz -C /opt/jdk
        root@pika-PC:/home/pika/Downloads# 
## 4. Cek versi Java
        java -version
        java version "1.8.0_241"
        Java(TM) SE Runtime Environment (build 1.8.0_241-b07)
        Java HotSpot(TM) 64-Bit Server VM (build 25.241-b07, mixed mode)
        root@pika-PC:/home/pika/Downloads# 
## 5. Untuk Install VSCODE menggunakan 
download file dari web. kemudian ketikan 

        sudo dkpg -i code_1.22.2-1523551015_amd64.deb
## 6. Membuat dan running suatu program .jar 
### a. compiling java class 
        javac hello.java
### b. file .jar
        jar cvfe HelloWorld.jar HelloWorld HelloWorld.class
### c. Running jar file 
        java -jar HelloWorld.jar
## 7. Running dari class
### a. Arahkan ke direktori 
        cd minggu-01/Hari-01/example.java.helloworld
### b. Compile Class 
        javac HelloWorld/Main.java
akan menghasilkan Main.class
### c. Running Class
        java -cp . HelloWorld.Main
hasil coding helloworld
## 8. Tugas Nomer 12
### Untuk membuat komentar digunakan 
        ** 
        * Progrm untuk menampilkan helloworld
        */
Semua aplikasi terdapat main method

        public static void main(String[] args)

## 9. Varibel Java
definisi untuk variabel array satu dimensi

        datatype[] namadata= new datatype[];

sedangkan untuk dua dimensi 
        datatype[][] namadata= new datatype[][];
## 10. Membuat Jar dari Salary
### a. membuat class
        pika@pika-PC:~/praxis-academy/minggu-01/Hari-01/Salary$ javac Salary.java
### b. running dari class 
        pika@pika-PC:~/praxis-academy/minggu-01/Hari-01/Salary$ java -cp . Employee
### c. Mengatur manifest.txt
buatlah file manifest.txt yang berisikan 

        Manifest-version: 1.0
        Main-Class: Employee
dengan Main-Class adalah Class terluar
### d. membuat jar
        pika@pika-PC:~/praxis-academy/minggu-01/Hari-01/Salary$ jar cfme Salary.jar Manifest.txt Employee Employee.class
### e. running jar
        pika@pika-PC:~/praxis-academy/minggu-01/Hari-01/Salary$ java -jar Salary.jar


# Catatan yang sangat penting
Definisi Class jika public harus menggunakan Huruf besar di awal.
contoh :

        public class Matriks
        {
                ...
        }