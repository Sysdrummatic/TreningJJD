import java.util.HashSet;
import java.util.Set;

public class Blog implements Observable{

    private Set<Observer> observers = new HashSet<>();
    private ArticleEvent newestArticle;

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    public ArticleEvent getNewArticle() {
        return newestArticle;
    }

    public void publishArticle(ArticleEvent article) {
        newestArticle = article;
        notifyObservers();
    }
}
