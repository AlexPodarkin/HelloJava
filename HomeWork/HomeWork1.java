package HomeWork;
import java.util.Scanner;
public class HomeWork1 {
    public static void main(String[] args) {
        //Вычислить n-ое треугольного число(сумма чисел от 1 до n),
        //n! (произведение чисел от 1 до n) тр 5 = 1+2+3+4+5 5! = 1*2*3*4*5
        //Zadacha1();

        // Вывести все простые числа от 1 до 1000
        //Zadacha2();

        // Реализовать простой калькулятор Scanner sc = ... int a = sc.nextLine int b = sc.nextLine
        Zadacha3();

       
        
        
    }
    static void Zadacha1() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число : ");
        int chislo = iScanner.nextInt();
        iScanner.close();
        int resTriengle = 0;
        int resFact = 1;
        for (int i = 1; i <= chislo; i++) {
            resTriengle += i;
            resFact *= i;
        }

        System.out.println( "Треугольноe числo " + chislo + " = " + resTriengle);
        System.out.println( "Факториал " + chislo + " = " + resFact);
    }

    static void Zadacha2() {
        int prostChisla = 1000;
        System.out.printf("Простые числа от 0 до %s : ", prostChisla);
        for(int i = 2; i < prostChisla; ++i){
            int count = 0;
            for(int j = 2; j <=i && count < 2;++j){
              if(i%j==0){
                ++count;}
            }
            if(count<2) {
               System.out.print(i + " ");}
          }
    }

    static void Zadacha3() {
        int a; // если заменить на doble бедет считать точнее ;)
        int b;
        int res = 0;
        char op;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите 1е число: ");
        a = sc.nextInt();
        System.out.print("Введите 2е число: ");
        b = sc.nextInt();
        System.out.print("\nВведите оператор (+, -, *, /): ");
        op = sc.next().charAt(0);
        sc.close();
        if (op == '+'){
            res = a + b;}
        else if(op == '-') {res = a - b;}
        else if(op == '*') {res = a * b;}
        else if(op == '/') {res = a / b;}
        else System.out.printf("Неверный ввод !");
        System.out.print("\n   Ответ:\n");
        System.out.printf(a + " " + op + " " + b + " = " + res);
    }
}
