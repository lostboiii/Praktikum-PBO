public class Member {
    private String nama;
    private String id;
    private Book pinjamBuku;

    public Member(String nama, String id, Book pinjamBuku) {
        this.nama = nama;
        this.id = id;
        this.pinjamBuku = pinjamBuku;
    }

    public String info() {
        return "Member [nama: " + nama + ", ID: " + id + ", Borrowed Book: " + pinjamBuku.info() + "]";
    }
}
