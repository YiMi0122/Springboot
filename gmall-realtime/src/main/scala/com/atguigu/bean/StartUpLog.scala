package com.atguigu.bean

/**
 * @author zljz
 * @create 2020-11-04 23:41
 */
object StartUpLog {
  case class StartUpLog(mid:String,
                        uid:String,
                        appid:String,
                        area:String,
                        os:String,
                        ch:String,
                        `type`:String,
                        vs:String,
                        var logDate:String,
                        var logHour:String,
                        var ts:Long)
}
