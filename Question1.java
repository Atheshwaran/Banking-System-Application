//   Qestion 1 - Atheshwaran.k - Sece (Ece )


 import java.util.*;

class Main
{

      public static void main(String[] args)
      {
             Scanner sc = new Scanner(System.in);
             String str = sc.nextLine().toLowerCase();
             int hasing[] = new int[127];
             int len = 0;
             while(str.charAt(len) != '\0')
             {
                   len++;
             }
             for(int i=1;i<=127;i++)
             hashing[i] = 0;             

             for(int i=0;i<len;i++)
             {
                   if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                   {
                           int n = str.charAt(i);
                           hashing[n]++;
                   }
             }
             
             for(int i=97;i<127;i++)
             {
                 char ch = (char)i;
                 if(hashing[i] > 0)
                 System.out.println(ch+" = "+hashing[i]);
             }

      }
 }

/*

Input : Today is Saturday and Tomorrow is Sunday

Output :
 a = 4
 d = 3
 i = 2
 m = 1
 n = 1
 o = 4
 r = 3
 s = 2
 t = 3
 u = 2
 w = 1
 y = 3

*/