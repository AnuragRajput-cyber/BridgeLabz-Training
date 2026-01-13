package collections_practice.junit.testCase;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import collections_practice.junit.logic.*;

public class TimeoutTesting {
	private TimeOutCheck timeoutcheck;
	
	@BeforeEach
	void setup() {
		timeoutcheck=new TimeOutCheck();
	}
	@Test
	@DisplayName("TimeOut Testing")
	@Timeout(2)
	void testingTimeOut() {
			assertTrue(timeoutcheck.timeRunningCheckout());
			
	}
}
