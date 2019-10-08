
import java.util.Random;

public class quickSort{
	static int[] arr;
	static int counter;

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
				arr[j] = t;
				counter++;
				}
			counter++;
			}
		int t = arr[i+1];
		arr[i+1] = pivot;
		arr[high] = t;
		return i+1;
	}

    public static void main(String args[]) {
    	Random rand = new Random();
    	counter = 0;
		int size_a = Integer.parseInt(args[0]);
		arr = new int[size_a];
		for (int i=0;i<size_a;i++){
			arr[i] = rand.nextInt(50);
		}
		quicksort(0,size_a-1);
		System.out.println("This is quick sort!");
		System.out.printf("Actual Operation %d\n", counter);
		System.out.printf("Worst case %d\n", (size_a-1)*size_a);
		System.out.printf("Average case %f\n", (size_a)*Math.log(size_a));



//		for(int i:arr){System.out.println(i);}
	}
}