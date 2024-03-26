import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;


public class CatTest {
    @Spy
    private Cat cat;

    @Mock
    private Feline feline;

    @Before
    public void setUp() {
        cat = new Cat(feline);
    }

    @Test
    public void getSoundTest(){
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodTest() throws Exception {
        cat.getFood();
        Mockito.verify(feline, Mockito.times(1)).eatMeat();
    }
}