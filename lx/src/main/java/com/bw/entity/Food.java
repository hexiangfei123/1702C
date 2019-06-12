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
public class Food {
  private int fid;

  private String fname;

  private int price;

  private String pname;

  private List<Pei> list;

  /**
   * @return the fid
   */
  public int getFid() {
    return fid;
  }

  /**
   * @param fid the fid to set
   */
  public void setFid(int fid) {
    this.fid = fid;
  }

  /**
   * @return the fname
   */
  public String getFname() {
    return fname;
  }

  /**
   * @param fname the fname to set
   */
  public void setFname(String fname) {
    this.fname = fname;
  }

  /**
   * @return the price
   */
  public int getPrice() {
    return price;
  }

  /**
   * @param price the price to set
   */
  public void setPrice(int price) {
    this.price = price;
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
  public List<Pei> getList() {
    return list;
  }

  /**
   * @param list the list to set
   */
  public void setList(List<Pei> list) {
    this.list = list;
  }

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:贺向飞(1132310433@qq.com)
   * <br>Date:2019年6月4日
   * @param fid
   * @param fname
   * @param price
   * @param pname
   * @param list
   */
  public Food(int fid, String fname, int price, String pname, List<Pei> list) {
    super();
    this.fid = fid;
    this.fname = fname;
    this.price = price;
    this.pname = pname;
    this.list = list;
  }

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:贺向飞(1132310433@qq.com)
   * <br>Date:2019年6月4日
   */
  public Food() {
    super();
  }

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:贺向飞(1132310433@qq.com)
   * <br>Date:2019年6月4日
   * @param fname
   * @param price
   * @param pname
   * @param list
   */
  public Food(String fname, int price, String pname, List<Pei> list) {
    super();
    this.fname = fname;
    this.price = price;
    this.pname = pname;
    this.list = list;
  }

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:贺向飞(1132310433@qq.com)
   * <br>Date:2019年6月4日
   * @param fid
   * @param fname
   * @param price
   * @param pname
   */
  public Food(int fid, String fname, int price, String pname) {
    super();
    this.fid = fid;
    this.fname = fname;
    this.price = price;
    this.pname = pname;
  }

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:贺向飞(1132310433@qq.com)
   * <br>Date:2019年6月4日
   * @param fname
   * @param price
   * @param pname
   */
  public Food(String fname, int price, String pname) {
    super();
    this.fname = fname;
    this.price = price;
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
    return "Food [fid=" + fid + ", fname=" + fname + ", price=" + price + ", pname=" + pname + ", list="
      + list + "]";
  }

}
