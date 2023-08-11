import java.util.Scanner;
class Program1
{
    public static void main()
    {
        Scanner sc= new Scanner (System.in);
        String str,str1,str2,upper,Upper,check;
        int len,index;
        System.out.println("Enter a string:\n");
        str=sc.nextLine();
        len=str.length();
        upper=str.toUpperCase();
        index=upper.indexOf(" ");
        str1=upper.substring(0,index);
        str2=upper.substring(index,len);
        Upper=str2.toUpperCase();
        boolean result=str2.contains(str1);
        if(result==true)
        {
            check="Substring found";
        }
        else
        {
            check="Substring not found";
        }
        System.out.println(len+" "+Upper+" "+check);
    }
}