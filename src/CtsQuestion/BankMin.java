package CtsQuestion;

public class BankMin {
	
 private   int minimumBalance=2500;

public int getMinimumBalance() {
	return minimumBalance;
}

public void setMinimumBalance(int value) {
	if(value>2500)
		this.minimumBalance=value;
}

}
