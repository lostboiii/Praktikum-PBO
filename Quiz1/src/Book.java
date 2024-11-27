public class Book {
    private String judul;
    private String penulis;

    public Book(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public String info() {
        return "Book [judul: " + judul + ", penulis: " + penulis + "]";
    }
}
