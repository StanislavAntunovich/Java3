import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.geekbrains.lesson6.MainClass;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class AfterFourTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{5, 6, 7}},
                {new int[]{1, 4, 3, 4, 4, 6, 7}, new int[]{6, 7}},
                {new int[]{1, 2, 3, 4, 5, 6, 4}, new int[0]},
                {new int[]{3, 4, 5}, new int[]{5}},
                {new int[]{4, 2, 3, 5, 6, 7}, new int[]{2, 3, 5, 6, 7}},
        });
    }

    private int[] dataArray;
    private int[] resArray;

    public AfterFourTest(int[] dataArray, int[] resArray) {
        this.dataArray = dataArray;
        this.resArray = resArray;
    }


    @Test
    public void test() {
        Assert.assertArrayEquals(resArray, MainClass.getAfterFour(dataArray));
    }

}
