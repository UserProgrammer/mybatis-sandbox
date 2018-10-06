package com.mybatissandbox.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface IMyBatisDao {
  List<Integer> executeMethodInMyBatis(@Param("filters") Map<String, Boolean> filters);
}

/**
Return a collection of numbers according to filters which are specified in a map object which is passed to the query.
**/
