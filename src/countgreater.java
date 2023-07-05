public class countgreater {
    public static void main(String[] args){
        int arr[] = {4, 3, 5, 9, 101, 8};
        int k = 11;
        
        boolean found = false;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(((arr[i] + arr[j]) == k) && (i != j)){
                    found = true;
                    break;
                }
            }
            
        }
        
        System.out.println(found);
    }
}

