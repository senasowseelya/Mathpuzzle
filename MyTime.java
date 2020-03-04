
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.JOptionPane;


public class MyTime{
	

    public static void updateLabel(JLabel countdownLabel,int countdown) {
        //final JFrame frm = new JFrame("Countdown");
        //final JLabel countdownLabel = new JLabel("03:00");
        final Timer t = new Timer(1000, new ActionListener() {
            int time = countdown;
            @Override
            public void actionPerformed(ActionEvent e) {
                time--;
                countdownLabel.setText(format(time / 60) + ":" + format(time % 60));
                if (time == 0) {
                    final Timer timer = (Timer) e.getSource();
					timer.stop();
					

 					
					//prompt which shows time up and exits the program.
					int choice = JOptionPane.showConfirmDialog(null, "Time Exhausted :(", "Game Over", JOptionPane.OK_CANCEL_OPTION);
					if (choice == JOptionPane.OK_OPTION || choice == JOptionPane.CANCEL_OPTION){
						System.exit(0);
					}
					
					
                }
            }
        });
        t.start();
		
        

    }

    private static String format(int i) {
        String result = String.valueOf(i);
        if (result.length() == 1) {
            result = "0" + result;
        }
        return result;
    }
	
}

		


