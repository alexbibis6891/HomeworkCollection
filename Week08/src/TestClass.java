import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class TestClass {

    @Test
    public void ageCalculator(){
        Student student = new Student("Jimmy", "Volmer", "1999-09-11", "M", 18523697);
        int birthYear = LocalDate.now().getYear() - 18;
        assertEquals(2001, birthYear);
    }
}
