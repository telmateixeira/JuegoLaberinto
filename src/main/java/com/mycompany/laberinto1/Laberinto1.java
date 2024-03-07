/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laberinto1;

import constructores.Comandos;
import constructores.PalabrasComandos;

/**
 *
 * @author Diurno
 */
public class Laberinto1 {

    public static void main(String[] args) {
        PalabrasComandos p = new PalabrasComandos(Comandos.fin);
        System.out.println(p.esComando("ayuda"));
    }
}
