public class A {
	static int count=0;
	private int x;
	public A(int x) {this.x=x;count++;}
	public A(){ this(0);}
	public A(A obj ) {x=obj.x;count++;}
	public int getA() { return x;}
	public A setA( int n) {
		x=n;
		return this;
	}
	protected void printA() {
		System.out.println("value: "+x+" ");
	}
	static int getCount(){return count;}
}
