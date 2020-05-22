import java.util.logging.Level;
import java.util.logging.Logger;

public class CarController {
    public static void main(String[] args) throws InterruptedException {
        CarShooters c1 = new CarShooters(400,400,"Left");
        c1.start();
       /* new Thread() {
            public void run() {
                try {
                    c1.calculateVeloc();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();*/

       /* new Thread() {
            public void run() {
                try {
                    c1.calculatePosition();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();*/

        new Thread() {
            public void run() {
                try {
                    c1.calculateTotalVel();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
        new Thread() {
            public void run() {
                try {
                    c1.run2();
                } catch (InterruptedException ex) {
                    Logger.getLogger(CarController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.start();
       /* new Thread() {
            public void run() {
                try {
                    c1.run2();
                } catch (InterruptedException ex) {
                    Logger.getLogger(CarController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.start();*/
    }

}

