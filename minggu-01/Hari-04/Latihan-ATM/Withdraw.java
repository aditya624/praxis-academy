public class Withdraw extends ATMMachine
{
    static double withdraw=0;
    public void setWithdraw(double withdraw) {
        this.withdraw=withdraw;
    }
    public static double getWithdraw() {
        return withdraw;
    }
}