package leetcodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class pascal {
    public static void main(String[] args){
        List<List<Integer>> ans = new ArrayList<>();
//        ans=Solutiona.generate(5);
//        System.out.println(ans);
//        ListNode n1=new ListNode(2);
//        ListNode n2=new ListNode(3,n1);
//        ListNode n3=new ListNode(4,n2);
//        //n1=Solution.mergeTwoLists(n2,n3);
//        System.out.println(n1);
//        System.out.println(n2);
//        System.out.println(n3.val);
    }
}
class Solutiona {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans=new ArrayList<>();
        int j;
        outerloop:
        for(int i=1;i<=nums.length;i++){
            for (j = i; j <=nums.length; j++) {
                if (i==nums[j-1]){
                    continue outerloop;
                }
            }
            if (j>nums.length){
                ans.add(i);
            }
        }
        return ans;
    }
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

class Solution12 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode();
        ListNode t1=head;
        int carry=0;
        while(l1!=null&&l2!=null){
            ListNode t=new ListNode();
            t.val=(l1.val+l2.val+carry)%10;
            if (l1.val+l2.val+carry>=10){
                carry=(l1.val+l2.val+carry)/10;
            }
            else carry=0;
            l1=l1.next;
            l2=l2.next;
            t1.next=t;
            t1=t1.next;
        }
        while(l1!=null){
            ListNode t=new ListNode();
            t.val=(l1.val+carry)%10;
            if (l1.val+carry>=10){
                carry=(l1.val+carry)/10;
            }
            l1=l1.next;
            t1.next=t;
            t1=t1.next;
        }
        while(l2!=null){
            ListNode t=new ListNode();
            t.val=(l2.val+carry)%10;
            if (l2.val+carry>=10){
                carry=(l2.val+carry)/10;
            }
            l2=l2.next;
            t1.next=t;
            t1=t1.next;
        }
        if (carry!=0){
            ListNode t=new ListNode();
            t.val=carry;
            t1.next=t;
        }
        return head;
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ans=new ListNode();
        boolean b1=true,b2=true;
        while (true){
            if (l1.val> l2.val&&b1){
                ListNode t1=new ListNode(l1.val,ans);
                if (l1.next!=null)
                l1=l1.next;
                else b1=false;
            }
            else {
                ListNode t1=new ListNode(l2.val,ans);
                if (l2.next!=null)
                l2=l2.next;
                else b2=false;
            }
            if(!b1&&!b2){
                break;
            }
        }
        return ans.next;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        TreeNode t=root;
        while (true){
            if (t.left!=null){
                t=t.left;
            }
            else {
                ans.add(t.val);
            }
            break;
        }
        return ans;
    }
    public static void get(TreeNode root){

    }
}