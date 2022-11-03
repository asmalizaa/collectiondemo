package com.example.collectionsdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CollectionsBeanTest {

  public static void main(String[] args) {

    ApplicationContext context = new AnnotationConfigApplicationContext(CollectionConfig.class);
    CollectionsBean collectionsBean = context.getBean(CollectionsBean.class);

    collectionsBean.printNameList();

    collectionsBean.printNameSet();

    collectionsBean.printNameMap();

    collectionsBean.printBeanList();

    collectionsBean.printNameListWithDefaults();
    
  }

}
