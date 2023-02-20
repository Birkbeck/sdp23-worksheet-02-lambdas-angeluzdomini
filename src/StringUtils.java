public class StringUtils {

  public static Integer eChecker(String a, String b) {
      if (a.contains("e") && !b.contains("e")) {
        return -1;
      }
      if (!a.contains("e") && b.contains("e")) {
        return 1;
      }
      return 0;
  }

  public static String betterString(String a, String b, TwoStringPredicate lambda) {
    return lambda.findBest(a, b) ? a : b;
  }

  public static <T> T betterElement(T t1, T t2, TwoElementPredicate<T> lambda) {
    return lambda.findBest(t1, t2) ? t1 : t2;
  }
}
