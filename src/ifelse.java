import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        if(x==13)
        {
            System.out.println("Error: There is no thirteenth floor");
        } else if (x<13||x>20) {
            System.out.println("");
            System.out.println("Error: The floor must be between 1 and 20");

        }
        else {
            System.out.println("Actual number is"+(x-1));
        }
    }
}
