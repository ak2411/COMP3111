package lab2.ex2;

interface Chargeable {
	public void charge();
}

public class Charger {
	public void charge(Chargeable c) { c.charge(); }

	public void charge(MobileComputer m) {
		// TODO Auto-generated method stub
		m.charge();
	}
}
