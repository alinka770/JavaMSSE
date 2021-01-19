//Hlazkova Alina 346316979
public class Worker extends Person implements IHours
{
	private BaseWorker worker;
	
	public Worker(String name, int hours, String position) {
		super(name);
		worker = new BaseWorker(hours, position);
	}
	
	public int getHours() {
		return worker.getHours();
	}
	
	public String getPosition() {
		return worker.getPosition();
	}
	

	@Override
	public void print() {
		super.print();
		worker.print();
	}

	@Override
	public int getAllHours() {
		return getHours();
	}
	
}
