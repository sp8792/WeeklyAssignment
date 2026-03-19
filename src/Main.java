import java.util.*;

public class Main {

    static HashMap<String,String> L1 = new HashMap<>();
    static HashMap<String,String> L2 = new HashMap<>();

    public static void main(String[] args){

        L2.put("video1","Video Data");

        getVideo("video1");
        getVideo("video1");
    }

    static void getVideo(String id){

        if(L1.containsKey(id)){

            System.out.println("L1 Cache HIT");
            return;
        }

        if(L2.containsKey(id)){

            System.out.println("L2 Cache HIT → Promoting to L1");

            L1.put(id,L2.get(id));
            return;
        }

        System.out.println("Database access required");
    }
}