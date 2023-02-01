//Print a series of numbers with recursive Java methods
class Main1{
  public static void main(String args[]){
     System.out.println(series(5)+" ");
     }
   System.out.println();
   }
  public static int series(int a){
   if(a<0)
     return;
     else
       a=a-1;
       series(a);
      }
    }
  
  // Sum a series of numbers
  class Main2{
    public static void main(String args[]){
       System.out.println(summation(9)+" ");
       }
    public static int summation(int i){
     if(i!=0)
      return i+summation(i-1);
      else
        return i;
        }
}

//Factorial Program
class Main3{
   public static void main(String args[]){
      System.out.println(factorial(9)+" ");
      }
      public static int factorial(int i){
        if(i<=0)
          return 1;
          else
           return i*factorial(i-1);
           }
       }
       
 //Recurssive Fibonacci series
 class Main4{
    public static void main(String args[]){
       for(int i=;i<9;i++){
         System.out.println(fibonacci(i)+" ");
         }
         System.out.println();
       }
     public static long fibonacci(long a){
         if(a==1 || a==2)
           return 1;
           else
             return fibonacci(a-2)+fibonacci(a-1);
             }
      }

//Palindrome Program
class Main{ 
  public static void main(String args[]){
     boolean check=palindrome("");
     System.out.println(check);
     check=palindrome("");
     System.out.println(check);
     check=palindrome("");
     System.out.println(check);
     }
public static int palindrome(String s){
     if(s.length()==0 || s.length()==1)
       return true;
       if(s.charAt(0)==s.charAt(s.length()-1){
         return plaindrome(s.substring(1,s.length()-1));
         }
         return false;
         }
     }
     
         
