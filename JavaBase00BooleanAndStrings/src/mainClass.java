
public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x = (float) 23123.456;
		double xx = 31234567890123456789d;
		
		float maxValueNegativo = -Float.MAX_VALUE;
		float maxValuePositivo = Float.MAX_VALUE;
		
		double maxValueNegativoD = -Double.MAX_VALUE;
		double maxValuePositivoD = Double.MAX_VALUE;
		
		double piuVicinoAZero = Double.MIN_VALUE;
		
		String cognome = "Toscano";
		boolean superaControllo = cognome.endsWith("no");

		System.out.println(superaControllo);
		int i;
		i = 1000 * 1000 * 1000 * 1000;
		
		char c1, c2, c3, c4;
		c1 = 'b';
		c2 = ' ';
		c3 = 'A'+'b';
		
		int ichar=c1+c2;  //i chat vengono convertiti ad interi e poi viene fatta la somma, non vale per c3= c1+c2 per farlo bisogna fare il cast
		
		c4= (char) (c1+c2);
		
		double d1;
		d1 = Double.parseDouble("3.14")*2;      //parse double estrae un double da una stringa
		System.out.println(i);
		
	}

}
