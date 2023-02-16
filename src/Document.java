public class Document {
    private String title;
    private String date;
    private String author;

    public Document(String title, String date, String author) {
        this.title = title;
        this.date = date;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return  "title=" + title +
                ", date=" + date  +
                ", author=" + author;
    }
}