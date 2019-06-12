/**
 * Create Date:2019年6月4日
 */
package com.bw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.dao.MyDao;
import com.bw.entity.Food;
import com.bw.entity.Pei;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:贺向飞(1132310433@qq.com)
 * <br>Date:2019年6月4日
 */
@Service
public class MyServiceImp implements MyService {
  @Autowired
  private MyDao dao;

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:贺向飞(1132310433@qq.com)
   * <br>Date:2019年6月4日
   * @see com.bw.service.MyService#list(java.lang.String)
   */
  @Override
  public List<Food> list(String fname) {
    // TODO Auto-generated method stub
    return dao.list(fname);
  }

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:贺向飞(1132310433@qq.com)
   * <br>Date:2019年6月4日
   * @see com.bw.service.MyService#peilist()
   */
  @Override
  public List<Pei> peilist() {
    // TODO Auto-generated method stub
    return dao.peilist();
  }

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:贺向飞(1132310433@qq.com)
   * <br>Date:2019年6月4日
   * @see com.bw.service.MyService#add(com.bw.entity.Food, java.lang.String)
   */
  @Override
  public int add(Food f, String pid) {
    // TODO Auto-generated method stub
    int num = dao.add(f);

    if (pid != null && !pid.equals("")) {
      num = dao.addcp(f.getFid(), pid.split(","));
    }
    return num;
  }

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:贺向飞(1132310433@qq.com)
   * <br>Date:2019年6月4日
   * @see com.bw.service.MyService#show(java.lang.String)
   */
  @Override
  public Food show(String fid) {
    // TODO Auto-generated method stub
    return dao.show(fid);
  }

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:贺向飞(1132310433@qq.com)
   * <br>Date:2019年6月4日
   * @see com.bw.service.MyService#update(com.bw.entity.Food, java.lang.String)
   */
  @Override
  public int update(Food f, String pid) {
    // TODO Auto-generated method stub
    int num = dao.updfood(f);
    int aa = dao.delcp(f.getFid());
    if (pid != null && !pid.equals("")) {
      num = dao.addcp(f.getFid(), pid.split(","));
    }
    return num;
  }

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:贺向飞(1132310433@qq.com)
   * <br>Date:2019年6月4日
   * @see com.bw.service.MyService#delall(java.lang.String)
   */
  @Override
  public int delall(String fids) {
    // TODO Auto-generated method stub
    int num = dao.delallcp(fids);
    num = dao.delallfood(fids);
    return num;
  }

}
