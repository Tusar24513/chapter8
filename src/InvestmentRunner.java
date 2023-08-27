public class InvestmentRunner {
    public static void main(String[] args) {
        Investment Tk=new Investment(100,2);
        Tk.waitforvalance(2*100);
        System.out.println(Tk.getYear());



    }
}
