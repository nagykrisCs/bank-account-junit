
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    void newAccountShouldHaveZeroBalance() {
        BankAccount account = new BankAccount();

        assertEquals(0.0, account.getBalance());
    }

    @Test
    void depositShouldIncreaseBalance() {
        BankAccount account = new BankAccount();

        account.deposit(1000);

        assertEquals(1000.0, account.getBalance());
    }

    @Test
    void multipleDepositsShouldAddUp() {
        BankAccount account = new BankAccount();

        account.deposit(1000);
        account.deposit(500);
        account.deposit(250);

        assertEquals(1750.0, account.getBalance());
    }

    @Test
    void negativeDepositShouldThrowException() {
        BankAccount account = new BankAccount();
        account.deposit(1000);

        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-500);
        });

        assertEquals(1000.0, account.getBalance());
    }

    @Test
    void zeroDepositShouldThrowException() {
        BankAccount account = new BankAccount();
        account.deposit(1000);

        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(0);
        });

        assertEquals(1000.0, account.getBalance());
    }

    @Test
    void withdrawShouldDecreaseBalance() {
        BankAccount account = new BankAccount();

        account.deposit(1000);
        account.withdraw(400);

        assertEquals(600.0, account.getBalance());
    }
}
