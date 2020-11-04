package com.atguigu.utils

import java.io.InputStreamReader
import java.util.Properties

/**
 * @author zljz
 * @create 2020-11-04 23:00
 */
object PropertiesUtil {
  def load(propertieName: String): Properties = {
    val prop = new Properties()
    prop.load(new InputStreamReader(Thread.currentThread().getContextClassLoader.getResourceAsStream(propertieName), "UTF-8"))
    prop
  }
}
