package monday;

public class GenericSummation<T extends Number> {
	
	private T left;
	private T right;
	public T getLeft() {
		return left;
	}
	public void setLeft(T left) {
		this.left = left;
	}
	public Number getRight() {
		return right;
	}
	public void setRight(T right) {
		this.right = right;
	}
	
	public Number sum() {
		if(left instanceof Integer) {
			return Integer.valueOf(left.toString()) + Integer.valueOf(right.toString());
		} else if(left instanceof Long) {
			return Long.valueOf(left.toString()) + Long.valueOf(right.toString());
		} else if (left instanceof Short) {
			return Short.valueOf(left.toString()) + Short.valueOf(right.toString());
		} else if (left instanceof Byte) {
			return Byte.valueOf(left.toString()) + Byte.valueOf(right.toString());
		} else if (left instanceof Float) {
			return Float.valueOf(left.toString()) + Float.valueOf(right.toString());
		} else if(left instanceof Double) {
			return Double.valueOf(left.toString()) + Double.valueOf(right.toString());
		}
		return null;
		
	}

}
