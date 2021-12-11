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
class ValidateRushOrderInfoTest {

	private PlaceRushOrderController placeRushOrderController;
	@BeforeEach
	void setUp() throws Exception {
		placeRushOrderController = new PlaceRushOrderController();
	}

	@ParameterizedTest
    @CsvSource({
    	"Do gia dung,true",
        "S# Noi niu xoong chao,false",
        ",false"
    })
	void test(String info, boolean expected) {
		//when
		boolean isValid = placeRushOrderController.validateRushOrderInfo(info);
		//then
		assertEquals(expected, isValid);
	}

}
