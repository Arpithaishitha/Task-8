import java.util.*;
public class class10
{
    public static void main (string args[])
    {
        int num, a=0;
        Scanner in = new Scanner(system.in);
        system.out.println("Enter the number");
        num=in.nextInt();
        while(num!=0) {
            num /= 10;
            ++a;
        }
        system.ou.println("number of digits=" +a);
    }
}
