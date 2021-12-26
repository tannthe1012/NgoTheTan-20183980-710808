package controller;

import controller.impl.SimpleRushOrderValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author TanNT -20183980
 */
public class ValidateRushOrderInfoTest {

    private PlaceRushOrderController placeRushOrderController;

    @BeforeEach
    void setUp() {
        placeRushOrderController = new PlaceRushOrderController(new SimpleRushOrderValidator());
    }

    @ParameterizedTest
    @CsvSource({
            "Den dung gio nhe,true",
            "124@,false",
            "Chi nhan gio hanh chinh,true",
            "@as,false"
    })
    void test(String info, boolean expected) {
        boolean isValid = placeRushOrderController.validateRushOrderInfo(info);
        Assertions.assertEquals(isValid, expected);
    }
}
