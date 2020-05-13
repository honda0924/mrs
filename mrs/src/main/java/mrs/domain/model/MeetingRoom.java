package mrs.domain.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;

public class MeetingRoom implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer roomId;

  private String roomName;

  public Integer getRoomId(){
    return roomId;
  }

  public void setRoomId(Integer roomId){
    this.roomId=roomId;
  }

}