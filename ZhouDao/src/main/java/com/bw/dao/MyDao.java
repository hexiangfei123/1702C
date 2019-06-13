package com.bw.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.bw.entity.Move;

public interface MyDao {

  public List<Move> list(Map<String, Object> map);

  public int updxia(@Param("yid") Integer yid);

  public int updshang(@Param("yid") Integer yid);

  public int delete(@Param("yids") String yids);

}
