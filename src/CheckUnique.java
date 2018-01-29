
public class CheckUnique {
	public CheckUnique() {
		// TODO Auto-generated constructor stub
	}
	boolean check(String input) {
		boolean [] array = new boolean[128];
		for(int i=0;i<input.length();i++) {
			if(array[input.charAt(i)]) {
				return false;
			}
			array[input.charAt(i)]=true;
			
		}
		
		return true;
		
	}
	
	
}
