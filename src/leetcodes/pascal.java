package leetcodes;

import java.util.ArrayList;
import java.util.List;

public class pascal {
    public static void main(String[] args){
        List<List<Integer>> ans = new ArrayList<>();
//        ans=Solutiona.generate(5);
//        System.out.println(ans);

    }
}
class Solutiona {
    public static List<List<Integer>> generate(int numRows) {
        numRows--;
        List<List<Integer>>total = new ArrayList<>();
        List<Integer>t1 = new ArrayList<>();
        t1.add(1);
        total.add(t1);
        if (numRows==1)return total;
        List<Integer>t2 = new ArrayList<>();
        t2.add(1);t2.add(1);
        total.add(t2);
        if (numRows==2)return total;
        for(int i=2;i<=numRows;i++){
            List<Integer>temp = new ArrayList<>();
            temp.add(1);
            for(int j=2;j<=i;j++){
                temp.add(total.get(i-1).get(j-2)+total.get(i-1).get(j-1));
            }
            temp.add(1);
            total.add(temp);
        }
        return total;
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

    }
}