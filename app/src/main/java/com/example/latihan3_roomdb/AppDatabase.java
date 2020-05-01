package com.example.latihan3_roomdb;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {AktivisEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract AktivisDao aktivisDao();
}