<<<<<<< HEAD
/*
 *Brittany Couts, Gabby Strong, Brock
 *4/20/2018
 *
 *This is the tester
*/

=======
>>>>>>> 6b0128955bbb90113c76c4fb794bccf7d5c0ebb6
import minchange.outlab4.CoinChanging;
import org.junit.Assert;
import org.junit.Test;


public class JUnitRun 
{ 
    int[] UScoins = { 1, 5, 10, 25 };
    //test one test coins 42
    @Test
    public void test1()
    {
        int[] expected = {1,1,5,10,25};
        
        int coins = 42;
        Assert.assertArrayEquals(expected,CoinChanging.run(UScoins,coins));
    }
    
    //test with 50 cents
    @Test
    public void test2()
    {
        int[] expected = {25,25};

        int coins = 50;
        Assert.assertArrayEquals(expected,CoinChanging.run(UScoins,coins));
    } 
    
    //test of 5
    @Test
    public void test3()
    {
        int[] expected = {5};

        int coins = 5;
        Assert.assertArrayEquals(expected,CoinChanging.run(UScoins,coins));
    }
    
    //testing empty array
    @Test(expected = IllegalArgumentException.class)
    public void EmptyArray()
    {
        
        int array[] = {};
        int coins = 10;
        Assert.assertArrayEquals(null,CoinChanging.run(array,coins));
        
    }

}
