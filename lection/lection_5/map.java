package lection.lection_5;

import java.text.Format;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class map {
    public static void main(String[] args) 
    {

        // Hash Map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "один");
        map.putIfAbsent(1, "ONE"); // если есть ключ то не добавляем
        map.put(2, "два"); 
        System.out.println(map);
        System.out.println(map.hashCode());
        System.out.println(map.containsValue("два")); // проверка значения
        System.out.println(map.containsKey(1));         // проверка ключа
        //System.out.println(dp.keySet());  не рабит

/*         put(K,V) – добавить пару если или изменить значение,если ключ имеется.
        putIfAbsent(K,V) – произвести добавление если ключ не найден.
        get(K) - получение значения по указанному ключу.
        remove(K) – удаляет пару по указанному ключу.
        containsValue(V) – проверка наличия значения.
        containsKey(V) – проверка наличия ключа.
        keySet() – возвращает множество ключей.
        values() – возвращает набор значений. */
        for (var item : map.entrySet()) 
        {
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        }
        System.out.printf("[%d: %s]\n", 5, "5" ); //  printF



        // TreeMap , порядок !
        TreeMap<Integer,String> tMap = new TreeMap<>();
        tMap.put(1,"один"); 
        // {1=один}
        tMap.put(6,"шесть"); 
        // {1=один, 6=шесть}
        tMap.put(4,"четыре");
        // {1=один, 4=четыре, 6=шесть}
        tMap.put(3,"три"); 
        // {1=один, 3=три, 4=четыре, 6=шесть}
        tMap.put(2,"два"); 
        System.out.println(tMap);
        // {1=один, 2=два, 3=три, 4=четыре, 6=шесть}

/*      Методы, на которые нужно обратить внимание   
        put(K,V) 
        get(K)      = поучить
        remove(K)   = удалить
        descendingMap() = в обратном порядке
        tailMap()   = больше чем
        headMap()   = меньше чем
        lastEntry() 
        firstEntry() */

        // LinkedHashMap
        // Помнит порядок добавления элементов ➜ более медлительный
        Map<Integer,String> linkmap = new LinkedHashMap<>();
        linkmap.put(11, "один один");
        linkmap.put(1, "два");
        linkmap.put(2, "один");
        System.out.println(linkmap); // {11=один один, 1=два, 2=один}
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(11, "один один");
        map1.put(2, "два");
        map1.put(1, "один");
        System.out.println(map1); // {1=один, 2=два, 11=один один}

        //HashTable
        //«Устаревший брат» коллекции HashMap,который не знает про null
        Map<Integer,String> table = new Hashtable<>();
        table.put(1, "два");
        table.put(11, "один один");
        table.put(2, "один");
        System.out.println(table); // {2=один, 1=два, 11=один один}
        
        
    }
}
