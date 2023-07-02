import java.util.Scanner;

public class PostfixExpression {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Postfix expression");
		String str=sc.next();
		IStack m=new IStack(str.length());
		int x;
		boolean flag=true;
		for(int i=0;i<str.length();i++)
		{
			int ch = str.charAt(i);
			
			if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
			{
				System.out.println("enter value of : "+(char)ch);
				ch=sc.nextInt();
				m.push(ch);
			}
			else
			{
				if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
				{
					int n2=m.pop();
					int n1=m.pop();
					if(ch=='+')
					{
						x=n1+n2;
						m.push(x);
						flag=true;
					}
					if(ch=='-')
					{
						x=n1-n2;
						m.push(x);
						flag=true;
					}
					if(ch=='*')
					{
						x=n1*n2;
						m.push(x);
						flag=true;
					}
					if(ch=='/')
					{
						x=n1/n2;
						m.push(x);
						flag=true;
					}
				}
				else
				{
					System.out.println("Given expression is not correct");
					flag=false;
					break;
				}
			}
		}
		if(flag==true)
		System.out.println(m.toString());
		
		
	}

}