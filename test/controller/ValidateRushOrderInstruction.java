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
class ValidateRushOrderInstruction {

	private PlaceRushOrderController placeRushOrderController;
	@BeforeEach
	void setUp() throws Exception {
		placeRushOrderController = new PlaceRushOrderController();
	}

	@ParameterizedTest
    @CsvSource({
    	"Nha van hoa thon, true",
        "Den xanh den do thu 2 re trai,true",
        "$# nha 7 tang, false",
        ",false"
    })
	void test(String instruction, boolean expected) {
		//when
		boolean isValid = placeRushOrderController.validateRushOrderInstruction(instruction);
		//then
		assertEquals(expected, isValid);
	}

}
