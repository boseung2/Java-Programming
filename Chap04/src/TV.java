public class TV {
	private String manufacturer;
	private int year, inch;
	
	public TV(String manufacturer, int year, int inch) {
		this.manufacturer = manufacturer;
		this.year = year;
		this.inch = inch;
	}
	
	public void show() {
		System.out.println(manufacturer + "���� ���� " + year + "���� " + inch + "��ġ TV");
	}
	
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}

}
