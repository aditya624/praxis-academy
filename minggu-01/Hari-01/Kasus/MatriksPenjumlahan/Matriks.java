public class Matriks
{
    public static void main(String[] args) {
         
        int[][] Matriks1= {{1,2,3},{2,3,1},{3,3,1}};
        int[][] Matriks2= {{1,1,3},{2,2,3},{1,1,1}};
        int[][] hasil=new int[4][4];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {   
                hasil[i][j]=Matriks1[i][j]+Matriks2[i][j];
            }
        }
        System.out.println("Matriks Pertama :");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {   
                System.out.print(Matriks1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matriks Kedua :");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {   
                System.out.print(Matriks2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matriks Hasil :");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {   
                System.out.print(hasil[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}