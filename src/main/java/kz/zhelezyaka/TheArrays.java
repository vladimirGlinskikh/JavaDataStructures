package kz.zhelezyaka;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[7];
        colors[0] = "yellow";
        colors[1] = "red";
        System.out.println(Arrays.toString(colors));

        System.out.println("------------------------");

        for (int i = 0; i < colors.length; i++) {
            System.out.print(colors[i] + ", ");
        }

        System.out.println("\n ------------------------");

        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.print(colors[i] + ", ");
        }

        System.out.println("\n ------------------------");

        for (String color : colors) {
            System.out.print(color + ", ");
        }

        System.out.println("\n ------------------------");

        Arrays.stream(colors)
                .map(color -> color + ", ")
                .forEach(System.out::print);
    }
}
