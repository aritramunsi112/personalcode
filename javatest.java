import java.io.*;
import java.util.*;

class Solution
{
    protected int a,b;
    Solution(int x,int y)
    {
        this.a=x;
        this.b=y;
    }
    public void solve()
    {
        System.out.println("The user inputs are "+a+" , "+b);
    }
}

class javatest 
{
    public static void main(String[] args) throws IOException
    {
        Solution ob1=new Solution(10,20);
        ob1.solve();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<10;i++)
        {
        al.add(i);
        }

        Iterator<Integer> it=al.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+"->");
        }

    }
}