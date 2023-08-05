import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.services.CalculateMonthMoney;
public class CalculateMonthMoneyParametrizedTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")
    public void shouldCalculateAmountMonthOfRest(int expected, int income, int expenses, int threshold) {

        CalculateMonthMoney service = new CalculateMonthMoney();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
