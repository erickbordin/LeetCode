class RemoveDuplicatesSortedArray {

    public static int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            int j = i - 1;
            if (nums[i] != nums[j]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int k = removeDuplicates(new int[] { 1, 1, 2, 2 });
        System.out.println(k);
    }
}
