package mx.com.twg;

public class Main {

	public static void main(String[] args) {
		
		// AutoBoxing: De tipo primitivo a tipo objeto
		Integer i = 255;
		Float f = 4.4F;
		System.out.println(i.intValue());
		System.out.println(f.floatValue());
		
		// Unboxing: De tipo Objeto a tipo Primitivo
		int o = i;
		float l = f;
		System.out.println(o);
		System.out.println(l);
		
		//=================
		
		String s = "4";
		int d = i.parseInt(s);
		System.out.println(d);
		
		int b = Integer.parseInt(s);
		System.out.println(b);
	}

}
