package javahomework.me;

public class Fibonacci {
    public static int of(int n){
        if(n>2){
           return of(n-1)+of(n-2);
        }
        else if (n==2){
           return 1;
        }
        else if(n==1){
            return 1;
        }
        else{
            return 0;
        }
    }
}
