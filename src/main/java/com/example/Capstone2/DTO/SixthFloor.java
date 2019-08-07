package com.example.Capstone2.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "SixthFloor")
public class SixthFloor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private boolean conferenceRoom;
    @NotNull
    private boolean serverRoom;
    @NotNull
    private boolean generalWorkingrea;

    public SixthFloor() {

    }

    public boolean isConferenceRoom() {
        return conferenceRoom;
    }

    public void setConferenceRoom(boolean conferenceRoom) {
        this.conferenceRoom = conferenceRoom;
    }

    public boolean isServerRoom() {
        return serverRoom;
    }

    public void setServerRoom(boolean serverRoom) {
        this.serverRoom = serverRoom;
    }

    public boolean isGeneralWorkingrea() {
        return generalWorkingrea;
    }

    public void setGeneralWorkingrea(boolean generalWorkingrea) {
        this.generalWorkingrea = generalWorkingrea;
    }
}
