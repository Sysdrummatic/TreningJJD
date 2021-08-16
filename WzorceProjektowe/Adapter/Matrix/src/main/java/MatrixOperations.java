public class MatrixOperations {
    public static int largest(Matrix m){
        if (m.size() == 0){
            throw new IllegalArgumentException("Matrix is empty");
        }
        int largest = m.get(0,0);
        for(int x = 0; x < m.size(); x++){
            for(int y = 0; y < m.size(); y++){
                if(m.get(x,y) > largest){
                    largest = m.get(x,y);
                }
            }
        }
        return largest;
    }
}
