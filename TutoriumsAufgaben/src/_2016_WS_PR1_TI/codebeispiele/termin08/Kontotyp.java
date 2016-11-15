package _2016_WS_PR1_TI.codebeispiele.termin08;

public enum Kontotyp {
	
	/**
	 * Ein typisches Girokonto
	 */
	Giro {
		@Override
		public int getProzentSatz() {
			return 5;
		}
	},
	/**
	 * Ein Sparbuch für Langzeit-Sparer
	 */
	Sparbuch {
		@Override
		public int getProzentSatz() {
			return 20;
		}
	};
	
	/**
	 * Gibt den Zinssatz in Prozent für den jeweiligen Kontotypen.
	 * @return Der Zinssatz in Prozent
	 */
	public abstract int getProzentSatz();
}
