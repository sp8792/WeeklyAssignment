import java.util.*;

public class Main
{

    public static void main(String[] args){

        String doc1="machine learning models are powerful";
        String doc2="machine learning models are widely used";

        Set<String> ngrams1 = generateNgrams(doc1,2);
        Set<String> ngrams2 = generateNgrams(doc2,2);

        ngrams1.retainAll(ngrams2);

        System.out.println("Matching ngrams: "+ngrams1.size());
    }

    static Set<String> generateNgrams(String text,int n){

        String[] words = text.split(" ");
        Set<String> set = new HashSet<>();

        for(int i=0;i<=words.length-n;i++){

            String gram = "";

            for(int j=0;j<n;j++){
                gram += words[i+j]+" ";
            }

            set.add(gram.trim());
        }

        return set;
    }
}