public class Taxreturn {
    public static final int SINGLE =1;
    public static final int MARRID =2;
    private static final double R1=0.10;
    private static final double R2=0.25;
    private static final double R_SINGLE_L=32000;
    private static final double R_MARRID_L=64000;
    double income;
    int status ;
    Taxreturn(double x,int y)
    {
        income=x;
        status=y;

    }

    public double getTax() {
        double T1=0;
        double T2=0;
        if(status==SINGLE)
        {
            if(income<=R_SINGLE_L)
            {
                T1=R1*income;

            }
            else {
                T1=R1*R_MARRID_L;
                T2=R1*(income-R_MARRID_L);
            }
        }
        else {
            if(income<=R_SINGLE_L)
            {
                T1=R1*income;

            }
            else {
                T1=R1*R_MARRID_L;
                T2=R1*(income-R_MARRID_L);
            }


        }

        return T1+T2;
    }
}
