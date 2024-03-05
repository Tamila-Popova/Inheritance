package practice;

import java.time.LocalDate;
import java.time.Month;

import static java.time.temporal.ChronoUnit.MONTHS;

public class DepositAccount extends BankAccount {
    public LocalDate lastIncome;

    @Override
    public void put(double amountToPut) {
        lastIncome = LocalDate.now();
        super.put(amountToPut);
    }

    @Override
    public void take(double amountToTake) {
        if (lastIncome.until(LocalDate.now(), MONTHS) >= 1) {
            super.take(amountToTake);
        } else {
            System.out.println("Операция не может быть выполнена");
        }
    }
}
