package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Задача 8
 * A television manufacturer advertises that a television set has a certain
 * size, measured diagonally. You wonder how the set will fit into your living
 * room. Write an algorithm that yields the horizontal and vertical size of the
 * television. Your inputs are the diagonal size and the aspect ratio (the ratio
 * of width to height, usually 16 : 9 for television sets).
 * Підказка: class Math();
 */
public class TelevisionApp {
    public static void main(String[] args) throws IOException {
        float aspectRatio;
        float diagonalSize;
        double width;
        double height;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter aspect ratio please (for example 16:9): ");
        String[] ratio = reader.readLine().split(":");
        aspectRatio = Float.parseFloat(ratio[0]) / Float.parseFloat(ratio[1]);
        System.out.print("And diagonal size: ");
        diagonalSize = Float.parseFloat(reader.readLine());

        reader.close();

        /*
        * width ^ 2 + height ^ 2 = diagonalSize ^ 2
        * width / height = aspectRatio => width = height * aspectRatio =>
        * => (height * aspectRatio) ^ 2 + height ^ 2 = diagonalSize ^ 2 =>
        * => height ^ 2 * aspectRatio ^ 2 + height ^ 2 = diagonalSize ^ 2 =>
        * => height ^ 2 * (aspectRatio ^ 2 + 1) = diagonalSize ^ 2 =>
        * => height ^ 2 = (diagonalSize ^ 2) / (aspectRatio ^ 2 + 1) =>
        * => height = SQRT((diagonalSize ^ 2) / (aspectRatio ^ 2 + 1))
        * */
        height = Math.sqrt((diagonalSize * diagonalSize) / (aspectRatio * aspectRatio + 1));
        width = height * aspectRatio;

        System.out.printf("Approximate width is %.2f and height is %.2f.", width, height);
    }
}
