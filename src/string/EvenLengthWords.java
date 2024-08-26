package string;

public class EvenLengthWords {
	public void stringp( String s) {
		String [] words=s.split(" ");
		int [] wordlength =new int[words.length];
		for(int i=0;i<words.length;i++) {
			wordlength[i]=words[i].length();
			
			
		}
		for(int j=0;j<words.length;j++) {
			if(wordlength[j]%2==0) {
				
				System.out.println(words[j]);
			}
			
			
		}
		
		
	}

	public static void main(String[] args) {
		String s="hi i am krishna jadhav";
		EvenLengthWords obj=new EvenLengthWords();
		obj.stringp(s);
		
		
	}

}
