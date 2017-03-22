package week2;

public class Pair {

	private Object member1;
	private Object member2;
	public Object getMember1() {
		return member1;
	}
//	public void setMember1(Object member1) {
//		this.member1 = member1;
//	}
	public Object getMember2() {
		return member2;
	}
//	public void setMember2(Object member2) {
//		this.member2 = member2;
//	}
	
	public Pair() {

	}
	
	public Pair(Object member1) {
		this.member1 = member1;
	}
	
	public Pair(Object member1, Object member2) {
		this(member1);
		this.member2 = member2;
	}
	
	public String toString() {
		return String.format((member1 == null && member2 == null) ? "The pair is empty" : "The pair contains %s and %s", member1.toString(), member2.toString());
	}
	
	public boolean equals(Object pair) {
		if (pair instanceof Pair) {
			Pair pairche = (Pair) pair;
			return this.getMember1().equals((pairche).getMember1()) && this.getMember2().equals((pairche).getMember2());
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Object memb1 = new Object();
		Object memb2 = new Object();
		
		Pair p1 = new Pair(memb1, memb2);
		Pair p2 = new Pair(memb1, memb2);
		Pair p3 = new Pair(memb2, memb1);
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
	}
	
	
	
}
