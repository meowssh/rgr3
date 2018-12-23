package fuel;

//класс Calc для вычисления расхода топлива
public class Calc {
	
	// инициализация переменных
	double way;
	double average;
	double price;
	double fuel;
	double cost;
	
	// инициализация переменных
	Calc(double way, double average, double price) {
		this.fuel = average / 100.0 * way;
		this.cost = fuel * price;
	}
	
	// метод getFuel возвращает количество необходимого топлива
	public String getFuel() {
		return Double.toString(fuel);
	}
	
	// метод getCost возвращает стоимость необходимого топлива
	public String getCost() {
		return Double.toString(cost);
	}
}
