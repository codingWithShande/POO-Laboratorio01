/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sirshande.guiado;

/**
 *
 * @author Administrator
 */
public class Empleados {
    //Atributos
    String codigo;
    String nombre;
    String area;
    double sueldoBase;
    double horasExtras;
    String tipo_seg;
    //Valores comunes a todos  los objetos
    private static double porc_Afp=0.11;
    private static double porc_Snp=0.06;
    private static double porc_Essalud=0.03;
    private static int contador=0;
    //Constructor

    public Empleados(String codigo, String nombre, String area, double sueldoBase, double horasExtras, String seguro) {
        contador++; //contando la cantidad de empleados generados con la clase
        //actualizando la informacion de los atributos de la clase
        this.codigo = codigo;
        this.nombre = nombre;
        this.area = area;
        this.sueldoBase = sueldoBase;
        this.horasExtras = horasExtras;
        this.tipo_seg = seguro;
    }
    //********************METODO ADICIONAL**********************
    //Calculando el monto  extra
    public double montoHExtras(){
        return sueldoBase * horasExtras  / 240;
    }
    //Calculando el monto de seguro
    public double montoSeguro(){
        if(tipo_seg.equalsIgnoreCase("AFP"))
            return sueldoBase * porc_Afp;
        if(tipo_seg.equalsIgnoreCase("SNP"))
            return sueldoBase * porc_Snp;
        return 0;
    }
    
    //Calculando el monto de Essalud
    public double montoEssalud(){
        return sueldoBase * porc_Essalud;
    }
    //Calculando el monto de Descuentos
    public double montoDescuentos(){
        return montoSeguro() + montoEssalud();
    }
    public double sueldoBruto(){
        return sueldoBase + montoHExtras();
    }
    public double sueldoNeto(){
        return sueldoBruto() - montoDescuentos();
    }
    public static int getContador(){
        return contador;
    }
    
}
