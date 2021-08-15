public class Reader implements Observer{
    private final Blog blog;
    private String newestArticle;


    public Reader(Blog blog) {
        this. blog = blog;
        newestArticle = blog.getNewArticle();
    }

    @Override
    public void update() {
        newestArticle = blog.getNewArticle();
        System.out.printf("An article „%s” was published!%n", newestArticle);
    }
}
