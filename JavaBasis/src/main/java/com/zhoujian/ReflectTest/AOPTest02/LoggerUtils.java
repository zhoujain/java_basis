package com.zhoujian.ReflectTest.AOPTest02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("loggerUtils")
@Aspect//表示一个切面
public class LoggerUtils {
    @Pointcut("execution(public void com.zhoujian.ReflectTest.AOPTest02.Impl.AccountServiceImpl.save())")
    public void pt1(){};

//    @Before("pt1()")
//    public void beginDisplay(){
//        System.out.println("开始日志记录");
//    }
//
//    @AfterReturning("pt1()")
//    public void afterDisplay(){
//        System.out.println("后置日志记录");
//    }
//    @AfterThrowing("pt1()")
//    public void afterThrowDisplay(){
//        System.out.println("后置异常日志记录");
//    }
//    @After("pt1()")
//    public void afterAllDisplay(){
//        System.out.println("后置最终日志记录");
//    }

    /**
     * 环绕通知
     *  配置环绕通知切入点方法没有执行，通知执行了
     *  分析：
     *     动态代理
     * spring环绕通知
     *   他是spring框架为我们提供一种可以手动控制增强的执行方法
     * @param proceedingJoinPoint
     * @return
     * @throws Throwable
     */
    @Around("pt1()")
    public Object aroundDisplay(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object rtValue = null;
        //获得参数
        try {
            Object [] args = proceedingJoinPoint.getArgs();
            System.out.println("前置通知");
            proceedingJoinPoint.proceed(args);
            System.out.println("后置通知");
        } catch (Throwable throwable) {
            System.out.println("后置异常通知");
            throwable.printStackTrace();
        }finally {
            System.out.println("最终通知");
        }
        return rtValue;

    }
}
