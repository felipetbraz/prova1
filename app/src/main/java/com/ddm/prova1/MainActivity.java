package com.ddm.prova1;

import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity{
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private TextView textView5;
    private TextView textView6;
    List<Aluno> listaDeAlunos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = findViewById(R.id.aluno1);
        textView2 = findViewById(R.id.aluno2);
        textView3 = findViewById(R.id.aluno3);
        textView4 = findViewById(R.id.nota1);
        textView5 = findViewById(R.id.nota2);
        textView6 = findViewById(R.id.nota3);
        buscaDados();
    }

    private void buscaDados(){
        RetrofitService.getServico().getAlunos().enqueue(new Callback<List<Aluno>>() {
            @Override
            public void onResponse(Call<List<Aluno>> call, Response<List<Aluno>> response) {
                listaDeAlunos = response.body();
                textView1.setText(listaDeAlunos.get(0).getNome());
                textView2.setText(listaDeAlunos.get(1).getNome());
                textView3.setText(listaDeAlunos.get(2).getNome());
                textView4.setText(listaDeAlunos.get(0).getNota().toString());
                textView5.setText(listaDeAlunos.get(1).getNota().toString());
                textView6.setText(listaDeAlunos.get(2).getNota().toString());
            }

            @Override
            public void onFailure(Call<List<Aluno>> call, Throwable t) {

            }
        });
    }
}
