
// Quick sort

public class quickSort{
	static int[] arr = new int[] {1,2,3,4,7,6,5,9,8,10};

    static void quicksort(int low, int high){
		if (low < high){// determine if it is time to terminate the branch
			int pivot = partition(low,high);
			
			//recursion part
			quicksort(low,pivot-1); //left part of the pivot
			quicksort(pivot+1,high);//right part of the pivot
			}
//	else{ System.out.println("Terminating");}
	}


    static int partition(int low, int high){
		int pivot = arr[high];//pivot value
		int i = low -1;
		for (int j=low;j<high;j++){
			if (arr[j]<pivot){
				i++;
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = arr[i];
				}
			}
		int t = arr[i+1];
		arr[i+1] = pivot;
		arr[high] = t;
		return i+1;
	}

    public static void main(String args[]) {
		System.out.println("This is quick sort!");
		quicksort(0,9);
		for(int i:arr){System.out.println(i);}
	}
}
