import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;

public class AddPlayer extends JDialog {

	private Player mainPlayer;
	
	public Player getMainPlayer(){
		return mainPlayer;
	}
	
	/**
	 * Create the dialog.
	 */
	public AddPlayer() {
		setTitle("ADD PLAYERS");
		setBounds(100, 100, 250, 350);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Id:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 89, 27);
		getContentPane().add(lblNewLabel);
		
		JLabel lblFirstNumber = new JLabel("First number:");
		lblFirstNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFirstNumber.setBounds(10, 49, 89, 27);
		getContentPane().add(lblFirstNumber);
		
		JLabel lblSecondNumber = new JLabel("Second number:");
		lblSecondNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSecondNumber.setBounds(10, 87, 103, 27);
		getContentPane().add(lblSecondNumber);
		
		JLabel lblFifthNumber = new JLabel("Fifth number:");
		lblFifthNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFifthNumber.setBounds(10, 202, 95, 27);
		getContentPane().add(lblFifthNumber);
		
		JLabel lblFourthNumber = new JLabel("Fourth number:");
		lblFourthNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFourthNumber.setBounds(10, 164, 108, 27);
		getContentPane().add(lblFourthNumber);
		
		JLabel lblThirdNumber = new JLabel("Third number:");
		lblThirdNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblThirdNumber.setBounds(10, 126, 95, 27);
		getContentPane().add(lblThirdNumber);
		
		
		JFormattedTextField formattedIdTextField = new JFormattedTextField("{0,number,#}");
		formattedIdTextField.setBounds(112, 16, 112, 20);
		formattedIdTextField.setValue(new Long(0L));
		getContentPane().add(formattedIdTextField);
		
		JFormattedTextField formattedFirstTextField = new JFormattedTextField();
		formattedFirstTextField.setBounds(122, 54, 77, 20);
		formattedFirstTextField.setValue(new Byte((byte) 0));
		getContentPane().add(formattedFirstTextField);
		
		JFormattedTextField formattedSecondTextField = new JFormattedTextField();
		formattedSecondTextField.setBounds(122, 92, 77, 20);
		formattedSecondTextField.setValue(new Byte((byte) 0));
		getContentPane().add(formattedSecondTextField);
		
		JFormattedTextField formattedThirdTextField = new JFormattedTextField();
		formattedThirdTextField.setBounds(122, 131, 77, 20);
		formattedThirdTextField.setValue(new Byte((byte) 0));
		getContentPane().add(formattedThirdTextField);
		
		JFormattedTextField formattedFourthTextField = new JFormattedTextField();
		formattedFourthTextField.setBounds(122, 169, 77, 20);
		formattedFourthTextField.setValue(new Byte((byte) 0));
		getContentPane().add(formattedFourthTextField);
		
		JFormattedTextField formattedFifthTextField = new JFormattedTextField();
		formattedFifthTextField.setBounds(122, 207, 77, 20);
		formattedFifthTextField.setValue(new Byte((byte) 0));
		getContentPane().add(formattedFifthTextField);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				mainPlayer = new Player();
				NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
				
				long id = 0;
				byte firstNumber = 0;
				byte secondNumber = 0;
				byte thirdNumber = 0;
				byte fourthNumber = 0;
				byte fifthNumber = 0;
				try {
					id = numberFormat.parse(formattedIdTextField.getText()).longValue();
					firstNumber = numberFormat.parse(formattedFirstTextField.getText()).byteValue();
					secondNumber = numberFormat.parse(formattedSecondTextField.getText()).byteValue();
					thirdNumber = numberFormat.parse(formattedThirdTextField.getText()).byteValue();
					fourthNumber = numberFormat.parse(formattedFourthTextField.getText()).byteValue();
					fifthNumber = numberFormat.parse(formattedFifthTextField.getText()).byteValue();
					
				} catch (ParseException ex) {
					JOptionPane.showMessageDialog(null, "Error parsing!");
					ex.printStackTrace();
				}

				if (formattedIdTextField.getText() == null || formattedIdTextField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter an Id!");
					
				} else if (formattedFirstTextField.getText() == null || 
						formattedFirstTextField.getText().equals("") ||
						firstNumber < 1 || firstNumber >30) {
							JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 30!");	
				} else if (formattedSecondTextField.getText() == null || 
						formattedSecondTextField.getText().equals("") ||
						secondNumber < 1 || secondNumber >30)
						 {
					JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 30!");
					
				} else if (formattedThirdTextField.getText() == null || 
						formattedThirdTextField.getText().equals("") ||
						thirdNumber < 1 || thirdNumber > 30) {
					JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 30!");
					
				} else if(formattedFourthTextField.getText() == null || 
						formattedFourthTextField.getText().equals("") ||
						fourthNumber < 1 || fourthNumber > 30) {
					JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 30!");
					
				} else if(formattedFifthTextField.getText() == null || 
						formattedFifthTextField.getText().equals("") ||
						fifthNumber < 1 || fifthNumber >30) {
					JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 30!");
					
				} else {
					mainPlayer.setId(id);
					mainPlayer.setFirstNumber(firstNumber);
					mainPlayer.setSecondNumber(secondNumber);
					mainPlayer.setThirdNumber(thirdNumber);
					mainPlayer.setFourthNumber(fourthNumber);
					mainPlayer.setFifthNumber(fifthNumber);
					setVisible(false);
				}
			}
		});
		btnNewButton.setBounds(36, 251, 159, 50);
		getContentPane().add(btnNewButton);


	}
}