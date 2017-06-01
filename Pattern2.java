public class Pattern2{
	public static void main(String args[]){
		for(int i=5;i>=1;i--)
		{

			for(int j=1;j<=i;j++){
				System.out.print(" ");

			}
			for(int k=5;k>=i;k--){
				System.out.print("1");
			}
			for(int l=4;l>=i;l--){
				System.out.print("1");
			}
			System.out.println( );
		}

	}
}
