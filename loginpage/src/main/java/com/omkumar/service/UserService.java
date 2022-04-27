package com.omkumar.service;

import com.omkumar.model.Edit;
import com.omkumar.model.Login;
import com.omkumar.model.C_Password;
import com.omkumar.model.User;

public interface UserService {

  int register(User user);

  User validateUser(Login login);

  User validateUser1(C_Password password);

  int updatePassword(C_Password password);

  int edit(Edit edit);

  User validate(Edit edit);

  User validateReg(User user);

}
