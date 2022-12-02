package br.com.etecia.listafilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView listaFilmes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaFilmes = findViewById(R.id.idlistaFilmes);

        MyAdapter adapter  = new MyAdapter();

        //preparar para instanciar o adaptador
        listaFilmes.setAdapter(Adaptador);

    }
    //criando uma inner class MyAdapter

    public class MyAdapter extends BaseAdapter {


        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            //Variaveis do modelo
            ImageView imagemFilme;
            TextView tituloFilme, descricaoFilme, acessoFilme;

            //Adaptador ligando ao modelo
            View v = getLayoutInflater().inflate(R.layout.modelo_filmes, null);

            //apresentando as variaveis do java para o modelo xml

            imagemFilme = v.findViewById(R.id.imgFilmes);
            tituloFilme = v.findViewById(R.id.txtTitulo);
            descricaoFilme = v.findViewById(R.id.txtDesc);
            acessoFilme = v.findViewById(R.id.txtNota);


            //inserindo os valores vas variáveis

            return null;
        }
    }
}





















