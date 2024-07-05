public class StringProgram {
     public static void main(String[] args) {
      String str = "Hello, this is a sample string for indexOf example.";
      String substr = "sample";

      int index = str.indexOf(substr);

      if (index != -1) {
          System.out.println("Substring '" + substr + "' found at index: " + index);
      } else {
          System.out.println("Substring '" + substr + "' not found in the string.");
      }
         
     }
   } 

