package leetcodes;

import java.util.ArrayList;
import java.util.List;

public class pascal {
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        ans=Solutiona.generate(5);
    }
}
class Solutiona {
    public static ArrayList<ArrayList<Integer>> generate(int numRows) {
        int i,j;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> t1=new ArrayList<>();
        t1.add(1);
        ans.add(t1);
        System.out.println(ans);
        t1.add(1);
        ans.add(t1);
        System.out.println(ans);
        for (i = 1; i < 5; i++) {
            ArrayList<Integer> t=new ArrayList<>();
            for (j = 1; j <=i; j++) {

            }
        }
        return ans;
    }
}