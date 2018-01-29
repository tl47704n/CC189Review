
public class ParlidromeOfPermutation {
	public ParlidromeOfPermutation() {
		// TODO Auto-generated constructor stub
	}
	boolean isParlidrome(String input) {
		return checkMaxOdd(getHashTable(input));
		
		
	}
	
	boolean checkMaxOdd(int[] array) {
		boolean foundOdd = false;
		for (int i : array) {
			if(i%2==1) {
				if(foundOdd ==true) {
					return false;
				}
				foundOdd=true;
			}
		}
		return true;
		
	}
	
	int getCharNumber(char c) {
		if(c<='z' && c>='a') {
			int result=c-'a';
			return result;
		}
		else
		return -1;
	}
	int [] getHashTable(String input) {
		int [] intarray = new int['z'-'a'+1];
		char [] chararray = input.toCharArray();
		
		for(char c : chararray) {
			int x = getCharNumber(c);
			if(x!=-1) {
				intarray[x]++;
			}
			
		}
		
		
		return intarray;
	}
	public static void main(String[] args) {
		ParlidromeOfPermutation p = new ParlidromeOfPermutation();
		System.out.println(p.isParlidrome("abcbaa"));
		
	}
}
