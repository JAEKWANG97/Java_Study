package ch02.sec08;

public class CastingExample {
    public static void main(String[] args) {
        int var1 = 10;
        byte var2 = (byte) var1;
        System.out.println(var2); //10 출력 예상

        long var3 = 300;
        int var4 = (int) var3;
        System.out.println(var4); //300 출력 예상

        int var5 = 65;
        char var6 = (char) var5;
        System.out.println(var6); // A 출력 예상

        double var7 = 3.14;
        int var8 = (int) var7;
        System.out.println(var8); // 3 출력 예상
    }
}
