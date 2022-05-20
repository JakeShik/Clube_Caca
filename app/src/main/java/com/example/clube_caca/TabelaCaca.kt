package com.example.clube_caca

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaCaca(db: SQLiteDatabase) {
    private val db: SQLiteDatabase = db
    fun cria(){
        db.execSQL("CREATE TABLE ${NOME_TABELA} (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT, ${TabelaRegiao.CAMPO_NOME} TEXT NOT NULL, ${TabelaRegiao.MEDIA_ANIMAIS} INTEGER NOT NULL, ${TabelaRegiao.TAMANHO_ZONA} FLOAT NOT NULL, ${TabelaRegiao.ANIMAIS_ZONA} TEXT NOT NULL )")
    }

    companion object {
        const val NOME_TABELA = "Caça"
        const val REGIAO= "Regiao"
        const val MEDIA_ANIMAIS = "MediaAnimais"
        const val TAMANHO_ZONA = "TamanhoDaZona"
        const val ANIMAIS_ZONA = "NumeroHabitantesNaoVacinados"


        val TODAS_COLUNAS = arrayOf(BaseColumns._ID, REGIAO)
    }
}
