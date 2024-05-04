import java.util.*;
public class class5
{
    public static void main(string args[])
    {
        int i, a, b=0, c=0;
        Scanner in = new Scanner (system.in)
                system.out.println("Enter the values of i");
        i=in.nextInt();
        a=i/2;
        if(i==0||i==1) {
            system.out.println("it is not a prime number=" + i);
        }
        else{
            for(a=2;a<=b;a++){
                if(i%a==0){
                    system.out.println("it is not prime number=" +i);
                    c=1;
                    break,
                }
            }
            if(c==0){
                system.out.println("it is prime number=" +i);
            }
        }
    }
}
