
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    void newAccountShouldHaveZeroBalance() {
        BankAccount account = new BankAccount();

        assertEquals(0.0, account.getBalance());
    }
}
