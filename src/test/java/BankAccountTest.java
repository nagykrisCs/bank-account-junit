
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
}
