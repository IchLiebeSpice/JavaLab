/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import static jdk.nashorn.internal.objects.NativeFunction.function;
/**
 *
 *
 */
public class JavaApplication4 {

    public static void main(String[] args) {
        
       int[] solutionArray = { 1, 2, 3, 4, 5, 6, 16, 15, 14, 13, 12, 11 };
        
    shuffleArray(solutionArray);
    for (int i = 0; i < solutionArray.length; i++)
    {
      System.out.print(solutionArray[i] + " ");
    }
    System.out.println();
  }

  static void shuffleArray(int[] ar)
  {
    Random rnd = ThreadLocalRandom.current();
    for (int i = ar.length - 1; i > 0; i--)
    {
      int index = rnd.nextInt(i + 1);
      int a = ar[index];
      ar[index] = ar[i];
      ar[i] = a;
    }
  }
 }
    



