import java.util.Scanner;
public class RreverseNumber_1 {
    // java program for reverse the given number
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int x=sc.nextInt();
        int r=reverse(x);
        System.out.println("Reverse Number is : "+r);
    }
    static int reverse(int num)
    {
        int rem,rev=0;
        while(num!=0)
        {
            rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        return rev;
    }


}
