import java.util.*;
public class main {
    static void sort(int[] array, int num)
    {
        int i, j, a;
        
        for(i = 0; i < num ; i++)
        {
            for(j = i + 1 ; j < num ; j++)
            {
                if(array[i] > array[j])
                {
                    a = array[i];
                    array[i] = array[j];
                    array[j] = a;
                }
            }
        }
        System.out.println("The assending sorted list of the elements is");
        for(i = 0; i < num ; i++)
        {
            System.out.print(array[i]);
            
            if(i != (num-1))
                System.out.print(", ");
            else
                System.out.println();
        }
        
        for(i = 0 ; i < num ; i++)
        {
            for(j = i+i ; j < num ; j++)
            {
                if(array[i] < array[j])
                {
                    a = array[i];
                    array[i] = array[j];
                    array[j] = a;
                }
            }
        }
        System.out.println("The desending sorted list of the list is");
        
        for(i = 0; i< num ; i++)
        {
            System.out.print(array[i]);
            if(i != (num - 1))
                System.out.print(", ");
            else
                System.out.println();
        }
    }
    public static void main(String[] args)
    {
        /*
        int[] array = {2,7,5,3,8,9,4,1,23,25,27,67,89,36,27,80};
        int x = array.length;
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size ; i++)
        {
            System.out.println("Eneter the value of index" + i);
            array[i] = scanner.nextInt();
        }
        System.out.println("the elements of the array entered are ");
        for(int i = 0 ; i < size; i++)
        {
            System.out.print(array[i]);
            if(i!= (size-1))
                System.out.print(", ");
            else
                System.out.println();
        }
        sort(array, size);
    }
}