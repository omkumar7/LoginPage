package com.omkumar.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import com.omkumar.model.C_Password;
import com.omkumar.model.Edit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.omkumar.model.Login;
import com.omkumar.model.User;

public class UserDaoImpl implements UserDao {

  @Autowired
  DataSource datasource;

  @Autowired
  JdbcTemplate jdbcTemplate;

  public int register(User user) {
    String sql = "insert into users values(?,?,?,?,?,?,?)";

    return jdbcTemplate.update(sql, new Object[] { user.getUsername(), user.getPassword(),
            user.getFirstname(), user.getLastname(), user.getEmail(), user.getAddress(), user.getPhone() });
  }

  public int edit(Edit edit){
    String sql= " update users set firstname = '" + edit.getFirstname() + "',lastname= '" +
            edit.getLastname()+"',email= '"+edit.getEmail()+"' ,address= '"
            + edit.getAddress()+"' ,phone= '"+ edit.getPhone()+"'where username='" + edit.getUsername() + "'";

    return jdbcTemplate.update(sql);
  }

  public User validateUser(Login login) {
    String sql = "select * from users where username='" + login.getUsername()
            + "' and password='" + login.getPassword()
            + "'";
    List<User> users = jdbcTemplate.query(sql, new UserMapper());

    return users.size() > 0 ? users.get(0) : null;
  }

    public User validateReg(User user) {
        String sql = "select * from users where username='" + user.getUsername()
                + "'";
        List<User> users = jdbcTemplate.query(sql, new UserMapper());

        return users.size() > 0 ? users.get(0) : null;
    }
  public User validate(Edit edit){
    String sql = "select * from users where  password='" + edit.getPassword()
            + "'";
    List<User> users = jdbcTemplate.query(sql, new UserMapper());

    return users.size() > 0 ? users.get(0) : null;
  }

  public User validateUser1(C_Password password) {
    String sql = "select * from users where username='" + password.getUsername() + "' and password='" + password.getPassword() + "'";

    List<User> users = jdbcTemplate.query(sql, new UserMapper());

    return users.size() > 0 ? users.get(0) : null;
  }

  public int updatePassword(C_Password password){
    String sql = " update users set password = '" + password.getNewpassword() + "' where username='" + password.getUsername() + "'";

    return  jdbcTemplate.update(sql);
  }

}

class UserMapper implements RowMapper<User> {

  public User mapRow(ResultSet rs, int arg1) throws SQLException {
    User user = new User();

    user.setUsername(rs.getString("username"));
    user.setPassword(rs.getString("password"));
    user.setFirstname(rs.getString("firstname"));
    user.setLastname(rs.getString("lastname"));
    user.setEmail(rs.getString("email"));
    user.setAddress(rs.getString("address"));
    user.setPhone(rs.getString("phone"));

    return user;
  }
}