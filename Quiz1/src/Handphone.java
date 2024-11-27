

public class Handphone {
    private String noSeri,model,VersiOS;
    private int volume = 0;
    private boolean on  = false;
    private boolean mute = false;
    private int volTemp;
    public Handphone(String noSeri, String model, String VersiOS) {
        this.noSeri = noSeri;
        this.model = model;
        this.VersiOS = VersiOS;
    }

    public Handphone() {

    }


    public void power(){
        if (this.on == false) {
            this.on = true;
            System.out.println("Handphone menyala");
        }
        else{
            this.on = false;
        }
       
    }
    void tambahVol(){
        if (this.on == false) {
            System.out.println("Handphone dalam kondisi off, silahkan nyalakan handphone terlebih dahulu");
        }
        else{
            if (this.volume <= 100) {
                this.volume += 50;
                System.out.println("Volume sekarang :"+this.volume);
            } if(this.volume >= 100) {
                System.out.println("Volume sudah maksimal");
            }
        }
       
    }
    void kurangVol(){
        if (this.on == false) {
            System.out.println("Handphone dalam kondisi off, silahkan nyalakan handphone terlebih dahulu");
        }
        else{
            if (this.volume >= 0) {
                this.volume -= 50;
                System.out.println("Volume sekarang :"+this.volume);
            } if(this.volume <= 0) {
                System.out.println("Volume sudah maksimal");
            }
        }
       
    }
    void mute(){
        
        if (this.on == false) {
            System.out.println("Handphone dalam kondisi off, silahkan nyalakan handphone terlebih dahulu");
        }
        if (!this.mute) { 
            this.volTemp = this.volume; 
            this.volume = 0; 
            this.mute = true; 
            System.out.println("Handphone dalam kondisi mute.");
        } else { 
            this.volume = this.volTemp; 
            this.mute = false; 
            System.out.println("\"Handphone dalam kondisi unmute.");
        }

    }
    void info(){
        System.out.println("No Seri : " + this.noSeri);
        System.out.println("Model : " + this.model);
        System.out.println("Versi OS : " + this.VersiOS);
        System.out.println("Volume : " + this.volume);
        if (this.on == true) {
            System.out.println("Handphone On");
        } else {
            System.out.println("Handphone Off");
        }
    }
}
 