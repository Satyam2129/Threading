/*
store colours in the form of an array
ex: String colours[]={"white","blue","black","green","red","yellow"};
display all colours repeatedly by generating colour index from Random class. If the random colour index matches to red stop display.
Note: perform this task by implementing Runnable interface
 */

import java.util.Random;

public class Threading_Q1 implements Runnable
{
    public static void main(String[] args)
    {
        Threading_Q1 obj = new Threading_Q1();
        Thread obj1 = new Thread(obj);
        obj1.start();
    }
    @Override
    public void run()
    {
        Random r1 = new Random();
        String[] color = {"White","Blue","Black","Green","Red","Yellow"};
        int index;
        while((index=r1.nextInt(6))!=4)
        {
            System.out.println(color[index]);
        }
    }
}