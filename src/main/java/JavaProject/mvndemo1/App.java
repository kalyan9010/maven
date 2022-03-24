package JavaProject.mvndemo1;

/**
 * Hello world!
 *
 */

class Calculater{
	int number1;
	int number2;
	public int add(int number1, int number2) {
		return number1+number2;	
	}
	public int product(int number1, int number2) {
		return number1*number2;
	}
}




public class App 
{
    public static void main( String[] args )
    {
        Calculater calculater1 = new Calculater();
        calculater1.add(2, 4);
        calculater1.product(5, 4);
        		
    }
}
