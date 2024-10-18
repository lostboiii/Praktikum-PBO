package UTS;


public class Pc extends Komputer {
    public int ukuranMonitor;
    public Pc(String merk, int kecProsesor, int sizeMemory, String jnsProcessor, int ukuranMonitor) {
        super(merk, kecProsesor, sizeMemory, jnsProcessor);
        this.ukuranMonitor = ukuranMonitor;
    }

    public Pc() {
      
    }


    public void tampilPc() {
        System.out.println("---------------------------------- Data PC ----------------------------------");
        super.tampil();
        System.out.println("Ukuran Monitor: " + ukuranMonitor + " inch");
    }
}

