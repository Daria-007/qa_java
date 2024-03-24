import com.example.Feline;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void felineEatMeat() throws Exception {
        Feline feline = new Feline();
        assertEquals(feline.eatMeat(), feline.getFood("Хищник"));
    }

    @Test
    public void felineGetFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void felineGetKittens() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void felineGetKittens_CustomCount()  {
        Feline feline = new Feline();
        assertEquals(3, feline.getKittens(3));
    }
}