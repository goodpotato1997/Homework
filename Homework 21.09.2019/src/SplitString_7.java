//java program to split the string
public class SplitString_7 {
    public static void main(String[] arg) {
        String str = "How are you?";
        String[] arrOfStr = str.split(" ");
        for (String a: arrOfStr)
            System.out.println(a);
    }
}
