
public class IStack {
	int arr[];
	int size;
	int top;
	
	public IStack()
	{
		
	}
	public IStack(int size)
	{
		this.size=size;
		arr=new int[size];
		top=-1;
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
		if(top==(size-1))
			return true;
		else 
			return false;
	}
	public void push(int element)
	{
		if(isFull())
		{
			System.out.println("stack is full !!!!!!");
		}
		else
		{
			arr[++top]=element;
		}
		
	}
	public int pop()
	{
		int element;
		if(isEmpty())
		{
			element=-9999;
		}
		else
		{
			element =arr[top--];
		}
		return element;
	}
	
	public int peek()
	{
		int element;
		if(isEmpty())
		{
			element=-9999;
		}
		else
			element=arr[top];
		
		return element;
	}
	
	public String toString()
	{
		String str=" ";
		for(int i=top;i>=0;i--)
		{
			str+=arr[i];
			str+=" ";
		}
		return str;
	}
	
	

}
