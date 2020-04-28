package prototype;

public class Minuuttiviisari implements Viisari, Cloneable {

	private int minutes=0;
	private int minuteLimit = 60;
	
	public Minuuttiviisari(int minutes) {
		this.minutes = minutes;
	}
	
	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		if(minutes < minuteLimit ) {
			minutes++;
		} else {
			minutes=0;
		}

	}

	@Override
	public int showUnit() {
		// TODO Auto-generated method stub
		return minutes;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}

}
