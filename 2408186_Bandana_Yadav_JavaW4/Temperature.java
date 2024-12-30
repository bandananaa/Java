package workshop4;

public class Temperature {
	public float cel_to_fahren(float c){
		float f = (c*9/5) + 32;
		return f;
	}
	
	public float fahren_to_cel(float f){
		float c = (f-32) * 5/9;
		return c;
	}
}
