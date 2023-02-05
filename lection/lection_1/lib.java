package lection.lection_1;

public class lib 
{
    static double factor(int n) // исп в файле methods.java
    {   
        if (n==1) return 1;
        {
            return n * factor(n-1);
        }
    }
}
