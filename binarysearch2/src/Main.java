import java.util.*;
public class Main {
    static int BinarySearch(int[] array, int num)
    {
        int low  = 0;
        int high = array.length;
        
        while(low <= high)
        {
            int middle = (low + high)/2;
            
            if(array[middle] == num)
            {
                return middle;
            }
            else if(array[middle] < num)
            {
                low = middle + 1;
            }
            else 
            {
                high = middle - 1;
            }
        }
        return 0;
    }
    
    public static void main(String[] args)
    {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,22,33,44};
        int num = 4;
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of the elements to add");
        int x = scanner.nextInt();
        int[] array = new int[x];
        for(int i = 0; i < x - 1; i++)
        {
            System.out.println("enter the value at position "+(i+1));
            int y = scanner.nextInt();
            array[i] = y;
        }
        System.out.println("enter the number to search");
        int num = scanner.nextInt();
        */
        int search = BinarySearch(array, num);
        if(search != 0)
        {
            System.out.println("Search found at position " + num);
        }
    }
}
