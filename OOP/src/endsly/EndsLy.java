package endsly;

public class EndsLy {
	
	public EndsLy() {
		
	}
	
	public boolean endsLy(String str) {
		
		if(str.length() > 1) {
			int indexLastTwo = str.length() - 2;
			String lastTwoChars = str.substring(indexLastTwo, str.length());
			
			if(lastTwoChars.contains("ly")) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}

}
