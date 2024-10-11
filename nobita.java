import java.util.*;
class nobita{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=0;
        for(int i=a;i<=b;i++){
            if(isnobita(i)){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
    public static boolean isnobita (int num){
        String str=Integer.toString(num);
        for(int i=0;i<str.length()-1;i++){
            int frst=str.charAt(i)-'0';
            int sec=str.charAt(i+1)-'0';
            if(Math.abs(frst-sec)!=0){ 
                return false;
            }}
            return true;
        
    }
}