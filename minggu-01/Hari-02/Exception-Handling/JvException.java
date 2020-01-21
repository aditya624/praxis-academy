/**
 * Program ini akan mencoba error handling
 */
public class JvException{
    public static void main(String[] args) {
        try {
            // program akan sukses jika a dapat dibagi dengan b.
            int a=9;
            int b=0;
            System.out.println("a dibagi b bernilai "+a/b);
        } catch (Exception e) {
            System.out.println("Error karena hasil tak terdeinisi");
        }
    }
}