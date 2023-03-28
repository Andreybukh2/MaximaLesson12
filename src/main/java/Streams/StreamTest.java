package Streams;

import java.util.Arrays;

public class StreamTest {
    public static void main(String[] args) {
        int [] ints = new int[]{12,23,69,64,108};
        int maxStream = 0;
        int minStream = 0;
        int sumStream = 0;
        maxStream = Arrays.stream(ints).max().getAsInt();
        minStream = Arrays.stream(ints).min().getAsInt();
        sumStream = Arrays.stream(ints).sum();
        System.out.println(maxStream);
        System.out.println(minStream);
        System.out.println(sumStream);
    }
}
