import java.util.Scanner;

class Day{
	private String work;
	public void set(String work) { this.work = work;}
	public String get() { return work; }
	public void show() {
		if(work == null) System.out.println("�����ϴ�.");
		else System.out.println(work + "�Դϴ�.");
	}
}

public class MonthSchedule {
	private int nDays;
	private Day days[]; 
	private Scanner scanner;
	
	public MonthSchedule(int nDays){
		this.nDays = nDays;
		this.days = new Day [nDays];
		for(int i=0; i<nDays; i++) {
			days[i] = new Day();
		}
		scanner = new Scanner(System.in);
	}
	
	public void inPut() {
		System.out.print("��¥(1~30)?");
		int inputDay = scanner.nextInt();
		System.out.print("����(��ĭ�����Է�)?");
		String work = scanner.next();
		days[inputDay-1].set(work); 
		System.out.println();
	}
	
	public void see() {
		System.out.print("����(1~30)?");
		int inputDay = scanner.nextInt();
		System.out.println((inputDay) + "���� �� ���� " + days[inputDay-1].get() + "�Դϴ�.");;
		System.out.println();
	}
	
	public void finish() {
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	public void run() {
		System.out.println("�̹��� ������ ���� ���α׷�.");
		while(true) {
		System.out.print("����(�Է�:1, ����:2, ������:3) >>");
		int inputNum = scanner.nextInt();
		if(inputNum == 1) { 
			inPut();
			continue;
		}else if(inputNum == 2) {
			see();
			continue;
		}else if(inputNum == 3) {
			finish();
			break;
		}else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			continue;
		}
		}
	}
	
	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();

	}

}
