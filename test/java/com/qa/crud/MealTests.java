package com.qa.crud;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.qa.crud.persistence.domain.Crud;

import nl.jqno.equalsverifier.EqualsVerifier;

@SpringBootTest
class MealTests {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void testEqualsVerifier() {
		EqualsVerifier.forClass(Crud.class).usingGetClass().verify();
	}

}
