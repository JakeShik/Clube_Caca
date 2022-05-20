package com.example.clube_caca

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class BdClubeHelper(context: Context?)
    : SQLiteOpenHelper(context, NOME_BASE_DADOS, null, VERSAO_BASE_DADOS){
    /**
     * Called when the database is created for the first time. This is where the
     * creation of tables and the initial population of the tables should happen.
     *
     * @param db The database.
     */
    override fun onCreate(db: SQLiteDatabase?) {
        if (db != null) {
            TabelaRegiao(db).cria()
            TabelaEquipas(db).cria()
            TabelaAnimais(db).cria() // Está a apresentar erros nos testes.
        }
    }

    /**
     * Called when the database needs to be upgraded. The implementation
     * should use this method to drop tables, add tables, or do anything else it
     * needs to upgrade to the new schema version.
     *
     *
     *
     * The SQLite ALTER TABLE documentation can be found
     * [here](http://sqlite.org/lang_altertable.html). If you add new columns
     * you can use ALTER TABLE to insert them into a live table. If you rename or remove columns
     * you can use ALTER TABLE to rename the old table, then create the new table and then
     * populate the new table with the contents of the old table.
     *
     *
     * This method executes within a transaction.  If an exception is thrown, all changes
     * will automatically be rolled back.
     *
     *
     * @param db The database.
     * @param oldVersion The old database version.
     * @param newVersion The new database version.
     */
    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        /* db.execSQL("DROP TABLE IF EXISTS "+TabelaVacinas);
         onCreate(db)*/
    }

    companion object {
        const val NOME_BASE_DADOS = "clubecaca.db"
        const val VERSAO_BASE_DADOS = 1
    }
}
