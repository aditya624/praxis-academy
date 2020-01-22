# Hari Ke - 3
# 1. Annotation
Annotations adalah suatu tag (@) ,yang merepresentasikan bentuk metadata , fungsinya untuk memberikan informasi atau keterangan tambahan , untuk suatu baris code di dalam program Java. Annotation tidak akan berpengaruh secara langsung saat baris code di eksekusi, tapi digunakan untuk tujuan tertentu. Beberapa kegunaanya seperti , memberi informasi ke compiler , jika terdeteksi error atau suppress warning. Serta memproses informasi untuk generate code xml , di periksa saat runtime dan lain sebagainya. Anotation dapat digunakan untuk Class, Method ,Interface dan Field.

ada annotation bawaan seperti @override, @SupperWarning, @Deprecated. Selain itu, ada annotation lain yang dapat di buat maupun di import dari library.

## Contoh @Override
Misalkan saya buat 2 file java dengan nama SuperClass.java dan SubClass.java. Berikut untuk SuperClass.java
```
public class SuperClass{
    public void print(){
        System.out.println("Ini adalah SuperClass");
    }
}
```
dan SubClass.java dengan meng-extends SuperClass kedalamnya.
```
public class SubClass extends SuperClass{

    @Override
    public void print(){
        System.out.println("Ini adalah SubClass");
    }
    public static void main(String[] args) {
        System.out.println("Ini adalah Main");
        SuperClass obj1=new SuperClass();
        SubClass obj2=new SubClass();
        obj1.print();
        obj2.print();
    }
}
```
hasil running akan menjadi 
```
Ini adalah Main
Ini adalah SuperClass
Ini adalah SubClass
```
Sedangkan jika kita rubah pada kode print() menjadi printLines() pada SuperClass maka,
```
public class SuperClass{
    public void printLines(){
        System.out.println("Ini adalah SuperClass");
    }
}
```
dan pada SubClass obj1.print menjadi obj1.printLines maka, 
```
public class SubClass extends SuperClass{

    @Override
    public void print(){
        System.out.println("Ini adalah SubClass");
    }
    public static void main(String[] args) {
        System.out.println("Ini adalah Main");
        SuperClass obj1=new SuperClass();
        SubClass obj2=new SubClass();
        obj1.printLines();
        obj2.print();
    }
}
```
Hasil akan menjadi error. Karena pada terdapat @Override. Dari sini dapat disimpulkan @override untuk mengecek apakah method di SuperClass dan SubClass memiliki nama yang sama atau kekomplitan dalam sintaksis.

## Contoh @Deprecated
Untuk annotation ini akan memberitanda coretan ketika method tersebut dipanggil yang bergguna untuk memberitnda pada developer lain dalam team. contoh penggunaan yaitu
```
public class SuperClass{
   
    @Deprecated
    public void methodDeprecated(){
        System.out.println("Ini method Deprecated");
    }
}
```

## Contoh @SuperWarning
Untuk annotation ini digunakan untuk mengabaikan warning. misalkan code berikut,
```
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        System.out.println("Ini adalah Main");
        SuperClass obj1=new SuperClass();
        SubClass obj2=new SubClass();
        obj1.print();
        obj2.print();
        obj1.methodDeprecated();
    }
```
akan menghilangkan warning karena annotation @Deprecated. pada contoh sebelumnya.

# 2. Javadoc
javadoc digunakan untuk mencatat atau mendokumentasikan class secara otomatis.
Tag yang digunakan sebagai berikut :
1. @author untuk memberitahu nama penulis,
2. @param untuk memberitahukan parameter yang digunakan dalam method 
3. @return untuk memberitahu nilai yang dikembalika.
4. @version untuk mendeklarasikan version program.

contoh penggunaan 
```
   /**
     * 
     * @param a
     * @return angka 'num'
     */
    int Angka(int a){
        num=a+2;
        return num;
    }
```
syntax diatas menyajikan parameter a dan return angka num.