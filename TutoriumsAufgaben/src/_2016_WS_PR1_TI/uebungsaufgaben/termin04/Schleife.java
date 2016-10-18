package _2016_WS_PR1_TI.uebungsaufgaben.termin04;

public class Schleife {

	public void ausgabe(int upperBound, int zahl) {
		for (int i = 0; i <= upperBound; i++) 
		{
			String ausgabe = "" + i;
			if ((i % zahl) == 0) 
			{
				ausgabe = "Super!";
			}
			System.out.println(ausgabe);
		}
	}

	public boolean palindrom(String text) {
		boolean result = true;
		for (int i = 0; i < (text.length() / 2) && result; i++)
		{
			result = result && (text.charAt(i) == text.charAt(text.length() - (1 + i)));
		}
		return result;
	}

	public void multiplikationsListe(int xBound, int yBound) {
		for (int i = 1; i <= xBound; i++)
		{
			for (int j = 1; j <= yBound; j++)
			{
				System.out.println(i + " x " + j + " = " + i * j);
			}
		}
	}

	public void multiplikationsTabelle(int xBound, int yBound) {
		int maxLength = String.valueOf(xBound * yBound).length();
		for (int x = 1; x <= xBound; x++)
		{
			for (int y = 1; y <= yBound; y++)
			{
				System.out.print(padding(maxLength, x, y));
			}
			System.out.println("");
		}
	}

	private String padding(int maxLength, int x, int y) {
		String result = "" + (x * y);
		return String.format("%-" + maxLength + "s", result);
	}

	public void fibonacciIterativ(int fibZahl) {
		int fibLetzer = 0;
		int fibAktueller = 1;

		if (fibZahl <= 0)
		{
			fibAktueller = 0;
		}

		for (int i = 1; i < fibZahl; i++)
		{
			int fibTemp = fibAktueller;
			fibAktueller += fibLetzer;
			fibLetzer = fibTemp;
		}
		System.out.println("Die " + fibZahl + "te Fibonacci Zahl ist: " + fibAktueller);
	}

	public void fibonacciRekursiv(int fibZahl) {
		int result = 0;
		if (fibZahl > 0)
		{
			result = fibHelper(fibZahl, 1, 0);
		}
		System.out.println("Die " + fibZahl + "te Fibonacci Zahl ist: " + result);
	}

	int fibHelper(int fibZahl, int fibAktueller, int fibLetzer) {
		if (fibZahl == 0)
			return fibLetzer;
		if (fibZahl == 1)
			return fibAktueller;
		return fibHelper(fibZahl - 1, fibAktueller + fibLetzer, fibAktueller);
	}
}
