import java.util.Arrays;
import java.util.Collections;

public class Outline {

  // Create an array containing some Strings.
  public static String[] getWords() {
    return new String[] {
        "orange",
        "apple",
        "watermelon",
        "rasberry",
        "kiwi",
        "fig",
        "muskmelon"
    };
  }

  // Sort the array by length (i.e., shortest to longest)
  public static void question1_1() {
    String[] fruits = getWords();
    Arrays.sort(fruits, (a, b) -> Integer.compare(a.length(), b.length()));
    System.out.println("1.1: " + Arrays.asList(fruits));
  }

  // Sort the array by length (i.e., longest to shortest)
  public static void question1_2() {
    String[] fruits = getWords();
    Arrays.sort(fruits, Collections.reverseOrder((a, b) -> Integer.compare(a.length(), b.length())));
    System.out.println("1.2: " + Arrays.asList(fruits));
  }

  // Sort the array by first character
  public static void question1_3() {
    String[] fruits = getWords();
    Arrays.sort(fruits, (a, b) -> Integer.compare(a.charAt(0), b.charAt(0)));
    System.out.println("1.3: " + Arrays.asList(fruits));
  }

  // Sort the array by strings that contain "e" first, everything else second.
  public static void question1_4() {
    String[] fruits = getWords();
    Arrays.sort(fruits, (a, b) -> {
      if (a.contains("e") && !b.contains("e")) {
        return -1;
      }
      if (!a.contains("e") && b.contains("e")) {
        return 1;
      }
      return 0;
    });
    System.out.println("1.4: " + Arrays.asList(fruits));
  }

  // move the logic that computes the number to a separate static method for Q1.4
  public static void question2() {
    String[] fruits = getWords();
    Arrays.sort(fruits, (a, b) -> StringUtils.eChecker(a,b));
    System.out.println("2: " + Arrays.asList(fruits));
  }

  public static void question3() {
    System.out.println("3:");
    String test1 = "grapes";
    String test2 = "watermelon";
    System.out.println(StringUtils.betterString(test1, test2, (s1, s2) -> s1.length() > s2.length()));
    System.out.println(StringUtils.betterString(test1, test2, (s1, s2) -> true));
  }

  public static void question4() {
    System.out.println("4:");
    String test1 = "grapes";
    String test2 = "watermelon";
    System.out.println(StringUtils.betterElement(test1, test2, (s1, s2) -> s1.length() > s2.length()));
    System.out.println(StringUtils.betterElement(test1, test2, (s1, s2) -> true));

    int i1 = 125 ;
    int i2 = 30;
    System.out.println(StringUtils.betterElement(i1, i2, (t1, t2) -> t1 > t2));
    System.out.println(StringUtils.betterElement(i1, i2, (t1, t2) -> true));
  }


  public static void main(String... args) { // varargs alternative to String[]
    question1_1();
    question1_2();
    question1_3();
    question1_4();
    question2();
    question3();
    question4();
  } 
}
