package lection.lection_1;
import java.io.FileWriter;
import java.io.IOException;
public class rabota_s_file {
    public static void main(String[] args) {
        
        try (FileWriter fw = new FileWriter("file.txt",false))    
        // аргумент false или true дописать или создать/переписать
        {
            fw.write("Line1");
            fw.append("\n");
            fw.write("Line2");
            fw.append("\n");
            fw.flush();            // записываем методом flush(); 
            fw.close();
            System.out.println("Успешно !");

        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        System.out.println("Hi");
    }
}
