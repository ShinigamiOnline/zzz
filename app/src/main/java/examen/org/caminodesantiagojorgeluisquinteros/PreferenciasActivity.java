package examen.org.caminodesantiagojorgeluisquinteros;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Vespertino on 20/02/2018.
 */

public class PreferenciasActivity extends Activity{
    @Override
    protected void onCreate (Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        getFragmentManager().beginTransaction().replace(android.R.id.content,new PreferenciasFragment()).commit();
    }
}
