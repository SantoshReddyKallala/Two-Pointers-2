class RemoveDuplicatesFromsortedArray{
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {return 0;}
        int pointer = 0, flag = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] && flag == 0) {
                flag = 1;
                pointer++;
            } else if (nums[i] != nums[i - 1]) {
                flag = 0;
                pointer++;
            }
            nums[pointer] = nums[i];
        }
        return pointer + 1;
    }
    //Time complexity : o(n)
    //Space complexity : o(1)
}