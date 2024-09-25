package LambdaExpression;

import java.sql.SQLOutput;

interface intlambda{
    int addition (int a, int b, int c);
}
public class LambdaWithInt {
    public static void main(String[] args) {
        intlambda obj=(int a, int b, int c) ->{

            int d = a+b+c;
            return d;
        };

        int d= obj.addition(10,20,30);
        System.out.println("addition of 3 numbers is "+d);

    }
}

