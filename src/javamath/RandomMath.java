package javamath;

public class RandomMath {
    public static void main(String[] args) {
        int min = 5;
int max = 15;
int randomInt = (int)(Math.random() * (max - min + 1)) + min;
System.out.println(randomInt);

        System.out.println(Math.random());
    }
}
