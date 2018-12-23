package fuel;

import static org.junit.Assert.*;

import org.junit.Test;

//создание класса Test7
public class Test7 {

	@org.junit.Test
	public void test1() {
		
		// создание объекта Calc с передачей параметров
		Calc a = new Calc(700, 10, 33);
		// сравнение результатов
		assertEquals(a.getFuel(),"70.0");
	}

}
