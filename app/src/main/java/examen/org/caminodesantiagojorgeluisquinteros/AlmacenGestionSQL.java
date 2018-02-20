package examen.org.caminodesantiagojorgeluisquinteros;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.Vector;

/**
 * Created by Vespertino on 20/02/2018.
 */

public class AlmacenGestionSQL extends SQLiteOpenHelper implements AlmacenGestiones {

    public AlmacenGestionSQL(Context context) {
        super(context, "Gestion", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        //creamos la tabla municipio.
        db.execSQL("CREATE TABLE municipio (" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT, "+
                "nombre TEXT,habitantes INTEGER, descripcionMunicipio INTEGER)");

    //creamos la tabla albergue.

            db.execSQL("CREATE TABLE albergue (" +
                    "_id INTEGER PRIMARY KEY AUTOINCREMENT, "+
                    "descipcion TEXT,valoracion INTEGER, precio BOOLEAN,id_Municipio INTEGER)");


            db.execSQL("Create table monumento("+
                    "_id INTEGER PRIMARY KEY AUTOINCREMENT,nombre TEXT," +
                    "descripcion TEXT,horario TEXT,precioEntrada BOOLEAN, id_Municipio INTEGER)" );
    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    @Override
    public void guardarGestiones(int puntos, String nombre, long fecha) {

    }

    @Override
    public Vector<String> listaGestiones(int cantidad) {
        return null;
    }
}
