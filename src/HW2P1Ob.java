
public class HW2P1Ob {
	private int num;
	private int den;
	
	HW2P1Ob (int n, int d)
	{
		num = n;
		den = d;
	}
	
	public HW2P1Ob add(HW2P1Ob f)
	{
		HW2P1Ob r = new HW2P1Ob(num, den);
		r. num = this.num * f.den + this.den * f.num;
		r.den = this.den * f.den;
		return r;
		
	}
public HW2P1Ob subs(HW2P1Ob f){
	HW2P1Ob r = new HW2P1Ob(num, den);
	r.num = this.num * f.den - this.den * f.num;
	r.den = this.den * f.den;
	return r;
}
public HW2P1Ob mult(HW2P1Ob f){
	HW2P1Ob r = new HW2P1Ob(num, den);
	r.num = this.num * f.num;
	r.den = this.den * f.den;
	return r;
}
public HW2P1Ob dvit(HW2P1Ob f){
	HW2P1Ob r = new HW2P1Ob(num, den);
	r.num = this.num * f.den;
	r.den = this.den * f.num;
	return r;
}

}