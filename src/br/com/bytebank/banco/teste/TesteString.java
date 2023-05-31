package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String vazio = "  Alura   ";
		String outroVazio = vazio.trim();
		//vazio.trim();  para tirar todos os espaços de uma String.
		
		System.out.println(vazio.contains("Alu")); //perguntar uma String se ela possui uma stirng ou uma substring.
		System.out.println(outroVazio);
		
		
		//System.out.println(outroVazio.isEmpty()); //para mostrar se a String está vazia
		
		String nome = "Alura"; //object literal
		//String outro = new String("alura");
		
		System.out.println(nome.length()); //para saber qual o tamanho da sua string
		
		for(int i = 0; i < nome.length(); i++){
			System.out.println(nome.charAt(i));
		}
			
		
//		String sub = nome.substring(1); a partir de qual posição você gostaria de começar a String.
//		System.out.println(sub);
		
//		int pos = nome.indexOf("ur"); para saber a posição da String.
//		System.out.println(pos);

		
//		char c = nome.charAt(2); para usar a posição da string
//		System.out.println(c);
		
//		char c = 'A'; //serve para usar apenas uma caracteres.
//		char d = 'a';
//		String outro = nome.replace(c, d);
		
	
		//String outro = nome.toLowerCase();
		
		//String outro = nome .toUpperCase();
		
//		System.out.println(nome);
//		System.out.println(outro);
	}

}
