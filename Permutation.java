
import java.util.*;

public class Permutation {
    // MalformedInputException
    public static void main(String[] args) {
        Solution s = new Solution();

        List<List<Integer>> res = s.permute(new int[]{1,2,3});
        for(int i=0;i<res.size();i++)
            System.out.println(res.get(i));
    }
}
class Solution {
    public void per(int n,int nums[],ArrayList<Integer> p,
    List<List<Integer>> res,boolean flag[] ){
        if(p.size()==n){
            res.add(new ArrayList<>(p));
            return;
        }
        for(int i=0;i<n;i++){
            if(!flag[i]){
                flag[i] = true;
                p.add(nums[i]);
                per(n,nums,p,res,flag);
                p.remove(p.size()-1);
                flag[i] = false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        boolean [] flag = new boolean[n];
        List<List<Integer>> a = new ArrayList<>();
        per(n,nums,new ArrayList<>(),a,flag);
        return a;
    }
}
