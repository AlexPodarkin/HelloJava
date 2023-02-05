package seminars;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.*;


public class seminar5 {
    public static void main(String[] args) {
        /* Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
        123456 Иванов     
        321456 Васильев    
        234561 Петрова   
        234432 Иванов   
        654321 Петрова   
        345678 Иванов    
        Вывести данные по сотрудникам с фамилией Иванов. */

/*         Map<Integer, String> map = new HashMap<>();
        map.put(123456, "Иванов");
        map.put(321456, "Васильев");
        map.put(234561, "Петрова");
        map.put(234432, "Иванов");
        map.put(654321, "Петрова");
        map.put(345678, "Иванов");
        System.out.println(map.values());

        for (var item : map.entrySet()) 
        {
            if (item.getValue().equals("Иванов"))
            {
                System.out.println("паспорт: " + item.getKey() + " фамилия: " + item.getValue());
            }
        } */

/* Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false,
 если нет.Строки изоморфны, если одну букву 
 в первом слове можно заменить на некоторую букву во втором слове,
 при этом 1. повторяющиеся буквы одного слова меняются на одну и ту же букву
  с сохранением порядка следования. 
(Например, add - egg изоморфны)
2. буква может не меняться, а остаться такой же. (Например, note - code)
Пример 1:Input: s = "foo", t = "bar"Output: false
Пример 2:Input: s = "paper", t = "title" Output: true */

    String str1 = "paper";
    String str2 = "title";
    String[] str3 = str1.split( "");
    String[] str4 = str2.split( "");
    Map<String, String> map = new HashMap<>();
    Boolean ok = true;
  

    for (int i = 0; i < str4.length; i++) 
    {
        map.put(str3[i], str4[i]);
        if(map.containsKey(str3[i]) & (map.containsKey(str3[i])))
        {
            ok = true;
        }
        else
        {
            ok = false;
        }
    }
     System.out.println(ok);  










     
     String string1 ="papera";
     String string2 ="titlet";
     Boolean prov=true;
     Map<Character, Character> dic=new HashMap<Character,Character>();
     if (string1.length()==string2.length()){
         for (int i = 0; i < string1.length(); i++) {
             if (dic.containsKey(string1.charAt(i))) {
                 if (dic.get(string1.charAt(i))!=string2.charAt(i)){
                     prov=false;
                 }
             }else{
                 if (dic.containsValue(string2.charAt(i))){
                     prov=false; 
                 }
                 dic.put(string1.charAt(i), string2.charAt(i));
             }
             }
     } else {
         prov=false;
     }
     System.out.println(prov);
      
    
    
    
    
    
/*      String yrav = "{}[](){}()[]";
    char[] chars = yrav.toCharArray();
    //System.out.println(chars[0].equals(')'));
    for (int i = 0; i < chars.length; i++) 
    {
         if (chars[i].equals(''))
        {
            System.out.println();
        }       
    } */


/*     String yrav = "(({[]+()}))";
        char[] chars = yrav.toCharArray();
        Stack<Character> stack = new Stack<>();
        Map <Character, Character> map = new HashMap<>();
        boolean flag = true;
        String[] c1 = new String[] {"()", "{}", "[]", "<>"};
        for (int i = 0; i < c1.length; i++)
        {
            String s = c1[i];
            map.put(s.charAt(1), s.charAt(0));
        }
        for (int i = 0; i < chars.length; i++){
            if (map.containsValue(chars[i])){
                stack.push(chars[i]);
            }
            else if (map.containsKey(chars[i])){
                if (stack.empty() || map.get(chars[i]) != stack.pop()){
                    flag = false;
                    break;
                }
            }
        }
        if (flag){
            System.out.println(stack.empty());
        }
        else
        {
            System.out.println(false);
        }
 */
    }
}
