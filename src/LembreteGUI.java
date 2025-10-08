import javax.swing.*;
import java.awt.*;

public class LembreteGUI extends JFrame {
    private JTextField campoIntervalo;
    private JButton botaoIniciar;
    private JLabel status;
    private Agendador agendador;

    public LembreteGUI() {
        super("Lembrete de Beber Água 💧");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new FlowLayout());

        campoIntervalo = new JTextField(10);
        campoIntervalo.setText("30");

        botaoIniciar = new JButton("Iniciar Lembrete");
        status = new JLabel("⏳ Aguardando início...");

        agendador = new Agendador();

        botaoIniciar.addActionListener(e -> {
            try {
                int intervalo = Integer.parseInt(campoIntervalo.getText());
                Lembrete lembrete = new Lembrete("Hora de beber água! 💧");
                agendador.iniciar(intervalo, lembrete);
                status.setText("✅ Lembrete a cada " + intervalo + " minutos.");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Digite um número válido!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });

        add(new JLabel("Intervalo (min):"));
        add(campoIntervalo);
        add(botaoIniciar);
        add(status);

        setVisible(true);
    }

    public static void main(String[] args) {
        new LembreteGUI();
    }
}
