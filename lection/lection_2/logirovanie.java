package lection.lection_2;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

public class logirovanie {
    public static void main(String[] args) throws SecurityException, IOException {
        // Логирование
     /* Логи содержат системную информацию работы
        программного или аппаратного комплекса.
        В них записываются действия разного приоритета
        от пользователя, или программного продукта.
        Процесс ведения логов называют
        “логированием” (журналированием). */

        //Использование
/*      Logger logger = Logger.getLogger()
        Уровни важности
        INFO, DEBUG, ERROR, WARNING и др.
        Вывод
        ConsoleHandler info = new ConsoleHandler();
        log.addHandler(info);
        Формат вывода: структурированный, абы как*
        XMLFormatter, SimpleFormatter
 */

        //ConsoleHandler(); // Для вывода логов в консоль

        // Файл Хандлер для логирования в файл
        Logger logger = Logger.getLogger(logirovanie.class.getName());
        FileHandler fh = new FileHandler("c:\\Users\\Александр\\Desktop\\Java\\lection\\lection_2\\log.txt"); 
        logger.addHandler(fh);

        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        
        logger.info("Log:");


        
    } // END MAIN


    static void ConsoleHandler()
    {
        Logger logir = Logger.getLogger(logirovanie.class.getTypeName());
        ConsoleHandler ch = new ConsoleHandler();

        logir.addHandler(ch);

        //SimpleFormatter sFormat = new SimpleFormatter(); // Текстовый формат логирования
        //ch.setFormatter(sFormat);                        // Текстовый формат логирования
        XMLFormatter xml = new XMLFormatter();
        ch.setFormatter(xml);


        logir.log(Level.WARNING, "Test LOG");
        logir.info("Test LOG 2");

    }
}
