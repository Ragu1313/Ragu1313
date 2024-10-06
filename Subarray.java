public class Subarray {
    public static void main(String[] args) {
        int n = 4;
        int arr[] = new int[]{1,2,3,4};
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k = i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
