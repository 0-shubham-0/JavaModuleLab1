package leetcodes;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/*Given a string s containing just the characters
'(', ')', '{', '}', '[' and ']', determine if
the input string is valid.*/
public class validParentheses {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int[] n={1,2,0,4,3,0,5,4};
        String str = Arrays.toString(n);
        System.out.println(str);
        Solution.moveZeroes(n);
        str = Arrays.toString(n);
        System.out.println(str);
    }
}
class Solution {
    public static void moveZeroes(int[] nums) {
        for (int i = nums.length-2; i >-1 ; i--) {
            if (nums[i]==0){
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j]=nums[j+1];
                }
                nums[nums.length-1]=0;
            }
        }
    }
}