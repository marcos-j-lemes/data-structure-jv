package estruturas.conjuntos;

import java.util.LinkedHashSet;

public class LinkHashSet {

    private static final LinkedHashSet<String> names = new LinkedHashSet<>();

    public static void main(String[] args){

        names.add("First");
        names.add("Second");
        names.add("Third");

        checkIfItHasTheElement("Second");
        removeElementInList("First");
        printOfList(names);
        sizeOfList(names);
        clearOfList(names);
        sizeOfList(names);
    }


    private static void checkIfItHasTheElement(String element){
        if(!names.contains(element)){
            System.out.println("item is not contain in list");
        }else{
            System.out.println("item is in  list");
        }
    }

    private static  void removeElementInList(String element){
        if(!names.contains(element)){
            System.out.println("Element is not contain in list");
        }else{
            names.remove(element);
        }
    }

    private static void sizeOfList(LinkedHashSet<String> list){
        System.out.println("Size: "+ list.size());
    }

    private static void clearOfList(LinkedHashSet<String> list){
        if(!list.isEmpty()){
            list.clear();
        }else{
            System.out.println("List is empty");

        }
    }

    private static void printOfList(LinkedHashSet<String> list){
        for(String s: list){
            System.out.println(s);
        }
    }
}

//add() → inserir
//remove() → remover
//contains() → verificar existência
//size() → contar elementos
//clear() → limpar tudo
//iterator() / for-each → percorrer
//toArray() → converter