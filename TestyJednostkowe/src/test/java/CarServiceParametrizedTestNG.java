import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class CarServiceParametrizedTestNG {


    @DataProvider(name="dataForParametrizedTest")
    private Object[][] dataForParametrizedTest()
    {
        return new Object [][]{
                {createCarDetailsFirstCase(),createExpectedResultsFirstCase()},
                {createCarDetailsFalseCase(),createExpectedResultsFalseCase()}
        };

    }

    @Test
    public void metodaTestoowa()
    {
        //given
        List<CarDetails> carDetails = createCarDetailsFirstCase();
        CarService service = new CarService();

        //when
        List<CarDiagnosticResult> results = service.analyzeCars(carDetails);

        //then
        List<CarDiagnosticResult> expectedResults = createExpectedResultsFirstCase();
        Assert.assertEquals(results, expectedResults);
    }

    @Test
    public void metodaTestowa()
    {
        //given
        List<CarDetails> carDetails = createCarDetailsFalseCase();
        CarService service = new CarService();

        //when
        List<CarDiagnosticResult> results = service.analyzeCars(carDetails);

        //then
        List<CarDiagnosticResult> expectedResults = createExpectedResultsFalseCase();
        Assert.assertEquals(results, expectedResults);
    }

    //Support Lists
    List<CarDiagnosticResult> createExpectedResultsFirstCase()
    {
        List<CarDiagnosticResult> results = new ArrayList<>();
        results.add(new CarDiagnosticResult("1", true));
        results.add(new CarDiagnosticResult("2", false));
        results.add(new CarDiagnosticResult("3", true));
        return results;
    }

    List<CarDiagnosticResult> createExpectedResultsFalseCase()
    {
        List<CarDiagnosticResult> results = new ArrayList<>();
        results.add(new CarDiagnosticResult("1", false));
        results.add(new CarDiagnosticResult("2", false));
        results.add(new CarDiagnosticResult("3", false));
        results.add(new CarDiagnosticResult("4", false));
        results.add(new CarDiagnosticResult("5", false));
        results.add(new CarDiagnosticResult("6", false));
        return results;
    }

    private List<CarDetails> createCarDetailsFirstCase()
    {
        List<CarDetails> carsDetails = new ArrayList<>();
        carsDetails.add(createCarDetails("1",3,3,3));
        carsDetails.add(createCarDetails("2",3,30000000,3));
        carsDetails.add(createCarDetails("3",3,3,3));
        return carsDetails;
    }

    private List<CarDetails> createCarDetailsFalseCase()
    {
        List<CarDetails> carsDetails = new ArrayList<>();
        carsDetails.add(createCarDetails("1",0,3,3));
        carsDetails.add(createCarDetails("2",0,3,3));
        carsDetails.add(createCarDetails("3",0,3,3));
        carsDetails.add(createCarDetails("4",0,3,3));
        carsDetails.add(createCarDetails("5",0,3,3));
        carsDetails.add(createCarDetails("6",0,32,3));
        return carsDetails;
    }

    //Support Method for tests verification
    private CarDetails createCarDetails(String id,Integer treadThickness,Integer fuelUsage,Integer carMillage)
    {
        CarDetails carDetails = new CarDetails();
        carDetails.setId(id);
        carDetails.setTreadThickness(treadThickness);
        carDetails.setFuelUsage(fuelUsage);
        carDetails.setCarMillage(carMillage);
        return carDetails;
    }
}
