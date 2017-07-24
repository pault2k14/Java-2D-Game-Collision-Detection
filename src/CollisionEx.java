import com.sun.xml.internal.bind.v2.util.CollisionCheckStack;

import javax.swing.*;

/**
 * Created by Paul on 7/23/2017.
 */

import java.awt.EventQueue;
import java.util.Collections;
import javax.swing.JFrame;

public class CollisionEx extends JFrame {

    public CollisionEx() {
        initUI();
    }

    private void initUI() {

        add(new Board());

        setResizable(false);
        pack();

        setTitle("Collision");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                CollisionEx ex = new CollisionEx();
                ex.setVisible(true);
            }
        });
    }

}
