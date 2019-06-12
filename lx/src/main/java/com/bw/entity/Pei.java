/**
 * Create Date:2019年6月4日
 */
package com.bw.entity;

import java.util.List;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:贺向飞(1132310433@qq.com)
 * <br>Date:2019年6月4日
 */
public class Pei {
  private int pid;

  private String pname;

  private List<Food> list;

  /**
   * @return the pid
   */
  public int getPid() {
    return pid;
  }

  /**
   * @param pid the pid to set
   */
  public void setPid(int pid) {
    this.pid = pid;
  }

  /**
   * @return the pname
   */
  public String getPname() {
    return pname;
  }

  /**
   * @param pname the pname to set
   */
  public void setPname(String pname) {
    this.pname = pname;
  }

  /**
   * @return the list
   */
  public List<Food> getList() {
    return list;
  }

  /**
   * @param list the list to set
   */
  public void setList(List<Food> list) {
    this.list = list;
  }

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:贺向飞(1132310433@qq.com)
   * <br>Date:2019年6月4日
   * @param pid
   * @param pname
   * @param list
   */
  public Pei(int pid, String pname, List<Food> list) {
    super();
    this.pid = pid;
    this.pname = pname;
    this.list = list;
  }

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:贺向飞(1132310433@qq.com)
   * <br>Date:2019年6月4日
   */
  public Pei() {
    super();
  }

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:贺向飞(1132310433@qq.com)
   * <br>Date:2019年6月4日
   * @param pname
   * @param list
   */
  public Pei(String pname, List<Food> list) {
    super();
    this.pname = pname;
    this.list = list;
  }

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:贺向飞(1132310433@qq.com)
   * <br>Date:2019年6月4日
   * @param pid
   * @param pname
   */
  public Pei(int pid, String pname) {
    super();
    this.pid = pid;
    this.pname = pname;
  }

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:贺向飞(1132310433@qq.com)
   * <br>Date:2019年6月4日
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "Pei [pid=" + pid + ", pname=" + pname + ", list=" + list + "]";
  }

}
