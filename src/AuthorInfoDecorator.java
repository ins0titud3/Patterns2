public class AuthorInfoDecorator extends BookDecorator{
    private String author;

    public AuthorInfoDecorator(IBook book, String author) {
        super(book);
        this.author = author;
    }

    @Override
    public void showBookInfo() {
        super.showBookInfo();
        System.out.println("Author: " + author);
    }
}
