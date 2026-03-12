import java.util.*;

class DNSEntry{

    String ip;
    long expiry;

    DNSEntry(String ip,long ttl){

        this.ip = ip;
        this.expiry = System.currentTimeMillis()+ttl;
    }

    boolean expired(){
        return System.currentTimeMillis()>expiry;
    }
}

public class Main{

    static HashMap<String,DNSEntry> cache = new HashMap<>();

    public static void main(String[] args){

        cache.put("google.com",new DNSEntry("142.250.183.14",5000));

        resolve("google.com");

        try{
            Thread.sleep(6000);
        }catch(Exception e){}

        resolve("google.com");
    }

    static void resolve(String domain){

        if(cache.containsKey(domain)){

            DNSEntry entry = cache.get(domain);

            if(!entry.expired()){
                System.out.println("Cache HIT → "+entry.ip);
                return;
            }

            System.out.println("Cache EXPIRED");
            cache.remove(domain);
        }

        System.out.println("Cache MISS → Query DNS");
    }
}