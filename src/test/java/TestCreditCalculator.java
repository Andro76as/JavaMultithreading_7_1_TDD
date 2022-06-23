import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.CreditCalculator;

public class TestCreditCalculator {
    private final int sum = 1000000;
    private final double rate = 11.8;
    private final int month = 60;
    CreditCalculator calculator = new CreditCalculator();

    @Test
    void testSumPerMonth() {
        int expected = 32000;
        int actual = (int) calculator.sumPerMonth(sum, rate, month);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testFullSumReturn() {
        int expected = 2000000;
        int actual = calculator.fullSumReturn(sum, rate, month);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testOverPaySum() {
        int expected = 500000;
        int actual = calculator.overPaySum(sum, rate, month);
        Assertions.assertEquals(expected, actual);
    }
}
