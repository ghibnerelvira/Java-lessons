package de.telran.summary4;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] myNumbers = { 0, 1, 3, 6, 6, 8, 18, 20, 25, 30};
        System.out.println(binSearch(myNumbers,3));
        System.out.println(binSearch(myNumbers,13));

    }

    public static int binSearch(int[] myArray, int findMe){
        if (myArray == null || myArray.length == 0) {
            throw new IllegalArgumentException("Передан пустой массив (Empty array received)");

        }
        if (myArray.length == 1) {
            return myArray[0] == findMe? 0 :  -1;
        }
        int low = 0;
        int high = myArray.length-1;

        while (low <= high){
            int middle = (low + high) / 2;
            int element = myArray[middle];
            if (element == findMe) return middle;
            if (element < findMe)
                low = middle + 1;
            else high = middle -1;
        }
        return -1;

    }
}
