
class Solution {
    public int removeElement(int[] nums, int val) {

        int contador = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[contador] = nums[i];
                contador++;

            }
        }
        return contador;
    }

    public static void main(String[] args) {

        Solution s1 = new Solution();

        int[] numeros = { 3, 2, 2, 3 };

        s1.removeElement(numeros, 2);
    }

}
