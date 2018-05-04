package java_InheritanceFiles;

import java.util.Scanner;

public class Calculator {
	int left, right;
	public Calculator(){}
	public Calculator(int left, int right){
		this.left=left;
		this.right=right;
	}//Calculator end
	
	public void Sum(){
		System.out.println("Sum:" + (this.left + this.right));
	}
	
	public void Avg(){
		System.out.println("Avg:" + (this.left + this.right)/2);
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator(10, 20);
		Calculator cal1 = new Calculator(50, 70);
		cal.Sum();
		cal.Avg();
		cal1.Sum();
		cal1.Avg();
	}//main end
}//Calculator END

