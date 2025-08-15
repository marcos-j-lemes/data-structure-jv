package estruturas.sequenciais;

import java.util.Arrays;

//util with structure of collection and list for arrayList
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrList {

    public static void main(String[] args){

        //create an arraylist empty;
        List<String> cars = new ArrayList<>();

        //create an arrayList with size 10;
        List<Integer> numbers = new ArrayList<>(10);

        numbers.add(10);
        numbers.add(1);
        numbers.add(4);

        //how to add elements in arrayList;
        cars.add("Ferrari");
        cars.add("BMW");
        cars.add("Porsche");

        printWithForLoops(cars);

        //add with index defined
        cars.add(1, "Fiat");

        // access elements defined of index
        System.out.println(cars.get(1));

        // In arrayList is not necessary use loop for print of elements
        System.out.println(cars);

        //remove elements in arrayList
        cars.remove(1); // remove for index;
        cars.remove("Ferrari"); //remove for elements;
        cars.clear(); // remove all elements in array;

        printWithForEachLoop(numbers); // this print is very efficiency;
        sortWithCollectionInArray(numbers); // this method order of array in small for big elements
        reverseInArrayListWithCollection(numbers); // this name is very clean

        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("apple");
        fruits.add("strawberry");
        fruits.add("blueberry");

        arrayListForArray(fruits);

        System.out.println(verifyElementsInArray(fruits, "apple")); // verify element exist in arrayList;

        System.out.println(checkIfEmpty(fruits));

    }

    public static void printWithForLoops(List<String> cars){
        for(int i = 0; i < cars.size(); i++){
            System.out.println("Index: "+ i + " Element: "+ cars.get(i));
        }
    }

    public static void printWithForEachLoop(List<Integer> numbers){
        for(Integer i: numbers){
            System.out.println(i);
        }
    }

    public static void sortWithCollectionInArray(List<Integer> numbers){
        Collections.sort(numbers);
        System.out.println("Sort in arrayList: " +numbers);
    }

    public static void reverseInArrayListWithCollection(List<Integer> numbers){
        System.out.println("ArrayList normally: "+ numbers);
        Collections.reverse(numbers);
        System.out.println("ArrayList with reverser: "+numbers);
    }

    public static void arrayListForArray(List<String> fruits){
        String[] carsForArray = fruits.toArray(new String[0]);
        System.out.println(Arrays.toString(carsForArray));
    }

    public static boolean verifyElementsInArray(List<String> fruits, String element){
        return fruits.contains(element);
    }

    public static boolean checkIfEmpty(List<String> fruits){
        return fruits.isEmpty();
    }
}
