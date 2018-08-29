
public class HW2P1Ob2 {

	private int num;
	private int den;
	
	HW2P1Ob2 (int n, int d)
	{
		num = n;
		den = d;
	}
	
	public HW2P1Ob2 add(HW2P1Ob2 r)
	{
		HW2P1Ob2 f = new HW2P1Ob2(num, den);
		f. num = this.num * r.den + this.den * r.num;
		f.den = this.den * r.den;
		return f;
		
	}
public HW2P1Ob2 subs(HW2P1Ob2 r){
	HW2P1Ob2 f = new HW2P1Ob2(num, den);
	f.num = this.num * r.den - this.den * r.num;
	f.den = this.den * r.den;
	return f;
}
public HW2P1Ob2 mult(HW2P1Ob2 r){
	HW2P1Ob2 f = new HW2P1Ob2(num, den);
	f.num = this.num * r.num;
	f.den = this.den * r.den;
	return f;
}
public HW2P1Ob2 dvit(HW2P1Ob2 r){
	HW2P1Ob2 f = new HW2P1Ob2(num, den);
	f.num = this.num * r.den;
	f.den = this.den * r.num;
	return f;
}

}
