import java.util.Scanner;

public class chap03_08 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
						
			System.out.print("���� �?");
			int intCount = scanner.nextInt();
			int row = intCount/10;
			int column = intCount%10;
			int randomInt;
			int[][] intArray = new int[row][];
			
			
			for(int i=0; i<row; i++) {
				for(int j=0; j<10; j++) {
					randomInt = (int)(Math.random()*100+1);
					intArray[i][j] = randomInt;
					//if(i == (row-1) && j == (column-1) ) break;
				}
			}
			
		/*	for(int i=0; i<row; i++) {
				for(int j=0; j<10; j++) {
					System.out.println(intArray[i][j] + " ");
					if(i == (row-1) && j == (column-1) ) break;
				}
				System.out.println();
			}			
		*/

	}

}
