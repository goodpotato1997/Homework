// Java program to iterate through all elements in a array list.
import java.util.*;
public class IterateElemant_18 {

    public static <string> void main(String[] args) {

        List<string> element=new ArrayList<string>();

        element.add((string) "Red");
        element.add((string) "Green");
        element.add((string) "Orange");
        element.add((string) "White");
        element.add((string) "Black");
        element.add((string) "Blue");

        Iterator itr=element.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
