
package yef.task.pkg1;

import java.util.Random;


public class YEFTask1 {

    public static void main(String[] args) {
      Random r=new Random();
      int ar[] = new int[10];
      for (int i=0;i<10;i++){
          ar[i]=r.nextInt(499)+1; //genrating 10 random numbers and storing in an array
      }
      for(int s=0;s<10;s++){
          System.out.print(ar[s]+" ");    //printing 10 random numbers generated
      }
      System.out.println();
      int temp;
      for(int j=0;j<10;j++){
          for(int k=0;k<9;k++){
              if(ar[k]>ar[k+1]){   //sorting the numbers in ascending order using Bubble Sort
                  temp=ar[k];
                  ar[k]=ar[k+1];
                  ar[k+1]=temp;
              }
          }
      }
     for(int s=0;s<10;s++){
          System.out.print(ar[s]+" ");   //printing the sorted numbers
      }
    }
    
}
