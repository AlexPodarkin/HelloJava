package lection.lection_1;

public class methods {
    public static void main(String[] args) {
        System.out.println(factor(5));
        System.out.println(lib.factor(5)); // это мы достали из файла lib.java в этой директории

        // тернарные операции
        int a = 5;
        int b = 2;
        int min = a < b ? a : b; // если выполнится то вернет "а" невыполнится "b"
        // обязательно возвращает значение !!! Внимание на синтаксис !
        System.out.println("minimum = " + min);

        // оператор выбора switch
        int vibor = 3;
        switch (vibor) {
            case 1:
                vibor = 1;
                System.out.println("Переменная vibor1 = " + vibor);
                break;
            case 2:
                vibor = 2;
                System.out.println("Переменная vibor2 = " + vibor);
                break;
            default:
                System.out.println("вы не определили переменную vibor"); // по типу else
                break;
        }

        // Циклы while, do while, for и его модификация for in
        for (int i = 0; i < 11; i++) 
        {
            if (i % 2 == 0)
                continue; // оператор "continue" перебрасывет цикл на следующую итерацию

            System.out.println("Нечетные числа = " + i);
        }

        int[] arr = new int[] { 1, 2, 3, 4, 55 }; // цикл foreatch для итерируемых обЪектов
        for (int x : arr)
        {
            System.out.print(x + " ");
        }
        

    }

    static double factor(int n) {
        if (n == 1)
            return 1;
        {
            return n * factor(n - 1);
        }
    }
}
