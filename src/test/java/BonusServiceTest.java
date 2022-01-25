import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.bonus.BonusService;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusServiceTest {

    BonusService service = new BonusService();

    @ParameterizedTest
    @CsvFileSource(resources = "/data/data.csv", delimiter = '|', numLinesToSkip = 2)

        void calculateWithCsvFileSource(String test, long amount, boolean registered, long expected) {
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
}