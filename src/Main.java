import java.util.*;

public class Main {

    public static void main(String[] args){

        int[] transactions = {500,300,200,700,100};

        int target = 500;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<transactions.length;i++){

            int complement = target-transactions[i];

            if(map.containsKey(complement)){

                System.out.println("Fraud pair found:");
                System.out.println(complement+" + "+transactions[i]);
                return;
            }

            map.put(transactions[i],i);
        }

        System.out.println("No pair found");
    }
}