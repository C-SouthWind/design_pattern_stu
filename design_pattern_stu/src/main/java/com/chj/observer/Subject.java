package com.chj.observer;

/**
 * @projectName: design_pattern_stu
 * @package: com.chj.observer
 * @className: Subject
 * @author: chj
 * @description:
 * @date: Created in  2023/9/7 19:48
 * @version: 1.0
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void registerObserver();
}
