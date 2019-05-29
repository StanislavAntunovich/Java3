import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.geekbrains.lesson6.MainClass;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ArraysOneAndFourTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 3, 4, 5}, false},
                {new int[]{}, false},
                {new int[]{1, 1, 1, 1, 1}, false},
                {new int[]{4, 4, 4}, false},
                {new int[]{4, 1, 4, 4, 1, 1}, true},
                {new int[]{4, 4, 1, 4, 4, 4}, true},
        });
    }

    private int[] data;
    private boolean res;

    public ArraysOneAndFourTest(int[] data, boolean res) {
        this.data = data;
        this.res = res;
    }

    @Test
    public void test() {
        Assert.assertEquals(res, MainClass.checkForOneAndFour(data));
    }
}
