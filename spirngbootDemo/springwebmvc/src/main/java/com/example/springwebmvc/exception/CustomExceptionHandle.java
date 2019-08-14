package com.example.springwebmvc.exception;

import com.example.springwebmvc.annotation.CustomAnnotation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice(annotations = CustomAnnotation.class)
public class CustomExceptionHandle {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handle(Exception e){
        return ResponseEntity.badRequest().body(e.getMessage()+"----"+e.getLocalizedMessage());
    }

}
