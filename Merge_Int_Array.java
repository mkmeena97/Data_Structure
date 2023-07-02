import java.util.Scanner;

public class Merge_Int_Array
{
    public static int[] margeArray(int arr1[],int arr2[])
	{
		int arr3[]=new int[arr1.length+arr2.length];
		//System.out.println(arr3.length);
		int k = 0;
		for(int i=0;i<arr1.length;i++)
		{
			arr3[k++]=arr1[i];
			
			
		}
		for(int i=0;i<arr2.length;i++)
		{
			arr3[k++]=arr2[i];
			
			
		}
		return arr3;
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
		res=margeArray(arr1,arr2);
		display(res);

  }
}