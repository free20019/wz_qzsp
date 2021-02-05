package helper;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * http切面
 */
@Aspect
@Component
public class HttpAspect {

    Logger Logger = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution (public * mvc.controllers.*.*(..)) && !execution (public * mvc.controllers..initBinder(..))")
    public void log() {
    }

    /**
     * 获取请求的具体信息
     * @param joinPoint
     */
    @Before("log()")
    public void HttpBeforeLog(JoinPoint joinPoint) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        Logger.info("---------------------------------request-------------------------------------------");
        Logger.info("uri={}", request.getRequestURI());
        Logger.info("method={}", request.getMethod());
        Logger.info("ip={}", request.getRemoteAddr());
        Logger.info("class_method={}", joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        Logger.info("args={}", joinPoint.getArgs());
        Logger.info("---------------------------------request--------------------------------------------");
    }

    @After("log()")
    public void HttpAfterLog() {}

    /**
     * 输出返回对象
     * @param object
     */
    @AfterReturning(returning = "object", pointcut = "log()")
    public void HttpResponseLog(Object object) {
        if (object != null) {
            Logger.info("-----------------------------------response-----------------------------------------");
            Logger.info("response={}", String.valueOf(object));
            Logger.info("-----------------------------------response-----------------------------------------");
        }
    }
}
