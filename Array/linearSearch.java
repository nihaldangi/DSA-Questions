// There are 2 questions on linear Search
// first is for find a key in an array
// second is for find the largest & smallest values in an array 

// first question -- Find a key in an array 

// public class linearSearch {
//     public static int linearSearch(int numbers[], int key){

//         for(int i = 0; i<numbers.length; i++) {
//             if(numbers[i] == key) {
//                 return i;
//             }
//         }

//         return -1;
//     }
//     public static void main(String[] args) {
//         int numbers[] = {2, 4, 6, 8, 10, 12, 14};
//         int key = 10;

//         int index = linearSearch(numbers, key);
//         if(index == -1) {
//             System.out.println("NOT found");
//         } else {
//             System.out.println("key is at index : " + index);
//         }
//     }
// }

// Second question -- Largest value & Smallest value in Array

public class linearSearch {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; //-infinity
        int smallest = Integer.MAX_VALUE; //+infinity

        for(int i = 0; i<numbers.length; i++) {
            if(largest < numbers[i]) {
                largest = numbers[i];
            }
            if(smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value is :" + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1, 3, 2, 5, 6, 4};
        System.out.println("larest value is :" + getLargest(numbers));
    }
}


