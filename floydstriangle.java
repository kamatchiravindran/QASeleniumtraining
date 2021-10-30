package seleniumpractice;

public class floydstriangle {
	//Java program to print Floyd’s Triangle
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int num = 1;
		//n - no of rows
		System.out.println("Floyd's Triangle");
		for(int i=0;i<n;i++)
		{
		  for(int j= 0; j<i; j++)
		  {
			  System.out.print(num +" ");
			  num++;
		  }
		  System.out.print("\n");
		}
	}
}
