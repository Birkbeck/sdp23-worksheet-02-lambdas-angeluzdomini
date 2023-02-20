@FunctionalInterface
interface TwoElementPredicate<T> {
  boolean findBest(T t1, T t2);
}