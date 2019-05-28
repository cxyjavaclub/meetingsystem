package com.quansu.entity;

import java.util.Date;

/**
 * 返回的会议对象
 * @author cxy
 * @date 2019/5/22
 */
public class ReturnMeetingVo {
    private Long meetingId;

    private String meetingSponsorName;

    private String sponsorTrueName;

    private String meetingTheme;

    private String meetingRoomId;

    private String meetingRoomName;

    private Date meetingBeginDate;

    private Date meetingEndDate;

    private String meetingContent;

    private Integer meetingAddTime;

    private Byte meetingAuditState;

    private Byte meetingSignInState;

    private Date created;

    private Date updated;

    public Long getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(Long meetingId) {
        this.meetingId = meetingId;
    }

    public String getMeetingSponsorName() {
        return meetingSponsorName;
    }

    public void setMeetingSponsorName(String meetingSponsorName) {
        this.meetingSponsorName = meetingSponsorName == null ? null : meetingSponsorName.trim();
    }

    public String getSponsorTrueName() {
        return sponsorTrueName;
    }

    public void setSponsorTrueName(String sponsorTrueName) {
        this.sponsorTrueName = sponsorTrueName == null ? null : sponsorTrueName.trim();
    }

    public String getMeetingTheme() {
        return meetingTheme;
    }

    public void setMeetingTheme(String meetingTheme) {
        this.meetingTheme = meetingTheme == null ? null : meetingTheme.trim();
    }

    public String getMeetingRoomId() {
        return meetingRoomId;
    }

    public void setMeetingRoomId(String meetingRoomId) {
        this.meetingRoomId = meetingRoomId == null ? null : meetingRoomId.trim();
    }

    public String getMeetingRoomName() {
        return meetingRoomName;
    }

    public void setMeetingRoomName(String meetingRoomName) {
        this.meetingRoomName = meetingRoomName == null ? null : meetingRoomName.trim();
    }

    public Date getMeetingBeginDate() {
        return meetingBeginDate;
    }

    public void setMeetingBeginDate(Date meetingBeginDate) {
        this.meetingBeginDate = meetingBeginDate;
    }

    public Date getMeetingEndDate() {
        return meetingEndDate;
    }

    public void setMeetingEndDate(Date meetingEndDate) {
        this.meetingEndDate = meetingEndDate;
    }

    public String getMeetingContent() {
        return meetingContent;
    }

    public void setMeetingContent(String meetingContent) {
        this.meetingContent = meetingContent == null ? null : meetingContent.trim();
    }

    public Integer getMeetingAddTime() {
        return meetingAddTime;
    }

    public void setMeetingAddTime(Integer meetingAddTime) {
        this.meetingAddTime = meetingAddTime;
    }

    public Byte getMeetingAuditState() {
        return meetingAuditState;
    }

    public void setMeetingAuditState(Byte meetingAuditState) {
        this.meetingAuditState = meetingAuditState;
    }

    public Byte getMeetingSignInState() {
        return meetingSignInState;
    }

    public void setMeetingSignInState(Byte meetingSignInState) {
        this.meetingSignInState = meetingSignInState;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}
