package prototype;

public class TickTock {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Kello Ticker = new Kello (23,59,50);
		Kello2 Tocker = new Kello2(12,0,0);
		int i= 0;
		int limit = 160;
	

/*		while(i < limit) {		
		Ticker.tick();
		i++;
		}*/
		System.out.println("Ticker luo shallow copyn Cuckoo");
		System.out.println("\n");
		//luodaan shallow -copy
		Kello Cuckoo = (Kello)Ticker.clone();
				
		System.out.println("Tickerin aika");
		Ticker.ShowClock();
		System.out.println("Cuckoon aika");
		Cuckoo.ShowClock();
		
		System.out.print("Cuckoo tikittää: ");
		Cuckoo.tick();
		System.out.println("");
		System.out.println("Tickerin aika");
		Ticker.ShowClock();
		System.out.println("Cuckoon aika");
		Cuckoo.ShowClock();		
		
		
		System.out.println("");
		System.out.println("Tocker luo deep copyn Deep_Tockerin");
		System.out.println("\n");
		//luodaan deep -copy
		Kello2 Deep_Tocker = Tocker.clone();
		
		System.out.println("Tockerin aika");
		Tocker.ShowClock();
		System.out.println("Deep_Tockerin aika");
		Deep_Tocker.ShowClock();
		
		System.out.print("Deep_Tocker tikittää: ");
		Deep_Tocker.tick();
		System.out.println("");
		System.out.println("Tockerin aika");
		Tocker.ShowClock();
		System.out.println("Deep_Tockerin aika");
		Deep_Tocker.ShowClock();
	}

}
