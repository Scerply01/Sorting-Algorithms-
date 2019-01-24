package sorting;

public class InsertionSort {

	public static int[] insertion_sort (int[] array) {
		/*
		 * for loop will go through array selecting which values to sort.
		 * sort_pos: will point to array index that will be sorted
		 * index of i will go through array comparing if previous values are greater than pos_value
		 */
		for (int sort_pos=1; sort_pos<array.length; sort_pos++) {
			int pos_value = array[sort_pos]; 
			int i=sort_pos-1; 
			
			/*
			 * While loop will check if i index value is greater than pos_value. 
			 * It will copy values over one to make room for pos_value before it.
			*/
			while (i>=0 && array[i]>pos_value) {
				array[i+1]=array[i];
				i--;
			}
			array[i+1] = pos_value;
		}
		return array;
	}
	
	public static void printArray(int [] pArray) {
		System.out.print ("[");
		for (int i = 0; i<pArray.length; i++) {
			System.out.print(pArray[i] + ", ");
		}
		System.out.print ("]");
	}
	
	public static void main (String [] args) {
		System.out.print("Create random Array: ");
		int [] ourArray = new int [10]; 
		for (int n = 0; n<10; n++) {
			ourArray[n] = (int) (Math.random()*10 + 1);
		}
		printArray(ourArray);
		insertion_sort (ourArray);
		System.out.print("\nSorted Array: "); printArray(ourArray);
	}
}