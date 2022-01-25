package kh.test.bank;

public class Run {

	public static void main(String[] args) {
		// TODO
		// 1. 통장개설
		// 2. 잔액조회
		// 3. 입금
		// 4. 출금

		// 무명 계좌개설
//		오류. BankAccount a = new BankAccount(); 
		
		// 김혜린 계좌개설 --> 1000원 입금
		BankAccount hr = new BankAccount("1111", "hrkim");// BankAccount.totalCnt++; hr.totalCnt++; 써도 되긴하는데														// 굳이
		System.out.println("hr 계좌번호: " + hr.getNo());
		
		System.out.println("totalCnt: "+ hr.gettotalCnt());

//		System.out.println(hr.DEFAULT_NO);
		
		//
		
		// 이제이 계좌개설 
		BankAccount ej = new BankAccount( "9999", "ejkim","010-3549-9999");// BankAccount.totalCnt++;
		System.out.println("ej 계좌번호: " + ej.getNo());
		
		//--> 1000원 입금
		hr.setBalance(1000);
		
		//--> 10000원 입금
//		ej.balance = 10000;
		ej.setBalance(10000);
		
		// 김혜린 잔액조회 --> 출금 500원
		int balance = hr.checkBalance();
		System.out.println("hr's balance: " + balance);
		hr.withdraw(500);
		System.out.println("hr's balance: " + hr.checkBalance());

		// 이제이 잔액조회 --> 입금 2000원
		balance = ej.checkBalance();
		System.out.println("ej's balance: " + ej.checkBalance());
		ej.deposit(2000);
		System.out.println("ej's balance: " + ej.checkBalance());
	
		hr.setPassword("hello");
		ej.setPassword("hey");
	
		
		
// 디버깅 Debugging
// 1. breakpoint 잡는다 / 푼다
		// 하던 작업을 잠시 멈춰야하는데 주석은 하는 일이 없으므로 breakpoint가 안 잡힘.
		
// 2. F11 눌러라
		// switch 모드 변경할거냐?
		// java -> debug 모드로 바뀜
		
// 3. F6/F7/F8 - 다음 동작 수행 
	// 수행 중 각종 변수들의 값을 확인할 수 있음.
		// 수행 중 호출되는 메소드들을 확인할 수 있음.
		
		
		
		
	}
}
