package com.abrandonbanti.pruebatecnica.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 *  Clase que por medio de un aspecto implementa un log que mida el tiempo de la ejecución de cada servicio
 *  @version 1.0
 */

@Aspect
@Component
public class ExecutionTimeAspect {

    private static final Logger logger = LoggerFactory.getLogger(ExecutionTimeAspect.class);

    @Around("execution(* com.abrandonbanti.pruebatecnica.service..*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        Object result = joinPoint.proceed(); // Ejecuta el método interceptado

        long elapsedTime = System.currentTimeMillis() - start;

        logger.info("Método: {} ejecutado en {} ms", joinPoint.getSignature(), elapsedTime);

        return result;
    }
}