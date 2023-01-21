package seminars;
import java.util.Arrays;
import java.util.Scanner;
import java.time.LocalDateTime;
public class seminar1 {
    public static void main(String[] args) {
        // SEMINAR #1
        //Zadacha1();
        //Zadacha2();
        //Zadacha3();
        Practical();

    }
    static void Zadacha1() {
        /* Написать программу, которая запросит пользователя ввести
         <Имя> в консоли. Получит введенную строку и выведет
          в консоль сообщение “Привет, <Имя>!” */
          Scanner iScanner = new Scanner(System.in,"Cp866"); // "Cp866" - понимает на вводе русский язык(у меня работал без него)

          System.out.printf("Введите имя : ");
          String name = iScanner.nextLine();
          System.out.printf("Привет, %s!\n", name); // %s добавляет знак "!" к концу сообщения.
          iScanner.close();
  
          // в зависимости от времени вывести сообщение дляя пользователя.
          System.out.printf("Сейчас %dч\n", LocalDateTime.now().getHour());
          int hourNow = LocalDateTime.now().getHour();
          if (hourNow > 5 && hourNow < 12) {
              System.out.println("Доброе утро!");
          } else if (hourNow > 12 && hourNow < 18) {
              System.out.println("Доброго дня!");
          } else if (hourNow > 18 && hourNow < 22) {
              System.out.println("Добрый вечер!");
          } else {
              System.out.println("Пора спать!");
          }
  
    }
    static void Zadacha2() {
        //Дан массив двоичных чисел, например [1,1,0,1,1,1],
        //вывести максимальное количество подряд идущих 1.
        Integer[] arr = new Integer[]{1,1,0,1,1,1,1,1,10,1,1,1,1};
        int kolvo = 0;
        int max = 0;
        for (Integer i = 0; i < arr.length; i++)
        {
            if (arr[i] == 1)
            {kolvo += 1;}
            else {
                max = kolvo;
                kolvo = 0;
            }
            if (kolvo > max){
                max = kolvo;
            }
        }
        System.out.println(max); 
    }
    static void Zadacha3(){
        /* Дан массив nums = [3,2,2,3] и число val = 3. 
        Если в массиве есть числа, равные заданному, нужно перенести
         эти элементы в конец массива. 
        Таким образом, первые несколько (или все) элементов
         массива должны быть отличны от заданного, а остальные - равны ему */

        /* Пример: 3 2 1 3 5 6
        Вывод: 2 1 5 6 3 3 */

        int[] nums = new int[] { 3, 2, 1, 3, 5, 6};
        int temp = 0;
        int chet = nums.length - 1;
        int count = nums.length -1;
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[chet] == 3) 
            {
                temp = nums[count];
                nums[count] = 3;
                nums[chet] = temp;
                count--;
                
            }
            chet--;
        }
        
        System.out.println(" ");
        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j] + " ");
        
        }
        System.out.println("\n");
    }
    static void Practical(){
        System.out.println("HI Java !");
        int[] array = new int[]{3,2,5,3};
        System.out.println(Arrays.toString(array)); // Напечатать массив
        System.out.println(array[0]);               // Обратиться по индексу
        


        

    }
}
