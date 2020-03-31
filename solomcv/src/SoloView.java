import java.awt.event.ActionListener;
import javax.swing.*;
public class SoloView extends JFrame {
    private JTextField firstNumber = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton = new JButton("alternativ 1");
    private JButton storyButton = new JButton("alternativ 2");
    private JLabel label1 = new JLabel("info1afshbajbhafsghjfgsahjghjasfghfsa adsiuhfiuahfi aufhaiushfioahufsais fh aiusfh aius fhaisu hfiaushfioaugfisbgaio gf siadoufisagf iysdfiygasfi isad gfisafgoi");


    private JTextField calcSolution = new JTextField(10);

    SoloView() {
        // Sets up the view and adds the components
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);
        calcPanel.add(label1);
        calcPanel.add(calculateButton);
        calcPanel.add(storyButton);


        this.add(calcPanel);
        // End of setting up the components --------
    }

    public int getFirstNumber() {
        return Integer.parseInt(firstNumber.getText());
    }

    public int getSecondNumber() {
        return Integer.parseInt(secondNumber.getText());
    }

    public int getCalcSolution() {
        return Integer.parseInt(calcSolution.getText());
    }

    public void setCalcSolution(int solution) {
        calcSolution.setText(Integer.toString(solution));
    }

    // If the calculateButton is clicked execute a method
    // in the Controller named actionPerformed
    void addCalculateListener(ActionListener listenForCalcButton) {
        calculateButton.addActionListener(listenForCalcButton);
        storyButton.addActionListener(listenForCalcButton);
    }

    // Open a popup that contains the error message passed
    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}