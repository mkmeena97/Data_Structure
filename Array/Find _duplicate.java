import java.util.Scanner;
public class Find _duplicate
{
   public static int[] dublicateValue(int arr1[],int arr2[])
	{
		
		int k = 0,count=0;
		for(int i=0;i<arr1.length-1;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
					count++;	
			}
		}
		int []res= new int[count];
		for(int i=0;i<arr1.length-1;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
					res[k++]=arr2[j];	
			}
		}
		
		return res;
	}

   public static void accept(int arr[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter "+arr.length+  " Elements ");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
	}
	
    public static void display(int arr[])
	{
		System.out.println(" ----------  Array Is ------------ ");
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
		
			System.out.print("  "+arr[i]);
		}
		System.out.println();
		
	}

    public static void main(String[] args) {
		
		int asize ,bsize;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter size of array1 and array2");
		asize=sc.nextInt();
		bsize=sc.nextInt();
		
		int arr1[]=new int[asize];
		int arr2[]=new int[bsize];
		
		accept(arr1);
		accept(arr2);

		int res[];
		res=dublicateValue(arr1,arr2);
		display(res);

  }
}
