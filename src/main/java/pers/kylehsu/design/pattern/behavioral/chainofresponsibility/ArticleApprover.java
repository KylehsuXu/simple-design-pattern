package pers.kylehsu.design.pattern.behavioral.chainofresponsibility;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

/**
 * 具体的审批者
 */
@Slf4j

public class ArticleApprover extends Approver {

    public ArticleApprover(String articleApproverName) {
        super(articleApproverName);
    }

    /**
     * 文章 具体怎么审批课程
     *
     * @param course 待审批的课程
     */
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotEmpty(course.getArticle())){
            log.info("课程：{} 包含文章，由：{} 批准！ ", course.getName(), approverName);
            // 下面还有审批者的话，那就继续发布
            if (approveHandler != null) {
                approveHandler.deploy(course);
            }
        }else {
            // 连文章都没有，第一个流程都没过，有下一个审批者也没用，结束流程
            log.info("文章为空， 不批准，流程结束！");
            return;
        }
    }
}
