package com.asd.proyecto.util;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseResponse<T> implements Serializable {

    private T data;
    private String messsage;
    private HttpStatus httpStatus;

    public BaseResponse(T data){
        this.data = data;
        this.httpStatus = HttpStatus.OK;
        this.messsage = "SUCCESS";
    }

    public BaseResponse(T data, String messsage){
        this(data);
        this.messsage = messsage;
    }

    public BaseResponse(T data, HttpStatus httpStatus){
        this(data);
        this.httpStatus = httpStatus;
    }

    public BaseResponse(T data, String message, HttpStatus httpStatus){
        this(data, message);
        this.httpStatus = httpStatus;
    }



}
