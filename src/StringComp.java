
public class StringComp {
		public StringComp() {
			// TODO Auto-generated constructor stub
		}
		String stringcmpress(String s) {
			int finalLength = compressedLength(s);
			int eachCharCount = 1;
			if(finalLength>=s.length()) {
				return s;
			}
			
			StringBuilder compressed = new StringBuilder(finalLength);
			for(int i = 1;i<s.length();i++) {
				eachCharCount++;
				if(i+1>=s.length() || s.charAt(i)!=s.charAt(i+1)) {
					compressed.append(s.charAt(i));
					compressed.append(eachCharCount);
					eachCharCount = 0;
				}
			}
			
			return compressed.toString();
		}
		
		
		int compressedLength(String s) {
			int result = 0;
			int eachCharCount = 1;
			
			for (int i = 0; i<s.length(); i++) {
				eachCharCount++;
				if( i+1 >= s.length() || s.charAt(i)!=s.charAt(i+1)) {
					result += 1 + String.valueOf(eachCharCount).length();
					eachCharCount=0;
				}
			}
			
			
			
			return result;
		}
		
		public static void main(String[] args) {
			StringComp s = new StringComp();
			System.out.println(s.stringcmpress("aabbbbbbccddeee"));
		}
}
