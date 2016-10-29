package withoutx2;

public class WithoutX2 {
	public String withoutX2(String str) {
		String text = str;
		String firstChar;
		String secondChar;
		
		if(text.length() > 1) {
			firstChar = text.substring(0, 1);
			secondChar = text.substring(1, 2);
			//System.out.println(firstChar + " and " + secondChar);
			
			if(firstChar.contains("x")) {
				int point = text.indexOf(firstChar);
				text = text.substring(point + firstChar.length(), text.length());
			}
			if (secondChar.contains("x")) {
				int point = text.indexOf(secondChar);
				if(firstChar.contains("x")) {
					text = text.substring(point + secondChar.length(), text.length());
				}
				else {
					String firstSet = text.substring(0, point);
					String secondSet = text.substring(point + secondChar.length(), text.length());
					text = firstSet + secondSet;
				}
			}
		}
		else {
			if(text.contains("x")) {
				text = "";
			}
		}
				
		return text;
		
	}
}
