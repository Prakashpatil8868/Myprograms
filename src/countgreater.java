public class countgreater {
    public static void main(String[] args){
        int arr[]={4,3,5,9,101,8};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
            max=arr[i];
        }
        System.out.print(max);
    }
    
}
