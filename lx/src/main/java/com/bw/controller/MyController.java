/**
 * Create Date:2019年6月4日
 */
package com.bw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.entity.Food;
import com.bw.entity.Pei;
import com.bw.service.MyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:贺向飞(1132310433@qq.com)
 * <br>Date:2019年6月4日
 */
@Controller
public class MyController {
  @Autowired
  private MyService service;

  @RequestMapping("list.do")
  public String list(Model model, String fname, @RequestParam(defaultValue = "1") Integer page) {
    PageHelper.startPage(page, 3);
    List<Food> list = service.list(fname);
    PageInfo<Food> pi = new PageInfo<Food>(list);
    model.addAttribute("list", list);

    model.addAttribute("fname", fname);
    model.addAttribute("pi", pi);

    return "list";

  }

  @RequestMapping("peilist.do")
  @ResponseBody
  public Object peilist() {

    List<Pei> list = service.peilist();

    return list;

  }

  @RequestMapping("add.do")
  @ResponseBody
  public Object add(Food f, String pid) {
    System.out.println(f);
    System.out.println(pid);
    int num = service.add(f, pid);

    return num;

  }

  @RequestMapping("show.do")
  @ResponseBody
  public Object show(String fid) {
    System.out.println(fid);

    Food food = service.show(fid);
    System.out.println(food);
    return food;

  }

  @RequestMapping("update.do")
  @ResponseBody
  public Object update(Food f, String pid) {
    System.out.println(pid);
    System.out.println(f);

    int num = service.update(f, pid);

    return num;

  }

  @RequestMapping("delall.do")
  @ResponseBody
  public Object delall(String fids) {
    System.out.println(fids);

    int num = service.delall(fids);

    return num;

  }

}
