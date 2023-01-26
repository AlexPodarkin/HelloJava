package lection.lection_1;

import java.util.Arrays;
import java.util.Scanner;

//import java.security.DomainLoadStoreParameter;

/*
 Длинный комментарий
 */

// Комментарий в строке
public class program {
    public static void main(String[] args) {
        System.out.println("Hi Aleksandr Podarkin!");

        // строки
        String s = "Stroka,";
        String f = null;
        System.out.println(s + f);

        // целые числа
        short age = 25;
        int salary = 150000;
        System.out.println(age + ", Alex = " + salary);

        // Вещественные числа
        float e = 2.7f;
        double pi = 3.1415;
        System.out.println(e + " < double обязательно указать \"f\"| для double необязательно > " + pi);
        // для doble можно указать "D" , но не обязательно.

        // Тип char
        char ch = '1';
        System.out.println(Character.isDigit(ch)); // это число ! true
        ch = 'a';
        System.out.println(Character.isDigit(ch)); // false

        int a = 15;
        double d = a;
        System.out.println("положили инт в дабл > " + d);
        // a = d так делать нельзя нужно преобразование

        // тип данных boolean
        boolean flag1 = 123 <= 234;
        System.out.println(flag1); // true
        boolean flag2 = 123 >= 234;
        System.out.println(flag2); // true
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3); // false
        boolean end = flag1 ^ flag2; // "^" - дизъюнкция, "|" - оператор "или" ,"&" - оператор "и"
        System.out.println(end);

        // неявная типизация var
        var v = 15;
        System.out.println(getType(v));
        var v1 = 123.15;
        System.out.println(getType(v1)); // Ниже создал метод / функцию для работы getType
        // System.out.println(v.getClass().getSimpleName()); так почему не работает !

        // Комментарии
        int num = 5;
        String asd = Integer.toString(num); // Конвртация числа в строку
        System.out.println(getType(asd)); // String
        num = 1_555_300; // Можно записывать числа так для наглядности
        System.out.println(num);
        String ctr = "Aleksandr";
        System.out.println(ctr.charAt(0)); // Напечатать букву в строке
        int i = 5;
        int j = 2;
        System.out.println(i | j); // можно изучить & and ^
        // 101
        // 010
        // 111 (ответ 7)
        // еще есть быстрые операции && and || имеют свои тонкости

        // Массивы

        int[] arr = new int[10]; // создание массива на 10 элементов [0,0,0,0,0,0,0,0,0,0]
        System.out.println(arr.length); // длина массива

        arr = new int[] { 1, 2, 3, 4, 5 };// переопределенее массива
        System.out.println(Arrays.toString(arr)); // печать массива
        arr[4] = 10; // перезапись элемента массива
        System.out.println(arr[4]); // обращение к элементу массива

        int[] array[] = new int[3][5]; // создание 2х мерного массива
        array[1][1] = 5; // обращение к элементу 2х мерного массива
        for (int[] line : array) { // печать 2х мерного массива
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }
        System.out.println(array.length); // количество строк
        System.out.println(array[0].length);// количество столбцов в [0] строке.
        int[][] array2 = new int[3][3];
        for (int k = 0; k < array2.length; k++) {
            for (int k2 = 0; k2 < array2[k].length; k2++) {
                System.out.print(array2[k][k2] + " ");
            }
            System.out.println();
        }

        // Преобразования

        String chislo = "5.123";
        float chislo1 = Float.parseFloat(chislo); // преобразовали строку в число float
        System.out.println(chislo1);
        int chislo2 = (int) chislo1; // преобразовали число float к числу int
        System.out.println(chislo2);

        // Получение данных из терминала

        // используем => import java.util.Scanner;
        // iScanner(); // функция приветствия пользователя !
        // iScanner1(); // функция считывает число из консоли + ариф операция

        // Форматированный вывод
        int a1 = 1, b1 = 2;
        int c1 = a1 + b1;
        String res = String.format("%d + %d = %d \n", a1, b1, c1);
        System.out.printf("%s + %d = %b \n", a1, b1, c1);
        System.out.println(res);
        // %d - целые %x- 16х чисел %f - плавающей точкой %e- для 3,1415е+01
        // %c - одиночный символ %s - для строковых значений
        // область видимости {} - будь внимателен с областью в которой кодишь )
        // то что снаружи доступно внутри {}, то что внутри не доступно снаружи
    }

    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }

    static void iScanner() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите имя : ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!\n", name);
        iScanner.close();
    }

    static void iScanner1() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число : ");
        int chislo3 = iScanner.nextInt();
        System.out.println("Вы ввели -> " + chislo3);
        System.out.println(chislo3 + " + 5 " + " = " + (chislo3 + 5));
        iScanner.close();
    }
}
