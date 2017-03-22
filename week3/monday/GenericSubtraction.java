package monday;

import java.math.BigDecimal;
import java.math.BigInteger;

public class GenericSubtraction <T extends Number>{
	
	
	public T subtraction(T leftElement, T rightElement) {
		if (leftElement instanceof Integer || leftElement instanceof Long || leftElement instanceof Byte || leftElement instanceof Short) {
			subtractInteger(leftElement, rightElement);
		} else if (leftElement instanceof Float || leftElement instanceof Double) {
			subtractDecimal(leftElement, rightElement);
		}
		return null;
	}
	
	private BigInteger subtractInteger(T leftElement, T rightElement) {
		BigInteger result = BigInteger.ZERO;
		result = BigInteger.valueOf(leftElement.longValue()).subtract(BigInteger.valueOf(rightElement.longValue()));
		return result;
	}
	
	
	private BigDecimal subtractDecimal(T leftElement, T rightElement) {
		BigDecimal result = BigDecimal.ZERO;
		result = BigDecimal.valueOf(leftElement.doubleValue()).subtract(BigDecimal.valueOf(rightElement.doubleValue()));
		return result;
	}
}
