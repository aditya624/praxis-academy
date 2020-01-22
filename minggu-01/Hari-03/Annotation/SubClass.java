/**
 * @author Aditya
 * @version 1.0
 * @param print()
 * @see ini adalah main program
 */

import java.lang.annotation.Documented;

@Documented
public @interface Annotationku{
    String nilai();
    String nama();
    int umur();
    String[] namaBaru();
}

@Annotationku(
    nilai = "123",nama="adit",umur=24,namaBaru = {"fandi","genji"}
)

public class SubClass extends SuperClass{

    @Override
    public void print(){
        System.out.println("Ini adalah SubClass.");
    }

    public int num;
    /**
     * 
     * @param a
     * @return angka
     */
    int Angka(int a){
        num=a+2;
        return num;
    }

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        System.out.println("Ini adalah Main");
        SuperClass obj1=new SuperClass();
        SubClass obj2=new SubClass();
        obj1.print();
        obj2.print();
        obj1.methodDeprecated();
        int b=obj2.Angka(2);
        System.out.println("Angka yang ada : "+b);
    }
}