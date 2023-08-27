import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter income = = =  ");
        double income =in.nextInt();
        System.out.println("are u married ?===== ");
        String input= in.next();
        int status;
        if(input.equals('Y'))
        {
            status=Taxreturn.MARRID;
        }
        else
        {
            status=Taxreturn.SINGLE;
        }
        Taxreturn aTaxReturn = new Taxreturn(income, status);
       System.out.println("Tax"+aTaxReturn.getTax() );
    }
}
