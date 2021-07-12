import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CarServiceParametrizedTests {

    private static Stream<Arguments> dataParamLessThanZero()
    {
        return Stream.of(
                Arguments.of(0,15,-12),
                Arguments.of(4,-15,12),
                Arguments.of(-10,15,312));
    }

    @ParameterizedTest
    @MethodSource("dataParamLessThanZero")
    public void analyzeCarByParams_millageLessThanZero_throwsIllegalArgumentException(Integer treadThickness,Integer fuelUsage,Integer carMillage) {

        //given
        CarService service = new CarService();

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.analyzeCarByParams(treadThickness, fuelUsage, carMillage));
    }

}
