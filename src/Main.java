import java.util.*;

public class Main {

    static HashMap<String,Integer> stock = new HashMap<>();
    static Queue<Integer> waitingList = new LinkedList<>();

    public static void main(String[] args){

        stock.put("IPHONE15",5);

        purchaseItem("IPHONE15",101);
        purchaseItem("IPHONE15",102);
        purchaseItem("IPHONE15",103);
        purchaseItem("IPHONE15",104);
        purchaseItem("IPHONE15",105);
        purchaseItem("IPHONE15",106);
    }

    static void purchaseItem(String productId,int userId){

        int currentStock = stock.getOrDefault(productId,0);

        if(currentStock>0){

            stock.put(productId,currentStock-1);

            System.out.println("Purchase successful by user "+userId+
                    ". Remaining: "+(currentStock-1));

        }else{

            waitingList.add(userId);

            System.out.println("Out of stock. User "+userId+
                    " added to waiting list.");
        }
    }
}