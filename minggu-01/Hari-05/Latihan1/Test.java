// Java code for serialization and deserialization 
// of a Java object 
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
