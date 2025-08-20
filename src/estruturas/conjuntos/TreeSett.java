package estruturas.conjuntos;

import java.util.*;

//first() → retorna o menor elemento.
//last() → retorna o maior elemento.
//higher(E e) → retorna o menor elemento maior que e.
//lower(E e) → retorna o maior elemento menor que e.
//subSet(E from, E to) → retorna um conjunto entre dois valores.
//headSet(E to) → todos os elementos menores que to.
//tailSet(E from) → todos os elementos maiores ou iguais a from.

public class TreeSett {

    public static void main(String[] args){
        //System.out.println("Hello, World");

        TreeSet<Integer> number = new TreeSet<>();

        number.add(2);
        number.add(30);
        number.add(5);
        number.add(9);

        System.out.println(number);

        firstElement(number); // print the first element;
        lastElement(number);
        biggerElement(number);


    }

    public static void firstElement(TreeSet<Integer> numbers){
        System.out.println(numbers.first());
    }

    public static void lastElement(TreeSet<Integer> numbers){
        System.out.println(numbers.last());
    }

    public static void biggerElement(TreeSet<Integer> numbers){
        System.out.println(numbers.higher(5));
    }

    public static void printTree(TreeSet<Integer> number){
        for(int i = 0; i < 1; i++){
            List<Integer> numeros = new ArrayList<>(number);
            System.out.println("  "+numeros.get(i));
            System.out.println(" /" +  "  \\ ");
            System.out.println(numeros.get(i + 1) +"  "+ numeros.get(i + 2));
        }
    }
}
