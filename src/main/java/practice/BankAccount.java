package practice;

public class BankAccount {
    public double amountOfMoney = 0;

    public double getAmount() {
        return amountOfMoney;
    }

    public void put(double amountToPut) {
        if (amountToPut <= 0.0) {
            System.out.println("Невозможно произвести операцию зачисления");
        } else {
            amountOfMoney += amountToPut;
        }
    }

    public void take(double amountToTake) {
        if (amountToTake > amountOfMoney) {
            System.out.println("Недостаточно средств для выполнения операции");
        } else {
            amountOfMoney -= amountToTake;
        }
    }
}