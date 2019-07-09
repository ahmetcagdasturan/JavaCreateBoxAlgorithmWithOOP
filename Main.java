import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Box kutu = new Box();
		int num;
		int num2;
		
        do {
        	menu();
        	num = input.nextInt();
		if(num==1) 
		{
			num2=input.nextInt();
			kutu.size(num2); 
			System.out.println("Box is created");
			System.out.println("Size = " + kutu.size(num2));
		}
		else if(num==2) 
		{
			kutu.incrementBox();
		}
		else if(num==3) 
		{
			kutu.decrementBox();
		}
		else if(num==4)
		{
			kutu.drawBox();
		}
		else if(num==5)
		{
			System.out.println("Area: " + kutu.getArea());
		}
		
        }while(num !=6);
        
        
	}
	public static void menu() 
	{
		System.out.println("1-Create box");
		System.out.println("2-Increment box size");
		System.out.println("3-Decrement box size");
		System.out.println("4-Draw box");
		System.out.println("5-Print box area");
		System.out.println("6-Exit program");
	}

}
