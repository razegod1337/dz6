import ru.netology.services.CalculateMonthMoney;

public class Main {
    public static void main(String[] args) {
        CalculateMonthMoney services = new CalculateMonthMoney();
        services.calculate(10000, 3000, 20000);

        services.calculate(100_000, 60_000, 150_000);
    }
}