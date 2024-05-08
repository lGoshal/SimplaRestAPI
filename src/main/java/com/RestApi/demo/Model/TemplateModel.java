package com.RestApi.demo.Model;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class TemplateModel {
    private String message;
    private String time;
    public String getMessage(){
        return message;
    }
    public void setMessage(String Message){
        this.message = message;
    }
    public String getTime(){
        return time;
    }
    public void setTime(String time){
        this.time = time;
    }
}