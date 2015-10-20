package util;

public class ModuloTestRechner {
	public static void main(String[] args) {
		for(String string : args) {
			moduloRechnen(string);
		}
	}
	
	private static void moduloRechnen(String intString) {
		String[] zahlen = intString.split("%");
		int zahl1 = Integer.parseInt(zahlen[0]);
		int zahl2 = Integer.parseInt(zahlen[1]);
		System.out.println(zahl1 + " % " + zahl2 + " ergiebt: " + (zahl1%zahl2));
	}
}
