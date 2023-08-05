import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.CalculateMonthMoney;

public class CalculateMonthMoneyTest {
    @Test
    public void testChillMonth() {
        CalculateMonthMoney service = new CalculateMonthMoney();
        int actual = service.calculate(10000, 3000, 20000);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChillMonth2() {
        CalculateMonthMoney service = new CalculateMonthMoney();
        int actual = service.calculate(100000, 60000, 150000);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }
}
