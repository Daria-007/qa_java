import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import java.util.ArrayList;
import java.util.List;


public class CatTest {
    @Spy
    private Cat cat;

    @Mock
    public Feline feline;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        cat = new Cat(feline);
    }

    @Test
    public void getSoundTest(){
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> food = new ArrayList<>();
        food.add("мясо");
        Mockito.when(feline.eatMeat()).thenReturn(food);

        List<String> result = cat.getFood();
        Assert.assertEquals(food, result);
        Mockito.verify(feline, Mockito.times(1)).eatMeat();
    }
}