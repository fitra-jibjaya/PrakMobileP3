package com.praktikum.prak5_mvp_room.presenter;

import com.praktikum.prak5_mvp_room.database.entity.Person;

public interface EditView {

    void showErrorMessage(int id);

    void clearPreError();

    void populate(Person person);
}
