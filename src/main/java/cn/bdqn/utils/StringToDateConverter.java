package cn.bdqn.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description: 第一种方式：自定义日期格式转换器
 * @author:章
 * @version：1.0
 * @Date: 2020-06-13 20:36
 **/
public class StringToDateConverter implements Converter<String, Date> {
    private String datepatrrern;   //日期转换格式

    public StringToDateConverter(String datepatrrern) {
        this.datepatrrern = datepatrrern;
    }

    @Override
    public Date convert(String s) {
        Date date=null;
        try {
            date= new SimpleDateFormat(datepatrrern).parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
