/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.tng.policymanager.repository.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Eleni Fotopoulou <efotopoulou@ubitech.eu>
 */
@Document(collection = "RuntimePolicy")
public class RuntimePolicy {

    @Id
    private String id;

    private String policyid;
    
    private String nsid;

    private String slaid;
    
    private boolean defaultPolicy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isDefaultPolicy() {
        return defaultPolicy;
    }

    public void setDefaultPolicy(boolean defaultPolicy) {
        this.defaultPolicy = defaultPolicy;
    }

    public String getPolicyid() {
        return policyid;
    }

    public void setPolicyid(String policyid) {
        this.policyid = policyid;
    }

    public void setNsid(String nsid) {
        this.nsid = nsid;
    }

    public String getNsid() {
        return nsid;
    }

    public String getSlaid() {
        return slaid;
    }

    public void setSlaid(String slaid) {
        this.slaid = slaid;
    }

}
