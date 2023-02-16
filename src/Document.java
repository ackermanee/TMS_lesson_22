public class Document {
    private String title;
    private String date;
    private String author;

    void setTitle(String title) {
        this.title = title;
    }

    void setDate(String date) {
        this.date = date;
    }

    void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public String toString() {
        return  "title=" + title +
                ", date=" + date  +
                ", author=" + author;
    }
}