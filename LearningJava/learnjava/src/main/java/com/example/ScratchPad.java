package com.example;

public class ScratchPad {
    public static void main(String[] args) {

        int[] tomsAverages = new int[3];
        double[] dblArray;
        String[] names;

        tomsAverages[0] = 250;
        tomsAverages[1] = 400;
        tomsAverages[2] = 600;

        System.out.println("Val 1: " + tomsAverages[0]);
        System.out.println("Val 2: " + tomsAverages[1]);
        System.out.println("Val 3: " + tomsAverages[2]);

        String[] top5Cars = {
                "GTR", "Aston Martin", "Chevy Pinto", "Jaguar", "BMW"
        };
        System.out.println(top5Cars[4]);

        System.out.println(top5Cars.length);
        System.out.println("last car: " + top5Cars[(top5Cars.length - 1)]);
    }
}
