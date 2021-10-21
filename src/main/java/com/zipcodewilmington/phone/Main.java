package com.zipcodewilmington.phone;

import com.zipcodewilmington.exceptions.InvalidPhoneNumberFormatException;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws InvalidPhoneNumberFormatException {
		String stringRepresentation = "(302)-312-5555";
		PhoneNumber phoneNumber = new PhoneNumber(stringRepresentation);
		String areaCode = phoneNumber.getAreaCode();
		String centralOfficeCode = phoneNumber.getCentralOfficeCode();
		String phoneLineCode = phoneNumber.getPhoneLineCode();

		System.out.println(PhoneNumberFactory.createPhoneNumberSafely(303, 312, 5555));
		System.out.println(areaCode + " " + centralOfficeCode + " " + phoneLineCode);

		System.out.println(PhoneNumberFactory.createRandomPhoneNumber());

		System.out.println(Arrays.toString(PhoneNumberFactory.createRandomPhoneNumberArray(5)));

	}
}
