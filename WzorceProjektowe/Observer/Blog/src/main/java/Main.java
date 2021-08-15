public class Main {

    public static void main(String[] args) {



        Blog lukaszmichtaPL = new Blog();
        Reader webObserver = new Reader(lukaszmichtaPL);
        lukaszmichtaPL.subscribe(webObserver);
        lukaszmichtaPL.publishArticle("Mega NewArticle1");
        lukaszmichtaPL.publishArticle("Mega NewArticle2");
        lukaszmichtaPL.unsubscribe(webObserver);
        lukaszmichtaPL.publishArticle("Mega NewArticle3");

    }
}
