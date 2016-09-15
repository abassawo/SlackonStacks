package nyc.c4q.abassawo.pojos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Abass on 9/15/16.
 */
public class Channel {

    private String id;
    private String name;
    private Boolean isChannel;
    private Integer created;
    private String creator;
    private Boolean isArchived;
    private Boolean isGeneral;
    private Boolean isMember;
    private List<String> members = new ArrayList<String>();
    private Topic topic;
    private Purpose purpose;


    public Channel(String name){
        setName(name);
    }
    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Boolean getIsChannel() {
        return isChannel;
    }


    public void setIsChannel(Boolean isChannel) {
        this.isChannel = isChannel;
    }


    public Integer getCreated() {
        return created;
    }


    public void setCreated(Integer created) {
        this.created = created;
    }


    public String getCreator() {
        return creator;
    }


    public void setCreator(String creator) {
        this.creator = creator;
    }


    public Boolean getIsArchived() {
        return isArchived;
    }


    public void setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
    }


    public Boolean getIsGeneral() {
        return isGeneral;
    }


    public void setIsGeneral(Boolean isGeneral) {
        this.isGeneral = isGeneral;
    }


    public Boolean getIsMember() {
        return isMember;
    }


    public void setIsMember(Boolean isMember) {
        this.isMember = isMember;
    }


    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }


    public Topic getTopic() {
        return topic;
    }


    public void setTopic(Topic topic) {
        this.topic = topic;
    }


    public Purpose getPurpose() {
        return purpose;
    }

    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
    }



}
