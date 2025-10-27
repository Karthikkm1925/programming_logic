package taskdaybyday;

public class seconMaxElement {

	public static void main(String[] args) {
		
		int[] array = {3, 1, 4, 4, 5, 5, 2};
		
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MAX_VALUE;
		
		for(int i=0; i<array.length;i++) {
			if(array[i]>firstMax) {
				secondMax = firstMax;
				firstMax = array[i];
			}
		}
		System.out.println("Second  Max Element is "+ secondMax);
	}

}
