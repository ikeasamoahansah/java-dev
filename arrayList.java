import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args){
        // For each loop with an ArrayList

        ArrayList<String> animals = new ArrayList<String>();

        animals.add("dog");
        animals.add("bird");
        animals.add("goat");

        for(String i : animals) {
            System.out.println(i);
        }
    }
}