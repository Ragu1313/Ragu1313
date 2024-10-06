import java.util.*;
class Node {
    Node left;
    Node right;
    int val;
    public Node(int val){
        this.val = val;
        left = null;
        right = null;
    }
}
public class BinaryTree {
    public static void insert(Node root,int val){
        if(root!=null){
            if(root.val>val){
                if(root.left!=null)     insert(root.left,val); 
                else {
                    // System.out.println("left child added");
                    root.left = new Node(val);
                }
            } 
            if(root.val<val){
                if(root.right!=null)  insert(root.right,val);  
                else   {
                    // System.out.println("right child added");
                    root.right = new Node(val);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter value for k");
        int k = sc.nextInt();
        Node root = new Node(arr[0]);

        for(int i=1;i<n;i++){
            insert(root,arr[i]);
        }
        // ArrayList<ArrayList<Integer>> arlist = new ArrayList<>();
        // inorder(root,k,arlist,new ArrayList<ArrayList<Integer>>());
    }
    // private static void inorder(Node root,int k,ArrayList<ArrayList<Integer>> arr,ArrayList<ArrayList<Integer>> p) {
    //     // throw new UnsupportedOperationException("Not supported yet.");
    //     if(root!=null){
    //         // for(int i=0;i<)
    //         p.add(new ArrayList<>());
    //         for(int i=0;i<p.size();i++){

    //         }
            // System.out.println(root.val);
            // inorder(root.left);
            // inorder(root.right);
    //     }
    // }
}
