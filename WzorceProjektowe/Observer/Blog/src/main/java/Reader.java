public class Reader implements Observer{
    private final Blog blog;
    private ArticleEvent newestArticle;


    public Reader(Blog blog) {
        this. blog = blog;
        newestArticle = blog.getNewArticle();
    }

    @Override
    public void update() {
        newestArticle = blog.getNewArticle();
        System.out.println("New article was published! Read immediately: " + newestArticle.getArticleName() + " by " + newestArticle.getArticleAuthor() + ". ");

    }
}
