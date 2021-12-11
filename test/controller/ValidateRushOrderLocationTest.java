package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
/**
 * 
 * @author Ngo The Tan 20183980
 *
 */
class ValidateRushOrderLocationTest {

	private PlaceRushOrderController placeRushOrderController;
	@BeforeEach
	void setUp() throws Exception {
		placeRushOrderController = new PlaceRushOrderController();
	}

	@ParameterizedTest
    @CsvSource({
            "Ha noi,true",
            "Ho Chi Minh,true",
            "Bac Ninh,false",
            "%# asdasd,false"
    })
	void test(String cityName, boolean expected) {
		boolean isValid = placeRushOrderController.validateLocation(cityName);
		assertEquals(expected, isValid);
	}
}
