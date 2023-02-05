package lection.lection_6;

import java.util.Arrays;
import java.util.HashSet;

public class OOP {
    public static void main(String[] args) {
/*      Java является объектно-ориентированным языком.
        Программа, написанная на Java, должна соответствовать
        парадигме объектно-ориентированного программирования.
        Следует понимать, что принципы ООП не просто определяют
        структуру программы. Это некий фундаментальный подход,
        с которым нам предстоит разобраться. */

    /*  Решение проблемы получило название объектно-ориентированное
        программирование или объектно-ориентированное проектирование или ООП.
        При использовании данного подхода, упорядочивание кода базируется
        на объединении данных, с одной стороны, и методов для обработки этих
        данных, с другой стороны, в одно целое. Это «одно целое» в ООП называется
        экземпляром класса.  */

     /* Каждый экземпляр класса определяется общим шаблоном, который
        называется классом.
        В рамках класса задается общая структура, на основе которой затем
        создаются экземпляры.
        Данные, относящиеся к классу, называются полями класса, а код для их
        обработки — методами класса. */

        // ПРАКТИКА
        //Создание класса Worker
        
        Worker w1 = new Worker();
        w1.firstName = "Name_1";
        w1.lastName  = "Family_1";
        w1.salary    = 100;
        w1.id        = 001;

        Worker w2 = new Worker();
        w2.firstName = "Name_2";
        w2.lastName  = "Family_2";
        w2.salary    = 200;
        w2.id        = 002;

        Worker w3 = new Worker(); // ВНИМАНИЕ значения аналогичны w1 !
        w3.firstName = "Name_1";
        w3.lastName  = "Family_1";
        w3.salary    = 100;
        w3.id        = 001;
        // Внимание!  методы equals() и hashCode() переопределены в общем классе
        System.out.println(w1 == w3);      // аналогичны значения не дают равенства экземпляров! 
        System.out.println(w1.equals(w3)); // сравнение элементов через метод equals()

        var workers = new HashSet<Worker>(Arrays.asList(w1, w2));
        System.out.println(workers.contains(w3)); //проверка на включение элемента в коллекции.

        System.out.println(w1); 
        // если не переопределить метод toString() покажет хешКод @36baf30c

        System.out.println(w2); // или записать w2.toString()
        // Для этого в class Worker надо переопределить метод toString()
        // посмотри файл Worker.java -> class Worker -> метод: public String toString()

        System.out.println(w1.equals(w2));
        System.out.println(w1.equals(w3)); 
        //мы переопределили в class Worker -> метод equals() 
        // посмотри файл Worker.java -> class Worker -> метод: equals() 

    }
}

