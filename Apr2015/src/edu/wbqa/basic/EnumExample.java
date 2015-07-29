package edu.wbqa.basic;

public class EnumExample {

	public static void main(String[] args) {

		Account a = new Account();
		a.accountType = AccountType.SAVING;

		switch (a.accountType) {
		case CHECKING:
			System.out.println();
			break;
		case SAVING:
			System.out.println();
			break;
		case CREDITCARD:
			System.out.println();
			break;
		default:
			System.out.println();
			break;
		}
		


	}

}
