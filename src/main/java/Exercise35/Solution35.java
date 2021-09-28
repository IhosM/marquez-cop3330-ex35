/*
 *  UCF COP3330 Fall 2021 Assignment 35 Solution
 *  Copyright 2021 Ihosvany Marquez
 */

package Exercise35;

import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

  class Solution35
  {
      public static void main(String[] args)
      {
          int listSize;
          Scanner scan = new Scanner(System.in);
          Random r = new Random();
          System.out.print("How many participants are there? ");
          listSize = scan.nextInt();

          String[] array = new String[listSize];
          for(int i = 0; i < array.length; i++)
          {
              Scanner scan2 = new Scanner(System.in);
              System.out.print("Enter a name: ");
              array[i] = scan2.nextLine();

              if(Objects.equals(array[i], ""))
              {
                  break;
              }
          }

          int randNum = r.nextInt(array.length);
          System.out.print(array[randNum] + " is the winner!");
      }
  }