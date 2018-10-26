package b2b.test;

public class Prime {
public static void main(String[] args) 
{
   int N=10;
    int x= 1;
    for(int i=1; i<N;i++)
    {
        int a=0;
        for(int j=1;j<=x;j++)
            if(x%j==0)
                a++;
        if(a==2)
        System.out.print(x);
               x++; 
    }
}}