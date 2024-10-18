package UTS;
public class Komputer {
    public String merk;
    public int kecProsesor;
    public int sizeMemory;
    public String jnsProcessor;

    public Komputer(String merk, int kecProsesor, int sizeMemory, String jnsProcessor) {
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProcessor = jnsProcessor;
    }
    public Komputer(){

    }

    public void tampil() {
        System.out.println("---------------------------------- Data Komputer ----------------------------------");
        System.out.println("Merk: " + merk);
        System.out.println("Kecepatan Prosesor: " + kecProsesor);
        System.out.println("Ukuran Memory: " + sizeMemory);
        System.out.println("Jenis Processor: " + jnsProcessor);
    }
}
