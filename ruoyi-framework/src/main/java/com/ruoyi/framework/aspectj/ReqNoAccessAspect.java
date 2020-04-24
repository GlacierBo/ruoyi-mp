package com.ruoyi.framework.aspectj;

import com.ruoyi.common.exception.BusinessException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * AOP 凌晨不处理其他业务
 * @author Wangpeidong
 * @create 2019-11-19 23:36
 **/
@Aspect
@Component
public class ReqNoAccessAspect {

    @Pointcut("@annotation(com.ruoyi.common.annotation.ReqNoAccess)")
    public void reqNoAccessPointCut()
    {
    }

    @Before("reqNoAccessPointCut()")
    public void doBefore(JoinPoint point) throws Throwable
    {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        //判断当前时间是否在凌晨2:00~2:10之间
        Date now = format.parse(format.format(new Date()));
        Long nowLong = now.getTime();
        Date startTime = format.parse("01:59");
        Date endTime = format.parse("02:11");

        Long startTimeLong = startTime.getTime();
        Long endTimeLong = endTime.getTime();
        if (startTimeLong < nowLong && nowLong < endTimeLong) {
            throw new BusinessException("当前时段正在统计社区奖，请稍后重试");
        }
    }
}
