package practice;

public class CardAccount extends BankAccount {
    private static final double COMISSION = 0.01;

    @Override
    public void take(double amountToTake) {
        double amountWithComission = amountToTake + (amountToTake * COMISSION);
        if (amountOfMoney >= amountWithComission) {
            super.take(amountWithComission);
        } else {
            System.out.println("Недостаточно средств для выполнения операции");
        }
    }
}
