package com.test.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by cdyoue on 2016/10/8.
 */
@Entity
public class Plan {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    //计划名称
    private String title;
    //是否是模板？0或null：不是。1：是
    private Integer isTemplate;
    //计划归属？0：部门。1：项目
    private Integer belongTo;
    //项目名称（计划归属为1时该项才有意义）
    private String projName;
    //部门ID，多个部门以逗号隔开（计划归属为0时该项才有意义）
    private String depts;
    //计划内容
    private String content;
    //附件ID，多个附件以逗号隔开
    private String attachments;
    //计划类型，与前台JSON关联
    private Integer type;
    //负责人ID，多个以逗号隔开
    private String supervisors;
    //计划制定人ID
    private String createBy;
    //任务ID，多个任务以逗号隔开
    private String tasks;
    //关注该计划的用户ID，多个以逗号隔开
    private String focusUsers;
    //0：未发布。1：发布进行中。2：暂停。3：强制完成。4：废除
    private Integer status;
    //发布时间
    private Date pubTime;
    //计划开始时间
    private Date startTime;
    //计划结束时间
    private Date endTime;
    //循环类型？0或null：不循环。1：每天。2、每周。3、每月。4、每季度
    private Integer loops;
    //计划完成时间
    private Date finishTime;

//    protected Plan() {}


    public Plan() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getIsTemplate() {
        return isTemplate;
    }

    public void setIsTemplate(Integer isTemplate) {
        this.isTemplate = isTemplate;
    }

    public Integer getBelongTo() {
        return belongTo;
    }

    public void setBelongTo(Integer belongTo) {
        this.belongTo = belongTo;
    }

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }

    public String getDepts() {
        return depts;
    }

    public void setDepts(String depts) {
        this.depts = depts;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAttachments() {
        return attachments;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getSupervisors() {
        return supervisors;
    }

    public void setSupervisors(String supervisors) {
        this.supervisors = supervisors;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getTasks() {
        return tasks;
    }

    public void setTasks(String tasks) {
        this.tasks = tasks;
    }

    public String getFocusUsers() {
        return focusUsers;
    }

    public void setFocusUsers(String focusUsers) {
        this.focusUsers = focusUsers;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getPubTime() {
        return pubTime;
    }

    public void setPubTime(Date pubTime) {
        this.pubTime = pubTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getLoops() {
        return loops;
    }

    public void setLoops(Integer loops) {
        this.loops = loops;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Plan(String title, Integer isTemplate, Integer belongTo, String projName, String depts, String content, String attachments, Integer type, String supervisors, String createBy, String tasks, String focusUsers, Integer status, Date pubTime, Date startTime, Date endTime, Integer loops, Date finishTime) {
        this.title = title;
        this.isTemplate = isTemplate;
        this.belongTo = belongTo;
        this.projName = projName;
        this.depts = depts;
        this.content = content;
        this.attachments = attachments;
        this.type = type;
        this.supervisors = supervisors;
        this.createBy = createBy;
        this.tasks = tasks;
        this.focusUsers = focusUsers;
        this.status = status;
        this.pubTime = pubTime;
        this.startTime = startTime;
        this.endTime = endTime;
        this.loops = loops;
        this.finishTime = finishTime;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isTemplate=" + isTemplate +
                ", belongTo=" + belongTo +
                ", projName='" + projName + '\'' +
                ", depts='" + depts + '\'' +
                ", content='" + content + '\'' +
                ", attachments='" + attachments + '\'' +
                ", type=" + type +
                ", supervisors='" + supervisors + '\'' +
                ", createBy='" + createBy + '\'' +
                ", tasks='" + tasks + '\'' +
                ", focusUsers='" + focusUsers + '\'' +
                ", status=" + status +
                ", pubTime=" + pubTime +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", loops=" + loops +
                ", finishTime=" + finishTime +
                '}';
    }
}
