package fuel;

//����� Calc ��� ���������� ������� �������
public class Calc {
	
	// ������������� ����������
	double way;
	double average;
	double price;
	double fuel;
	double cost;
	
	// ������������� ����������
	Calc(double way, double average, double price) {
		this.fuel = average / 100.0 * way;
		this.cost = fuel * price;
	}
	
	// ����� getFuel ���������� ���������� ������������ �������
	public String getFuel() {
		return Double.toString(fuel);
	}
	
	// ����� getCost ���������� ��������� ������������ �������
	public String getCost() {
		return Double.toString(cost);
	}
}
