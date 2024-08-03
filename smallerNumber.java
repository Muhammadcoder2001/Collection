package Collections;

import java.util.ArrayList;

public class smallerNumber {

    public int[] smallerNumber(int [] nums){
//        ArrayList <Integer> list = new ArrayList<>();
        int [] result =new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            int count = 0;
            for (int j = 0; j < nums.length; j++){
                if (nums[j] < nums[i]){
                    count += 1;
                }

            }
            result[i] = count;
        }


        return result;

    }



    public static void main(String[] args) {
    smallerNumber num = new smallerNumber();
        int [] nums = {8, 1, 4, 7, 9};
        System.out.println(java.util.Arrays.toString(num.smallerNumber(nums)));

    }
}
