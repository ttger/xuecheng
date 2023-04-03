package com.xuecheng.base.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by acer-pc on 2018/6/19.
 */

public class GsonUtil {

    public static Gson gson = new GsonBuilder().create();


    public static <T extends Object> T parseJson(String jsonStr, Class<T> tClass) {
        try {
            return gson.fromJson(jsonStr, tClass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public static String toJson(Object object) {
        try {
            return gson.toJson(object);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}