package FunctionalInterface;

import static java.lang.System.out;

@FunctionalInterface

public interface MyInterface {
    void say1();
    default void say2() {
        out.println("default void say2 из интерфейса");
    }
    default void say3() {
        out.println("default void say3 из интерфейса");
    }
}