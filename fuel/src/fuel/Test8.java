package fuel;

import static org.junit.Assert.*;

import org.junit.Test;

//создание класса Test8
public class Test8 {

	@org.junit.Test
	public void test1() {
		
		// создание объекта Calc с передачей параметров
		Calc a = new Calc(200,5,78);
		// сравнение результатов
		assertEquals(a.getCost(),"780.0");
	}

}
