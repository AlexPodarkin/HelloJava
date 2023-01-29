package lection.lection_2;

public class API {
    public static void main(String[] args) 
    {
        // API - это контракт, который предостовляет программа.
        // к ней можно обращаться и она обязуется что то делать :)
        // это возможность работать с его функционалом
        // что такое API для нас: строки
        // Создать строку из 1 млн плюсиков. Как ?

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000; i++) // миллион мой комп печатал 30 сек :D поэтому я уменьшил значение
        {
            sb.append("+");
        }
        System.out.println(sb.charAt(5));
        sb.replace(3, 10, "0");
        System.out.println(sb);
        // методы для Строк
/*      concat(): объединение строк
            valueOf(): преобразует Object в строковое представление (завязан на toString())
        join(): объединяет набор строк в одну с учетом разделителя
        charAt(): получение символа по индексу
            indexOf(): первый индекс вхождения подстроки
        lastIndexOf(): последний индекс вхождения подстроки
            startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
        replace(): замена одной подстроки на другую
        trim(): удаляет начальные и конечные пробелы
            substring(): возвращает подстроку, см.аргументы
        toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
        сompareTo(): сравнивает две строки
        equals(): сравнивает строки с учетом регистра
        equalsIgnoreCase(): сравнивает строки без учета регистра
        regionMatches(): сравнивает подстроки в строках */
        
        // Массив строк
        String[] name = {"S","e","r","g","e","i"};
        String sk = "Sergei`ka";
        System.out.println(sk.toLowerCase());
        System.out.println(String.join(" ", name));
    } 
}
