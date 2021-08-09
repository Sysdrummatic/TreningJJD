public class TrianglePegAdapter extends RoundPeg{
    private TrianglePeg peg;

    public TrianglePegAdapter(TrianglePeg peg){
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double halfTheCircumferenceOfTheTriangle;
        double theRadiusOfTheCircleInscribed;
        double result;
        halfTheCircumferenceOfTheTriangle = ((peg.getSideA() + peg.getSideB() + peg.getSideC()) / 2);
        theRadiusOfTheCircleInscribed = Math.sqrt(((halfTheCircumferenceOfTheTriangle - peg.getSideA()) *
                                                    (halfTheCircumferenceOfTheTriangle - peg.getSideB()) *
                                                        (halfTheCircumferenceOfTheTriangle - peg.getSideC())) / halfTheCircumferenceOfTheTriangle);
        result = (peg.getSideA()) * peg.getSideB() * peg.getSideC() / (4 * theRadiusOfTheCircleInscribed * halfTheCircumferenceOfTheTriangle);
        return result;
    }
}
