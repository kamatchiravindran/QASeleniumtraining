package seleniumpractice;

public class stringswap {
	// To Perform string swap without temp variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "first";
		String str2 = "second";
		int str1len, str2len;
		
		System.out.println("Before Swapping");
		System.out.println("String 1 : " + str1);
		System.out.println("String 2 : " + str2);
		
		str1len = str1.length();
		str2len = str2.length();
	
		str1= str1 + str2;
		str2 = str1.substring(0,str1len);
		str1 = str1.substring(str1len, str1len+str2len);
		
		System.out.println("After Swapping");
		System.out.println("String 1 : " + str1);
		System.out.println("String 2 : " + str2);
		

	}

}
