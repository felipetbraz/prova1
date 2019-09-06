package com.ddm.prova1;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface EndPoints {

    @GET("notas")
    Call<List<Aluno>> getAlunos();
}
