import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        int[] odd=new int[num];
        int[] even=new int[num];
        for(int i=0;i<num;i++){
            int a=sc.nextInt();
            if(a%2!=0){
                odd[i]=a;
            }
            else{
                even[i]=a;
            }
        }
        Arrays.sort(odd);
        Arrays.sort(even);
        System.out.println(odd[1]+even[1]);
    }
}