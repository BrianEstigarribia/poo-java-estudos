package br.com.w3c.java.classes.datas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExecutaDataFormatada {

	public static void main(String[] args) {
		LocalDateTime minhaDataAgora = LocalDateTime.now();
		DateTimeFormatter minhaDataFormatada = DateTimeFormatter.ofPattern("E,"
				+ " dd-MM-yyyy HH:mm:ss");
		
		String dataFormatada = minhaDataAgora.format(minhaDataFormatada);
		System.out.println(dataFormatada);
	}

}
