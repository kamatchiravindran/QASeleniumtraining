package seleniumpractice;

public class primenumbersum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isprimeflg;
		int count = 1;
		int i = 2; 
		int sum = 0;
		System.out.println("First 10 Prime numbers");
		while(count<=10)
		{
			isprimeflg = true;
			for(int j = 2; j<=(i/2); j++)
			{
				if (i%j == 0)
					isprimeflg = false;
			}
			if (isprimeflg)
			{
				System.out.println(i);
				count++;
				sum += i;
			}
			i++;
		}
		System.out.println("Sum of first 10 prime numbers : "+ sum);
	}

}
