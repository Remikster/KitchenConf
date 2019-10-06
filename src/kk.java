import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;

public class kk extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kk frame = new kk();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public kk() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 947, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u0417\u0434\u0440\u0430\u0432\u0441\u0442\u0443\u0439\u0442\u0435 \u043D\u0430 \u043E\u043F\u0440\u043E\u0441 \u043F\u0435\u0440\u0435\u0434 \u043A\u043E\u043D\u0444\u0435\u0440\u0435\u043D\u0446\u0438\u0435\u0439 \u043F\u0435\u043A\u0430\u0440\u0435\u0439 , \u043F\u043E\u0436\u0430\u043B\u0443\u0439\u0441\u0442\u0430 \u043F\u0440\u043E\u0439\u0434\u0438\u0442\u0435 \u0435\u0433\u043E");
		label.setBounds(128, 3, 687, 22);
		contentPane.add(label);
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBounds(10, 79, 395, 34);
		contentPane.add(horizontalBox);
		
		JLabel label_1 = new JLabel("1.\u0424\u0418\u041E");
		horizontalBox.add(label_1);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textField = new JTextField();
		horizontalBox.add(textField);
		textField.setColumns(10);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		horizontalBox_1.setBounds(10, 169, 395, 34);
		contentPane.add(horizontalBox_1);
		
		JLabel label_2 = new JLabel("3.\u041F\u041E\u041B");
		horizontalBox_1.add(label_2);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\u041C\u0443\u0436\u0441\u043A\u043E\u0439");
		horizontalBox_1.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JRadioButton radioButton = new JRadioButton("\u0416\u0435\u043D\u0441\u043A\u0438\u0439");
		horizontalBox_1.add(radioButton);
		radioButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setBounds(431, 75, 135, 48);
		contentPane.add(verticalBox);
		
		JLabel label_3 = new JLabel("\u0414\u0430\u0442\u0430 \u0440\u043E\u0436\u0434\u0435\u043D\u0438\u044F");
		verticalBox.add(label_3);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		textField_1 = new JTextField();
		verticalBox.add(textField_1);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setColumns(10);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		horizontalBox_2.setBounds(10, 214, 395, 34);
		contentPane.add(horizontalBox_2);
		
		JLabel label_4 = new JLabel("4.\u041A\u0430\u043A \u0432\u044B \u043E\u0442\u043D\u043E\u0441\u0438\u0442\u0435\u0441\u044C \u043A \u0433\u043E\u0442\u043E\u0432\u043A\u0435?");
		horizontalBox_2.add(label_4);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		textField_2 = new JTextField();
		horizontalBox_2.add(textField_2);
		textField_2.setColumns(10);
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		horizontalBox_3.setBounds(10, 304, 213, 34);
		contentPane.add(horizontalBox_3);
		
		JLabel label_5 = new JLabel("6.\u0421\u043A\u043E\u043B\u044C\u043A\u043E \u0432\u0430\u0441 \u043F\u0440\u0438\u0435\u0434\u0435\u0442?");
		horizontalBox_3.add(label_5);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JSpinner spinner = new JSpinner();
		horizontalBox_3.add(spinner);
		
		Box horizontalBox_4 = Box.createHorizontalBox();
		horizontalBox_4.setBounds(10, 349, 317, 34);
		contentPane.add(horizontalBox_4);
		
		JLabel lblNewLabel = new JLabel("7.\u0421\u043A\u043E\u043B\u044C\u043A\u043E \u0432\u0430\u043C \u043F\u043E\u043D\u0430\u0434\u043E\u0431\u0438\u0442\u0441\u044F \u043A\u043E\u043C\u043D\u0430\u0442?");
		horizontalBox_4.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JSpinner spinner_1 = new JSpinner();
		horizontalBox_4.add(spinner_1);
		
		Box horizontalBox_5 = Box.createHorizontalBox();
		horizontalBox_5.setBounds(10, 259, 395, 34);
		contentPane.add(horizontalBox_5);
		
		JLabel label_6 = new JLabel("5.\u0427\u0442\u043E\u0431\u044B \u0432\u044B \u0445\u043E\u0442\u0435\u043B\u0438 \u0438\u0437\u043C\u0435\u043D\u0438\u0442\u044C?");
		horizontalBox_5.add(label_6);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		textField_3 = new JTextField();
		horizontalBox_5.add(textField_3);
		textField_3.setColumns(10);
		
		Box horizontalBox_6 = Box.createHorizontalBox();
		horizontalBox_6.setBounds(10, 124, 90, 34);
		contentPane.add(horizontalBox_6);
		
		JCheckBox checkBox = new JCheckBox("2.\u0412\u0435\u0433\u0430\u043D");
		horizontalBox_6.add(checkBox);
		checkBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
	}
}
