
public class Money {

	private int moneyValue;
	private String moneyCurrency;
	int currentMoney=100;
	String more="more";
	String less="less";
	
	public Money(int moneyValue,String Currency) {
		this.moneyValue = moneyValue;
		this.moneyCurrency = Currency;
	}

	public int getMoneyValue() {
		return this.moneyValue;
	}

	

	public String getMoneyCurrency() {
		return moneyCurrency;
	}

	public String compareMoney(String svalue) {
		if(moneyValue > currentMoney) {
			svalue="more";
			
		}else if(moneyValue < currentMoney) {
			svalue="less";
			
		}else {
			svalue="equal";
		}
		return svalue;
	}
	
	public float moneytodollar(float dollar) {
		return dollar/80;
	}
	
	
	
	
	
}



	

