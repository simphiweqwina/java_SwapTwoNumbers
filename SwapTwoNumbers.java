//import scanner to retrieve numbers
import java.util.Scanner;

public class SwapTwoNumbers {

	private int a,b,c ;

public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	//instanciate class
	SwapTwoNumbers stn = new SwapTwoNumbers();
	//getValueA
	System.out.print("Enter value of a:");
	stn.getValueA(sc.nextInt());

	//getValueB
	System.out.print("Enter value of b:");
	stn.getValueB(sc.nextInt());


	//Print result before processing
	stn.printResultBeforeSwap();

	//Print result after processing
	System.out.print("***RESULT WITHOUT THIRD VARIABLE***");
	stn.printResultAfterSwap();

	//Print result after processing
	System.out.print("***RESULT WITH THIRD VARIABLE***");
	stn.printResultAfterSwapV2();

}


SwapTwoNumbers(){
		
	}

	public void getValueA(int a){
		this.a = a;
	}

	public void getValueB(int b){
		this.b = b;
	}

	public void getValueC(int c){
		this.c = c;
	}

	public void printResultBeforeSwap(){
		System.out.println("Before swapping - a: "+this.a +", b: "+this.b);
	}

	//result without third variable
	public void printResultAfterSwap(){
		System.out.println("Before swapping - a: "+this.b +", b: "+this.a);
	}
	//result with third variable
	public void printResultAfterSwapV2(){
		this.c = this.a;
		this.a = this.b;
		this.b=this.c;
		System.out.println("Before swapping - a: "+this.a +", b: "+this.b);
	}

}