package com.eren.goat.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.eren.goat.service.GoatService;

@Service
public class GoatServiceImpl implements GoatService {

	@Value(value = "${goat}")
	private String goatBinary;

	@Override
	public String findOutTheGoat() {

		String theGoat = "";
		String[] goatArray = goatBinary.split(" ");

		for (String string : goatArray) {
			int charCode = Integer.parseInt(string, 2);
			String str = new Character((char) charCode).toString();
			theGoat = theGoat.concat(str);
		}

		return theGoat;

	}
}
