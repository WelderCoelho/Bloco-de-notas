package com.welder.blocodenotas;

import android.content.Context;
import android.content.SharedPreferences;

public class anotacao {


    private Context contex;
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;
    private final String NOME_ARQUIVO = "anotacao.preferencias";
    private final String CHAVE_NOME = "nome";

    public anotacao(Context c) {
        this.contex = c;
        preferences = contex.getSharedPreferences(NOME_ARQUIVO, 0);
        editor = preferences.edit();


    }

    public  void salvarAnotacao(String anotacao){

        editor.putString(CHAVE_NOME, anotacao);
        editor.commit();


    }

    public String  recuperarAnotacao(){
        return preferences.getString(CHAVE_NOME,"");


    }
}
