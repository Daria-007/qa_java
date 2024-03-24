import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
        private final String sex;
        private final boolean hasMane;

        public LionParameterizedTest(String sex, boolean hasMane) {
            this.sex = sex;
            this.hasMane = hasMane;
        }

    @Parameterized.Parameters(name = "{index}: Lion sex = {0}, hasMane = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"InvalidSex", false}
        });
    }

    @Test
    public void testConstructor() {
        try {
            Lion lion = new Lion(sex, null);
            assertEquals(hasMane, lion.doesHaveMane());
        } catch (Exception e) {
            assertFalse(hasMane); // Если произошло исключение, ожидаем, что гривы нет
        }
    }
}

