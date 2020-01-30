package Latihan;

import java.util.ArrayList;
import java.util.List;

public class CrawledSites{
    private List<String> crawledSites=new ArrayList<String>();
    private List<String> linkedSites=new ArrayList<String>();
    public void add(String site) {
            synchronized(this){
                if (!crawledSites.contains(site)) {
                    linkedSites.add(site);
                }
            }
    }
    public String next(){
        if (linkedSites.size()==0) {
            return null;
        }
        synchronized (this){
            if (linkedSites.size()>0) {
                String s =linkedSites.get(0);
                linkedSites.remove(0);
                crawledSites.add(s);
                return s;
            }
            return null;
        }
    }
}