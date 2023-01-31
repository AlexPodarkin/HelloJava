package seminars;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class seminar4 
{
    public static void main(String[] args)
    {
        Zadacha1();
        //Zadacha2();
        //Zadacha3();
        //Zadacha4();
    } //END MAIN
    static void Zadacha1()
    {
        ArrayList<Integer> arList = new ArrayList<>();
        LinkedList<Integer> linList = new LinkedList<>();
        //System.out.println(System.currentTimeMillis());
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) 
        {
            arList.add(0,i); // тестить это ззначение arList.add(0,i);
        }
        long timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart);
        System.out.println("-------");
        timeStart = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            linList.add(0,i);
        }
        timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish-timeStart);



    }
    static void Zadacha2()
    {
      /*Реализовать консольное приложение, которое:
        1. Принимает от пользователя строку вида
        text~num
        1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
        2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка. */
        LinkedList<String> text = new LinkedList<String>();
        Scanner iScanner = new Scanner(System.in);
        while (true) 
        {                       
            //while (!line.equalsIgnoreCase("stop")) интересно | переменная String line = "";

            String input = iScanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            String[] string = input.split("~");
            if (string[0].equals("print")) {
                System.out.println(text.remove(Integer.parseInt(string[1])));
            } else {
                text.add(Integer.parseInt(string[1]), string[0]);
            }
        }
        iScanner.close();




    }
    static void Zadacha3()
    {
     /* Реализовать консольное приложение, которое:
        1. Принимает от пользователя и “запоминает” строки.
        2. Если введено print, выводит строки так, чтобы 
        последняя введенная была первой в списке, а первая - последней. */
        Stack<String> stack = new Stack<>();
        Scanner iScanner = new Scanner(System.in);

        while (true) 
        {
            String text = iScanner.nextLine();
            if (text.equals("print")) 
            {
                int size = stack.size();
                for (int i = 0; i < size; i++) 
                {
                    System.out.print(stack.pop() + " ");
                }
                break;
            }
            stack.push(text);
        }
        iScanner.close();

        
    }
    static void Zadacha4()
    {
        System.out.println("3 задача др решение");
        Scanner scan= new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        String str = "";

        while (!str.equals("print")){
            System.out.println("Введите строку: ");
            str = scan.nextLine();
            if (!str.equals("print")) {
                stack.push(str);
            }
        }
        scan.close();
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }      

               
    }
}

