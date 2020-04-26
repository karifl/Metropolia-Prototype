package prototype;

public class Kello2 implements Cloneable{

	private Sekuntiviisari second;
	private Minuuttiviisari minute;
	private Tuntiviisari hour;
	
	private int seconds=0;
	private int minutes=0;
	private int hours=0;
	
	private int secondLimit = 60;
	private int minuteLimit = 60;
	private int hourLimit = 24;
	
	
	
	public Kello2(int hours, int minutes, int seconds){
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
	
	//luo deep copyn
	
	protected Kello2 clone() throws CloneNotSupportedException{
		Kello2 Tock = new Kello2(this.hours,this.minutes,this.seconds);
		
		return Tock;
		
	}
	
	
	
}
