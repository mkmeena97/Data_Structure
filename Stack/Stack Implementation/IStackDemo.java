
import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;
public class IStackDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		IStack m1 = new IStack(10);
		int element;
		
		int choice=1;
		do
		{
			System.out.println("1. push");
			System.out.println("2. pop");
			System.out.println("3.peek)");
			System.out.println("4. Display");
			System.out.println("5. Exit ");
			System.out.println("Enter your choice ");
			choice=sc.nextInt();
			
		switch(choice)
		{
		case 1:
			System.out.println("Enter Element  ");
			element = sc.nextInt();
			m1.push(element);
			break;
			
		case 2:
			element = m1.pop();
			if(element==-9999)
			{
				System.out.println("STACK IS EMPTY!!!!!");
			}
			else
				System.out.println("DELETED/Poped ELEMENT IS :[ "+element+ " ]");
			
			break;
			
		case 3 :
			element=m1.peek();
			if(element==-9999)
			{
				System.out.println("STACK IS EMPTY !!!!!");
			}
			else
				System.out.println("TOPMOST ELEMENT IS :[ "+element+" ]");
			
			break;
			
		case 4:
			System.out.println("STACK ELEMENT : [ "+m1.toString()+" ]");
			
			break;
			
		case 5:
			break;

		}
		
			
		}while(choice!=0);
		
		
		

	}

}
