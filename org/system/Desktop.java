package org.system;

public class Desktop extends Computer {
		
	public void desktopSize() {
		System.out.println("Desktop Size is 15.5");
	}
	
	public static void main(String[] args)	{
		Desktop desObj = new Desktop();
		desObj.computerModel();
		desObj.desktopSize();
	}
}