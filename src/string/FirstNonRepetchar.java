package string;

public class FirstNonRepetchar {
	void firstRepeat( String s) {
		int Char=256;
		int[]count=new int[Char];
		for(int i=0;i<=s.length()-1;i++) {
			count[s.charAt(i)]++;
			
		}
		for(int i=0;i<=s.length()-1;i++) {
			if(count[s.charAt(i)]==1) {
				System.out.println(s.charAt(i));
				break;
			}
		//	
		}
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="jadhavj";
		FirstNonRepetchar obj=new FirstNonRepetchar();
		obj.firstRepeat(s);

	}

}
