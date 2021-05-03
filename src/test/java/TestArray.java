import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestArray {

    @Test
    public void arrTaskOneTest1(){
        int[] in = new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] out = new int[]{1, 7};
        Assertions.assertArrayEquals(out, Main.arrTaskOne(in));
    }

    @Test
    public void arrTaskOneTest2(){
        int[] in = new int[]{1, 2, 4, 3, 4};
        int[] out = new int[]{};
        Assertions.assertArrayEquals(out, Main.arrTaskOne(in));
    }

    @Test
    public void arrTaskOneTest3(){
        int[] in = new int[]{1, 2, 44, 24, 3, 7};
        Assertions.assertThrows(RuntimeException.class, ()->{
            Main.arrTaskOne(in);
        });
    }

    @Test
    public void arrTaskTwoTest1(){
        int[] in = new int[]{1, 1, 1, 4, 4, 1, 4, 4};
        boolean out = true;
        Assertions.assertEquals(out, Main.arrTaskTwo(in));
    }

    @Test
    public void arrTaskTwoTest2(){
        int[] in = new int[]{1, 1, 1, 1, 1, 1};
        boolean out = false;
        Assertions.assertEquals(out, Main.arrTaskTwo(in));
    }

    @Test
    public void arrTaskTwoTest3(){
        int[] in = new int[]{4, 4, 4, 4};
        boolean out = false;
        Assertions.assertEquals(out, Main.arrTaskTwo(in));
    }

    @Test
    public void arrTaskTwoTest4(){
        int[] in = new int[]{1, 4, 4, 1, 1, 4, 3};
        boolean out = false;
        Assertions.assertEquals(out, Main.arrTaskTwo(in));
    }
}
