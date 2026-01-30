import java.applet.Applet;
import java.awt.Graphics;

public class BlueprintApplet extends Applet {

    public void paint(Graphics g) {
        g.drawRect(50, 50, 200, 100);   // Room
        g.drawOval(300, 50, 50, 50);    // Vent
        g.drawLine(50, 200, 250, 200);  // Wall
        g.drawLine(250, 200, 350, 250); // Wall
    }
}
