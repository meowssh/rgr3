package fuel;

import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

//создаем класс textFieldFilter
public class textFieldFilter {
	
	// метод, который не дает пользователю ввести не те данные 
	private static void TextFilter(JTextField TextField, final int length) {
		
		// пользователь сможет ввести только цифры, вместо других символов
		TextField.setDocument(new PlainDocument() {
			String chars = "0123456789.";

			public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
				// проверка на то, пользователь ввел цифру
				if (chars.indexOf(str) != -1) {
					// проверка на длину введеных данных
					if (getLength() < length) {
						super.insertString(offs, str, a);
					}
				}
			}
		});
	}

	public void PTextFilter(JTextField TextField, final int length) {
		TextFilter(TextField, length);
	}

}
