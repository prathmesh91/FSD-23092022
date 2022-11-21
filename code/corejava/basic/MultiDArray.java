public class MultiDArray 
{

	public static void main(String ar[])
	{
		int percent[][] = {
							{23,46,67,32},
							{3,65},
							{76,45,67,34,67,3}
						};
						
		System.out.println("Total Rows : " + percent.length);
		System.out.println("Total columns : " + percent[1].length);
		
		
		
		for(int i=0 ; i< percent.length ; i++) {
			for(int j=0 ; j< percent[i].length ;j++) {
				System.out.print(percent[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}