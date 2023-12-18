package com.keshe.backend.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private Integer status;
    private String msg;
    private Object data;

    public static Result success(){
        return new Result(Constants.CODE_200,"",null);
    }
    public static Result success(Object data){
        return new Result(Constants.CODE_200,"",data);
    }

    public static Result error(Integer code,String msg){
        return new Result(code,msg,null);
    }
}
