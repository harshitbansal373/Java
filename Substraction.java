public class Addition{

	public static int add(int num1,int num2){

			int sum = num1 + num2;
			//int sum = num1 * 2;

			return sum;
	}



}


class AdditionTest{

	public static int test1()
	//unit test 1
	{
		int ans1 = Addition.add(2, 3);
		assert ans1 == 5 : "Addition Test1 Incorrect";
		return ans1;
	
	}

	public static void test2()
	{
		//unit test 2
		int ans2 = Addition.add(7,3);
		assert ans2 == 10: "Addition Test2 Incorrect";
	}

	public static void test3()
	{
		//unit test 3
		int ans3 = Addition.add(2,6);
		assert ans3 == 8: "Addition Test3 Incorrect";
	}

	public static void critical1()
	{
		//unit test 4
		int ans4 = Addition.add(2,2);
		assert ans4 == 4 :"Addition Test4 Correct" ;
	}

	public static void unit(){
		test1();
		test2();
		test3();
		critical1();

	}	
	public static void main(String[] args) {
		
		//System.out.println("test succesful");
		/*test1();
		test2();
		test3();
		critical1();

*/
		unit();
	}

}

