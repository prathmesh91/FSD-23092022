/*
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5

Rows : 3
Column : 5
*/

class NestedLoopDemo1
{
	public static void main(String ar[]) {
		for(int r=1; r<=3 ; r++) {   // ROW
			for(int c=1 ; c<=5; c++) {   // COLUMN
				System.out.print(c + "\t");
			}
			System.out.println();
		}
	}
}




