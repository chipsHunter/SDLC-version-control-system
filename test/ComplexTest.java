import demo.parallel.Complex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ComplexTest {
    Complex one = new Complex(1, 2);
    Complex two = new Complex(2, 3);
    Complex sum = new Complex(3, 5);

    @Test
    public void testAdd() {
        Complex three = one.plus(two);
        Assertions.assertEquals(three.getRe(), sum.getRe());
        Assertions.assertEquals(three.getIm(), sum.getIm());
    }
}
