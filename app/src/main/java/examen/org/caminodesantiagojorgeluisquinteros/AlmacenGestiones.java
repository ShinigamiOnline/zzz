package examen.org.caminodesantiagojorgeluisquinteros;

import java.util.Vector;

/**
 * Created by Vespertino on 20/02/2018.
 */

public interface AlmacenGestiones {
     void guardarGestiones(int puntos,String nombre,long fecha);
     Vector<String> listaGestiones(int cantidad);
}
