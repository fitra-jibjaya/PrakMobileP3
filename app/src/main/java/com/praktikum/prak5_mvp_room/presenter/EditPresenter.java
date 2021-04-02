package com.praktikum.prak5_mvp_room.presenter;

import com.praktikum.prak5_mvp_room.database.entity.Person;

public interface EditPresenter {

    void save(Person person);

    boolean validate(Person person);

    void  getPerson(long id);

    void update(Person person);
}
