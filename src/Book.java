public class Book {
    private String title;
    private String genre;
    private int pages;

    public Book(String title, String genre, int pages) {
        this.title = title;
        this.genre = genre;
        this.pages = pages;
    }
    public String getTitle(){
        return title;
    }
    public String getGenre(){
        return genre;
    }
    public int getPages(){
        return pages;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setPages(int pages){
        this.pages = pages;
    }
    public String toString(){
        return "Title: \'" + title + "\', Genre: \'" + genre + "\', Pages: " + pages;
    }
}
