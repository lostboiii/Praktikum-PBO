package OverrideOverload;

public class Manager extends Karyawan {
    private double tunjangan;
    private String bagian;
    private Staff st[];
    public Manager() {
        super();
    }

    public Manager(String name, String nip, String golongan, double tunjangan, String bagian) {
        super(name, nip, golongan);
        this.tunjangan = tunjangan;
        this.bagian = bagian;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }
    public double getTunjangan() {
        return tunjangan;
    }
    public void setBagian(String bagian) {
        this.bagian = bagian;
    }
    public String getBagian() {
        return bagian;
    }
    public void setStaff(Staff st[]) {
        this.st = st;
    }
    public void viewStaff() {
        int i;
        for (i = 0; i < st.length; i++) {

            st[i].info();
        }
    }
    public void info() {
        System.out.println("NIP: " + getNip());
        System.out.println("Nama: " + getName());
        System.out.println("Golongan: " + getGolongan());
        System.out.println("Tunjangan: " + getTunjangan());
        System.out.println("Bagian: " + getBagian());
        System.out.println("Gaji Total: " + getGaji());
        System.out.println("-----------------------------------");
        this.viewStaff();
    }
    @Override
    public double getGaji() {
        return super.getGaji() + tunjangan;
    }
}
