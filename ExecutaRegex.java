package br.com.w3c.java.clases.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExecutaRegex {

	public static void main(String[] args) {
		Pattern padrao = Pattern.compile("w3schools",Pattern.CASE_INSENSITIVE);
		Matcher combinar = padrao.matcher("Visit W3SCHOOLS!");
		
		boolean encontrarCombinacao = combinar.find();
		
		if(encontrarCombinacao){
			System.out.println("Combina��o encontrada");
		}else{
			System.out.println("Combina��o N�o encontrada");
		}
	}
}
