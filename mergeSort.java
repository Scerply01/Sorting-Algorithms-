package sorting;

public class mergeSort {
	
	public static int[] merge_sort (int[] array, int p, int r) {
		if (p<r) {							//Check if array is empty
			int q=(p+r)/2;					//Find middle
			Sort.merge_sort(array, p, q); 	//Breaks & Sorts our first half of array[p..q]
			Sort.merge_sort(array, q+1, r); //Breaks & Sorts our 2nd half of array, [q+1..r]
			Sort.merge(array, p, q, r); 	//Merges our sub arrays back into our array
		}
		return array;
	}
	
	public static int[] merge (int[] array, int p, int q, int r) {
		int n1, n2, i, j, k;
		int [] L, R; //temp L & R arrays (+1 to account for one sentinel values.
		
		//Determines the length of our temp left & right arrays.
		n1=q-p+1; 
		n2=r-q; 
		
		L=new int[n1+1];
		R=new int[n2+1];

		//For loop populates our temp L array with values from our array.
		for (i=0; i<L.length; i++) 
			L[i]=array[p+i];
		
		//Populates our temp R array with values from our array.
		for (j=0; j<R.length; j++) { 
			if (q+j<array.length-1) {
				R[j]=array[q+j+1];
			}
			else {
				R[j]=array[q+j];
				j++;
			}
		}
		
		//Sentinel Values
		L[n1]= Integer.MAX_VALUE;
		R[n2]= Integer.MAX_VALUE;
		
		//Assigns an index value for our sub arrays.
		i=0;
		j=0;
		
		//Merges our temp sub arrays back together into our array while picking the least value first.
		for(k=p; k<=r; k++) {
			if (L[i]<=R[j]) {
				array[k]=L[i];
				i=i+1;
			}
			else {
				array[k]=R[j];
				j=j+1;
			}
		}
		return array;
	}
	
	public static void main (String [] args) {
		
	}
}
