package fuel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//класс Components наследуется от JFrame
public class Components extends JFrame {
	// создаем методы видимые для пакета и всех подклассов
	protected JFrame CreateMainFrame(String FrameName, JPanel Panel, int w, int h) {
		// создаем объект JFrame
		JFrame mainFrame = new JFrame(FrameName);
		// необходимо для того, чтобы при закрытии окна закрывалась и программа
		// иначе она останется висеть в воздухе
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// установка размеров
		mainFrame.setSize(w, h);
		// позволяет заменить панель содержимого окна
		mainFrame.setContentPane(Panel);
		// позволяет запретить изменение размеров окна
		mainFrame.setResizable(false);
		return mainFrame;
	}

	protected JLabel CreateLabel(String name, int x, int y, int w, int h) {
		JLabel Label = new JLabel(name);
		Label.setBounds(x, y, w, h);
		return Label;
	}

	protected JTextField CreateTextField(int x, int y, int w, int h) {
		// создаем объект JTextField, предназначенный для ввода текстовых данных
		JTextField textField = new JTextField();
		textField.setBounds(x, y, w, h);
		return textField;
	}

	protected JPanel CreateMainPanel() {
		JPanel MainPanel = new JPanel();
		MainPanel.setLayout(null);
		return MainPanel;
	}

	// метод для создания кнопок
	protected JButton CreateButton(String name, int x, int y, int h, int w) {
		JButton a = new JButton(name);
		a.setBounds(x, y, h, w);
		return a;
	}
}
