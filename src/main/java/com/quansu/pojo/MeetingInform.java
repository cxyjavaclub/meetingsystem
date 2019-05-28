package com.quansu.pojo;

import java.util.Date;

public class MeetingInform {
    private Long informId;

    private String informMessage;

    private String informUserName;

    private Byte informState;

    private Boolean deleteState;

    private Date created;

    private Date updated;

    public Long getInformId() {
        return informId;
    }

    public void setInformId(Long informId) {
        this.informId = informId;
    }

    public String getInformMessage() {
        return informMessage;
    }

    public void setInformMessage(String informMessage) {
        this.informMessage = informMessage == null ? null : informMessage.trim();
    }

    public String getInformUserName() {
        return informUserName;
    }

    public void setInformUserName(String informUserName) {
        this.informUserName = informUserName == null ? null : informUserName.trim();
    }

    public Byte getInformState() {
        return informState;
    }

    public void setInformState(Byte informState) {
        this.informState = informState;
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