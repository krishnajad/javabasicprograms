package pattern;

public class DiamondStarPattern {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) 
		{
			for(int j=5;j>i;j--) {
				System.out.print(" ");
				
			}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int l=1;l<5;l++) {
			for(int m=0;m<=l;m++) {
				System.out.print(" ");
			}
			for(int n=5;n>l;n--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
