package com.bw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bw.entity.Food;
import com.bw.entity.User;

public interface MyDao {
  public User login(User user);

  public List<Food> list(@Param("fname") String fname);

}
