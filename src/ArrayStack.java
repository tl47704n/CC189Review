
public class ArrayStack {
	private int numberOfStacks = 3;
	private int[] values;
	private int[] sizes;
	private int stackCapacity;
	
	public ArrayStack(int stacksize) {

		stackCapacity = stacksize;
		values = new int[stacksize * numberOfStacks];
		sizes = new int[numberOfStacks];
		
	}
	
	public void push(int stackNum, int value) {
		if(isFull(stackNum)) {
			System.out.println("Stack Full");
		}
		else {
		sizes[stackNum]++;
		values[indexOfTop(stackNum)] = value;
		}
	}
	
	public int peek(int stackNum) {
		
		return values[stackNum*stackCapacity + sizes[stackNum]-1];
	}
	
	public void pop(int stackNum) {
		if(ifEmpty(stackNum)) {
			System.out.println("Already empty, nothing to pop");
		}else {
			
		}
	}
	
	private boolean ifEmpty(int stackNum) {
		
		return sizes[stackNum]==0;
	}

	private int indexOfTop(int stackNum) {
		int offset = stackNum * stackCapacity;
		int size = sizes[stackNum];
		return offset + size -1;
		
	}

	public boolean isFull(int stackNum) {
		return sizes[stackNum] == stackCapacity;
	}
	
}
