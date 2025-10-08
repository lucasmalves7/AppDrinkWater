import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Agendador {
    private Timer timer;

    public void iniciar(int intervaloMinutos, Lembrete lembrete) {
        int intervaloMillis = intervaloMinutos * 60 * 1000;

        timer = new Timer(intervaloMillis, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lembrete.exibir();
            }
        });

        timer.setInitialDelay(0); // dispara imediatamente
        timer.start();
    }

    public void parar() {
        if (timer != null) {
            timer.stop();
        }
    }
}