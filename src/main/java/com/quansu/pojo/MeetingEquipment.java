package com.quansu.pojo;

import java.util.Date;

public class MeetingEquipment {
    private Long equipmentId;

    private String equipmentUuid;

    private String equipmentSite;

    private Byte equipmentType;

    private Byte equipmentState;

    private String meetingRoomId;

    private Boolean deleteState;

    private Date created;

    private Date updated;

    public Long getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Long equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getEquipmentUuid() {
        return equipmentUuid;
    }

    public void setEquipmentUuid(String equipmentUuid) {
        this.equipmentUuid = equipmentUuid == null ? null : equipmentUuid.trim();
    }

    public String getEquipmentSite() {
        return equipmentSite;
    }

    public void setEquipmentSite(String equipmentSite) {
        this.equipmentSite = equipmentSite == null ? null : equipmentSite.trim();
    }

    public Byte getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(Byte equipmentType) {
        this.equipmentType = equipmentType;
    }

    public Byte getEquipmentState() {
        return equipmentState;
    }

    public void setEquipmentState(Byte equipmentState) {
        this.equipmentState = equipmentState;
    }

    public String getMeetingRoomId() {
        return meetingRoomId;
    }

    public void setMeetingRoomId(String meetingRoomId) {
        this.meetingRoomId = meetingRoomId == null ? null : meetingRoomId.trim();
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