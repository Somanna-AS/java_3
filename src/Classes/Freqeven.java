package Classes;

public class Freqeven {
	public static void main(String[] args) {
        String ip= "hellolelelee";

        int[] freq = new int[127];
        for (int i=1;i<ip.length();i+= 2) {
            char ch = ip.charAt(i);
            freq[ch]++;
        }

        for (int i=0;i<freq.length;i++) {
            if (freq[i]>0){
                char ch =(char)i;
                System.out.println("Character: "+ch+"  Frequency: "+freq[i]);
            }
        }
    }
}







