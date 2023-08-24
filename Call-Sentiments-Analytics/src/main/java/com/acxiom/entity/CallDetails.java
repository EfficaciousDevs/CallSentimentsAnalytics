package com.acxiom.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="call_data")
public class CallDetails {

    @Id
    @Column(name = "call_id")
    private String callId;

    @Column(name="audio_file")
    private String audioFile;

    @Column(name = "datetime")
    private Date dateTime;

    public String getCallId() {
        return callId;
    }

    public void setCallId(String callId) {
        this.callId = callId;
    }

    public String getAudioFile() {
        return audioFile;
    }

    public void setAudioFile(String audioFile) {
        this.audioFile = audioFile;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}
