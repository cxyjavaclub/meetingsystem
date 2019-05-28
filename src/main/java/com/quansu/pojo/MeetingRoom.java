package com.quansu.pojo;

import java.util.Date;

public class MeetingRoom {
    private Long meetingRoomId;

    private String meetingRoomName;

    private String meetingRoomImg;

    private Integer meetingRoomGalleryful;

    private String meetingRoomSite;

    private String meetingRoomResources;

    private Byte meetingRoomState;

    private Boolean deleteState;

    private Date created;

    private Date updated;

    public Long getMeetingRoomId() {
        return meetingRoomId;
    }

    public void setMeetingRoomId(Long meetingRoomId) {
        this.meetingRoomId = meetingRoomId;
    }

    public String getMeetingRoomName() {
        return meetingRoomName;
    }

    public void setMeetingRoomName(String meetingRoomName) {
        this.meetingRoomName = meetingRoomName == null ? null : meetingRoomName.trim();
    }

    public String getMeetingRoomImg() {
        return meetingRoomImg;
    }

    public void setMeetingRoomImg(String meetingRoomImg) {
        this.meetingRoomImg = meetingRoomImg == null ? null : meetingRoomImg.trim();
    }

    public Integer getMeetingRoomGalleryful() {
        return meetingRoomGalleryful;
    }

    public void setMeetingRoomGalleryful(Integer meetingRoomGalleryful) {
        this.meetingRoomGalleryful = meetingRoomGalleryful;
    }

    public String getMeetingRoomSite() {
        return meetingRoomSite;
    }

    public void setMeetingRoomSite(String meetingRoomSite) {
        this.meetingRoomSite = meetingRoomSite == null ? null : meetingRoomSite.trim();
    }

    public String getMeetingRoomResources() {
        return meetingRoomResources;
    }

    public void setMeetingRoomResources(String meetingRoomResources) {
        this.meetingRoomResources = meetingRoomResources == null ? null : meetingRoomResources.trim();
    }

    public Byte getMeetingRoomState() {
        return meetingRoomState;
    }

    public void setMeetingRoomState(Byte meetingRoomState) {
        this.meetingRoomState = meetingRoomState;
    }

    public Boolean getDeleteState() {
        return deleteState;
    }

    public void setDeleteState(Boolean deleteState) {
        this.deleteState = deleteState;
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