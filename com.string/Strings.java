
public class Strings {
    public static void main(String[] args) {

              // 1. String creation and immutability
              String str1 = "Hello";
              String str2 = str1.concat(" World");
              System.out.println("Original String: " + str1);  // Output: Hello (Immutable)
              System.out.println("Concatenated String: " + str2);  // Output: Hello World
      
              // 2. String comparison and concatenation
              String s1 = "Java";
              String s2 = new String("Java");
              System.out.println("s1 equals s2: " + s1.equals(s2));  // Output: true (Content comparison)
              System.out.println("s1 == s2: " + (s1 == s2));  // Output: false (Reference comparison)
      
              // 3. String methods
              String example = " Java Programming ";
              System.out.println("Length: " + example.length());  // Output: 18
              System.out.println("Trimmed: " + example.trim());  // Output: Java Programming
              System.out.println("Uppercase: " + example.toUpperCase());  // Output:  JAVA PROGRAMMING 
              System.out.println("Substring (5 to 15): " + example.substring(5, 15));  // Output: Programming
              System.out.println("Replace 'a' with 'o': " + example.replace('a', 'o'));  // Output: Jovo Progromming
               System.out.println(example.charAt(1));// return index char
              // 4. StringBuffer (mutable string, thread-safe)
              StringBuffer sb = new StringBuffer("Hello");
              sb.append(" World");
              System.out.println("StringBuffer: " + sb);  // Output: Hello World
      
              // 5. StringBuilder (mutable string, not thread-safe)
              StringBuilder stb = new StringBuilder("Hello");
              stb.append(" World");
              System.out.println("StringBuilder: " + stb);  // Output: Hello World

    }
}
