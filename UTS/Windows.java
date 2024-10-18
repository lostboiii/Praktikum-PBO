package UTS;
public class Windows extends Leptop {
    public String fitur;

    public Windows(String jnsBatrei, String merk, int kecProsesor, int sizeMemory, String jnsProcessor, String fitur) {
        super(jnsBatrei, merk, kecProsesor, sizeMemory, jnsProcessor);
        this.fitur = fitur;
    }

    public Windows() {
    }

    public void tampilWindows() {
        System.out.println("---------------------------------- Data Windows ----------------------------------");
        super.tampilLeptop();
        System.out.println("Fitur: " + fitur);
    }
}
