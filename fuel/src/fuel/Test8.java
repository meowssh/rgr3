package fuel;

import static org.junit.Assert.*;

import org.junit.Test;

//�������� ������ Test8
public class Test8 {

	@org.junit.Test
	public void test1() {
		
		// �������� ������� Calc � ��������� ����������
		Calc a = new Calc(200,5,78);
		// ��������� �����������
		assertEquals(a.getCost(),"780.0");
	}

}
