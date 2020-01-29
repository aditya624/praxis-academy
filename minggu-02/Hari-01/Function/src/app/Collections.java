package app;

import java.util.ArrayList;

public class Collections{
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("abc");
        list.add("One");
        list.add("BCD");
        Collections.sort(list, (String a, String b) -> {
            return a.compareTo(b);
        });
    }
}