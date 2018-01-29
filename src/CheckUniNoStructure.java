import java.util.Arrays;

public class CheckUniNoStructure {
	public CheckUniNoStructure() {
		// TODO Auto-generated constructor stub
	}
	boolean checkUni(String input) {
		char [] array = new char[128];
		array=input.toCharArray();
		Arrays.sort(array);
		for(int i=0;i<input.length()-1;i++) {
			if(array[i]==array[i+1]) {
				return false;
			}
		}
		
		return true;
	}
}
