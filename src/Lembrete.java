import javax.swing.JOptionPane;

public class Lembrete {
    private String mensagem;

    public Lembrete(String mensagem) {
        this.mensagem = mensagem;
    }

    public void exibir() {
        JOptionPane.showMessageDialog(null, mensagem, "Lembrete", JOptionPane.INFORMATION_MESSAGE);
    }
}

