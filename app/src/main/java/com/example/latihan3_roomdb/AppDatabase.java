package com.example.latihan3_roomdb;

import androidx.room.Database;
import androidx.room.RoomDatabase;

/*
 * Nama : M Izzudin Wijaya
 * Nim : 10117152
 * Waktu : 1 Mei 2020, 13.36 WIB
 * */

@Database(entities = {AktivisEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract AktivisDao aktivisDao();
}