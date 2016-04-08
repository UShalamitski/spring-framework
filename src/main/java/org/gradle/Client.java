package org.gradle;

public class Client {
    private String id;
    private String fullName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Client(){}
    
    public Client(String id, String fullNmae){
        setId(id);
        setFullName(fullNmae);
    }
    
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

}
