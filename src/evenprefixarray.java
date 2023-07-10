public class evenprefixarray {

    public static void main(String[]args){
        int arr[]={4, 6, 7, 3, 5, 1, 2};
        int N=arr.length;
        int pf[]=new int[N];
        if((((arr[0])%2)==0))
        pf[0]=1;
        else
        pf[0]=0;
        for(int i=1;i<N;i++){
            if((((arr[i])%2)==0))
            pf[i]=pf[i-1]+1;
            else
           pf[i]=pf[i-1]; 
        }
        int M=3;
       
        for(int i = 0;i<M;i++){
            int l = 1;
            int r =5 ;
            int res=pf[r]-pf[l-1];
            System.out.println(res);

    }
}
}