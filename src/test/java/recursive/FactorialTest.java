package recursive;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {


    @Test
    public void factorial() {


        Factorial factorial = new Factorial();


        Assert.assertEquals(1, factorial.recursive(0));
        Assert.assertEquals(1, factorial.recursive(1));
        Assert.assertEquals(2, factorial.recursive(2));
        Assert.assertEquals(6, factorial.recursive(3));
        Assert.assertEquals(24, factorial.recursive(4));
        Assert.assertEquals(120, factorial.recursive(5));



    }

    @Test
    public void recursive() {


        Factorial factorial = new Factorial();

        Assert.assertEquals(1, factorial.recursive(0));
        Assert.assertEquals(1, factorial.recursive(1));
        Assert.assertEquals(2, factorial.recursive(2));
        Assert.assertEquals(6, factorial.recursive(3));
        Assert.assertEquals(24, factorial.recursive(4));
        Assert.assertEquals(120, factorial.recursive(5));


    }


}