package codebeispiele.termin10;

public class EqualsBeispiel {
	private int int1;
	private int int2;
	private int int3;
	private int int4;
	private int[] intArray = new int[5];
	private int[] intArray2 = {1,2,3,4};
	private int[] intArray3 = new int[]{1,2,3,4,5};
	
	public int[] doSomething() {
		return new int[]{1,2,3,4};
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + int1;
		result = prime * result + int2;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualsBeispiel other = (EqualsBeispiel) obj;
		if (int1 != other.int1)
			return false;
		if (int2 != other.int2)
			return false;
		return true;
	}
	
}
