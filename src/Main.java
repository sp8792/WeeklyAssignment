import java.util.*;

public class Main {

    static HashMap<String,Integer> requests = new HashMap<>();
    static int limit = 5;

    public static void main(String[] args){

        for(int i=1;i<=7;i++){

            checkRate("client1");
        }
    }

    static void checkRate(String client){

        int count = requests.getOrDefault(client,0);

        if(count<limit){

            requests.put(client,count+1);

            System.out.println("Request allowed");
        }
        else{

            System.out.println("Rate limit exceeded");
        }
