package estruturas.conjuntos;

import java.util.HashSet;
import java.util.Set;

public class HashSett {

    public static void main(String[] args){

        String nome = "Marcos";
        int hash = nome.hashCode();
        //System.out.println(hash); output -1997446263

        Set<String> names = new HashSet<>();

        names.add("Marcos");
        names.add("Jhon");
        names.add("Marcos"); // ignore, because Marcos is exists in list;

        System.out.println(names);

        boolean yes = names.contains("marcos"); //true;
        boolean no = names.contains("ana"); // false;
        names.remove("Marcos");

        System.out.println(names.size());

    }
}
