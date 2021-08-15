public class Main {

    public static void main(String[] args) {



        Blog lukaszmichtaPL = new Blog();
        Reader webObserver = new Reader(lukaszmichtaPL);
        lukaszmichtaPL.subscribe(webObserver);
        lukaszmichtaPL.publishArticle(new ArticleEvent("NewArticle1","Lukas Michtioni"));
        lukaszmichtaPL.publishArticle(new ArticleEvent("NewArticle2","Alberto Pierdżordżi"));
        lukaszmichtaPL.unsubscribe(webObserver);
        lukaszmichtaPL.publishArticle(new ArticleEvent("NewArticle2","Pierre Dzoncy"));

    }
}
