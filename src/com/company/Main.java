/*  Author : rajanikant pawar
    Date : 6 august 2021
    Program for Exception Handling
    point 1: every try block must be followed by catch or finally block
    Point 2: Catch method must have a parameter
    Point 3: finally is the block which will always execute irrespective of catch
    Point 4: A single try block can have multiple catch blocks, BUT only 1 catch block will get executed
*
*
* */
package com.company;
public class Main {
    public static void main(String[] args)
    {
        int x,y;
        x = 5; y =0;
        int z;
        //System.out.println("code success");
        try {
            z = x / y;
        }
        catch(ArithmeticException obj1)
        {
            System.out.println("in child class result is: " + obj1);
        }
        catch(Exception obj)
        {
            System.out.println("In parent class result is: " + obj);
        }
        finally
        {
            System.out.println("code executed successfully");
        }

    }
}