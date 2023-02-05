package pers.kylehsu.design.pattern.behavioral.chainofresponsibility;

import lombok.Getter;
import lombok.Setter;
/**
 * <h1>责任链模式</h1>
 *  <h2> 意思是：为请求创建一个接收此次请求对象的链 </h2>
 *  <p> 适用场景：一个请求的处理需要多个对象当中的一个或几个协作处理；[比如：采购系统中金额超过不同的数目由不同级别的领导审批;OA系统中某项流程需要经过多层领导的审批；请求参数的多层校验]
 *  <p> 优点：实现请求发送者和接受者的解耦，动态组合,比如通过外部配置来实时改变责任链模式；可以消除上层应用的if else需要添加的时候只需要添加实现类就可以了
 *  <p> 缺点：责任链太长就会影响性能
 *
 *  本demo：是模仿在线教育系统中的 发布课程会通过不同的审批者（本类），一个课程包含文章和视频，对应不同的审批人  <p/>
 *  <h2>常见应用：</h2>
 *  <p> 1. servlet、MVC中的FilterChain接口就是我们的审批者Approver或Handler，他有具体的实现，如Mock、Log、MultiPartFile 的FilterChain实现
 *  <p> 2. SpringMVC 的拦截器 InterceptorHandler接口，我们的实现就是对应执行拦截的具体拦截器
 */
@Getter
@Setter
public abstract class Approver {
    // 注意：包含一个自己同类型的对象，为了子类也可以访问用protected
    protected Approver approveHandler;
    protected String approverName;

    public Approver(String name) {
        this.approverName = name;
    }

    // 设置接收传入的审批者进行审批
    public void setNextApprover(Approver approver){
        this.approveHandler = approver;
        this.approverName = approver.getApproverName();
    }

    // [抽象方法]：发布课程的时候，会有不同的人审批，具体实现交由子类去做
    public abstract void deploy(Course course);

}

