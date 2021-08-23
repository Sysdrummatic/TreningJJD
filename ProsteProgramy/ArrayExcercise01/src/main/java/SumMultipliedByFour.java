public class SumMultipliedByFour {

    public int solution(int[] A) {
    int sum = 0;

    //for (int a : A)
        for(int a = 0; a < A.length; a++ ) // sprwdzić jak napisać to w formie zwykłej pętli jakby ktoś pytal ;)
        {
            if (a % 4 == 0) {
            sum += a;
        }
    }
        return sum;
    }
}
