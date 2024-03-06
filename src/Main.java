import org.openqa.selenium.By;

import com.sun.tools.javac.parser.Scanner;

class Main {

  public static String QuestionsMarks(String str) {
    // code goes here  
      int i=0;
      int qcount=0;
      while(i<str.length()){
      if(Character.isDigit(str.charAt(i)) ){
        int j= i+1;
        while(j<str.length()){
          if(str.charAt(j)=='?')
            qcount++;
          if(Character.isDigit(str.charAt(j))){
          int sum=  Integer.parseInt(String.valueOf(str.charAt(i)))+Integer.parseInt(String.valueOf(str.charAt(j)));
          if(sum==10 && qcount==3)
            return "true";
            else
            break;
          }
        }
        j++;
        }
      }
      i++;
    }
  
  
  
  
    
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(QuestionsMarks(s.nextLine())); 
  }

}