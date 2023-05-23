import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass {
    @BeforeMethod
    public  void BeforeMethod(){
        System.out.println("This is before method");
    }
    @Test
    public void FirstTest(){
        System.out.println("The sum is");
        AddClass addClass=new AddClass();
        int res=addClass.getsum(2,3);
        Assert.assertEquals(5,res);


    }
    @Test
    public  void SecondTest(){
        System.out.println("This is second Test ");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("This is After methid");
    }
}
