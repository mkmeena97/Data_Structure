package character_stack;

public class Cstack {
	private int top,size;
	private char arr[];
	
	
	
	public Cstack() 
	{
		super();
	}

	public Cstack(int size)
	{
		top=-1;
		this.size=size;
		arr=new char[size];
	}
	
	public boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
		
	}
	
	public boolean isFull()
	{
		if(top==size-1)
			return true;
		else
			return false;
	}
	
	public void push(char data)
	{
		if(!isFull())
		{
			arr[++top]=data;
		}
		else
			System.out.println("stack is full");
	}
	public char  pop()
	{
		char data=' ';
		if(!isEmpty())
			data=arr[top--];
		
		return data;
			
	}
	
	public String toString()
	{
		String str = " ";
		for(int i=top;i>=0;i++)
		{
			str+=arr[i];
			str=str+" ";
		}
		return str;
	}
	
	public void display()
	{
		if(!isEmpty())
		{
			System.out.println("-------Stack is-----------");
			for(int i=top;i>=0;i--)
			{
				System.out.println(" "+arr[i]);
			}
		}
	}

}
