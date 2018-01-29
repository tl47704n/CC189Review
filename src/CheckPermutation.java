import java.util.Arrays;

public class CheckPermutation {
	public CheckPermutation() {
		// TODO Auto-generated constructor stub
	}
	
	String sort(String input) {
		char [] chararray = input.toCharArray();
		Arrays.sort(chararray);
		return new String(chararray);
	}
	boolean checkPermu(String a, String b) {
		if(a.length()!=b.length()) {
			return false;
		}
		return sort(a).equals(sort(b));
	}
}
