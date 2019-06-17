package com.hxf.test;

import java.util.ArrayList;
import java.util.LinkedHashSet;

import org.junit.Test;

import com.hxf.RandomUtil.RandomNum;
import com.hxf.StringUtil.Stringut;
import com.hxf.entity.Person;

public class TestF {
  @Test
  public void personTest() {
    ArrayList<Person> list = new ArrayList<Person>();
    for (int i = 0; i < 30; i++) {
      Person person = new Person();
      int length = (int) ((Math.random() * (2)) + 1);
      person.setName(Stringut.generateChineseName(length));
      person.setAge(RandomNum.random(1, 120));
      person.setAbout(Stringut.randomChineseString(150));
      person.setCreated(RandomNum.randomDate("2010-01-01"));
      list.add(person);
    }

    for (Person person : list) {
      System.out.println(person);
    }
  }

  @Test
  public void TestString() {
    String string = "";
    boolean b = Stringut.hasLength(string);
    if (b) {
      System.out.println("无值");
    } else {
      System.out.println("有值");

    }
  }

  @Test
  public void TestNull() {
    String string = "   ";
    boolean b = Stringut.hasText(string);
    if (b) {
      System.out.println("无值");
    } else {
      System.out.println("有值");

    }
  }

  @Test
  public void ff() {
    LinkedHashSet<Integer> set = RandomNum.subRandom(5, 20, 5);
    for (Integer integer : set) {
      System.out.println(integer);
    }
  }

}
