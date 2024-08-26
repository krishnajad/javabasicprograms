package string;

public class palliWithoutOtherString {
	public void palindromee(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j)) 
			{
				System.out.println("not pallindrome");
				break;
			}
				else 
				{
					i++;
					j--;
			}
				
		}
		System.out.println("pallindrome");
		
	}

	public static void main(String[] args) {
		String str="madamh";
		palliWithoutOtherString obj=new palliWithoutOtherString();
		obj.palindromee(str);
		
		
		
		

	}

}
