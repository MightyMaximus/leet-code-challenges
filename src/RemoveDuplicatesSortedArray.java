public class RemoveDuplicatesSortedArray {
    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length == 0 || length == 1)
            return length;
        int check = nums[0];
        int counter = 0;

        for (int i = 1; i < length; i++) {
          if (nums[i] != check) {
              nums[counter] = check;
              check = nums[i];
              counter++;
          }
        }
        for (int num : nums) {
            System.out.print(num + ", ");
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 3};
        System.out.println(removeDuplicates(array));
    }
}
