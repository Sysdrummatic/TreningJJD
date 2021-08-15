//Event class implemented by my own.

public class ArticleEvent {
    private String articleName;
    private String articleAuthor;

    public ArticleEvent(String articleName, String articleTitle) {
        this.articleName = articleName;
        this.articleAuthor = articleTitle;
    }

    public String getArticleName() {
        return articleName;
    }

    public String getArticleAuthor() {
        return articleAuthor;
    }
}
