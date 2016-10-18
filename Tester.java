
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char []ch = new char[26];
		for (int n = 65; n <= 90; n++){
			int m = n - 65;
			ch[m] = (char) n;
		}
		for (int n = 0; n <= 25; n++){
			System.out.print(ch[n] + ", ");
		}
	}

}
