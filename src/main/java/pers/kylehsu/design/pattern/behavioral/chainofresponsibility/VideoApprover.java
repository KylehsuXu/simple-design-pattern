package pers.kylehsu.design.pattern.behavioral.chainofresponsibility;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

/**
 * 视频审批者
 */
@Slf4j
public class VideoApprover extends Approver {
    public VideoApprover(String name) {
        super(name);
    }

    /**
     * 视频 具体怎么审批课程
     *
     * @param course 待审批的课程
     */
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotEmpty(course.getVideo())) {
            log.info("课程：{} 包含视频，由：{} 批准！ ", course.getName(), approverName);
            // 下面还有审批者的话，那就继续发布
            if (approveHandler != null) {
                approveHandler.deploy(course);
            }
        } else {
            log.info("视频为空， 不批准，流程结束！");
            return;
        }
    }
}
