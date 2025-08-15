package estruturas.sequenciais;

import java.util.Arrays; // import of collection of array with methods

public class Arr {

    public static void main(String[] args){

        // how to initial at array:
        int[] number = new int[5];
        //or
        String[] colors = {"red", "blue","green","white"};

        //how to add elements in an array:
        colors[0] = "red";
        // with loops
        for(int i = 0; i < 5; i++){
            number[i] = i;
        }

        String[] nameWithSplit = StringForArray("Marcos"); // this split the word in at array. output [m,a,r,c,o,s]

        PrintWithForEachString(nameWithSplit); // output: m, a,r,c,o,s by line
        String numberInString = ReturnArrayInString(number); //output: [0,1,2,3,4]
        System.out.println(numberInString);

        int[] numbers = {1,2,3,4,5};
        boolean arrIsEquals = compareTwoArraysIfEquals(number, numbers); // return false, because one range 1 to 5, and other is 0 to 4;
        System.out.println(arrIsEquals);

        arrIsEquals = compareTwoArraysIfEquals(numbers, numbers); // return true, because is same arr.
        System.out.println(arrIsEquals);

        boolean resultOfCompareIndex = compareTheIndexElementOfArr(new String[]{"a", "b","c"}, new String[]{"a", "b", "c"}, 2);
        // this compare two index of arrays is equals
        System.out.println(resultOfCompareIndex);

        int[] copyOfArrWithTarget = copyOfArrayWithTarget( new int[]{1,2,3,4,5,6,7}, 4);
        //this method copy an array, IS defined of target index or length;
        System.out.println("Copy: "+Arrays.toString(copyOfArrWithTarget));

       // System.out.println(Arrays.toString(copyOfArrWithTarget(new int[]{1,2,3,4,5}, 5)));
        //System.out.println("Word with split: "+ nameWithSplit); // this back the address of arr in memory
        // is not correct
    }

    public static void PrintWithForEachString(String[] arr){
        for (String s : arr) { //this for is much used with arr, because is simplified of print elements of array
            System.out.println(s);
        }
    }

    public static String[]  StringForArray( String word){
        return word.split(""); // split is used to separate the letters of string to be in individual elements
    }

    public static String ReturnArrayInString(int[] numbers){
        return Arrays.toString(numbers); // transform an array in at String, perfect for manipulate or print;
    }

    public static boolean compareTwoArraysIfEquals(int[] arrOne, int[] arrTwo){
        return Arrays.equals(arrOne, arrTwo); // this compare two array, but only is same type, if not return error;
    }

    public static boolean compareTheIndexElementOfArr(String[] arrOne, String[] arrTwo, int index){
        return arrOne[index].equals(arrTwo[index]); // in summary, he is compare index of array is equal, and later return true or false;
    }

    public static  int[] copyOfArrayWithTarget(int[] number, int target){
        return Arrays.copyOf(number, target); // copy the array to target index defined;
    }
}
