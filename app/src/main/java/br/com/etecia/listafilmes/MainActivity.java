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

    //criar a base de dados para os filmes

    String titulo [] = {"Ragnarok", "Incriminada","Piranha","A Presa","Viveiro","Patrulha Canina"};
    String descricao [] = {"Um arqueólogo fica obcecado pelos escritos encontrados em um navio viking, que podem solucionar o mistério de Ragnarok Porém, durante suas buscas, ele acaba despertando acidentalmente um monstro gigantesco.",
    "Annie decide usar o carro do marido durante uma viagem repentina que ele fez trabalho. Ao ser parada pela polícia, ela é surpreendida ao encontrarem uma faca ensanguentada na parte de trás do veículo.",
    "Um acidente geologico nas produndezas da agua despertou uma especie de piranha extinta ha milhoes de anos. Agora tudo indica que um cardume podera invadir o lago de uma pacata cidade comandada pela Xerife Julie (Elisabeth Shue).",
    "Para escapar de um trauma, um policial aposentado se muda para um vilarejo que não consta do mapa. Logo ele irá descobrir que a aparente paz do lugar esconde algo muito sombrio.",
    "Enquanto procuram pela casa ideal para que possam morar juntos, um casal se vê preso em um complicado labirinto feito de moradas idênticas entre si. Quando eles percebem que o local não é nada do que imaginavam, pode ser tarde demais.",
    "A Patrulha Canina está em alta... em sua primeira aventura na tela grande! Com a ajuda de um novo filhote, Liberty, a PAW Patrol luta para salvar os cidadãos de Adventure City de seu rival, Humdinger."};

    String acesso [] = {"4.5","4.0","2.5","3.0","3.0","4.0"};
    int filmes [] = {R.drawable.ragnarok,
            R.drawable.incriminada,
    R.drawable.piranha,
    R.drawable.presa,
    R.drawable.viveiro,
    R.drawable.cachorro};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaFilmes = findViewById(R.id.idlistaFilmes);

        MyAdapter adapter  = new MyAdapter();

        //preparar para instanciar o adaptador
        listaFilmes.setAdapter(adapter);

    }
    //criando uma inner class MyAdapter

    public class MyAdapter extends BaseAdapter {


        @Override
        public int getCount() {
            return filmes.length;
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
            tituloFilme.setText(titulo[i]);
            descricaoFilme.setText(descricao[i]);
            acessoFilme.setText(acesso[i]);
            imagemFilme.setImageResource(filmes[i]);



            return v;
        }
    }
}





















