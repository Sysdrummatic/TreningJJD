import org.junit.jupiter.api.*;
public class CarServiceUnitTests {

//Tests dedicated to analyzeCarByParams method

//ThrowException verification - Null

    /*01*/
    @Test
    public void analyzeCarByParams_millageNull_throwsIllegalArgumentException() {
        //given
        Integer treadThickness = 3;
        Integer fuelUsage = 5;
        Integer carMillage = null;
        CarService service = new CarService();

        //when
        //W tym wypadku puste, nie mamy rezultatu, tylko sprawdzamy czy zostanie wyrzucony wyjątek.

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.analyzeCarByParams(treadThickness, fuelUsage, carMillage));
    }
    /*02*/
    @Test
    public void analyzeCarByParams_fuelUsageNull_throwsIllegalArgumentException() {
        //given
        Integer treadThickness = 3;
        Integer fuelUsage = null;
        Integer carMillage = 15000;
        CarService service = new CarService();

        //when
        //W tym wypadku puste, nie mamy rezultatu, tylko sprawdzamy czy zostanie wyrzucony wyjątek.

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.analyzeCarByParams(treadThickness, fuelUsage, carMillage));

    }
    /*03*/
    @Test
    public void analyzeCarByParams_treadThicknessNull_throwsIllegalArgumentException() {
        //given
        Integer treadThickness = null;
        Integer fuelUsage = 5;
        Integer carMillage = 15000;
        CarService service = new CarService();

        //when
        //W tym wypadku puste, nie mamy rezultatu, tylko sprawdzamy czy zostanie wyrzucony wyjątek.

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.analyzeCarByParams(treadThickness, fuelUsage, carMillage));

    }

//ThrowException verification - LessThanZero

    /*04*/
    @Test
    public void analyzeCarByParams_millageLessThanZero_throwsIllegalArgumentException() {

        //given
        Integer treadThickness = 0;
        Integer fuelUsage = 15;
        Integer carMillage = -12;
        CarService service = new CarService();

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.analyzeCarByParams(treadThickness, fuelUsage, carMillage));
    }
    /*05*/
    @Test
    public void analyzeCarByParams_fuelUsageLessThanZero_throwsIllegalArgumentException() {

        //given
        Integer treadThickness = 4;
        Integer fuelUsage = -15;
        Integer carMillage = 12;
        CarService service = new CarService();

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.analyzeCarByParams(treadThickness, fuelUsage, carMillage));
    }
    /*06*/
    @Test
    public void analyzeCarByParams_treadThicknessThanZero_throwsIllegalArgumentException() {

        //given
        Integer treadThickness = -10;
        Integer fuelUsage = 15;
        Integer carMillage = 312;
        CarService service = new CarService();

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.analyzeCarByParams(treadThickness, fuelUsage, carMillage));
    }

//ThrowException verification - LessThanZero

    /*08*/
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
    /*09*/
    @Test
    public void analyzeCarByParams_carMillageNotOk_resultFalse() {
        //given
        Integer treadThickness = 3;
        Integer fuelUsage = 5;
        Integer carMillage = 25000;
        CarService service = new CarService();

        //when
        boolean result = service.analyzeCarByParams(treadThickness, fuelUsage, carMillage);

        //then
        //Assertions.assertEquals(result, false);
        Assertions.assertFalse(result);
    }
    /*10*/
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
    /*11*/
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


    /*12*/
    @Test
    public void analyzeCarByParams_allValues_resultTrue() {
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
}
