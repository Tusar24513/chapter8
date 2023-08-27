import java.security.PublicKey;

public class Investment {
    private double balance;
private double rate;
private int year=0;
public Investment(double x,double y)
{
    balance=x;
    rate=y;

}

    public void waitforvalance(double Targetbalance) {
        while (balance > Targetbalance) {
            year++;
            double interest = balance * rate / 100;
            balance = balance + interest;

        }
    }

    public double getBalance() {
        return balance;
    }

    public int getYear() {
        return year;
    }
}
