package bai.lab3;

public class book {
    public String boCode;
    public String Title;
    public String boAuthor;
    public book(){}

    public book(String boCode, String Title, String boAuthor)
    {
        this.boCode = boCode;
        this.Title = Title;
        this.boAuthor = boAuthor;
    }

    public String getBoCode() {
        return boCode;
    }

    public String getTitle() {
        return Title;
    }

    public String getBoAuthor() {
        return boAuthor;
    }
    
    
}
