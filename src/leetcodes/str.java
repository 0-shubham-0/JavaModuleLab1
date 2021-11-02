package leetcodes;

public class str {
    public static void main(String[] args) {
        String h="mississippieee hello";
        String n="issip";
        //int a=Solution11.strStr(h,n);
        //System.out.println(a);
        int[] b={1,2,3,4,5};
        int c=4;
        String aa="100";
        String bb="110";
        System.out.println(Solution11.addBinary(aa,bb));
        //System.out.println(gg);
        //System.out.println(Solution11.searchInsert(b,c));
        //System.out.println(Solution11.lengthOfLastWord(h));
    }
}
class Solution11 {
    public static int strStr(String haystack, String needle) {
        int a=0,i,j;
        if(needle.isEmpty()){
            return 0;
        }
        if (!haystack.contains(needle)){
            return -1;
        }
        for (i = 0; i < haystack.length(); i++) {
            for (j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i)==needle.charAt(j)){
                    i++;
                }
                else{
                    i-=j;
                    break;
                }
            }
            if (j==needle.length())break;
        }
        return i-needle.length();
    }
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>=target)
                return i;
        }
        return nums.length;
    }
    public static int removeElement(int[] nums, int val) {
        int a=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=val){
                nums[a]=nums[i];
                a++;
            }
        }
        return a;
    }
    public static int lengthOfLastWord(String s) {
        int a=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                a++;
            }
            else if(a>0)
                return a;
        }
        return a;
    }
    public static String addBinary(String a, String b) {
        StringBuilder n=new StringBuilder();
        n.append('h');
        int f=1,s=1,t=1;
        int sum=f^s^t;
        System.out.println(sum);
        System.out.println(n);
        return "gg";
    }
}