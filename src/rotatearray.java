  import java.util.Arrays;
public class rotatearray {
  
   
        public static void reverseArray(int[] arr,int s, int e) {
            
    
            while (s < e) {
                // Swap elements at start and end positions
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
    
                // Move start pointer forward and end pointer backward
                s++;
                e--;
            }
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int K=2;
            int N=arr.length;
    
            System.out.println("Original array: " + Arrays.toString(arr));
    
            reverseArray(arr,0,N-1);
            reverseArray(arr,0,K-1);
            reverseArray(arr,K,N-1);
    
            System.out.println("Reversed array: " + Arrays.toString(arr));
        }
    }
     

