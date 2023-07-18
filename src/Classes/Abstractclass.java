package Classes;

abstract class Oop{
	private abstract void read() ;
	void write() {}
}

public class Abstractclass extends Oop {
	void read() {}
	public static void main(String[] args) {
		Abstractclass o=new Abstractclass();
		o.write();
	}

}
