import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CarServiceParametrizedTests {



//ThrowException verification - Null
//Replacement for tests 01-03
    private static Stream<Arguments> dataParamNull()
    {
        return Stream.of(
                Arguments.of(3,5,null),
                Arguments.of(3,null,15000),
                Arguments.of(null,5,15000));
    }

    @ParameterizedTest
    @MethodSource("dataParamNull")
    public void analyzeCarByParams_ParamNull_throwsIllegalArgumentException(Integer treadThickness,Integer fuelUsage,Integer carMillage) {
        //given
        CarService service = new CarService();

        //when
        //N/A

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.analyzeCarByParams(treadThickness, fuelUsage, carMillage));
    }

//ThrowException verification - LessThanZero
//Replacement for tests 04-06
    private static Stream<Arguments> dataParamLessThanZero()
    {
        return Stream.of(
                Arguments.of(0,15,-12),
                Arguments.of(4,-15,12),
                Arguments.of(-10,15,312));
    }

    @ParameterizedTest
    @MethodSource("dataParamLessThanZero")
    public void analyzeCarByParams_ParametersLessThanZero_throwsIllegalArgumentException(Integer treadThickness,Integer fuelUsage,Integer carMillage) {

        //given
        CarService service = new CarService();

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.analyzeCarByParams(treadThickness, fuelUsage, carMillage));
    }

    //True/False verification

    /*07*///Original Test from CarServiceUnitTests
    @Test
    public void analyzeCarByParams_allValuesOk_resultTrue() {
        //given
        Integer treadThickness = 3;
        Integer fuelUsage = 5;
        Integer carMillage = 15000;
        CarService service = new CarService();

        //when
        boolean result = service.analyzeCarByParams(treadThickness, fuelUsage, carMillage);

        //then
        //Assertions.assertEquals(result, true);
        Assertions.assertTrue(result);
    }

//Replacement for tests 08-10
    private static Stream<Arguments> dataNotOkParams()
    {
        return Stream.of(
                Arguments.of(3,5,25000,false),
                Arguments.of(3,15,15000,false),
                Arguments.of(0,15,15000,false)
        );
    }
    @ParameterizedTest
    @MethodSource("dataNotOkParams")
    public void analyzeCarByParams_carMillageNotOk_resultFalse(Integer treadThickness,Integer fuelUsage,Integer carMillage, boolean expectedResult) {
        //given
        CarService service = new CarService();

        //when
        boolean result = service.analyzeCarByParams(treadThickness, fuelUsage, carMillage);

        //then
        //Assertions.assertEquals(result, false);
        Assertions.assertEquals(result,expectedResult);
    }

    private static Stream<Object[][]> dataFromTable()
    {
        return Stream.of(
                Object.of{"1",2}
        );
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
        Assertions.assertEquals(results, expectedResults);
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
        Assertions.assertEquals(results, expectedResults);
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
