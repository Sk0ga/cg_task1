package cs.vsu.ru.skogorev_m_a.gr12;

import javax.swing.*;

public class FrameMain extends JFrame {
    public FrameMain(){
        PanelDraw panel = new PanelDraw();
        this.add(panel);
        this.setSize(1024,768);
        this.setTitle("Primitives");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
