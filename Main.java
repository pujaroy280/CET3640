//NAME: Puja Roy
//DATE: 5/19/22

import java.util.*;

public class Main
{
static void longest(Stack<String> st)
{
String longest="";//longest string is set to null
while(!st.isEmpty())//loop until stack of strings becomes empty
{
String s=st.pop();//remove each element
if(s.length()>longest.length())// Verifies which string in each stack is larger
{
longest=s;//if it is larger then executes the word (string)
}
}
System.out.println(longest);//Prints the largest or longest string of the stack 
}
   public static void main(String[] args) {
       Stack<String> st= new Stack<>();
       String []str={"table","chair","computer","hi","hello","Student","Joseph","King","Queen","Rosie"};
       for(int i=0;i<str.length;i++)//you can push whole array if the size is large also
       {
       st.push(str[i]);//push 10 elements to stack
       }
       System.out.println(st);//stack values
       longest(st);//call function
   }
}


