package OverrideOverload;

public class Staff extends Karyawan {
    private int lembur;
    private double gajiLembur;
    public Staff() {
        super();
    }

    public Staff(String name, String nip, String golongan, int lembur, double gajiLembur) {
        super(name, nip, golongan);
        this.lembur = lembur;
        this.gajiLembur = gajiLembur;
    }

    public int getLembur() {
        return lembur;
    }

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }

    public double getGajiLembur() {
        return gajiLembur;
    }

    public void setGajiLembur(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }
    @Override
    public double getGaji() {
        return super.getGaji() + (lembur * gajiLembur);
    }
    public double getGaji(int lembur, double gajiLembur) {
        return super.getGaji() + (lembur * gajiLembur);
    }
    public void info() {
        System.out.println("NIP: " + getNip());
        System.out.println("Nama: " + getName());
        System.out.println("Golongan: " + getGolongan());
        System.out.println("Jumlah Lembur: " + getLembur());
        System.out.println("Gaji Lembur: " + getGajiLembur());
        System.out.println("Gaji Total: " + getGaji());
    }
}
