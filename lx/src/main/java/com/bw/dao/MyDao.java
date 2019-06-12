/**
 * Create Date:2019年6月4日
 */
package com.bw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bw.entity.Food;
import com.bw.entity.Pei;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:贺向飞(1132310433@qq.com)
 * <br>Date:2019年6月4日
 */
public interface MyDao {

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:贺向飞(1132310433@qq.com)
   * <br>Date:2019年6月4日
   * @param fname
   * @return
   */
  List<Food> list(@Param("fname") String fname);

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
   * @return
   */
  int add(Food f);

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:贺向飞(1132310433@qq.com)
   * <br>Date:2019年6月4日
   * @param fid
   * @param split
   * @return
   */
  int addcp(@Param("fid") int fid, @Param("pids") String[] split);

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:贺向飞(1132310433@qq.com)
   * <br>Date:2019年6月4日
   * @param fid
   * @return
   */
  Food show(@Param("fid") String fid);

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:贺向飞(1132310433@qq.com)
   * <br>Date:2019年6月4日
   * @param f
   * @return
   */
  int updfood(Food f);

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:贺向飞(1132310433@qq.com)
   * <br>Date:2019年6月4日
   * @param fid
   * @return
   */
  int delcp(@Param("fid") int fid);

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:贺向飞(1132310433@qq.com)
   * <br>Date:2019年6月4日
   * @param fids
   * @return
   */
  int delallcp(@Param("fids") String fids);

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:贺向飞(1132310433@qq.com)
   * <br>Date:2019年6月4日
   * @param fids
   * @return
   */
  int delallfood(@Param("fids") String fids);

}
