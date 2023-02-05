package pers.kylehsu.design.pattern.behavioral.chainofresponsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * <h1>测试类</h1>
 */
@Slf4j
public class Test {
    /**
     * 审核顺序是 先审核文章，文章通过后再审核视频
     */
    public static void main(String[] args) {
        ArticleApprover articleApprover = new ArticleApprover("@文章审批者");
        VideoApprover videoApprover = new VideoApprover("@视频审批者");
        CommentApprover commentApprover = new CommentApprover("@评论审批者");

        // 模拟请求，这里请求处理的是课程
        Course course = new Course();
        course.setName("《计算机网络 自顶向下方法》");
        course.setArticle("《计算机网络 自顶向下方法》 --- 文章部分");
        course.setVideo("《计算机网络 自顶向下方法》 --- 视频部分");
        // course.setComment("《计算机网络 自顶向下方法》 --- 评论部分");

        articleApprover.setNextApprover(videoApprover);
        videoApprover.setNextApprover(commentApprover);


        // 审批课程
        articleApprover.deploy(course);
    }
}
