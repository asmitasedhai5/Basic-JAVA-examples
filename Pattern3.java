public class Pattern3{
	public static void main(String args[]){
		for(int i=5;i>=1;i--)
		{

			for(int j=4;j>=i;j--){
				System.out.print(" ");

			}
			for(int k=1;k<=i;k++){
				System.out.print("1");
			}
			for(int l=1;l<=i-1;l++){
				System.out.print("1");
			}

			System.out.println( );
		}

	}
}
