import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoneyTest {

	Money myMoney = new Money(200,"Rs");
	
	@Test
	void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	void testMoneyValue() {
		assertEquals(myMoney.getMoneyValue(),200);
	}
	
	@Test
	void testCurrency() {
		assertEquals(myMoney.getMoneyCurrency(),"Rs");
	}
	
	@Test
	void testCompare() {
		assertEquals(myMoney.compareMoney("more"),"more");
	}
	
	@Test
	void testDollar() {
		assertEquals(myMoney.moneytodollar(200),2.5);
	}
}
