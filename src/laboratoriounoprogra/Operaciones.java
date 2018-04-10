/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratoriounoprogra;

import java.util.ArrayList;
import java.util.List;
import static laboratoriounoprogra.Fruta.LIMON;
import static laboratoriounoprogra.Fruta.MANZANA;
import static laboratoriounoprogra.Fruta.MELON;
import static laboratoriounoprogra.Fruta.NARANJA;
import static laboratoriounoprogra.Fruta.PERA;

/**
 *
 * @author daniela
 */
public class Operaciones {

    private ArrayList listaFrutas;
    private ArrayList listaUno;
    private ArrayList listaDos;
    private ArrayList listaTres;
    private ArrayList listaCuatro;
    private ArrayList listaCinco;
    private ArrayList filaColumna;
    
    
    
    public Operaciones() {
    
    this.listaFrutas = new ArrayList();
    this.filaColumna  = new ArrayList();
    this.listaUno  = new ArrayList();
    this.listaDos  = new ArrayList();
    this.listaTres  = new ArrayList();
    this.listaCuatro  = new ArrayList();
    this.listaCinco  = new ArrayList();
   
    inicializarLista();
        
    }

    public ArrayList getFilaColumna() {
        return filaColumna;
    }

    public void setFilaColumna(ArrayList filaColumna) {
        this.filaColumna = filaColumna;
    }
    
    

    public void inicializarLista() {
        listaUno.add(0, PERA.name());
        listaUno.add(1, MELON.name());
        listaUno.add(2, NARANJA.name());
        listaUno.add(3, LIMON.name());
        listaUno.add(4, MANZANA.name());
//
        listaDos.add(0, MELON.name());
        listaDos.add(1, MANZANA.name());
        listaDos.add(2, NARANJA.name());
        listaDos.add(3, LIMON.name());
        listaDos.add(4, PERA.name() );

        listaTres.add(0, NARANJA.name());
        listaTres.add(1, PERA.name());
        listaTres.add(2, LIMON.name());
        listaTres.add(3, MANZANA.name());
        listaTres.add(4, MELON.name());

        listaCuatro.add(0, MANZANA.name());
        listaCuatro.add(1, PERA.name());
        listaCuatro.add(2, NARANJA.name());
        listaCuatro.add(3, MELON.name());
        listaCuatro.add(4, LIMON.name());

        listaCinco.add(0, LIMON.name());
        listaCinco.add(1, MELON.name());
        listaCinco.add(2, PERA.name());
        listaCinco.add(3, MANZANA.name());
        listaCinco.add(4, NARANJA.name());

        filaColumna.add(0, PERA.name());
        filaColumna.add(1, MANZANA.name());
        filaColumna.add(2, LIMON.name());
        filaColumna.add(3, MELON.name());
        filaColumna.add(4, NARANJA.name());

        this.listaFrutas.add(0, listaUno);
        this.listaFrutas.add(1, listaDos);
        this.listaFrutas.add(2, listaTres);
        this.listaFrutas.add(3, listaCuatro);
        this.listaFrutas.add(4, listaCinco);

    }

//    public String sumar(String fruta) {
//        String resultado = "";
//
//        if (fruta.equalsIgnoreCase("Pera")) {
//            resultado = "Pera";
//        }else if(fruta.equalsIgnoreCase("Manzana")){
//                resultado= "Melon";
//        }else if(fruta.equalsIgnoreCase("Limon")){
//            resultado = "Naranja";
//        }else if(fruta.equalsIgnoreCase("Melon")){
//            resultado="Limon";
//        }else if(fruta.equalsIgnoreCase("Naranja")){
//        resultado="Manzana";
//    }
//      return resultado;
//    }
    public String sumar(String frutaUno, String frutaDos) {
        
        
        String resultado = "";
        ArrayList listaTemp = new ArrayList();
        String listaPosicion = "";

        for (int i = 0; i < filaColumna.size(); i++) {
            
            if (frutaUno.equalsIgnoreCase((String) filaColumna.get(i))) {
             
                listaTemp = (ArrayList) listaFrutas.get(i);
         
                for (int j = 0; j < listaTemp.size(); j++) {
            
                    if (frutaDos.equalsIgnoreCase((String) filaColumna.get(j))) {
                 
                        listaPosicion = (String) listaTemp.get(j);
                
                        resultado = listaPosicion;
                      
   
                    }
                }
            }
        }
        return resultado;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

}
