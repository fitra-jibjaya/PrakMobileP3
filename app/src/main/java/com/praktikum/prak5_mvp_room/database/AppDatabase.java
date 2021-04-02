package com.praktikum.prak5_mvp_room.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.praktikum.prak5_mvp_room.database.dao.PersonDao;
import com.praktikum.prak5_mvp_room.database.entity.Person;

@Database(entities = {Person.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase INSTANCE;

    public static AppDatabase getDatabase(Context context){
        if (INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    AppDatabase.class, "database")
                    .allowMainThreadQueries() //supaya querynya bisa terpanggil di thread main
                    .build();
        }
        return INSTANCE;
    }

    public abstract PersonDao personDao();
}
