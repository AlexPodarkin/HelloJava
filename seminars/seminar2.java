package seminars;
import java.util.Scanner;
import org.w3c.dom.Text;
import java.io.FileReader;
import java.io.FileWriter;
public class seminar2 {
    public static void main(String[] args) {

        // stroka.equals(stroka2)    Proverka ravenstva
        // split(" |,|\\.");         Как сплитовать пробел","." через | перечислять если точка 
        // можно экранировать \\

        // Дано четное число N (>0) и символы c1 и c2. 
        // Написать метод, который вернет строку длины N, 
        // которая состоит из чередующихся символов c1 и c2, начиная с c1.
        Zadacha1();
        //Zadacha2();

        //Zadacha3();       


    }
    static void Zadacha2(){
        System.out.println("сжатие строки ");
        
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Enter: ");
        String x = iScanner.next();
        iScanner.close();
        
        StringBuilder sb = new StringBuilder();
        int count = 1;
        String result = "";
        for (int i = 0; i < x.length()-1; i++) {
            if (x.charAt(i) == x.charAt(i+1)){
                count++;}
            else{
                sb.append(x.charAt(i)).append(count);
                count=1;
            }
        }
        sb.append(x.charAt(x.length()-1)).append(count);
        result = sb.toString();
        System.out.println(result);

    }    
    static void Zadacha1() {
        Scanner scan = new Scanner(System.in);
        System.out.print(" введите четное число: ");
        Integer number = scan.nextInt();
        System.out.print(" введите первый символ: ");
        char c1 = scan.next().charAt(0);
        System.out.print(" введите второй символ: ");
        char c2 = scan.next().charAt(0);
        scan.close();
        
        StringBuilder sb = new StringBuilder();
 
        for (int i = 0; i<number/2; i++){

            sb.append(c1);
            sb.append(c2);
        }

        System.out.println(sb.toString());

    }
    static void Zadacha3()
    {
        System.out.println("Записать в файл строку \"Text\" 100 раз");

        

        String text = "TEXT";
        try {
            // FileReader flread = new FileReader("file.txt");
            FileWriter writer = new FileWriter("file.txt");
            for (int i=0; i < 100; i++){
                writer.write(text + "\n");
            }
            System.out.println("Получилось");
            writer.close();
        }
        catch (Exception e){
            System.out.println("Что то не так");
        }
    }
}