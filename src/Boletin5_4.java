/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;

/**
 *
 * @author Adrián
 */
public class Boletin5_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pulpo;
        int patatas;
       MateriaPrima restaurante = new MateriaPrima();
       pulpo = Integer.parseInt(JOptionPane.showInputDialog("Introducir cantidad de pulpo en kg: "));
       patatas = Integer.parseInt(JOptionPane.showInputDialog("Introducir cantidad de patatas en kg : "));
       restaurante.añadirPulpo(pulpo);
       restaurante.añadirPatatas(patatas);
       JOptionPane.showMessageDialog(null,"Grupo de 3 clientes que pueden comer pulpo hoy = "+ restaurante.capacidadPulpoClientes(pulpo));
       JOptionPane.showMessageDialog(null,"Grupo de 3 que pueden comer patatas hoy = "+ restaurante.capacidadPatatasClientes(patatas));
    }
    }
    

