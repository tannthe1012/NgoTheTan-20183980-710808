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
class ValidateReceiveTimeTest {

	private PlaceRushOrderController placeRushOrderController;
	@BeforeEach
	void setUp() throws Exception {
		placeRushOrderController = new PlaceRushOrderController();
	}

	@ParameterizedTest
    @CsvSource({
    	"10-12-2021 10:00,true",
        "06/07/2021 11:00,false",
        "06-15-2021 12:00,false",
        "02-05-2021 13:00,true",
        "02-05-2021 25:00,false"
    })
	/**
	 * 
	 * @param time
	 * @param expected
	 */
	void test(String time, boolean expected) {
		//when
		boolean isValid = placeRushOrderController.validateReceiveTime(time);
		//then
		assertEquals(expected, isValid);
	}
}
