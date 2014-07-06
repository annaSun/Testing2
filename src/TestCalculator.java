import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

/**
 * Created by Анка on 06.07.2014.
 */
public class TestCalculator {
    @Test
    public void testMaxOk() {
        Integer[] arr = {1, 2, 3, 4, 10};

        assertEquals("Успешно", 10, Calculator.max(arr));
    }

    @Test
    public void testMaxNull() {
        Integer[] arr = {null,5};
        try {
            Calculator.max(arr);
            fail("Must throw Nullpointer Exception");
        } catch (NullPointerException e) {
        };
    }

    @Test
    public void testMaxNegative() {
        Integer[] arr = {-4, 0};

        assertEquals("Успешно", 0, Calculator.max(arr));
    }

    @Test
    public void testMaxNIntegerMaxValue() {
        Integer[] arr = {Integer.MAX_VALUE, 0, 2, 3};
        assertEquals("Успешно", 3, Calculator.max(arr));
    }

    @Test
    public void testMax() {
        Integer[] arr = {};
        try {
            Calculator.max(arr);
            fail("Must throw Nullpointer Exception");
        } catch (NullPointerException e){} ;
    }
}
