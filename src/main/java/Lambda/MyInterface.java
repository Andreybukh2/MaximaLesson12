package Lambda;
@FunctionalInterface
public interface MyInterface<I extends Number> {
    void methodBase();
    default void methodDefault1 () {
        System.out.println("Реализация метода - default void methodDefault1");
    }
    default void methodDefault2 () {
        System.out.println("Реализация метода - default void methodDefault2");
    }
    default void methodDefault3 () {
        System.out.println("Реализация метода - default void methodDefault3");
    }
}
