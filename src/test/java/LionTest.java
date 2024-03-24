import com.example.Lion;
import com.example.Predator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Predator predator;
    private Lion lion;
    @Before
    public void setUp() throws Exception {
        lion = new Lion("Самец", predator);
    }

    @Test
    public void testGetSound() {
        assertEquals("Ррррр", lion.getSound());
    }

    @Test
    public void testGetFood() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(predator.eatMeat()).thenReturn(expectedFood);

        List<String> actualFood = lion.getFood();

        Assert.assertEquals(expectedFood, actualFood);
        Mockito.verify(predator, Mockito.times(1)).eatMeat();
    }

    @Test
    public void testGetKittens() {
        assertEquals(2, lion.getKittens());
    }
}