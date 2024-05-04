import java.util.*;
public class Two
{
    public static void main(string args[])
    {
        Scanner scanner = new Scanner (system.in);
        system.out.println("enter a string");
        string inputstring = scanner.nextLine();
        Scanner.close();
        string reversedstring="";
        for(int i=inputstring.length()-1;i>=0;i--)
        {
            reversedstring+=inputstring.charAt(i);

        }
        system.out.println("reversed string:" +reversedsring);
    }
}
