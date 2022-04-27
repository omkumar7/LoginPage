package com.omkumar.service;

import com.omkumar.dao.UserDao;
import com.omkumar.model.C_Password;
import com.omkumar.model.Edit;
import org.springframework.beans.factory.annotation.Autowired;

import com.omkumar.model.Login;
import com.omkumar.model.User;

public class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  public int register(User user) {
    return userDao.register(user);
  }

  public User validateUser(Login login) {
    return userDao.validateUser(login);
  }

  public User validateUser1(C_Password password) {
    return userDao.validateUser1(password);
  }

  public int updatePassword(C_Password password){ return userDao.updatePassword(password);}

  public  int edit(Edit edit){return  userDao.edit(edit);}

  public  User validate(Edit edit){return  userDao.validate(edit);}

  public User validateReg(User user){return userDao.validateReg(user);}


}
