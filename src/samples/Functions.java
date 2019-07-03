package samples;

public class Functions {

  public static void main(String[] args) {

    System.out.println("functions samples");

    String word = "cat";
    String longest = longestWord(word, "horse" + word);
    System.out.println(longest);

    String longest2 = longestWord("orange", "pear");
    System.out.println(longest2);
  }



  /** Given two strings returns the longest */
  public static String longestWord(String s1, String s2) {

    if (s1.length() < s2.length()){
      return s2;
    } else {
      return s1;
    }
  }

}
