public class Document {
    private String title;
    private String date;
    private String author;

    public String getTitle() {
        return title;
    }
    public String getDate() {
        return date;
    }
    public String getAuthor() {
        return author;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public String toString() {
        return  "title=" + title +
                ", date=" + date  +
                ", author=" + author;
    }
}