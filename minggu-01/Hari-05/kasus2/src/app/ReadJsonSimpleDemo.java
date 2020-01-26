package app;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJsonSimpleDemo {
    public static void main(String[] args){
	JSONParser parser = new JSONParser();
		 
	try {
	 
	  Object obj = parser.parse(new FileReader("/home/pika/praxis-academy/minggu-01/Hari-05/kasus2/src/app/input.json"));
	 
	  JSONObject jsonObject = (JSONObject) obj;
	 
	  String namaTeam = (String) jsonObject.get("Nama_Team");
      System.out.println("Nama = "+namaTeam);
      System.out.println("Anggota : ");
      	  // looping array Anggota
	  JSONArray anggota = (JSONArray) jsonObject.get("Anggota");
	  Iterator iterasiAng = anggota.iterator();
	  
	  for (Object obj1:anggota) {
		System.out.println("\t - " + obj1);
	  }

      String hari = (String) jsonObject.get("Day");
      System.out.println("Hari ke-"+hari);
     
      String lokasi = (String) jsonObject.get("Lokasi");
      System.out.println("Lokasi : "+lokasi);
	} catch (FileNotFoundException ex) {
	   ex.printStackTrace();
	} catch (IOException ex) {
	   ex.printStackTrace();
	} catch (ParseException ex) {
	   ex.printStackTrace();
	}
    }
}