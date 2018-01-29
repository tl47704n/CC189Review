
public class OneWay {
		public OneWay() {
			// TODO Auto-generated constructor stub
		}
		
		
		boolean checkInsert(String first, String second) {
			String longer = first.length() > second.length() ? first : second;
			String shorter = first.length() < second.length() ? first : second;
			if(longer.length()-shorter.length()>1) return false;
			int index1 = 0, index2 = 0;
			boolean founddiffer=false;
			while(index1<shorter.length() && index2<longer.length()) {
			if(shorter.charAt(index1)!=longer.charAt(index2)) {
				if (founddiffer) {
					return false;
				}
				founddiffer = true;

			}
			else {
				index1++;
			}
			index2++;

		}

		return true;
	}

		public static void main(String[] args) {
			OneWay o = new OneWay();
			System.out.println(o.checkInsert("pale", "bae"));
		}
}
