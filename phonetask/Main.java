package com.te.phonetask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Phone contact = new Phone();

		ArrayList<Phone> contacts = new ArrayList<>();
		contacts.add(new Phone("mohit", 9518712736l));
		contacts.add(new Phone("darshan", 9075826495l));
		contacts.add(new Phone("Bhagawat", 9856787568l));
		contacts.add(new Phone("ravi", 8966886790l));

		System.out.println(
				"Welcome to Phone Book \n\n" + "Press 1 to show all contacts \n\n" + "Press 2 to search contact");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if (n == 1) {

			Iterator<Phone> iterator = contacts.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}

		} else if (n == 2) {

			System.out.println("Entre contact name to search");
			String x = sc.next();

			if (contacts.stream().anyMatch(f -> f.name.equalsIgnoreCase(x))) {
				List<Phone> collect = contacts.stream().filter(f -> f.name.equalsIgnoreCase(x))
						.collect(Collectors.toList());
				Phone contact2 = collect.get(0);
				System.out.println(contact2);
			} else {
				System.out.println("No contact found");
			}

		} else {
			System.out.println("Invalid Input");

		}

	}

	@Override
	public String toString() {
		return "Main [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	
}
