package prototype;

public class Tuntiviisari implements Viisari{
	private int hours=0;
	private int hourLimit = 24;
	
	public Tuntiviisari(int hours) {
		this.hours=hours;
	}
	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		if(hours < hourLimit) {
			hours++;
		} else {
			hours=0;
		}
	
		
	}
	@Override
	public int showUnit() {
		// TODO Auto-generated method stub
		return hours;
	}
	
}
