package signs.studio.com.signs;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView signsList;

    private String[] signs = {
            "Áries", "Touro", "Gêmeos", "Cancêr", "Leão", "Virgem",
            "Libra", "Escorpião", "Sagitário", "Capricórnio", "Aquário", "Peixes"
    };

    private String[] profiles = {
            "Vive de orgulho e morre de saudade.", "Good vibes tipo de maconha.", "Chora feito uma sanfona.",
            "O famigerado gama fácil.", "Paga de durão, mas no fundo é molenguinha.",
            "Chato que dói, sem risadinha com eles.", "Nada de negro drama, só papo reto.",
            "Se defende com o rabo e curte uma potaria.", "Já chega e passa a visão sem enrolação.",
            "Paga de difícil, mas é só pegar com jeitinho.", "Mau amado que só curte noitada",
            "Qualquer lágrima de crocodilo já convence esse aí."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signsList = (ListView) findViewById(R.id.listViewId);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signs
        );

        signsList.setAdapter(adapter);

        signsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(getApplicationContext(), profiles[i], Toast.LENGTH_LONG).show();

            }
        });


    }
}
