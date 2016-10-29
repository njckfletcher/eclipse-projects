package extrafront;

public class ExtraFront {
	public String extraFront(String str) {
		String firstTwoChars;
		  
		if(str.length() > 1) {
		  firstTwoChars = str.substring(0, 2);
		}
		else {
		  firstTwoChars = str.substring(0);
		}
		
		return firstTwoChars + firstTwoChars + firstTwoChars;
	}
	
	public String extraEnd(String str) {
		String text = str;
		String lastTwoChars;
		  
		if(text.length() > 1) {
			int point = text.length() - 2;
			lastTwoChars = text.substring(point, text.length());
		}
		else {
			lastTwoChars = text.substring(0);
		}
		
		return lastTwoChars + lastTwoChars + lastTwoChars;
	}

}
