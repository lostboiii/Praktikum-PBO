public class Staff {
    private String nama;
    private String id;

    public Staff(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public String info() {
        return "Staff [Name: " + nama + ", ID: " + id + "]";
    }
}
