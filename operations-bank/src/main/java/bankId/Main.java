package bankId;


import bankId.cards.CardBank;
import bankId.cards.CreditCard;
import bankId.cards.DebitCard;
import bankId.cards.KidCard;
import bankId.customers.Customer;
import bankId.services.Premium;
import bankId.services.ServicesBank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<CardBank> sitnikov = new ArrayList<>(Arrays.asList(
				new CreditCard("1111 2222 3333 4444", "sitnikov SERGEI"),
				new DebitCard("4444 5555 6666 7777", "SITNIKOV SERGEI")
		));

		Customer sitnikovs = new Customer("Ситников Сергей Сергеевич", sitnikov, "324234-23/32/23");

		sitnikov.get(0).pay(200);
		sitnikov.get(0).deactivationCard();
		sitnikov.get(0).pay(200);
		System.out.println(sitnikov.get(0));
		sitnikov.get(0).setBalanceCard(20000);
		sitnikov.get(0).pay(200);
		System.out.println(sitnikov.get(0));
		ServicesBank sb = new Premium(sitnikov.get(0), 299);
		sb.serviceStatus();
		sb.activateService();

		System.out.println(sitnikov);
		sb.activateService();
		sb.isDeactivationService();



		System.out.println(sitnikov);
		System.out.println(sitnikovs);
		sitnikov.add(new KidCard("8888 9999 0000 0000", "SITNIKOVA anastasia", 11, sitnikovs));
		System.out.println(sitnikovs);
	}
}