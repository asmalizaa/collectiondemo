package com.example.collectionsdemo;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class CollectionsBean {

  // 1. injection using Autowired
  @Autowired
  private List<String> nameList;

  // 2.
  private Set<String> nameSet;

  // injection within constructor instead
  public CollectionsBean(Set<String> strings) {
    nameSet = strings;
  }

  // 3.
  private Map<Integer, String> nameMap;

  // injection using Autowired with setter
  @Autowired
  public void setNameMap(Map<Integer, String> nameMap) {
    this.nameMap = nameMap;
  }

  // inject list of MyBean
  @Autowired
  @Qualifier("CollectionsBean")
  private List<MyBean> beanList;

  // setting an empty list as a default value
  @Value("${names.list:}#{T(java.util.Collections).emptyList()}")
  private List<String> nameListWithDefaultValue;

  
  public void printNameList() {
    System.out.println(nameList);
  }

  public void printNameSet() {
    System.out.println(nameSet);
  }

  public void printNameMap() {
    System.out.println(nameMap);
  }

  public void printBeanList() {
    System.out.println(beanList);
  }

  public void printNameListWithDefaults() {
    System.out.println(nameListWithDefaultValue);
  }
}
