package lection.lection_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class collection {
    public static void main(String[] args) 
    {
        System.out.println("5");

        System.out.println(Sum(1, 2));
        System.out.println(Sum(1.0, 2));
        System.out.println(Sum(1, 2.0));
        System.out.println(Sum(1.2, 2.1));

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5_123);
        ArrayList<String> list2 = new ArrayList<>(); // без типизации
        for (Object o : list1)
        {
            System.out.println(o);
        }
           

        ArrayList<Integer> list5 = new ArrayList<Integer>();
        ArrayList<Integer> list6 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>(10);
        ArrayList<Integer> list4 = new ArrayList<>(list3);

        //Коллекции. Функционал
/*      add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
        get(pos) – возвращает элемент из списка по указанной позиции
        indexOf(item) – первое вхождение или -1
        lastIndexOf(item) – последнее вхождение или -1
        remove(pos) – удаление элемента на указанной позиции и его возвращение
        set(int pos, T item) – gjvtoftn значение item элементу, который находится
        на позиции pos
        void sort(Comparator) – сортирует набор данных по правилу
        subList(int start, int end) – получение набора данных от позиции start до end
        clear() – очистка списка
        toString() – «конвертация» списка в строку
        Arrays.asList – преобразует массив в список
        containsAll(col) – проверяет включение всех элементов из col
        removeAll(col) – удаляет элементы, имеющиеся в col
        retainAll(col) – оставляет элементы, имеющиеся в col
        toArray() – конвертация списка в массив Object’ов
        toArray(type array) – конвертация списка в массив type
        List.copyOf(col) – возвращает копию списка на основе имеющегося
        List.of(item1, item2,...) – возвращает неизменяемый список */

        int day = 29;
        int month = 9;
        int year = 1990;
        Integer[] date = { day, month, year };
        List<Integer> d = Arrays.asList(date);
        System.out.println(d); // [29, 9, 1990]



    }
 
    static Object Sum(Object a, Object b) 
    {
        if (a instanceof Double && b instanceof Double) {
        return (Object)((Double) a + (Double) b);
        } else if(a instanceof Integer && b instanceof Integer) {
        return (Object)((Integer) a + (Integer) b);
        } else return 0;
   
    
    }

}
