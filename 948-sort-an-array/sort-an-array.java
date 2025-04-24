class Solution {
    public int[] sortArray(int[] nums) {

        // bubble sort -- 
        // for(int i=0; i<nums.length; i++){
        //     for(int j=0; j<nums.length-1; j++){
        //         if(nums[j] > nums[j+1]){
        //             int temp = nums[j];
        //             nums[j] = nums[j+1];
        //             nums[j+1] = temp;
        //         }
        //     }
        // }
        
        // selection sort -- 
        // for(int i=0; i<nums.length; i++){
        //     int smallest = i;
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[smallest] > nums[j]){
        //             smallest = j;
        //         }
        //     }
        //     int temp = nums[smallest];
        //     nums[smallest] = nums[i];
        //     nums[i] = temp;
        // }

        // insertion sort -- 
        // for(int i=1; i<nums.length; i++){
        //     int key = nums[i];
        //     int j = i-1;
        //     while(j>=0 && key < nums[j]){
        //         nums[j+1] = nums[j];
        //         j--;
        //     }
        //     nums[j+1] = key;
        // }

        // merge sort --
        mergeSort(nums);

        return nums;
    }

    public static void mergeSort(int[] nums){
        if(nums.length < 2) return;
        int mid = nums.length/2;

        int left[] = Arrays.copyOfRange(nums, 0, mid);
        int right[] = Arrays.copyOfRange(nums, mid, nums.length);

        mergeSort(left);
        mergeSort(right);

        merge(nums, left, right);
    }

    public static void merge(int[] nums, int[] left, int[] right){
        int i=0, j=0, k=0;

        while(j<left.length && k<right.length){
            if(left[j] < right[k]) nums[i++] = left[j++];
            else nums[i++] = right[k++];
        }

        while(j<left.length){
            nums[i++] = left[j++];
        }

        while(k<right.length){
            nums[i++] = right[k++];
        }
    }
}