/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adrián
 */
public class MateriaPrima {
    private int patatas;
    private int pulpo;
    private int clientes;
    
    public void añadirPulpo(int x){
       float maspulpo=pulpo+ x;   
    }
    public void añadirPatatas(int x){
        float maspatatas = patatas + x;
    }
    public int amosarPulpo(int pulpo){
        return pulpo;
    }
    public int amosarPatatas(int patata){
        return patata;
    }
    public int capacidadPulpoClientes(int pulpo){
        ;
        return pulpo/3;    
    }
    public int capacidadPatatasClientes (int patatas){
        
        return patatas/3;
    }
}
