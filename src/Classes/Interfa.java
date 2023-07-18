package Classes;

interface Interface1{
	int x=30;
	void read();
}
interface Interface2{
	void read();
}
public class Interfa implements Interface1,Interface2 {
	public void read(){
	}

	public static void main(String[] args) {
		Interface2 i=new Interfa();
		System.out.println(x);
	}

}
