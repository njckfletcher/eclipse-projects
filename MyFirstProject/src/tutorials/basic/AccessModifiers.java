package tutorials.basic;

public class AccessModifiers {
	
	// private is the most restrictive
	// default
	// protected
	// public
	
	private int x;
	public int y;
	int w;
	protected int z;
	
	public static void main(String[] args) {
		
	}
	
	// public visibility means this method can be accessed anywhere in the program so
	// long as you have an instance of this class to call it from
	public void doSomthingPublic() {
		
	}
	
	// private visibilty means that this method cannot be accessed anywhere other than inside of this class
	private void doSomthingPrivate() {
		
	}
	
	// protected visibility means that this method can only be accessed inside of this package,
	// and from subclasses of this class
	protected void doSomethingProtected() {
		
	}
	
	// default visibility means that this method can only be accessed inside of this package
	void soSomething() {
		
	}
}
