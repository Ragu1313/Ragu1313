import java.util.*;

public class MaximumIndegree {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.substring(1,s.length()-1);
        String sarr[] = s.split(",");
        int arr[] = new int[sarr.length];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<sarr.length;i++){
            arr[i] = Integer.parseInt(sarr[i]);
            map.put(arr[i],0);
        }
        for(int i=0;i<arr.length;i++){
            int temp = arr[i];
            map.put(temp,map.get(temp)+i);
            // System.out.println(i+" " +map.get(arr[i]));
        }
        int res = 0;
        for(Integer set:arr){
            // System.out.println(map.get(set));
            res = Math.max(res,map.get(set));
        }
        System.out.println(res);
    }
}
