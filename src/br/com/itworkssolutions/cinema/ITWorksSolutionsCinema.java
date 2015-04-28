package br.com.itworkssolutions.cinema;

import br.com.itworkssolutions.cinema.views.FormMenuPrincipal;
import javax.swing.JFrame;

/**
 *
 * @author ITWorksSolutions
 */
public class ITWorksSolutionsCinema {

    public static void main(String[] args) {
        FormMenuPrincipal frmp = new FormMenuPrincipal();
        frmp.setVisible(true);
        frmp.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
