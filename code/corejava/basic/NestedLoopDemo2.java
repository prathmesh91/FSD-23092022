/*
1
1	2
1	2	3
1	2	3	4
1	2	3	4	5

Rows : 5
Column : 5
*/
class NestedLoopDemo2
{
	public static void main(String ar[]) {
		for(int r=1; r<=5 ; r++) {   // ROW
			for(int c=1 ; c<=r; c++) {   // COLUMN
				System.out.print(c + "\t");
			}
			System.out.println();
		}
	}
}




