package Sum;

public class AdditionArray {
		public static void main(String args[]) {
			int arr[]={10,20,30,40,50};
			int sum=0;
			/*for(int i=0;i<=4;i++){
				System.out.println(arr[i]);
			
			}*/
			for(int num:arr){
				sum=sum+num;
			}
			System.out.println("sum of array elements is:"+sum);
		}

}
