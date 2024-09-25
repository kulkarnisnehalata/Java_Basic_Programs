package LambdaExpression;


import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

interface LambdaTest{
    void display(int a, String b);
}
public class SimpleLambdaExp {

    public static void main(String[] args) {

        LambdaTest obj = (int a, String b) -> {
            System.out.println("value of param a is" + a);
            System.out.println("value of param b is" + b);
        };

        obj.display(100, "java programming");

    }
}
