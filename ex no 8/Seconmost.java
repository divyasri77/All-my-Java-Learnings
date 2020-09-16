/*
Write a Java program to find the second most frequent character in a given string.
Sample Output
The given string is: successes
The second most frequent char in the string is: c
 */
package seconmost;

import java.util.Scanner;

/**
 *
 * @author divya
 */
public class Seconmost {
static  int NOOFCHARS = 256;
 static char getsecondmostfreq(String str1) {

  int[] ctr = new int[NOOFCHARS];
  int i;
  for (i = 0; i < str1.length(); i++)
        
     System.out.println((ctr[str1.charAt(i)]) ++);

  int first = 0, second = 0;
  for (i = 0; i < NOOFCHARS; i++) {
   if (ctr[i] > ctr[first]) {
    second = first;
    first = i;
   } else if (ctr[i] > ctr[second] && ctr[i] != ctr[first])
    second = i;
  }
  return (char) second;
 }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
  String str1 = obj.nextLine();
  System.out.println("The given string is: " + str1);
  char res = getsecondmostfreq(str1);
  if (res != '\0')
   System.out.println("The second most frequent char in the string is: " + res);
  else
   System.out.println("No second most frequent character found in the string.");
 }
}
    

