package string;

public class MaxRepitativeChar {

	public static void main(String[] args) {
		String s1="hi my name is krishna jadhav KKKKK kkkkkkkk ";
		String s=s1.replaceAll("\\s", "").toLowerCase();// it will remove all white spaces
		//String s=s2.toLowerCase();
		System.out.println(s);
		int arr[]=new int[256];
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)]=arr[s.charAt(i)]+1;
			
		}
		int max=-1;
		char c=' ';
		for(int i=0;i<s.length();i++) {
			if(max<arr[s.charAt(i)]) {
				max=arr[s.charAt(i)];
				c=s.charAt(i);
			}
		}
		System.out.println("Maximum Repitative char in String is  : "+c);
		

	}

}
