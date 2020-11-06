import org.junit.Assert;
import org.junit.Test;
import sun.applet.Main;

public class Testing {
    @Test
    public void TestArr1 (){
        TestClass mainTest = new TestClass();
        Assert.assertArrayEquals(new int[]{5,6,7}, mainTest.after4(new int[] {3,4,5,6,7}));
        }

    @Test (expected = RuntimeException.class)
    public void TestArr2 (){
        TestClass mainTest = new TestClass();
        Assert.assertArrayEquals(new int[]{}, mainTest.after4(new int[] {3,5,6,7}));
        }

    @Test
    public void TestArr3 (){
        TestClass mainTest = new TestClass();
        Assert.assertArrayEquals(new int[]{5,4,5,7}, mainTest.after4(new int[] {4,5,4,5,7}));
    }

    @Test (expected = RuntimeException.class)
    public void TestArr4 (){
        TestClass mainTest = new TestClass();
        Assert.assertArrayEquals(new int[]{}, mainTest.after4(new int[] {}));
    }

    @Test
    public void TestArr5 (){
        TestClass mainTest = new TestClass();
        Assert.assertEquals(true, mainTest.test14(new int []{1,1,4,1,4}));
    }

    @Test
    public void TestArr6 (){
        TestClass mainTest = new TestClass();
        Assert.assertEquals(false, mainTest.test14(new int []{1,3,1,4,1,4}));
    }

    @Test
    public void TestArr7 (){
        TestClass mainTest = new TestClass();
        Assert.assertEquals(false, mainTest.test14(new int []{1,1,1,1,1}));
    }

    @Test
    public void TestArr8 (){
        TestClass mainTest = new TestClass();
        Assert.assertEquals(false, mainTest.test14(new int []{4,4,4,4}));
    }

}
