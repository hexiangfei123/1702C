package com.hxf.RandomUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Random;

public class RandomNum {
  public static int random(int min, int max) {
    int num = (int) ((Math.random() * (max - min)) + min);
    return num;

  }

  public static LinkedHashSet<Integer> subRandom(int min, int max, int subs) {
    LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

    for (int i = 0; i < subs; i++) {
      int num = (int) ((Math.random() * (max - min)) + min);
      set.add(num);
    }

    return set;

  }

  public static char randomCharacter() {

    String string = "123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLMNBVCXZ";
    char[] charArray = string.toCharArray();
    Random random = new Random();
    int n = random.nextInt(charArray.length);

    return charArray[n];

  }

  public static String randomString(int length) {
    String string = "123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLMNBVCXZ";
    char[] charArray = string.toCharArray();
    Random random = new Random();
    String str = "";
    for (int i = 0; i < length; i++) {
      int n = random.nextInt(charArray.length);
      str += charArray[n];
    }

    return str;

  }

  public static Long randomLong(Long start, Long end) {

    Long num = (long) ((Math.random() * (start - end)) + start);
    if (num == start || num == end) {
      randomLong(start, end);
    }
    return num;

  }

  public static String randomDate(String start) {
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    try {
      Date st = format.parse(start);
      Date en = new Date();
      Long randomLong = randomLong(st.getTime(), en.getTime());
      Date date = new Date(randomLong);
      String string = format.format(date);
      return string;

    } catch (ParseException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      return null;
    }

  }

}
