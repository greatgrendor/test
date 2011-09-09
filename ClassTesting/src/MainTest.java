
public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Class c = null;
		try {
			c = Class.forName("MainTest.FirstTest");
			c.newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static class FirstTest
	{
		public FirstTest(){
			System.out.println("created first test");
		}
	}

}
