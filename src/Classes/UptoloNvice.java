package Classes;

public class UptoloNvice {
	public static void Con(char a) {
		int lost=97,loen=122,upst=65,upen=90,diff;
		if((int)a>=lost&&(int)a<=loen) {
			diff=(int)a-lost;
			System.out.print((char)(upst+diff));
	}
		else if((int)a>=upst&&(int)a<=upen) {
			diff=(int)a-upst;
			System.out.print((char)(lost+diff));
		}
		else
			System.out.print(a);
}

	public static void main(String[] args) {
		String s="asdFGH gh";
		for(int i=0;i<s.length();i++) {
			Con(s.charAt(i));
		}
	}

}
