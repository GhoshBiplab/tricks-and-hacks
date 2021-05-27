package com.biplab.triicks;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Map;

public class FindDifferenceInTwoJson {
    public static void main(String[] args) {
            String json1 = "{\"name\":\"ABC\", \"city\":\"DEF\", \"state\":\"XYZ\"}";
            String json2 = "{\"name\":\"ABC\", \"city\":\"DEF\", \"STATE\":\"XYZ\"}";

            Gson g = new Gson();
            Type mapType = new TypeToken<Map<String, Object>>(){}.getType();
            Map<String, Object> firstMap = g.fromJson(json1, mapType);
            Map<String, Object> secondMap = g.fromJson(json2, mapType);
            System.out.println(Maps.difference(firstMap, secondMap));

    }
}
