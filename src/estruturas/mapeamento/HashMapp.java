package estruturas.mapeamento;

import java.util.HashMap;
import java.util.Map;

/*
 Map<K, V> is an amazing Java structure that stores a key and a value.
 This makes searching faster and more efficient.
*/

public class HashMapp {

    private static Map<String, Integer> namesAge = new HashMap<>();

    public static void main(String[] args){


        addElement("Marcos", 20);
        addElement("Ana", 26);
        addElement("Junior", 33);

        printHashTable(namesAge);
        addIfNotExistInList("Marcos", 20);

        getElementInList("Marcos");

        System.out.println(" ");
        getElementIfNotExistReturnDefault("Marcos", 1);

        verifyIfExistElementInList("Marcos", 20);

        System.out.println(" ");
        sizeAndIsEmpty(namesAge);

        System.out.println(" ");
        removeElement("Marcos");

        printHashTable(namesAge);
    }

    public static void addElement(String nome, int age){
        namesAge.put(nome, age);
    }

    public static void printHashTable(Map<String, Integer> list){
        for(var entry: list.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void addIfNotExistInList(String name, int age){
        namesAge.putIfAbsent(name, age);
    }

    public static void getElementInList(String name){
        System.out.println("Search in list: "+name+ " -> "+namesAge.get(name));
    }

    public static void getElementIfNotExistReturnDefault(String name, int age){
        System.out.println("Search by element, if not exist return default "+namesAge.getOrDefault(name, age));
    }

    public static void verifyIfExistElementInList(String key, int value ){
        System.out.println("Key is exist: "+ namesAge.containsKey(key));
        System.out.println("value is exist: "+ namesAge.containsValue(value));
    }

    public static void sizeAndIsEmpty(Map<String, Integer> list){
        System.out.println("Size of list: "+ list.size());
        System.out.println("IsEmpty: "+ list.isEmpty());
    }

    public static void removeElement(String name){
        namesAge.remove(name);
    }
}
