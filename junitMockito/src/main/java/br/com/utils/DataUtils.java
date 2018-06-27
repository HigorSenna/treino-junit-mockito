package br.com.utils;

import java.util.Calendar;
import java.util.Date;

public final class DataUtils {
	
	private DataUtils() {}
	
	public static Date adicionarDias(Date data, int dias) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		calendar.add(Calendar.DAY_OF_MONTH, dias);
		
		return calendar.getTime();
	}
	
	public static Date obterDataComDiferencaDias(int dias) {
		return adicionarDias(new Date(), dias);
	}
	
	public static Date obterData(int dia, int mes, int ano) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, dia);
		calendar.set(Calendar.MONTH, mes);
		calendar.set(Calendar.YEAR, ano);
		
		return calendar.getTime();
	}
}
