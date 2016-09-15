package nyc.c4q.abassawo.pojos;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Abass on 9/15/16.
 */

public class Topic {

    private String value;
    private String creator;
    private Integer lastSet;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }


    public Integer getLastSet() {
        return lastSet;
    }

    public void setLastSet(Integer lastSet) {
        this.lastSet = lastSet;
    }
}