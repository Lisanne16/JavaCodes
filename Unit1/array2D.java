package Unit1;

import java.util.Scanner;

public class array2D {
    public static void main(String[] args){
         int arr[][]= new int[5][5];
         int r,c,j,i;

        Scanner in = new Scanner(System.in);
         System.out.println("Enter the number of rows and columns: ");
         r=in.nextInt();
         c=in.nextInt();


         for (i=0;i<r; i++)
         {
             for(j=0;j<c;j++)
             {   System.out.println("Enter element "+i+','+j);
                 arr[i][j]=in.nextInt();

             }
         }

         for(i=0;i<r;i++)
         {
             for(j=0;j<c;j++){
             System.out.print(arr[i][j]+"  "); //print means to print directly
         }
       System.out.println(); //println means to print on a new line
         }
    }
}
