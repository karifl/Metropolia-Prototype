package prototype;

public class Kello implements Cloneable{

	private Sekuntiviisari second;
	private Minuuttiviisari minute;
	private Tuntiviisari hour;
	
	private int seconds=0;
	private int minutes=0;
	private int hours=0;
	
	private int secondLimit = 60;
	private int minuteLimit = 60;
	private int hourLimit = 24;
	
	
	
	public Kello(int hours, int minutes, int seconds){
		this.hours = hours;
		this.seconds = seconds;
		this.minutes = minutes;
		this.second = new Sekuntiviisari(this.seconds);
		this.minute = new Minuuttiviisari(this.minutes);
		this.hour = new Tuntiviisari(this.hours);
	}

	public void tick() {
	//	ShowClock();
		System.out.println("Tick");
		second.calculate();
		
		if(second.showUnit() == secondLimit) {
			second.calculate();
			minute.calculate();
			if(minute.showUnit() == minuteLimit) {
				minute.calculate();
				hour.calculate();
				if(hour.showUnit() == hourLimit) {
					hour.calculate();
				}
			}
		}
	}
	public void ShowClock() {
		System.out.println(hour.showUnit()+ " : " + minute.showUnit() + " : " + second.showUnit());
	}
	
	
	//luo shallow-copy
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
	
	
	
	
	
}
