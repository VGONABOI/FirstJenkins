package FirstSelenium1.Sample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstTest {
	
	@Test(dataProvider="first")
	public void run(String first,String second)
	{
		System.out.println("it is working");
		System.out.println(first+second);
	}
	
	@Test
	public void sun()
	{
		System.out.println("it is sun");
	}
	
	@Test(groups= {"test1"})
	public void dus()
	{
	   System.out.println("it is groups");	
	}
	@Test(groups= {"test2"})
	public void dus1()
	{
	   System.out.println("it is groups work");	
	}
	
	@DataProvider(name="first")
	public Object[][] get1()
	{
		Object[][] arr = {{"somesh","sanjana"},{"srujana","sanjeevini"}};
		return arr;
	}


}
