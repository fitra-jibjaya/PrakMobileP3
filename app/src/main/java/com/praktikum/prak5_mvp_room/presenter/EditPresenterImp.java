package com.praktikum.prak5_mvp_room.presenter;

import com.praktikum.prak5_mvp_room.database.dao.PersonDao;
import com.praktikum.prak5_mvp_room.database.entity.Person;
import com.praktikum.prak5_mvp_room.utils.Constants;
import com.praktikum.prak5_mvp_room.utils.Util;

public class EditPresenterImp implements EditPresenter {

    private final EditView view;
    private final PersonDao personDao;

    public EditPresenterImp(EditView view, PersonDao personDao) {
        this.view = view;
        this.personDao = personDao;
    }

    @Override
    public void save(Person person) {
        this.personDao.insertPerson(person);
    }

    @Override
    public boolean validate(Person person) {
        if (person.getName().isEmpty() || !Util.isValidName(person.getName())){
            view.showErrorMessage(Constants.ID_NAME);
            return false;
        }
        if (person.getAddress().isEmpty()){
            view.showErrorMessage(Constants.ID_ADDRESS);
            return false;
        }
        if (person.getPhone().isEmpty() || !Util.isValidPhone(person.getPhone())){
            view.showErrorMessage(Constants.ID_PHONE);
            return false;
        }
        if (person.getEmail().isEmpty() || !Util.isValidEmail(person.getEmail())){
            view.showErrorMessage(Constants.ID_EMAIL);
            return false;
        }
        return true;
    }

    @Override
    public void getPerson(long id) {

    }

    @Override
    public void update(Person person) {

    }
}
