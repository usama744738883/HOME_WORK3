import javax.naming.LimitExceededException;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    void deposit(double sum) {
        amount = amount + sum;
    }

    public void withDraw(double sum) throws LimitExceededException {
        if (amount < sum) {
            throw new LimitExceededException("Пополните счёт. Вас счёт" + amount);
        } else {
            amount = amount - sum;
        }
    }
}

