package com.bw.entity;

public class Move {
  private int yid;

  private String yname;

  private String daoy;

  private int price;

  private String date;

  private int time;

  private String type;

  private String nd;

  private String qy;

  private int zt;

  public int getYid() {
    return yid;
  }

  public void setYid(int yid) {
    this.yid = yid;
  }

  public String getYname() {
    return yname;
  }

  public void setYname(String yname) {
    this.yname = yname;
  }

  public String getDaoy() {
    return daoy;
  }

  public void setDaoy(String daoy) {
    this.daoy = daoy;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public int getTime() {
    return time;
  }

  public void setTime(int time) {
    this.time = time;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getNd() {
    return nd;
  }

  public void setNd(String nd) {
    this.nd = nd;
  }

  public String getQy() {
    return qy;
  }

  public void setQy(String qy) {
    this.qy = qy;
  }

  public int getZt() {
    return zt;
  }

  public void setZt(int zt) {
    this.zt = zt;
  }

  public Move(int yid, String yname, String daoy, int price, String date, int time, String type, String nd,
    String qy, int zt) {
    super();
    this.yid = yid;
    this.yname = yname;
    this.daoy = daoy;
    this.price = price;
    this.date = date;
    this.time = time;
    this.type = type;
    this.nd = nd;
    this.qy = qy;
    this.zt = zt;
  }

  public Move() {
    super();
  }

  public Move(String yname, String daoy, int price, String date, int time, String type, String nd, String qy,
    int zt) {
    super();
    this.yname = yname;
    this.daoy = daoy;
    this.price = price;
    this.date = date;
    this.time = time;
    this.type = type;
    this.nd = nd;
    this.qy = qy;
    this.zt = zt;
  }

  @Override
  public String toString() {
    return "Move [yid=" + yid + ", yname=" + yname + ", daoy=" + daoy + ", price=" + price + ", date=" + date
      + ", time=" + time + ", type=" + type + ", nd=" + nd + ", qy=" + qy + ", zt=" + zt + "]";
  }

}
