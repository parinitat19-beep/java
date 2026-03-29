

public class occuring {
    public static void main(Stringfun[] args) {
       int n= 2443;
         int count=0;
        while(n>0){
            int rem=n%10;
            if(rem==4){
                count++;
            }
            n=n/10; // Remove the last digit from n
           
        }
        System.out.println("The digit 4 occurs " + count + " times in the number 2443.");
    }
}
