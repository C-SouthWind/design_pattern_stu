package com.chj.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.flyweight
 * @className: WebSiteFactory
 * @author: chj
 * @description:
 * @date: Created in  2023/7/26 19:44
 * @version: 1.0
 */
public class WebSiteFactory {

    private Map<String, ConcreteWebSite> pool = new HashMap<>();

    public WebSite getWebSiteCategory(String type){
        if (!pool.containsKey(type)) {
            pool.put(type,new ConcreteWebSite(type));
        }
        return (WebSite)pool.get(type);
    }

    public int getWebSiteCount(){
        return pool.size();
    }
}
