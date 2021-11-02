package leetcodes;
import java.lang.*;
public class commonPrefix {
    public static void main(String[] args) {
        String[] strs={"flower","flow","flight"};
        System.out.println(Solution1.longestCommonPrefix(strs));
        String strs1="HEllo";
        String s="ll";
        if (strs1.contains(s)){
        }
    }
}
class Solution1 {
    public static String longestCommonPrefix(String[] strs) {
        int a=0;
        char t;
        outerloop:
        for(int i=0;i<strs[0].length();i++){
            t=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if (!(t==strs[j].charAt(i))){
                    break outerloop;
                }
            }
            a++;
        }
        String ab=new String();
        for (int i = 0; i < a; i++) {
            ab += strs[1].charAt(i);
        }
        return ab;
    }
}