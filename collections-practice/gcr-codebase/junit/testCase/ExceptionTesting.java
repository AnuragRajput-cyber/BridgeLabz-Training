package collections_practice.junit.testCase;
import org.junit.jupiter.api.*;
import collections_practice.junit.logic.*;
import collections_practice.junit.logic.ExceptionTest;

import static org.junit.jupiter.api.Assertions.*;
public class ExceptionTesting {
	private ExceptionTest exceptions;
	@BeforeEach
	void setup() {
		exceptions=new ExceptionTest();
	}
	@Test
	void testException() {
		assertThrows(ArithmeticException.class,()->{
			exceptions.exceptionS(10);
		});
	}
}
