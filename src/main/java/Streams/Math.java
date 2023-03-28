package Streams;

public class Math {
    public static void main(String[] args) {
        int[] mas = new int [] {15,18,25,24,42,45,16};
        int max = 0;
        for (int i = 0; i < mas.length; i++) {
            if (max < mas[i]) {
               max = mas[i];
            }
        }
        System.out.println(max);
    }
}
