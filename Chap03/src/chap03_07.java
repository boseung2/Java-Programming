public class chap03_07 {
	public static void main(String[] args) {
		
		int[] randomIntArray = new int[10];
		int sum = 0;
		
		for(int i=0; i<10; i++) { 
			randomIntArray[i] = (int)(Math.random()*10 + 1);
			sum += randomIntArray[i];
		}
		
		System.out.print("������ ������ : ");
		for(int i=0; i<10; i++)
			System.out.print(randomIntArray[i] + " ");
		System.out.println();
		System.out.print("����� : ");
		System.out.print(sum/randomIntArray.length);
		
		
	}
	
}
