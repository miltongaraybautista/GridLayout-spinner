package com.examplegrid.milton.girdlayout;
import java.util.ArrayList;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spMarca= (Spinner) findViewById(R.id.combobox);
        final ArrayList<Articulos2> articulos2 = new ArrayList<Articulos2>();
        ArrayList<String> marcaLista = new ArrayList<String>();

        Articulos2 art1 = new Articulos2("XP006200", "SOCOLOR.BEAUTY 6.3", "SOCOLOR", "SOCOLOR PIGMENTS", "SOCOLOR", 2, 74.00);
        Articulos2 art2 = new Articulos2("XP006200", "SOCOLOR.BEAUTY 6.3", "SOCOLOR", "SOCOLOR PIGMENTS", "SOCOLOR", 2, 74.00);
        Articulos2 art3 = new Articulos2("XP006200", "SOCOLOR.BEAUTY 6.3", "SOCOLOR", "SOCOLOR PIGMENTS", "SOCOLOR", 2, 74.00);
        Articulos2 art4 = new Articulos2("XP006200", "SOCOLOR.BEAUTY 6.3", "SOCOLOR", "SOCOLOR PIGMENTS", "SOCOLOR", 2, 74.00);
        Articulos2 art5 = new Articulos2("XP006100", "SOCOLOR.BEAUTY 6.0", "MASTER COLOR", "SOCOLOR PIGMENTS", "SOCOLOR", 2, 64.00);
        Articulos2 art6 = new Articulos2("XP006100", "SOCOLOR.BEAUTY 6.0", "MASTER COLOR", "SOCOLOR PIGMENTS", "SOCOLOR", 2, 64.00);
        Articulos2 art7 = new Articulos2("XP006100", "SOCOLOR.BEAUTY 6.0", "MASTER COLOR", "SOCOLOR PIGMENTS", "SOCOLOR", 2, 64.00);
        Articulos2 art8 = new Articulos2("XP006100", "SOCOLOR.BEAUTY 6.0", "MASTER COLOR", "SOCOLOR PIGMENTS", "SOCOLOR", 2, 64.00);
        articulos2.add(art1);
        articulos2.add(art2);
        articulos2.add(art3);
        articulos2.add(art4);
        articulos2.add(art5);
        articulos2.add(art6);
        articulos2.add(art7);
        articulos2.add(art8);

        marcaLista.add("Todas");
        for (int i=0; i < articulos2.size(); i++){
            if (!marcaLista.contains(articulos2.get(i).getMarca())){
                marcaLista.add(articulos2.get(i).getMarca());
            }
        }

        final GridView grilla = (GridView) findViewById(R.id.gv);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);


        ArrayAdapter<String> rubrosAdaptador = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, marcaLista);
        spMarca.setAdapter(rubrosAdaptador);

        spMarca.setOnItemSelectedListener(new OnItemSelectedListener() {



            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                Toast.makeText(arg0.getContext(), "Haz seleccionado " + arg0.getItemAtPosition(arg2).toString(), Toast.LENGTH_LONG).show();

                adapter.clear();

                for (int i=0; i<articulos2.size();i++){

                    if (arg0.getItemAtPosition(arg2).toString().equals("Todas")){
                        adapter.add(articulos2.get(i).getCodigo());
                        adapter.add(articulos2.get(i).getDescripcion());
                        adapter.add(articulos2.get(i).getPrecio().toString());
                    }

                    if (articulos2.get(i).getMarca().contains(arg0.getItemAtPosition(arg2).toString())){
                        adapter.add(articulos2.get(i).getCodigo());
                        adapter.add(articulos2.get(i).getDescripcion());
                        adapter.add(articulos2.get(i).getPrecio().toString());


                    }
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });

        grilla.setAdapter(adapter);
    }

}