package string;

public class InsertStringIntoAnother {
	public void insertString(String oldString,String stringtobeInserted,int index) {
		String newString=new String();	
		for(int i=0;i<oldString.length();i++) {
			newString=newString + oldString.charAt(i);
			if(i==index) {
				newString=newString + stringtobeInserted;
			}
			
		}
		System.out.println(newString);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oldString="krishnajadhav";
		String stringtobeInserted="dattatray";
		int index=6;
		InsertStringIntoAnother obj=new InsertStringIntoAnother();
		obj.insertString(oldString, stringtobeInserted, index);

	}

}
