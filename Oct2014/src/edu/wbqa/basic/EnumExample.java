package edu.wbqa.basic;

public class EnumExample {

	public static void main(String[] args) {

		Account a = new Account();
		a.accountType = ACCOUNTTYPE.CHECKING;

		switch (a.accountType) {
		case CHECKING:
			System.out.println();
			break;

		}

	}

}
