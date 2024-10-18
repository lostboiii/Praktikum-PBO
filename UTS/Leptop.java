package UTS;
public class Leptop extends Komputer {
    public String jnsBatrei;

    public Leptop(String jnsBatrei, String merk, int kecProsesor, int sizeMemory, String jnsProcessor) {
        super(merk, kecProsesor, sizeMemory, jnsProcessor);
        this.jnsBatrei = jnsBatrei;
    }

    public Leptop() {

    }
    public void tampilLeptop() {
        System.out.println("---------------------------------- Data Leptop ----------------------------------");
        super.tampil();
        System.out.println("Jenis Batrei: " + jnsBatrei);
    }
}
