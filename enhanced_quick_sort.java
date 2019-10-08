import java.util.Random;
class enhanced_quick_sort {
	static int count;
	public static void quicksort(int[] arr){
		quicksort(arr, 0, arr.length-1);
	}

	public static void quicksort(int[] arr, int left, int right){
		if (left >= right){
			return;
		}
		int pivot = arr[(left+right)/2]; // pick pivot at the center
		int index = partition(arr, left, right, pivot);
		quicksort(arr, left, index-1); // left part
		quicksort(arr, index, right); // right part 
	}

	public static int partition(int[] arr, int left, int right, int pivot){
		while (left<=right){
			while(arr[left]<pivot){
				left++;
				count++
				// left cursor increases until find an element which is larger then pivot
				// jump out of the while loop
			}
			while(arr[right]>pivot){
				right--;
				count++

				// right cursor descreases until find an element which is less than pivot
				// jump out of the while loop
			}

			if (left<=right){
				int t = arr[left];
				arr[left] = arr[right];
				arr[right] = t;
				left++;
				right--;
			}

		}
		return left;
	}
	public static void main(String args[]){
		Random rand = new Random();
		count = 0;
		int size_a = Integer.parseInt(args[0]);
		int [] arr = new int[size_a];
		for (int i=0;i<size_a;i++){
			arr[i] = rand.nextInt(50);
		}

		quicksort(arr);
		for (int i:arr){
			System.out.println(i);
		}

	}
}