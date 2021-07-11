import org.junit.jupiter.api.*;

public class CarServiceTest {

//Tests dedicated to analyzeCarByParams method

    @Test
    public void analyzeCarByParams_millageNull_throwsIllegalArgumentException()
    {
        //given
        Integer treadThickness = 3;
        Integer fuelUsage = 5;
        Integer carMillage = null;
        CarService service = new CarService();

        //when
        //W tym wypadku puste, nie mamy rezultatu, tylko sprawdzamy czy zostanie wyrzucony wyjątek.

        //then
        Assertions.assertThrows(IllegalArgumentException.class,() -> service.analyzeCarByParams(treadThickness, fuelUsage, carMillage));
    }

    @Test
    public void analyzeCarByParams_fuelUsageNull_throwsIllegalArgumentException()
    {
        //given
        Integer treadThickness = 3;
        Integer fuelUsage = null;
        Integer carMillage = 15000;
        CarService service = new CarService();

        //when
        //W tym wypadku puste, nie mamy rezultatu, tylko sprawdzamy czy zostanie wyrzucony wyjątek.

        //then
        Assertions.assertThrows(IllegalArgumentException.class,() -> service.analyzeCarByParams(treadThickness, fuelUsage, carMillage));

    }

    @Test
    public void analyzeCarByParams_treadThicknessNull_throwsIllegalArgumentException()
    {
        //given
        Integer treadThickness = null;
        Integer fuelUsage = 5;
        Integer carMillage = 15000;
        CarService service = new CarService();

        //when
        //W tym wypadku puste, nie mamy rezultatu, tylko sprawdzamy czy zostanie wyrzucony wyjątek.

        //then
        Assertions.assertThrows(IllegalArgumentException.class,() -> service.analyzeCarByParams(treadThickness, fuelUsage, carMillage));

    }

    @Test
    public void analyzeCarByParams_allValuesOk_resultTrue()
    {
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

    @Test
    public void analyzeCarByParams_carMillageNotOk_resultFalse()
    {
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

    @Test
    public void analyzeCarByParams_fuelUsageNotOk_resultFalse()
    {
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

    @Test
    public void analyzeCarByParams_treadThicknessNotOk_resultFalse()
    {
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

//Tests dedicated to analyzeCarByParams method

    @Test
    public void analyzeCarByParams_millageLessThanZero_throwsIllegalArgumentException()
    {

        //given
        Integer treadThickness = 0;
        Integer fuelUsage = 15;
        Integer carMillage = -12;
        CarService service = new CarService();

        //then
        Assertions.assertThrows(IllegalArgumentException.class,() -> service.analyzeCarByParams(treadThickness, fuelUsage, carMillage));
    }

    @Test
    public void analyzeCarByParams_fuelUsageLessThanZero_throwsIllegalArgumentException()
    {

        //given
        Integer treadThickness = 4;
        Integer fuelUsage = -15;
        Integer carMillage = 12;
        CarService service = new CarService();

        //then
        Assertions.assertThrows(IllegalArgumentException.class,() -> service.analyzeCarByParams(treadThickness, fuelUsage, carMillage));
    }

    @Test
    public void analyzeCarByParams_treadThicknessThanZero_throwsIllegalArgumentException()
    {

        //given
        Integer treadThickness = -10;
        Integer fuelUsage = 15;
        Integer carMillage = 312;
        CarService service = new CarService();

        //then
        Assertions.assertThrows(IllegalArgumentException.class,() -> service.analyzeCarByParams(treadThickness, fuelUsage, carMillage));
    }
}
