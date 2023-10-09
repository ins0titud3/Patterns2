public class Book implements IBook{
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void showBookInfo() {
        System.out.println("Book Title: " + title);
    }
}
