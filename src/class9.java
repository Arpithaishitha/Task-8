import java.util.*;
public class class9
{
    public static void main (string args[])
    {
        int age;
        Scanner in = new Scanner (system.in);
        system.out.println("Enter the age");
        age=in.nextInt();
        if(age>=60)
            system.out.println("Senior citizen");
        else
            system.out.println("not a senior citizen");
    }
}
