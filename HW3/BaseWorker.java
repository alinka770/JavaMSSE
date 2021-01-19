//Hlazkova Alina 346316979
public class BaseWorker implements IPerson{
	
	private int hours;
	private String position;
	
	public BaseWorker(int hours, String position)
	{
		setHours(hours);
		setPosition(position);
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public void print() {
		System.out.println("worker");
		System.out.println("Work hours: " + hours);
		System.out.println("Position: " + position);	
	}

}
