package prototype;

public class Sekuntiviisari implements Viisari, Cloneable {

	private int seconds = 0;
	private int secondLimit = 60;
	
	public Sekuntiviisari(int seconds) {
		this.seconds = seconds;
	}
	
	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		if(seconds < secondLimit) {
			seconds++;
		} else {
			seconds=0;
		}
	
	}

	@Override
	public int showUnit() {
		// TODO Auto-generated method stub
		return seconds;
	}
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}


}
