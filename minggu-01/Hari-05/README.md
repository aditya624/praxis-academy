# Serialization & Deserialization
Serialization adalah suatu proses mengubah objek menjadi byte stream, agar bisa disimpan dalam file, memori ataupun berguna dalam proses transmisi jaringan. Sedangkan Deserialization adalah kebalikan dari proses Serialization.

Dalam proses serialization dan deserialization di Java, ada dua kelas yang sangat berperan penting yaitu :
    
    - kelas ObjectOutputStream.
    
    - kelas ObjectInputStream.

Selain itu, kelas yang mau di-serialization kan harus mengimplement interface java.io.Serializable.

contoh misalkan code class Demo:
```
import java.io.*; 

class Demo implements java.io.Serializable 
{ 
	public int a; 
	public String b; 

	// Default constructor 
	public Demo(int a, String b) 
	{ 
		this.a = a; 
		this.b = b; 
	} 

}
```
Kita harus import package bawaan java yaitu java.io.Serializable kemudian di implement ke dalam class demo.

Kemudian 

```
public class Test 
{ 
	public static void main(String[] args) 
	{ 
		Demo object = new Demo(1, "geeksforgeeks"); 
		String filename = "file.txt"; 
		
		// Serialization 
		try
		{ 
			//Saving of object in a file 
            FileOutputStream file = 
                    new FileOutputStream("/home/pika/praxis-academy/minggu-01/Hari-05/Latihan1/"+filename); 
			ObjectOutputStream out = new ObjectOutputStream(file); 
			
			// Method for serialization of object 
			out.writeObject(object); 
			
			out.close(); 
			file.close(); 
			
			System.out.println("Object has been serialized"); 

		} 
		
		catch(IOException ex) 
		{ 
			System.out.println("IOException is caught"); 
		} 


		Demo object1 = null; 

		// Deserialization 
		try
		{ 
			// Reading the object from a file 
            FileInputStream file = 
                    new FileInputStream("/home/pika/praxis-academy/minggu-01/Hari-05/Latihan1/"+filename); 
			ObjectInputStream in = new ObjectInputStream(file); 
			
			// Method for deserialization of object 
			object1 = (Demo)in.readObject(); 
			
			in.close(); 
			file.close(); 
			
			System.out.println("Object has been deserialized "); 
			System.out.println("a = " + object1.a); 
			System.out.println("b = " + object1.b); 
		} 
		
		catch(IOException ex) 
		{ 
			System.out.println("IOException is caught"); 
		} 
		
		catch(ClassNotFoundException ex) 
		{ 
			System.out.println("ClassNotFoundException is caught"); 
		} 

	} 
} 
```
Didalam class tersebut terdapat 
```
            FileOutputStream file = 
                    new FileOutputStream("/home/pika/praxis-academy/minggu-01/Hari-05/Latihan1/"+filename); 
			ObjectOutputStream out = new ObjectOutputStream(file); 
```
digunakn untuk mendefinisikan objek lokasi dari file data yang akan disimpan (Serialization). code berikut untuk menulis kedalam file
```
			// Method for serialization of object 
			out.writeObject(object); 
```

Sedngkan code,

```
            FileInputStream file = 
                    new FileInputStream("/home/pika/praxis-academy/minggu-01/Hari-05/Latihan1/"+filename); 
			ObjectInputStream in = new ObjectInputStream(file); 
```
digunakan untuk mendefinisikan lokasi dari file yang akan di baca. code berikut untuk membaca file,
```
			// Method for deserialization of object 
			object1 = (Demo)in.readObject(); 
```
# XML
Untuk menyambungkan ke XML java harus menggunakan exception. Pada folder Create-XML terdapat contoh bagaimana membuat file XML dari code java. Untuk memodifikasi file XML yang sudah dibuat pada folder Modify-XML terdapat contoh penggunaan.

# Perbedaan XML dan JSON dalam code sbb:
## XML
```
<car>
   <company>Volkswagen</company>
   <name>Vento</name>
   <price>800000</price>
</car>
```
## JSON
```
{
   "company": Volkswagen,
   "name": "Vento",
   "price": 800000
}
```

Berikut contoh create json,
```
import org.json.simple.JSONObject;

public class JsonEncodeDemo {

   public static void main(String[] args) {
      JSONObject obj = new JSONObject();

      obj.put("name", "foo");
      obj.put("num", new Integer(100));
      obj.put("balance", new Double(1000.21));
      obj.put("is_vip", new Boolean(true));

      System.out.print(obj);
   }
}
```
untuk mengimport download dulu package di https://github.com/fangyidong/json-simple

# Struktur Data 
Beberapa Struktur data yang wajib diketahui oleh programmer yaitu :
1. Array
2. Linked List
3. Hash Table
4. Stack
5. Queue
6. Set
7. Vector
8. Dictionary 
9. BitSet
10. Enumeration

# Kasus Satu
# XML
```
<?xml version = "1.0"?>
<Team>
    <Nama_Team>Bootcamp</Nama_Team>
    <Anggota>
        <id>01</id>
        <nama>Adit</nama>
        <Alamat>Tulungagung</Alamat>
    </Anggota>
    <Anggota>
        <id>02</id>
        <nama>Fandi</nama>
        <Alamat>Surabaya</Alamat>
    </Anggota>
    <Anggota>
        <id>03</id>
        <nama>Genji</nama>
        <Alamat>Tulungagung</Alamat>
    </Anggota>
    <Day>4</Day>
    <Lokasi>Surabaya</Lokasi>
</Team>
```
## JSON
```
<?xml version = "1.0"?>
<Praxis>
<Team>
    <Nama_Team>Bootcamp</Nama_Team>
    <Anggota>
        <id>01</id>
        <nama>Adit</nama>
        <Alamat>Tulungagung</Alamat>
    </Anggota>
    <Anggota>
        <id>02</id>
        <nama>Fandi</nama>
        <Alamat>Surabaya</Alamat>
    </Anggota>
    <Anggota>
        <id>03</id>
        <nama>Genji</nama>
        <Alamat>Tulungagung</Alamat>
    </Anggota>
    <Day>4</Day>
    <Lokasi>Surabaya</Lokasi>
</Team>
</Praxis>
```