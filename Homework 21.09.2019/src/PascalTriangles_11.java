//Java program to display Pascal's triangle.Input number of rows: 5
public class PascalTriangles_11 {

    public static void main(String[] args) {
        int no_row,c=1,blk,i,j;
        no_row = 5;
        for(i=0;i<no_row;i++) {
            for(blk=1;blk<=no_row-i;blk++)
                System.out.print(" ");
            for(j=0;j<=i;j++) {
                if (j==0||i==0)
                    c=1;
                else
                    c=c*(i-j+1)/j;
                System.out.print(" "+c);
            }
            System.out.print("\n");
        }
    }
}
