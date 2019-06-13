package com.bw.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.entity.Move;
import com.bw.service.MyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class MyController {
  @Resource
  private MyService service;

  @RequestMapping("list.do")
  public String list(Model model, String yname, String daoy, String nd, String timest, String timeend,
    String datest, String dateend, @RequestParam(defaultValue = "1") Integer page, String pricest,
    String priceend) {
    Map<String, Object> map = new HashMap<String, Object>();
    map.put("yname", yname);
    map.put("daoy", daoy);
    map.put("nd", nd);
    map.put("pricest", pricest);
    map.put("priceend", priceend);
    map.put("datest", datest);
    map.put("dateend", dateend);
    map.put("timest", timest);
    map.put("timeend", timeend);
    PageHelper.startPage(page, 3);
    List<Move> list = service.list(map);
    PageInfo<Move> pi = new PageInfo<Move>(list);
    model.addAttribute("list", list);
    model.addAttribute("pi", pi);
    model.addAttribute("map", map);
    model.addAttribute("map", map);
    System.out.println(list);

    return "list";

  }

  @RequestMapping("updxia.do")
  public String updxia(Integer yid) {
    int n = service.updxia(yid);
    return "redirect:list.do";

  }

  @RequestMapping("updshang.do")
  public String updshang(Integer yid) {
    int n = service.updshang(yid);
    return "redirect:list.do";

  }

  @RequestMapping("delete.do")
  @ResponseBody
  public Object delete(String yids) {
    System.out.println(yids);
    int n = service.delete(yids);
    return true;

  }

}
