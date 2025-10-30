import java.util.*;
public class Selection 
{   
  public static void print_array(int arr[], int n)
   { 
     for (int i = 0; i < n; i++)
       {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    } 

    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of elements in the array:");
       int n = sc.nextInt();
       int arr[] = new int[n];
       System.out.println("Enter the array elements:");
       for (int i = 0; i < n; i++)
         {
            arr[i] = sc.nextInt();
         }
       for (int i = 0; i < n - 1; i++)
         {
            int min = i;
            for (int j = i + 1; j < n; j++)
              {
                if (arr[j] < arr[min])
                {
                    min = j;
                }
             }
          int temp = arr[min];
          arr[min] = arr[i];
          arr[i] = temp;
      }
      System.out.println("Sorted array:");
     print_array(arr, n);
      sc.close();
    }
}

