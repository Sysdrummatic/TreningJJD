import java.util.HashMap;

public class MapMatrix extends HashMap<String, Integer> implements Matrix{
    private final int size;

    public MapMatrix(int size){
        this.size = size;
    }

    @Override
    public int get(int x, int y) {
        assertBoundaries(x,y);
        return this.getOrDefault(key(x,y),0);
    }

    public  void set(int x, int y, int value){
        assertBoundaries(x,y);
        put(key(x,y), value);
    }

    @Override
    public int size(){
        return size;
    }

    private String key(int x, int y) {
        return x + "," + y;
    }

    private void assertBoundaries(int x, int y){
        if( x < 0 || x > size || y < 0 || y > size){
            throw new IllegalArgumentException(key(x,y));
        }
    }
}
