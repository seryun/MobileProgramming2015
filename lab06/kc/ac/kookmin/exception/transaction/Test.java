package kc.ac.kookmin.exception.transaction;

class Bank {
	private int balance = 1000;
	public void oneqTrade() {
		try{
			tradeWithA();
			tradeWithB();
			tradeWithC();
			Exception ex = new Exception();
			throw ex;
			}
		catch(Exception e){
			System.out.println("거래중 에러 발생, 전체 취소");
			cancelA();
			cancelB();
			cancelC();
			System.out.println("잔여 금액 : " + balance);
		}
		
	}
	
	public void tradeWithA () {
		int m = 100; // A계좌에서 출금할 금액
		try {
			System.out.println("A 계좌에서 출금 - " + m);
			balance -= m;
		} catch(Exception e) {
                        System.out.println("A계좌 거래 에러 발생");
			cancelA();
		}
		
	}
	public void tradeWithB() {
		int m = 200;
		try {
			System.out.println("B 계좌에서 출금 - " + m);
			balance -= m;
		} catch(Exception e) {
                        System.out.println("B계좌 거래 에러 발생");
			cancelB();
		}
	}
	public void tradeWithC() {
		int m = 300;
		try {
			System.out.println("C 계좌에서 출금 - " + m);
			balance -= m;
		} catch(Exception e) {
                        System.out.println("C계좌 거래 에러 발생");
			cancelC();
		}
	}
        public void cancelA() {
		System.out.println("A 계좌 거래 취소  ");
		balance += 100;
	}
	public void cancelB() {
		System.out.println("B 계좌 거래 취소  ");
		balance += 200;
	}
	public void cancelC() {
		System.out.println("C 계좌 거래 취소  ");
		balance += 300;
	}
}

public class Test {

	 public static void main(String args[]) {
	    	Bank b = new Bank();
	    	b.oneqTrade();
	    }
}
