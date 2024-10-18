package UTS;
public class Mac extends Leptop {
    public String security;

    public Mac(String jnsBatrei, String merk, int kecProsesor, int sizeMemory, String jnsProcessor, String security) {
        super(jnsBatrei, merk, kecProsesor, sizeMemory, jnsProcessor);
        this.security = security;
    }

    public Mac() {
    
    }

    public void tampilMac() {
        System.out.println("Data Mac :");
        super.tampilLeptop();
        System.out.println("Security: " + security);
    }
}
