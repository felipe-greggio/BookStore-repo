public class Cashier implements  ICashierManager{

    private double moneyOnRegister;

    public Cashier(){
        this.moneyOnRegister = 0;
    }

    public double getMoneyOnRegister() {
        return moneyOnRegister;
    }

    public void setMoneyOnRegister(double moneyOnRegister) {
        this.moneyOnRegister = moneyOnRegister;
    }
}
