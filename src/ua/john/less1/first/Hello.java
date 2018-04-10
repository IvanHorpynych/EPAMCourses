package ua.john.less1.first;

public class Hello{
	public static void main(String[] args){
		PrintClass printClass = new PrintClass();
		printClass.printHello();
	}
}

class PrintClass{
	public void printHello(){
	System.out.println("Hello");
	}
}