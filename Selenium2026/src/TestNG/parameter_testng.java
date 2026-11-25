package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter_testng {

    @Parameters("a")
    @Test
    public void main(String s) {
        System.out.println("value is: " + s);
    }
}