package bai14;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Stack;
import java.time.*;

class filter 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer inp = input.nextInt();
        Stack <Integer> stack = new Stack<>();
        Integer temp = inp;

        do
        {
            temp = inp/2;
            stack.push(inp%2);
            inp = temp;
        }while(inp!=0);
        System.out.println(stack);
        int temp_2 = stack.size();
        for (int i=0; i<temp_2; i++)
        {
            System.out.print(stack.pop() + " ");
        }
    }
}