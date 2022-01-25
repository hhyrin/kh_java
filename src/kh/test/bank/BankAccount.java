package kh.test.bank;

public class BankAccount {
	private static final String DEFAULT_NO = "99999999";
	// static 넣어도 되고 안 넣어도 됨
	private String no; // 계좌번호
	private String password; // 비밀번호
	private String name; // 예금주
	private int balance; // 잔액
	private static int totalCnt; // 이 통장이 개설된 수 // static 꼭 필요함
	// static 옵션이 걸려있는 필드를 class 변수라고 부름

	// 생략가능 compile 시에 javac가 넣어줄게. 단, 밑에 아무것도 없을때만
	// public BankAccount(){ }

	// overloading : 매개변수의 자료형과 개수가 달라서
	// 호출하는 시점에 전달되는 매개인자 값의 자료형과 개수에 따라
	// 각각의 메소드 정의 부분이 수행됨.
	// 통장개설을 하기 위해서는 계좌번호, 비밀번호, 예금주를 알려줘야 통장개설을 해줌.
	public BankAccount(String password, String name, String no) {
		this.no = no;
		this.password = password;
		this.name = name;
		if (totalCnt > 10) {
			System.out.println("통장개설 개수가 한계에 도달하고 있습니다.");
		}
		System.out.println("현재 개설된 통장 개수: " + totalCnt);
		totalCnt++;
	}

	// 통장개설을 하기 위해서는 비밀번호, 예금주를 알려주고 통장개설을 원한 경우.
	public BankAccount(String password, String name) {
		this.no = DEFAULT_NO + totalCnt;
		this.password = password;
		this.name = name;
		if (totalCnt > 10) {
			System.out.println("통장개설 개수가 한계에 도달하고 있습니다.");
		}
		System.out.println("현재 개설된 통장 개수: " + totalCnt);
		totalCnt++;
	}

	// 잔액조회 : 잔액을 리턴
	int checkBalance() {
		return balance;
	}

	// 입금 : 입금금액을 받아서(매개인자) 잔액에서 더해서 대입.
	void deposit(int account) {
		balance += account;
	}

	// 출금 : 출금금액을 받아서(매개인자) 잔액에서 빼서 대입.
	void withdraw(int account) {
		balance -= account;
	}

	// private String no; // 계좌번호
	public String getNo() {
		return no;
	}
	private void setNo(String no) {
		this.no = no;
	}
	
	// public String password; // 비밀번호
	// field에서 값을 변경하거나 읽게 되면 누가 언제 바꿨는지 읽었는지 알 수 없음.
	// 메소드를 이용해서 읽고 바꾸게 되면 누가 언제 바꿨는지 알 수가 있음.
	// 값을 읽고 쓰는 것 이외의 일들을 수행할 수도 있음.
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		// 기존 password 입력 받은 후 맞다면 패스워드 변경해줌.
		// 패스워드는 20자리까지만 가능하다고 할 때, 전달되어온 패스워드 길이를 확인해서 알려줄 수 있음.
		if (password.length() <= 20) {
			this.password = password;
		} else {
			System.out.println("비밀번호 변경에 실패했습니다. 20자리 미만으로 입력해주세요.");
		}
		
	}
	// Alt + Shift + s 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//private static int totalCnt; // 이 통장이 개설된 수
	// static 붙은 메소드는 class 메소드라고 부름
	public static int gettotalCnt() {
		return totalCnt;
	}
	
}
