package OverrideOverload;

public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA) {
        return 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }
    public double keliling(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC;
    }

    public double keliling(double sideA, double sideB) {
        double sideC = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
        return sideA + sideB + sideC;
    }
    public static void main(String[] args) {
        Segitiga sgt = new Segitiga();
        System.out.println(sgt.totalSudut(30));
        System.out.println(sgt.totalSudut(30, 40));
        System.out.println(sgt.keliling(3, 4, 5));
        System.out.println(sgt.keliling(3, 4));
    }
}

