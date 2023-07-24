package com.program.controller;


import lombok.Data;

/**
 * 使用了lombok工具简化开发
 */
@Data
public class Result {

    /**
     * 响应类，给前端返回数据类
     */
    private String code;//响应代码，Integer类型无法返回要求的00000，临时改成了String类，实际开发中还是使用Integer类型的Code
    private String msg;//响应信息
    private Object data;//响应数据类




    public Result(String code, Object data, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }

    public Result(String code, Object data) {//双参构造函数满足返回不需要数据体的请求，如删除
        this.data = data;
        this.code = code;
    }

    public Result() {
    }
}
