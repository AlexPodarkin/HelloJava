package lection.lection_6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set {
    public static void main(String[] args) 
    {
        
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(4);
        System.out.println(set.contains(2)); // true / есть ли 12 в множестве
        set.add(null);
        System.out.println(set.size()); // 5 Размер множества
        System.out.println(set); // [null, 1, 1234, 123, 12]
        set.remove(2);  // удаление

        //цикл аналогичен map
        for (var item : set) 
        {
            System.out.println(item); // null 1 1234 123
        }
        
        set.clear(); // отчистка множества
        System.out.println(set); // []

        // синтаксис для set
        /* isEmpty() – проверка на пустоту. true 
        add(V) – добавление элемента в коллекцию.
        remove(V) – удаление элемента из коллекцию.
        contains(V) – проверка на включение элемента в коллекции. true 
        clear() – удаление всех элементов коллекции.
        size() – возвращает количество элементов коллекции.размер */

        //HashSet как синоним множества
        //addAll(Coll) – объединение множеств.
        //retainAll(Coll) – пересечение множеств.
        //removeAll(Coll) – разность множеств.
        var a = new HashSet<>(Arrays.asList(100,99));    // [1, 2, 3, 4, 5, 6, 7]
        var b = new HashSet<>(Arrays.asList(2,3,5,7,11,13,17)); // [17, 2, 3, 5, 7, 11,13]
        var u = new HashSet<Integer>(a);   u.addAll(b);    //объединение множеств(сложение)
        var r = new HashSet<Integer>(a);   r.retainAll(b); //пересечение множеств(общее из 2х)
        var s = new HashSet<Integer>(a);   s.removeAll(b); //разность множеств(вычитание a-b)
        System.out.println(u);                             // [1, 17, 2, 3, 4, 5, 6, 11]
        System.out.println(r);                             // [2, 3, 5, 7]
        System.out.println(s);                             // [1, 4, 6]
        boolean res = a.addAll(b);                         // boolean res
        System.out.println(res);
        //HashSet как синоним множества    
     
        // TreeSet упорядоченное множество
        /* В основе HashMap.
        ● Упорядочен по возрастанию.
        ● null’ов быть не может. */

        /* first()
        last()
        headSet(E)
        tailSet(E)
        subSet(E1, E2) */
        var a1 = new TreeSet<>(Arrays.asList(1,7,2,3,6,4,5));
        System.out.println(a1); // [1, 2, 3, 4, 5, 6, 7]
        System.out.println(a1.first()); // первый 
        System.out.println(a1.last());  // последний
        System.out.println(a1.headSet(5)); // [1, 2, 3] // срез
        System.out.println(a1);
        System.out.println(a1.tailSet(4)); // [4, 5, 6, 7] // срез
        System.out.println(a1);
        System.out.println(a1.subSet(3, 5)); // [3, 4] // срез

        //LinkedHashSet
      /*● В основе HashMap.
        ● Помнит порядок.
        ● Использовать, когда нужен HashSet с запоминанием порядка элемента. */

     /* isEmpty() – проверка на пустоту.
        add(V) – добавление элемента в коллекцию.
        remove(V) – удаление элемента из коллекцию.
        contains(V) – проверка на включение элемента в коллекции.
        clear() – удаление всех элементов коллекции.
        size() – возвращает количество элементов коллекции. */

        var a2 = new LinkedHashSet<>(Arrays.asList(1,7,2,3,6,4,5));
        System.out.println(a2); // [1, 7, 2, 3, 6, 4, 5]
        a2.add(28);
        System.out.println(a2);

        











    }
}