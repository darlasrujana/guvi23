/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num;
       System.out.println("enter the number");
       Scanner input = new Scanner(System.in);
       num = input.nextInt();
       if (num % 2 == 0)
       System.out.println("enter the number is even");
       else
       System.out.println("enter the number is odd");
       
	}
}
