import java.io.*;
class Amstroneforloop
{
    public static void main(String args[])throws IOException
    {
        int num, rev, arm = 0, copy,i;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter the 3 Digit no:");
        num=Integer.parseInt(br.readLine());
        copy=num;
        for(i=1;i<=3;i++)
        {
        rev=(num%10);
        arm=(rev*rev*rev)+arm;
        num=num/10;
        }
        if(copy==arm)
        {
            System.out.print(copy+":no. is Amstrone");
        }
        else
        {
            System.out.print(copy+":no. is not a Amstrone");
        }
    }
}

