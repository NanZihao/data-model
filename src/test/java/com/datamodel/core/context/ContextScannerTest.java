package com.datamodel.core.context;

/**
 * @author Chal Nan 
 */
public class ContextScannerTest {
  public static void main(String[] args) {
//    ContextScanner scanner = new ContextScanner(new String[]{"com.datamodel.bean.predefine"});
    ContextScanner.scan(new String[]{"com.datamodel.bean.predefine"});
  }
}
