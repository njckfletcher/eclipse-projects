package lineeditor;

public class MyLine {
	
	String lineText;
	
	public MyLine(String name) {
		// System.out.println("Line Created.");
		lineText = name;
	}
	
	public void insert(String str, int index) {
		if(-1 < index && index < lineText.length() + 1) {
			lineText = lineText.substring(0, index) + str + lineText.substring(index);
		}
		else {
			System.out.println("Invalid command!");
		}
	}
	
	public void delete(String str) {
		
		if(lineText.contains(str)) {
			int PositionBeforeString;
			int PositionAfterString;
		
			String firstSet;
			String secondSet;
		
			PositionBeforeString = lineText.indexOf(str);
			PositionAfterString = PositionBeforeString + str.length();
		
			firstSet = lineText.substring(0, PositionBeforeString);
			secondSet = lineText.substring(PositionAfterString);
		
			lineText = firstSet + secondSet;
			}
			else {
				System.out.println("Invalid command!");
			}
			
	}
	
}
