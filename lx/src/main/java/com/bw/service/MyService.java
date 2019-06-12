/**
 * Create Date:2019年6月4日
 */
package com.bw.service;

import java.util.List;

import com.bw.entity.Food;
import com.bw.entity.Pei;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:贺向飞(1132310433@qq.com)
 * <br>Date:2019年6月4日
 */
public interface MyService {

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:贺向飞(1132310433@qq.com)
   * <br>Date:2019年6月4日
   * @param fname
   * @return
   */
  List<Food> list(String fname);

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:贺向飞(1132310433@qq.com)
   * <br>Date:2019年6月4日
   * @return
   */
  List<Pei> peilist();

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:贺向飞(1132310433@qq.com)
   * <br>Date:2019年6月4日
   * @param f
   * @param pid
   * @return
   */
  int add(Food f, String pid);

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:贺向飞(1132310433@qq.com)
   * <br>Date:2019年6月4日
   * @param fid
   * @return
   */
  Food show(String fid);

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:贺向飞(1132310433@qq.com)
   * <br>Date:2019年6月4日
   * @param f
   * @param pid
   * @return
   */
  int update(Food f, String pid);

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:贺向飞(1132310433@qq.com)
   * <br>Date:2019年6月4日
   * @param fids
   * @return
   */
  int delall(String fids);

}
