package string;

public class reverseTheWord {
	 public void reverseWords(String S)
	    {
	        String arr[]=S.split(" ");
	        String reverseString="";
	        for(int i=arr.length-1;i>=0;i--){
	            reverseString=reverseString+arr[i]+".";
	            
	        }
	        String newString=reverseString.substring(0,reverseString.length()-1);
	        System.out.println(newString);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="i am krishna jadhav";
		reverseTheWord obj=new reverseTheWord();
		obj.reverseWords(S);
		
		

	}

}
