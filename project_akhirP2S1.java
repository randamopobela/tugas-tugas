import javax.swing.*;
import java.util.Arrays;

public class Sorting {

    static int angka;
    static int[] nilaiArray;

    private JPanel SortingPanel;
    private JTextField tfBilanganAcak;
    private JButton acakAngkaButton;
    private JButton sortingAscendingButton;
    private JButton sortingDescendingButton;
    private JButton keluarButton;
    private JTextField tfAscending;
    private JTextField tfDescending;
    private JTextField tfAngka;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mengurutkan Bilangan Genap");
        frame.setContentPane(new Sorting().SortingPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Sorting() {
        acakAngkaButton.addActionListener(e -> {
            angka = Integer.parseInt(tfAngka.getText());
            nilaiArray = new int[angka];

            for (int i = 0; i < nilaiArray.length; i++) {
                int acak = (int) (Math.random() * 21);
                if (acak % 2 == 0 && acak > 0) {
                    nilaiArray[i] = acak;
                }
                else {
                    i--;
                }
            }

            tfBilanganAcak.setText(Arrays.toString(nilaiArray));
            tfAscending.setText("");
            tfDescending.setText("");

        });
        sortingAscendingButton.addActionListener(e -> {
            tfAscending.setText("");
            for(int i = 0; i < nilaiArray.length; i++) {
                for(int j = i+1; j < nilaiArray.length; j++) {
                    if(nilaiArray[i] > nilaiArray[j]) {
                        int temp = nilaiArray[i];
                        nilaiArray[i] = nilaiArray[j];
                        nilaiArray[j] = temp;
                    }
                }
            }

            tfAscending.setText(Arrays.toString(nilaiArray));

        });
        sortingDescendingButton.addActionListener(e -> {
            tfDescending.setText("");
            for(int i = 0; i < nilaiArray.length; i++) {
                for(int j = i+1; j < nilaiArray.length; j++) {
                    if(nilaiArray[i] < nilaiArray[j]) {
                        int temp = nilaiArray[i];
                        nilaiArray[i] = nilaiArray[j];
                        nilaiArray[j] = temp;
                    }
                }
            }

            tfDescending.setText(Arrays.toString(nilaiArray));

        });
        keluarButton.addActionListener(e -> System.exit(0));
    }
}
