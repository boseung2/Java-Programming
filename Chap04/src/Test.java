import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Test{
	
	static int getHundredValue(int num) {
		return num/100;
	}
	
	static int getTenValue(int num) {
		num = num-(getHundredValue(num)*100);
		return num/10;
	}
	
	static int getOneValue(int num) {
		num = num-(getTenValue(num)*10);
		return num%10;
	}
	
	static int getRandomNumber() {
		int randomNum;
		while(true) {
			randomNum = ThreadLocalRandom.current().nextInt(111, 1000);
			if(getHundredValue(randomNum) != getTenValue(randomNum) &&
			   getHundredValue(randomNum) != getOneValue(randomNum) &&
			   getTenValue(randomNum) != getOneValue(randomNum) &&
			   getHundredValue(randomNum) != 0 &&
			   getTenValue(randomNum) != 0 &&
			   getOneValue(randomNum) != 0 
			   )
			break;
		}
		return randomNum;
	}
		
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int answer = getRandomNumber();
		int answerHundredValue = getHundredValue(answer);
		int answerTenValue = getTenValue(answer);
		int answerOneValue = getOneValue(answer);
		
		
		while(true) {
		System.out.print("���ڸ� �Է����ּ��� ex)123 : ");
		int inputNum = scanner.nextInt();
		int inputNumHundredValue = getHundredValue(inputNum);
		int inputNumTenValue = getTenValue(inputNum);
		int inputNumOneValue = getOneValue(inputNum);
		int strike= 0, ball = 0;
		if(inputNumHundredValue == answerHundredValue)
			strike++;
		if(inputNumHundredValue == answerTenValue)
			ball++;
		if(inputNumHundredValue == answerOneValue)
			ball++;
		if(inputNumTenValue == answerHundredValue)
			ball++;
		if(inputNumTenValue == answerTenValue)
			strike++;
		if(inputNumTenValue == answerOneValue)
			ball++;
		if(inputNumOneValue == answerHundredValue)
			ball++;
		if(inputNumOneValue == answerTenValue)
			ball++;
		if(inputNumOneValue == answerOneValue)
			strike++;
		
		if(strike == 3) {
			System.out.println("3��Ʈ����ũ");
			System.out.println("3���� ���ڸ� ��� �����̽��ϴ�! ��������");
			break;
		}else if(strike > 0 || ball > 0) {
			System.out.println(strike + "��Ʈ����ũ " + ball + "��");
			continue;
		}else {
			System.out.println("����");
			continue;
		}
				
		}
		scanner.close();
	}
	
	
}