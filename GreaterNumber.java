// Java program to find next greater 
// number with same set of digits.
import java.util.Arrays;
 
 public class QuickSort {
   public static void exchangeCharchar i, char j, char[] array) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
   }
  
   public static void quickSort(int lowerIndex, int higherIndex, char[] array) {
         
        int i = lowerIndex;
        int j = higherIndex;
        
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which 
             * is greater then the pivot value, and also we will identify a number 
             * from right side which is less then the pivot value. Once the search 
             * is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeChar(i, j, array);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j, array);
        if (i < higherIndex)
            quickSort(i, higherIndex, array);
    }
    
    public static int[] sort(char[] array) {
        int i = array.length-1;
        
        while ((i>0) && (array[i-1] > array[i]) {
            i--;
        }
        
        if (i==0) {
            return array;
        } else {
            
        }
        
        return array;
    }
}

public class nextGreater 
{
    // Utility function to swap two digit
    static void swap(char ar[], int i, int j) 
    {
        char temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
 
    // Given a number as a char array number[], 
    // this function finds the next greater number. 
    // It modifies the same array to store the result
    static void findNext(char ar[], int n) 
    {
        int i;
         
        // I) Start from the right most digit 
        // and find the first digit that is smaller 
        // than the digit next to it.
        for (i = n - 1; i > 0; i--) 
        {
            if (ar[i] > ar[i - 1]) {
                break;
            }
        }
         
        // If no such digit is found, then all 
        // digits are in descending order means 
        // there cannot be a greater number with 
        // same set of digits
        if (i == 0) 
        {
            System.out.println("Not possible");
        } 
        else
        {
            int x = ar[i - 1], min = i;
             
            // II) Find the smallest digit on right 
            // side of (i-1)'th digit that is greater 
            // than number[i-1]
            for (int j = i + 1; j < n; j++) 
            {
                if (ar[j] > x && ar[j] < ar[min]) 
                {
                    min = j;
                }
            }
 
            // III) Swap the above found smallest 
            // digit with number[i-1]
            swap(ar, i - 1, min);
 
            // IV) Sort the digits after (i-1) 
            // in ascending order
            quickSort(i, n, ar);
            System.out.print("Next number with same" +
                                    " set of digits is ");
            for (i = 0; i < n; i++)
                System.out.print(ar[i]);
        }
    }
 
    public static void main(String[] args) 
    {
        char digits[] = {'5','3','4','9','7','6'};
        int n = digits.length;
        findNext(digits, n);
    }
}
