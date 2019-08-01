package company;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCases {
	
@Test
public void Testsum() {
Integer x= 10;
Integer y= 20;
Integer expresult=30;
Integer result = Calculator.sum(x, y);
assertEquals(expresult, result);

}
}
