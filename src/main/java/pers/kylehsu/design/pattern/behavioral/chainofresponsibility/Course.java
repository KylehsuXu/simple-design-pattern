package pers.kylehsu.design.pattern.behavioral.chainofresponsibility;

import lombok.Data;
import lombok.ToString;

/**
 * 课程
 * <br/> 责任链 对什么对象负责/审批/处理：课程
 */
@Data
@ToString
public class Course {
    private String name;
    private String article;
    private String video;
    private String comment;
}
