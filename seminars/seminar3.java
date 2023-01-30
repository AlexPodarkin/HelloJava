package seminars;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
public class seminar3 {
    public static void main(String[] args) 
    {
        //System.out.println(ThreadLocalRandom.current().nextInt(1, 100));

/*         Random random = new Random();
        ArrayList<Integer> list1 = new ArrayList<>();
        //int a = random.nextInt(10);
        for (int i = 0; i < 10; i++) 
        {
            list1.add(random.nextInt(10));
        }
        list1.sort(Comparator.naturalOrder());
        for (Object x : list1)
        {
            System.out.print(x + " ");
        } */
        
        
        /* ArrayList<String> list2 = new ArrayList<>();
        list2.add("Upiter");
        list2.add("Mars");
        list2.add("Venus");
        list2.add("Mercury");
        list2.add("Venus");
        list2.add("Venus");
        list2.add("Upiter");
        list2.add("Upiter");
        list2.add("Mars");
        int cout1 = 0;
        int cout2 = 0;
        int cout3 = 0;
        int cout4 = 0;

        
        for (int i = 0; i < list2.size(); i++) 
        {
            if (list2.get(i) == "Upiter")
            cout1 +=1;
            else if (list2.get(i) == "Mars")
            cout2 +=1;
            else if (list2.get(i) == "Venus")
            cout3 +=1;
            else if (list2.get(i) == "Mercury")
            cout4 +=1;          
        }

        System.out.println
        ("Upiter = " +  cout1 + "\nMars = " + cout2 + "\nVenus = " + cout3 + "\nMercury = " + cout4 );
 */
        ArrayList list3 = new ArrayList(Arrays.asList(123,"asd", 123, "dfg", 159, 5, "asd"));
        System.out.println("Исходный массив" + list3);
        for (int i = 0; i < list3.size(); i++)
        {
            if (list3.get(i) instanceof Integer)
            {
                list3.remove(i);
                i--;
            }
        }

        System.out.println("Итоговый массив" + list3);

/*         ArrayList<String> list = new ArrayList<>();

        list.add("qweq");
        list.add( "fgdfg");
        list.add( "234");
        list.add( "343");
        list.add( "fgf");
        list.add( "fgf");
        list.add( "Сатурн");
        list.add( "123");
        list.add( "Земля");
        System.out.println(list);


        for (int i=0; i<list.size(); i++){
            try {
                int check = Integer.valueOf(list.get(i));
                // System.out.println(check);
                list.remove(i);
                i--;
            }
            catch (Exception e){
                // System.out.println("string");
            }
            
        }
        System.out.println(list); */









    }   
}