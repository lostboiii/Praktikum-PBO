package OverrideOverload;

public class Karyawan {
    private String name;
    private String nip;
    private String golongan;
    private double gaji;

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    public Karyawan() {
        
    }

    public Karyawan(String name, String nip, String golongan) {
        this.name = name;
        this.nip = nip;
        setGolongan(golongan); 
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
        switch (golongan.charAt(0)) {
            case '1':
                this.gaji = 5000000;
                break;
            case '2':
                this.gaji = 3000000;
                break;
            case '3':
                this.gaji = 2000000;
                break;
            case '4':
                this.gaji = 1000000;
                break;
            case '5':
                this.gaji = 750000;
                break;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public double getGaji() {
        return gaji;
    }

    public String getGolongan() {
        return golongan;
    }

    public String getName() {
        return name;
    }

    public String getNip() {
        return nip;
    }
}
