package com.example.latihan3_roomdb;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

/*
 * Nama : M Izzudin Wijaya
 * Nim : 10117152
 * Waktu : 1 Mei 2020, 13.44 WIB
 * */

@Dao
public interface AktivisDao {
    @Insert
    void tambahAktivis(AktivisEntity aktivisEntity);

    @Delete
    public void hapusAktivis(AktivisEntity aktivisEntity);

    @Query("SELECT * FROM AktivisEntity")
    List<AktivisEntity> tampilSeluruhAktivis();

    @Query("SELECT * FROM AktivisEntity WHERE zonaTugas LIKE :zona")
    List<AktivisEntity> findByZone(String zona);
}
