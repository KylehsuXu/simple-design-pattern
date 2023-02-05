package pers.kylehsu.design.pattern.behavioral.chainofresponsibility;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

/**
 * 评论审批者
 *
 * @author kylehsu.xu
 */
@Getter
@Setter
@Slf4j
public class CommentApprover extends Approver{
    public CommentApprover(String name) {
        super(name);
    }

    /**
     * 审核并继续发布课程
     * @param course 课程
     */
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotEmpty(course.getComment())){
            log.info("课程：{} 包含评论，由：{} 批准！ ", course.getName(), approverName);
            // 下面还有审批者的话，那就继续发布
            if (approveHandler != null) {
                approveHandler.deploy(course);
            }
        }else {
            // if中的判断应该是评论是否违规，而不是是课程否有评论。为了方便才这么写的
            log.info("评论为空/违规，不批准，流程结束");
            return;
        }
    }
}
