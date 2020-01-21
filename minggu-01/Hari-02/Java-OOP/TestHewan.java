interface Hewan{
    public void aturUmur(int b);
    public void Tampil();
}

class Atribut{
    public String name;
    public int umurhewan;
}

public class TestHewan extends Atribut implements Hewan
{   
    
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