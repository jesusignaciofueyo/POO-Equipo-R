/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.jfueyo.r1;

/**
 * Esta clase representará la tarjeta, el monedero electronico. Puede crearse un
 * monedero electrónico con un cliente asociado o sin cliente.
 *
 * @author
 */
public class MonederoElectronico {
    
    //Atributos
    /**
     * ID_MONEDERO: El id de la tarjeta
     * saldo: El saldo que tenga el monedero
     * idCliente: El cliente que poseé la tarjeta
     */
    private final int ID_MONEDERO;
    private double saldo;
    private int idCliente;
        
    // Metodos
    /**
     * Constructor que solo recibe el id del monedero
     * @param idMonedero int que representa el id del monedero
     */
    public MonederoElectronico(int idMonedero){
        this.ID_MONEDERO = idMonedero;
        this.saldo = 0;
    }
    
    /**
     * Constructor que recibe id del monedero y del cliente
     * @param idMonedero int que representa el id del monedero
     * @param idCliente int que representa el id del cliente
     */
    public MonederoElectronico (int idMonedero, int idCliente){
        this.ID_MONEDERO = idMonedero;
        this.idCliente = idCliente;        
        this.saldo = 0;
    }
    
    /**
     * Metodo para conocer el ID del monedero
     * @return int que representa el ID del monedero
     */
    public int getIDMonedero(){
        return this.ID_MONEDERO;
    }
    
    /**
     * Metodo para conocer el saldo que tiene el monedero
     * @return double que representa el saldo en la tarjeta
     */
    public double getSaldo(){
        return this.saldo;
    }
    
    /**
     * Método para conocer quién es el cliente que posee el monedero
     * @return int que representa el ID del cliente que posee el monedero
     */
    public int getIDCliente(){
       return this.idCliente; 
    }
    
    /**
     * Método para asignarle al monedero un cliente
     * @param idCliente int que represente el ID del Cliente a quien se le asignará
     *          esta tarjeta
     */
    public void setIDCliente(int idCliente){
        this.idCliente = idCliente;
    }
    
    /**
     * Método para depositar Saldo. Verifica que el monto recibido sea positivo y diferente de 0
     * @param monto double que sea la cantidad a depositar
     * @return True si el depósito se realizó (viendo que el monto sea mayor a 0),
     *      False, en caso contrario
     */
    public boolean depositarSaldo(double monto){
        boolean siDeposito = true;        
        if (monto > 0){
            this.saldo = this.saldo + monto;
        } else{
            siDeposito = false;
        }        
        return siDeposito;
    }
    
    /**
     * Método para retirar o sacar saldo de la tarjeta. Verifica si hay suficiente saldo para 
     * el retiro que se requiere (devolviendo un booleano si se hizo la operación o no)
     * @param monto double con la cantidad a "retirar" de la tarjeta
     * @return True si la transacción se cumplió con éxito (que hubiera fondos para la
     *          cantidad que se quería "retirar"), False en caso contrario.
     */
    public boolean retirarSaldo(double monto){
        boolean siRetiro = true;        
        if (monto <= this.saldo){
            this.saldo = this.saldo - monto;
        } else{
            siRetiro = false;
        }
        return siRetiro;
    }
    
    
}
