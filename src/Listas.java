import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Carlos");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add("Bruno");
        list.add(2, "Marco");

        System.out.println(list.size());


        for (String x : list){
            System.out.println(x);
        }

        System.out.println("-------------------");

        list.remove(1);

        //Removendo nomes que iniciam em "A" com base em um predicado
        list.removeIf(x -> x.charAt(0) == 'B');

        for (String x : list){
            System.out.println(x);
        }

        System.out.println("------------------------");
        //Buscando posição de um elemento
        System.out.println("Index of Carlos: " + list.indexOf("Carlos"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'B').collect(Collectors.toList());

        for (String x : result){
            System.out.println(x);
        }

        System.out.println("------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}
