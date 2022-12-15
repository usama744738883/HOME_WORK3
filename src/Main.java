import javax.naming.LimitExceededException;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        bankAccount.deposit (20000);
        while (true){
            try {
                bankAccount.withDraw(6000);
                System.out.println(bankAccount.getAmount());
            } catch (LimitExceededException e) {
                throw new RuntimeException(e);
            }
            System.out.println(bankAccount.getAmount());
            break;

        }

    }
}