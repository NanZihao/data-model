package com.datamodel.core.context;

import java.io.File;
import java.io.FileFilter;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * @author Chal Nan
 */
public class ContextScanner {
  public static List<Class> scan(String[] paths) {
    List<Class> list = new ArrayList<Class>();
    if (paths == null && paths.length == 0) {
      return list;
    }
    for (String path : paths) {
      list.addAll(getClasssFromPackage(path));
    }

    return list;
  }

  public static List<Class> getClasssFromPackage(String pack) {
    List<Class> clazzs = new ArrayList<Class>();

    boolean recursive = true;

    String packageName = pack;
    String packageDirName = packageName.replace('.', '/');

    Enumeration<URL> dirs;

    try {
      dirs = Thread.currentThread().getContextClassLoader().getResources(packageDirName);
      while (dirs.hasMoreElements()) {
        URL url = dirs.nextElement();

        String protocol = url.getProtocol();

        if ("file".equals(protocol)) {
          String filePath = URLDecoder.decode(url.getFile(), "UTF-8");
          findClassInPackageByFile(packageName, filePath, recursive, clazzs);
        } else if ("jar".equals(protocol)) {
        }
      }

    } catch (Exception e) {
      e.printStackTrace();
    }

    return clazzs;
  }

  public static void findClassInPackageByFile(String packageName, String filePath, final boolean recursive, List<Class> clazzs) {
    File dir = new File(filePath);
    if (!dir.exists() || !dir.isDirectory()) {
      return;
    }
    File[] dirFiles = dir.listFiles(new FileFilter() {

      @Override
      public boolean accept(File file) {
        boolean acceptDir = recursive && file.isDirectory();
        boolean acceptClass = file.getName().endsWith("class");
        return acceptDir || acceptClass;
      }
    });

    for (File file : dirFiles) {
      if (file.isDirectory()) {
        findClassInPackageByFile(packageName + "." + file.getName(), file.getAbsolutePath(), recursive, clazzs);
      } else {
        String className = file.getName().substring(0, file.getName().length() - 6);
        try {
          clazzs.add(Thread.currentThread().getContextClassLoader().loadClass(packageName + "." + className));
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }
  }

}
