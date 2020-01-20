import java.util.Scanner;

public class MatriksInp
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Masukkan Jumlah baris Matriks:");
        int a=Integer.parseInt(scanner.nextLine());
        System.out.print("Masukkan Jumlah kolom Matriks:");
        int b=Integer.parseInt(scanner.nextLine());
        //Pendeklarasian Array multidimensi
        int[][] Matriks1= new int[10][10];
        int[][] Matriks2= new int[10][10];
        int[][] Hasil= new int[10][10];

        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print("Masukkan elemen Matriks1 "+i+" "+j+" : ");
                Matriks1[i][j]=Integer.parseInt(scanner.nextLine());
            }
        }

        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print("Masukkan elemen Matriks2 "+i+" "+j+" : ");
                Matriks2[i][j]=Integer.parseInt(scanner.nextLine());
            }
        }

        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {   
                Hasil[i][j]=Matriks1[i][j]+Matriks2[i][j];
            }
        }
        System.out.println("Matriks Pertama :");
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {   
                System.out.print(Matriks1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matriks Kedua :");
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {   
                System.out.print(Matriks2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matriks Hasil :");
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {   
                System.out.print(Hasil[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}