package com.calculator.calci;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	Scanner s = new Scanner(System.in);
        System.out.println("enter the first operand");
        float a = s.nextFloat();
        System.out.println("enter the operation you want to perform");
        char c = s.next().charAt(0);
        System.out.println("enter the Second operand");
        float b = s.nextFloat();
        if(c=='+') {
        	Addition addition = new Addition(a,b);
        	System.out.println(addition.add(a, b));
        }
        else if(c=='-') {
        	Subtraction subtraction = new Subtraction(a,b);
        	System.out.println(subtraction.sub(a, b));
        }
        else if(c=='*') {
        	Multipication multipication = new Multipication(a,b);
        	System.out.println(multipication.mul(a, b));
        }
        else if(c=='/') {
        	Division division = new Division(a,b);
        	System.out.println(division.div(a, b));
        }
        else if(c=='%') {
        	Modulo modulo = new Modulo(a,b);
        	System.out.println(modulo.mod(a, b));
        }
        else {
        	System.out.println("Please enter valid operator to perform");
        }
        s.close();
    }
}
