
public class Stack implements StackInterface {
	//int size;
	int[] arrNum;
	int counter;
	int number; //will be deleted
	
	public Stack(int size) {
		arrNum = new int[size];
		counter = -1;
	}
	
	public void push(int number) {
		counter++;
		arrNum[counter] = number;
		
	}

	public int pop() {
		System.out.println(arrNum[counter]);
		return arrNum[counter];
	}

	public int peek() {
		System.out.println(arrNum[counter]);
		counter--;
		if (counter == -1) {
			isEmpty();
		}
		return number;
	}

	public boolean isEmpty() {
		if (counter != -1) {
			System.out.println("Not Empty");
		}
		else {
			System.out.println("Empty");
		}
		return false;
	}
	
	public int getValue() {
		return number;
	}

}

