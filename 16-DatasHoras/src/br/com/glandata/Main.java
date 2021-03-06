package br.com.glandata;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void  main(String[] args) {
		
		LocalDate dataAgora = LocalDate.now();	
		
		DateTimeFormatter formataData =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(formataData.format(dataAgora));
		formataData =  DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		System.out.println(formataData.format(dataAgora));
		formataData =  DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
		System.out.println(formataData.format(dataAgora));
		
		LocalDateTime dataHoraAgora = LocalDateTime.now();
		DateTimeFormatter formataDataHora =  DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy '-' hh:mm:ss.ms");
		System.out.println(formataDataHora.format(dataHoraAgora));
		formataDataHora =  DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy '-' HH:mm:ss.ms");
		System.out.println(formataDataHora.format(dataHoraAgora));

	}

}
