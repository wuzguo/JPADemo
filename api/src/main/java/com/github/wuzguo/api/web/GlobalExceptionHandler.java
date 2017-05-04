package com.github.wuzguo.api.web;


import com.github.wuzguo.api.vo.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;


@ControllerAdvice
public class GlobalExceptionHandler {

    // 日志
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);


    @ExceptionHandler(value = Exception.class)
    public Result defaultErrorHandler(final HttpServletRequest req, final Exception e) throws Exception {
        logger.error("[GlobalExceptionHandler] defaultErrorHandler Exception: ", e);
        return new Result(false, "服务器内部错误");
    }
}
