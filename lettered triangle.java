import java.io.*;
class q1
{
	public static void main(String args[])
	{
	    int i,j,k; char c=65,d;
	    for(i=1;i<=7;i++)
        {
            d=c;
            for(j=i;j>=1;j--)
            {
                System.out.print(d);
                d-=1;

            }
            System.out.println();
            c+=1;
        }

        c=70;
        for(i=6;i>=1;i--)
        {
            d=c;
            for(j=i;j>=1;j--)
            {
                System.out.print(d);
                d-=1;

            }
            System.out.println();
            c-=1;
        }


	}

}
