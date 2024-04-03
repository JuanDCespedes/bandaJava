/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.JuanDCespedes.banda.principal;
import co.com.JuanDCespedes.banda.logica.Banda;
import co.com.JuanDCespedes.banda.logica.Instrumento;
/**
 *
 * @author Estudiantes
 */
public class Test {
    public static void main(String[] args){
        Banda b=new Banda();
        b.conformarBanda(5);
        b.afinarBanda();
        b.tocarBanda();
}
}
