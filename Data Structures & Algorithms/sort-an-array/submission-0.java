class Solution {
    public int[] sortArray(int[] nums) {

        // QuickSort Algo is the one solution I have in my mind.

        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSort(int[] nums, int left, int right){

        if(left < right){
            int mid = partition(nums, left, right);
            quickSort(nums, left, mid - 1);
            quickSort(nums, mid + 1, right);
        }
    }


    private static int partition(int[] nums, int left, int right){
       int pivot = nums[right];

       int i = left - 1;

       for(int j = left; j < right; j++){
        if(nums[j] <= pivot){
            i++;
            swap(nums, i, j);
        }
       }

       swap(nums, i + 1, right);

       return i + 1;

    }

    	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}


}