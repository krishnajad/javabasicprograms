package string;


public class isPallindrome {
	public void pallindrome(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
			
		}
		System.out.println("The reverse string is "+rev);
		if(str.equals(rev)) {
			System.out.println("The string is palindrome");
		}
		else
		{
			System.out.println("The string is not palindrome");
		}
		
		
	}

	public static void main(String[] args) {
		String str="madam";
		isPallindrome obj=new isPallindrome();
		obj.pallindrome(str);

	}

}
