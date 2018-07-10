package com.transferwise.rsp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@ControllerAdvice
public class GameExceptionHandler {
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleMismatch() {
        return "Tool not recognized.\n" +
                "Possible Tools:\n" +
                "- ROCK\n" +
                "- PAPER\n" +
                "- SCISSORS\n";
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleMissingParameter() {
        return "Please add all the request parameters.\n" +
                "- name\n" +
                "- tool\n" +
                "EG: /register_player?name=Edward&tool=SCISSORS";
    }
}
