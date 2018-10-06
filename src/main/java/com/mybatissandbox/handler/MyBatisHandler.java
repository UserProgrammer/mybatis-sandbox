package com.mybatissandbox.handlers;

import java.util.List;
import com.mybatissandbox.dao.IMyBatisDao;
import java.util.Map;
import java.util.HashMap;

public class MyBatisHandler {
  private IMyBatisDao myBatisDao;

  public List<Integer> executeMethodInMyBatis() {
    Map<String, Boolean> filters = new HashMap<>();
    filters.put("evenNumbersOnly", true);
    filters.put("positiveNumbersOnly", false);
    return myBatisDao.executeMethodInMyBatis(filters);
  }

  public void setMyBatisDao(IMyBatisDao myBatisDao) {
    this.myBatisDao = myBatisDao;
  }
}
