package com.chj.observer;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.observer
 * @className: Observer
 * @author: chj
 * @description:
 * @date: Created in  2023/9/7 19:50
 * @version: 1.0
 */
public interface Observer {

    void update(float temperature, float pressure, float humidity);
}
