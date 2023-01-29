package lection.lection_2;
import java.io.FileWriter;
public class rabota_s_failami {
    /**
     * @param args
     */
    public static void main(String[] args) {
    // каталоги и файлы
    
    //Работа с файловой системой
/*  isHidden(): возвращает истину, если каталог или файл является скрытым
    length(): возвращает размер файла в байтах
    lastModified(): возвращает время последнего изменения файла или каталога
    list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
    listFiles(): возвращает массив файлов и подкаталогов, которые находятся
    в определенном каталоге
    mkdir(): создает новый каталог
    renameTo(File dest): переименовывает файл или каталог 
    length(): возвращает размер файла в байтах
    lastModified(): возвращает время последнего изменения
    файла или каталога
    list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
    listFiles(): возвращает массив файлов и подкаталогов, которые
    находятся в определенном каталоге
    mkdir(): создает новый каталог
    renameTo(File dest): переименовывает файл или каталог */
    System.out.println("Записать в файл строку \"Text\" 5 раз"); 

        String text = "Alex";
        try 
        {
            // FileReader flread = new FileReader("file.txt");
            FileWriter writer = new FileWriter("c:\\Users\\Александр\\Desktop\\Java\\lection\\lection_2\\file.txt");
            for (int i=0; i < 5; i++){
                writer.write(text + "\n");
            }
            System.out.println("Получилось");
            writer.close();
        }
        catch (Exception e)
        {
            System.out.println("Что то не так");
        }

        // Бинарные файлы
        // Изучи статьи 
        // END
    }
}
