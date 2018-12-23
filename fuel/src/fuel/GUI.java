package fuel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//Класс GUI для создания окна приложения и указания его параметров
public class GUI extends Components {
	 
	private JPanel mainPanel;
	private JFrame mainFrame;
	// создание массива JLabel
	private JLabel[] label = new JLabel[7];
	// создание массива JTextField
	private JTextField[] textField = new JTextField[4];
	private JButton confirm;
	private String[] labelNames = { "Расстояние", "Средний расход топлива на 100 км.", "Цена за литр топлива", "км.",
			"л.", "руб.", "Введите необходимые данные" };
	private int[] labelBounds = { 10, 5, 280, 50, 10, 35, 280, 50, 10, 65, 280, 50, 350, 5, 210, 50, 350, 35, 210, 50,
			350, 65, 210, 50, 10, 120, 250, 50 };
	private int[] textFieldsBounds = { 250, 17, 90, 25, 250, 47, 90, 25, 250, 77, 90, 25, 225, 17, 90, 25 };

	GUI() {
		// создание формы
		mainPanel = CreateMainPanel();
		// конфигурирование параметров панели
		mainFrame = CreateMainFrame("Расход топлива", mainPanel, 400, 200);
		// создание кнопки
		confirm = CreateButton("Рассчитать", 250, 130, 120, 25);
		// циклы для создания интерфейса панели
		for (int i = 0; i < 7; i++) {
			label[i] = CreateLabel(labelNames[i], labelBounds[i * 4], labelBounds[i * 4 + 1], labelBounds[i * 4 + 2],
					labelBounds[i * 4 + 3]);
			mainPanel.add(label[i]);
		}
		for (int i = 0; i < 3; i++) {
			textField[i] = CreateTextField(textFieldsBounds[i * 4], textFieldsBounds[i * 4 + 1],
					textFieldsBounds[i * 4 + 2], textFieldsBounds[i * 4 + 3]);
			mainPanel.add(textField[i]);
		}
		
		mainPanel.add(confirm);
		// создание объекта textFieldFilter
		textFieldFilter filter = new textFieldFilter();
		// ограничение на длину введеных цифр
		for (int i = 0; i < 3; i++) {
			filter.PTextFilter(textField[i], 6);
		}
		// с этого момента приложение запущено
		mainFrame.setVisible(true);
		confirm.addActionListener(new ActionListener() {
			@Override
			// метод actionPerformed для вывода результата
			public void actionPerformed(ActionEvent ae) {
				// проверка на то, чтобы ни одно поле не было пустым
				if (!textField[0].getText().isEmpty() && !textField[1].getText().isEmpty()
						&& !textField[2].getText().isEmpty()) {
					// создание нового объекта Calc, в котором хранится вывод стоимости и количества топлива
					Calc result = new Calc(Double.parseDouble(textField[0].getText()),
							Double.parseDouble(textField[1].getText()), Double.parseDouble(textField[2].getText()));
					label[6].setText("<html>Понадобится <font style='color: green; font-weight: bold;'>"
							+ result.getFuel()
							+ "</font> литров топлива, обойдётся в <font style='color: green; font-weight: bold;'>"
							+ result.getCost() + "</font> рублей.</html>");
				}
			}
		});
	}
}
