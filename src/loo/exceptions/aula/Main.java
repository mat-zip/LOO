//Crie uma classe Main (inicial em maiusculo) e adicione este codigo dentro.
package loo.exceptions.aula;

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Main t = new Main();
		System.out.println("Inicio do main");
		/*try{
			t.metodo1();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("[ERRO] - " + e);
		}
		System.out.println("Fim do main");*/
		t.readFile("D:\\mathe\\Documents\\UTFPR\\4 - Periodo\\Linguagem-Orientada-a-Objetos\\exceptions\\src\\aula\\teste.txt");
	}

	public void readFile(String fileName) throws IOException {
		File file = new File(fileName);
		System.out.println(file.getAbsolutePath());
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

			String text;

			for (int i = 0; (text = bufferedReader.readLine()) != null ; i++) {
				System.out.println(text);
			}
		} catch (FileNotFoundException e) {
			System.out.println("[ERRO] - " + e);
		}


	}


	public void metodo1() {
		System.out.println("Inicio do método 1");
		metodo2();
		System.out.println("Fim do método 1");
	}

	public void metodo2() {
		System.out.println("Inicio do metodo 2");
		int[] array = new int[10];


		for (int i = 0; i <= 15; i++) {
			array[i] = i;
			System.out.println(i);
		}

		System.out.println("Fim do metodo 2");
	}
}
