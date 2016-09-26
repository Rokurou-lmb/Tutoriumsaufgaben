package _2016_SS_PR1_TI.aufgabenblatt6;

import java.util.Random;

/**
 * Trivialimplementation von {@link SendungsdauerSchaetzer} antwortet auf
 * Anfragen statisch.
 * 
 * @author Helena
 *
 */
public class DummerSchaetzer implements SendungsdauerSchaetzer {
	
	private final static Random RNG = new Random();

	/**
	 * Gibt immer 1 zur�ck.
	 * 
	 * @param herkunft
	 *            Die Stadt aus welcher versendet wird.
	 * @param ziel
	 *            Die Stadt zu welcher zugestellt werden soll.
	 */
	@Override
	public int getSendungsTransportDauer(Staedte herkunft, Staedte ziel) {
		return RNG.nextInt(1000);
	}

}
