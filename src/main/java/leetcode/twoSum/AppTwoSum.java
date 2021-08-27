package leetcode.twoSum;

public class AppTwoSum {
        public int[] twoSum(int[] nums, int target) {
            if (nums.length < 2 || nums.length > 10000) throw new IndexOutOfBoundsException();
            if (target < -1000000000 || target > 1000000000) throw new IndexOutOfBoundsException();
            for (int i: nums) {
                if (i<-1000000000||i>1000000000) throw new IndexOutOfBoundsException();
            }

            int[] result = {0,0};

            for (int i=0; i<nums.length-1; i++) {
                for (int j=i+1; j<nums.length;j++) {
                    if (nums[i]+nums[j]==target) {
                        result[0]=i;
                        result[1]=j;
                    }
                }
            }
            return result;
        }
        public static void main(String[] args) {
            int[] nums = {11,15,49,81,36,2,7};
            int[] res;
            AppTwoSum example = new AppTwoSum();
            res=example.twoSum(nums,9);
            for (int i:res) {
                System.out.println(i);
            }

        }
}
