package prototype;

public class Minuuttiviisari implements Viisari {

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

}
