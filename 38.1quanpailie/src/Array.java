
public class Array {

	public static void f(char[] ch, int k) {
		for(int i = k;i<ch.length;i++){
			char temp = ch[k];
			ch[k] = ch[i];
			ch[i] = temp;
			
			f(ch,k+1);
			
			temp = ch[k];
			ch[k] = ch[i];
			ch[i] = temp;
			
		}
		
		if(k == ch.length){
			for (char c : ch) {
				System.out.print(c +" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		char ch[] = "abc".toCharArray();

		f(ch, 0);
	}

}
