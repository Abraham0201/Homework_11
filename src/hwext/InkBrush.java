package hwext;

public class InkBrush extends Pen {
	public InkBrush() {

	}

	public InkBrush(String brand, double price) {
		super(brand, price);
	}

	@Override
	public double getPrice() {
		return super.getPrice() * 0.9;
	}

	@Override  //延續覆寫abstract
	public void write() {
		System.out.println("沾墨汁再寫");
	}

}
