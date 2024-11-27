public class Library {
    private String name;
    private Staff staff;
    private Book book;
    private Member member;
    
    public Library(String name, Staff staff, Book book, Member member) {
        this.name = name;
        this.staff = staff;
        this.book = book;
        this.member = member;
    }

    public String info() {
        return "Library: " + name;
    }

    public void displayDetails() {
        System.out.println(info());
        System.out.println(staff.info());
        System.out.println(book.info());
        System.out.println(member.info());
    }
}
