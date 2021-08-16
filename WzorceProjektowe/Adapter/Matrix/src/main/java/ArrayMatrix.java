public class ArrayMatrix implements Matrix{

    //Adapter implementation with compositions

    private final int[][] matrix;

    public ArrayMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public int get(int x, int y) {
        return matrix[x][y];
    }

    @Override
    public int size() {
        return matrix.length;
    }
}
