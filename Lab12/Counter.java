//Hlazkova Alina 346316979
public class Counter {

	String word;
	int counter;
	
	public Counter(String word)
	{
		setWord(word);
		counter = 1;
	}
	public void increaseCounter()
	{
		counter++;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getWord() {
		return word;
	}
	
	public String print()
	{
		return word + " " + counter;
	}
}
