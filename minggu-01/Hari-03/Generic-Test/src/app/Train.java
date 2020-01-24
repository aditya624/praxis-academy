package app;

class Pick<P>{
    P obj;
    Pick(P obj){
        this.obj=obj;
    }
    public P getPick(){
        return this.obj;
    }
}

public class Train{
    public static void main(String[] args) {
        Pick <String> Try = new Pick<String>("Pikacu");
        Pick <Integer> Try1 = new Pick<Integer>(50);
        System.out.println(Try.getPick());
        System.out.println(Try1.getPick());
    }
}