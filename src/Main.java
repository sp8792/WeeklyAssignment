import java.util.*;

public class Main {

    static HashMap<String,Integer> queries = new HashMap<>();

    public static void main(String[] args){

        queries.put("java tutorial",100);
        queries.put("javascript guide",90);
        queries.put("java download",80);

        search("jav");
    }

    static void search(String prefix){

        for(String query:queries.keySet()){

            if(query.startsWith(prefix)){

                System.out.println(query+" ("+queries.get(query)+")");
            }
        }
    }
}