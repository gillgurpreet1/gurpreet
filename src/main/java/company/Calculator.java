package company;

public class Calculator {
	public static Integer sum(Integer x, Integer y) {
		System.out.println("addition");
		if (x==null || y==null) {
			
			return null;
		}
		
		return x+y;
	}

}
