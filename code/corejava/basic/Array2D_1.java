public class Array2D_1 
{

	public static void main(String ar[])
	{
		double percent[][];
		percent = new double[3][6];
		percent[0][0] = 66.77;
		percent[1][2] = 77.0;
		percent[2][4] = 81.2;

		System.out.println("Total Rows : "+percent.length); // totoal number of rows 
		System.out.println("Total Column from row : "+percent[1].length); // totoal number of column in a given row

		//System.out.println(percent[1][2]);
		//System.out.println(percent[2][4]);
		//System.out.println(percent[2][2]);

		for(int r = 0; r<3 ; r++) {
			for(int  c=0 ; c<6 ; c++) {
				System.out.print(percent[r][c] + "\t");
			}
			System.out.println();
		}


	}
}