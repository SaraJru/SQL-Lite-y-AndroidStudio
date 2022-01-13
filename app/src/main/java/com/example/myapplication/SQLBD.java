package com.example.myapplication;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class SQLBD extends SQLiteOpenHelper {

    private static final String NOMBRE_BD = "sqlumg.bd";
    private static final int VERSION_BD = 1;
    private static final String TABLA_INSCRIPCIONESS = "CREATE TABLE INSCRIPCIONES(CARNE int PRIMARY KEY,NOMBRES TEXT, APELLIDOS TEXT, CARRERA TEXT)";
    private static final String TABLA_PROFESORES = "CREATE TABLE PROFESORES(IDPROFESOR int PRIMARY KEY, NOMBRESPROF TEXT, APELLIDOSPROF TEXT, FACULTAD TEXT)";
    private static final String TABLA_CURSOS = "CREATE TABLE CURSOS(CODIGO TEXT PRIMARY KEY, CURSO TEXT, CARRERA TEXT)";

    public SQLBD(@Nullable Context context) {
        super(context, NOMBRE_BD, null, VERSION_BD);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(TABLA_INSCRIPCIONESS);
        sqLiteDatabase.execSQL(TABLA_PROFESORES);
        sqLiteDatabase.execSQL(TABLA_CURSOS);
    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLA_INSCRIPCIONESS);
        sqLiteDatabase.execSQL(TABLA_INSCRIPCIONESS);

        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLA_PROFESORES);
        sqLiteDatabase.execSQL(TABLA_PROFESORES);

        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLA_CURSOS);
        sqLiteDatabase.execSQL(TABLA_CURSOS);

    }

    public void inscribirEstudiantes(String nombres, String apellidos, String carne, String carrera) {
        SQLiteDatabase bd1 = getWritableDatabase();
        if (bd1 != null) {
            bd1.execSQL("INSERT INTO INSCRIPCIONES VALUES('" + nombres + "','" + apellidos + "','" + carne + "','" + carrera + "')");
            bd1.close();
        }
    }

    public void agregarProf(String ID, String nomProf, String apellidosProf, String facultad) {
        SQLiteDatabase bd = getWritableDatabase();
        if (bd != null) {
            bd.execSQL("INSERT INTO PROFESORES VALUES ('" + ID + "','" + nomProf + "','" + apellidosProf + "','" + facultad + "')");
            bd.close();
        }
    }

    public void agregarCursos(String codigo, String curso, String carrera) {
        SQLiteDatabase bd1 = getWritableDatabase();
        if (bd1 != null) {
            bd1.execSQL("INSERT INTO CURSOS VALUES('" + codigo + "','" + curso + "','" + carrera + "')");
            bd1.close();
        }
    }

    public List<EstudiantesModelo> mostrarEstudiantes() {
        SQLiteDatabase bd1 = getReadableDatabase();
        Cursor cursor = bd1.rawQuery("SELECT * FROM INSCRIPCIONES", null);
        List<EstudiantesModelo> estudiantes = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {
                estudiantes.add(new EstudiantesModelo(cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3)));
            } while (cursor.moveToNext());
        }
        return estudiantes;
    }

    public List<ProfesoresModelo> mostrarProfesores() {
        SQLiteDatabase bd = getReadableDatabase();
        Cursor cursor = bd.rawQuery("SELECT * FROM PROFESORES", null);
        List<ProfesoresModelo> profesores = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {
                profesores.add(new ProfesoresModelo(cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3)));
            } while (cursor.moveToNext());
        }
        return profesores;
    }
}