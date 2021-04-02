package com.praktikum.prak5_mvp_room.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.praktikum.prak5_mvp_room.database.entity.Person;

import java.util.List;

@Dao
public interface PersonDao {

    // Di interface ini berisi query-query untuk mengakses entitas yang telah kita isi sebelumnya

    // Ini adalah query-query yang otomatis tersedia dari library dari room database
    @Insert
    void insertPerson(Person person);

    @Update
    void update(Person person);

    @Delete
    void delete(Person person);

    // Ini adalah query manual yang kita definisikan sendiri
    @Query("SELECT * FROM person")
    List<Person> getAll();

    @Query("SELECT * FROM person WHERE id=:id")
    Person finPerson(long id);
}
