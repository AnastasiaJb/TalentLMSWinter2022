package com.digital.homeWork;

public class SixFirstLast {
    public static void main(String[] args) {
        SixFirstLast sf = new SixFirstLast();
        System.out.println(sf.firstLast6(new int[] {1, 2, 6}));
        System.out.println(sf.firstLast6(new int[] {2, 4, 6, 8}));
        System.out.println(sf.firstLast6(new int[] {6, 4, 6, 6}));
    }

    public static boolean firstLast6(int[] nums)
    {
        if(nums[0]==6 || nums[nums.length-1] == 6)
            return true;
        else
            return false;
    }
}
