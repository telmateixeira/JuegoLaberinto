/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructores;

/**
 *
 * @author Diurno
 */
public class PalabrasComandos {
    private Comandos comando;

    public PalabrasComandos(Comandos comando) {
        this.comando = comando;
    }
    
    public boolean esComando(String com){
        if (com.equalsIgnoreCase(Comandos.ayuda.toString()) || com.equalsIgnoreCase(Comandos.fin.toString())
               || com.equalsIgnoreCase(Comandos.ir.toString()) || com.equalsIgnoreCase(Comandos.luz.toString())) {
            return true;
        }
        return false;
    }

    public String mostrarTodos(){
    
        return null;
    
    }
    
    
}
