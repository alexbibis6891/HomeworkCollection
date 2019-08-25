import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestClass {

    @Test
    public void addToInventory(){
        Animal sausage = new Animal("Sausage", 13, 20, 3, 50, "2019.12.25", -20);
        Animal newSausage = new Animal("Sausage", 13, 20, 3, 20, "2019.12.25", -20);
        int result = sausage.quantity + newSausage.quantity;
        assertEquals(70, result);
    }

    @Test
    public void sellFromInventory(){
        Vegetal apple = new Vegetal("Apple", 21, 5, 1, 60, "2029.09.20", "D,E,C");
        Vegetal soldApple = new Vegetal("Apple", 21, 5, 1, 30, "2029.09.20", "D,E,C");
        int result = apple.quantity - soldApple.quantity;
        assertEquals(30, result);
    }

}
