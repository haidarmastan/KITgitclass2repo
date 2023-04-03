{
	public static void main(String[] args) {
		printOne();
		printOne();
		printTwo();
	}

	public static void printOne() {
		System.out.println("Hello World");
	}

	public static void printTwo() {
		printOne();
		printOne();
	}


	#new feature is added by dev4
	{	int x = 3;
		int y = 2;
		System.out.println("In method go. x: " + x + " y: " + y);
		falseSwap(x,y);
		System.out.println("in method go. x: " + x + " y: " + y);
		moreParameters(x,y);
		System.out.println("in method go. x: " + x + " y: " + y);
	}
}