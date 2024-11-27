public class MainL {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
     
    
        Member member1 = new Member("Alice", "M001", book1);

        Staff staff = new Staff("John", "S001");

        Library library = new Library("Central Library", staff,book1,member1);
       
        library.displayDetails();
    }
}
