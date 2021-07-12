import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

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
    /*09*/
    @Test
    public void analyzeCarByParams_fuelUsageNotOk_resultFalse() {
        //given
        Integer treadThickness = 3;
        Integer fuelUsage = 15;
        Integer carMillage = 15000;
        CarService service = new CarService();

        //when
        boolean result = service.analyzeCarByParams(treadThickness, fuelUsage, carMillage);

        //then
        //Assertions.assertEquals(result, false);
        Assertions.assertFalse(result);
    }
    /*10*/
    @Test
    public void analyzeCarByParams_treadThicknessNotOk_resultFalse() {
        //given
        Integer treadThickness = 0;
        Integer fuelUsage = 15;
        Integer carMillage = 15000;
        CarService service = new CarService();

        //when
        boolean result = service.analyzeCarByParams(treadThickness, fuelUsage, carMillage);

        //then
        //Assertions.assertEquals(result, false);
        Assertions.assertFalse(result);
    }

}
