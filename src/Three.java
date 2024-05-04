import java.util.*;
public class Three
{
    public static void main(string args[])
    {
        Scanner scanner = new Scanner (system.in);
        system.out.println("enter the no. of rows:");
        int n = scanner.nextInt();
        scanner.close();
        int num = 1;
        int currentnum = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
            {
                system.out.println(currentnum+"");
                currentnum++;
                system.out.println();
            }
        }
    }

}
