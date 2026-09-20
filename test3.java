//# EXPERIMENT - 1 (INPUT OUTPUT IN JAVA)
//#Q3:Write a java program to find if the given number is palindrom or not.

class test3
  {
    public static void main(String args[])
    {
      int num = Integer.parseInt(args[0]);
      int temp = 0;
      int rev = 0;
      while(num != 0)
        {
          int d = num%10;
          rev = rev*10+d;
          num = num/10;
        }
      if(temp == rev)
      {
        System.out.println(temp +"is a palindrome number")
      }
      else
      {
        System.out.println(temp +"is not a palindrome number")
      }
    }
  }
