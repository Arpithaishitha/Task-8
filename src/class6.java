import java.util.*;
public class class6
{
    public static void main (string args[]);
    {
        int i, n, fact=1;
        Scanner in = new Scanner (system.in);
        n=in.nextInt();
        for(i=1;i<=n;i++)
            fact=fact*i;
        system.out.println("Factorial=" +fact);
    }
}
