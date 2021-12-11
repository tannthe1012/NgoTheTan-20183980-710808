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
class ValidateRushOrderMediaItem {

	private PlaceRushOrderController placeRushOrderController;
	@BeforeEach
	void setUp() throws Exception {
		placeRushOrderController = new PlaceRushOrderController();
	}

	@ParameterizedTest
    @CsvSource({
            "100000,true",
            "54000,true",
            "12345,false"
    })
	
	void test(int mediaId, boolean expected) {
		boolean isValid = placeRushOrderController.validateItems(mediaId);
		assertEquals(expected, isValid);
	}

}
