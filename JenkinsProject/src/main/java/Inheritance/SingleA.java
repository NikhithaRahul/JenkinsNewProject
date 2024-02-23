package Inheritance;

public class SingleA extends Single{
	public void show()
	{
		System.out.println("Morning");
	}

	public static void main(String[] args) {
		SingleA obj = new SingleA();
		obj.display();
		obj.show();
		
	}

}
