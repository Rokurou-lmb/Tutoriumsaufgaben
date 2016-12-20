package _2016_WS_PR1_TI.codebeispiele.termin12;

public class ServiceMix2Impl implements ServiceMix2 {
	
	@Override
	public int arrayKapazitaet(int[][] intarr) {
		testNull(intarr);
		
		int summe = 0;
		for(int i = 0; i < intarr.length; i++)
		{
			if(intarr[i] != null)
			{
				summe += intarr[i].length;
			}
		}
		return summe;
	}
	
	@Override
	public String laengstesPalindrom(String s) {
		testNull(s);
		if(s.length() < 2) {
			return s;
		}
		String laengstesPalindrom = "";
		String sCopy = s.toLowerCase();
		
		for(int i = 0; i < s.length(); i++)
		{
			for(int j = s.length(); j > i; j--)
			{
				String currentString = sCopy.substring(i, j);
				if(istPalindrom(currentString))
				{
					if(currentString.length() > laengstesPalindrom.length())
					{
						laengstesPalindrom = s.substring(i,j);
					}
				}
			}
		}
		return laengstesPalindrom;
	}
	
	private boolean istPalindrom(String s) {
		boolean matching = true;
		if(s.length() > 1)
		{
			matching = s.charAt(0) == s.charAt(s.length() -1);
		}
		return (s.length() > 1) ? matching && istPalindrom(s.substring(1, s.length()-1)) : true ;
	}
	
	private void testNull(Object o) {
		if(o == null)
		{
			throw new IllegalArgumentException();
		}
	}
}
