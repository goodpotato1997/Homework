// Java program to reverse an array of integer values.
import java.util.Arrays;
public class ReverseArray_13 {
    public static void main(String[] args){
        int[] array = { 10, 20, 30, 40, 50 };
        int len = array.length;
        int[] newArray = new int[len];

        for(int i = 0; i < len; i++){
            newArray[i] = array[len-1 - i];
        }
        System.out.println("Reversed Array:"+Arrays.toString(newArray));
    }
}
