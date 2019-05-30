import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.geekbrains.lesson6.MainClass;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class AfterFourExceptionTest {

    @Parameterized.Parameters
    public static Collection<Object[]> exceptionData() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 3, 5}},
                {new int[]{}},
                {new int[]{1, 3, 42, 865, 34}},
        });
    }

    private int[] exceptionData;

    public AfterFourExceptionTest(int[] exceptionData) {
        this.exceptionData = exceptionData;
    }

    @Test(expected = RuntimeException.class)
    public void test() {
        MainClass.getAfterFour(exceptionData);
    }
}
