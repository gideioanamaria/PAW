/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Oana
 */
@Entity
@Table(name = "event")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Event.findAll", query = "SELECT e FROM Event e"),
    @NamedQuery(name = "Event.findByEventid", query = "SELECT e FROM Event e WHERE e.eventid = :eventid"),
    @NamedQuery(name = "Event.findByEventname", query = "SELECT e FROM Event e WHERE e.eventname = :eventname"),
    @NamedQuery(name = "Event.findByAdress", query = "SELECT e FROM Event e WHERE e.adress = :adress"),
    @NamedQuery(name = "Event.findByStartdate", query = "SELECT e FROM Event e WHERE e.startdate = :startdate"),
    @NamedQuery(name = "Event.findByEnddate", query = "SELECT e FROM Event e WHERE e.enddate = :enddate"),
    @NamedQuery(name = "Event.findByDepartament", query = "SELECT e FROM Event e WHERE e.departament = :departament"),
    @NamedQuery(name = "Event.findByCoordinator", query = "SELECT e FROM Event e WHERE e.coordinator = :coordinator"),
    @NamedQuery(name = "Event.findByRemarks", query = "SELECT e FROM Event e WHERE e.remarks = :remarks")})
public class Event implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "eventid")
    private Short eventid;
    @Size(max = 30)
    @Column(name = "eventname")
    private String eventname;
    @Size(max = 50)
    @Column(name = "adress")
    private String adress;
    @Column(name = "startdate")
    @Temporal(TemporalType.DATE)
    private Date startdate;
    @Column(name = "enddate")
    @Temporal(TemporalType.DATE)
    private Date enddate;
    @Size(max = 50)
    @Column(name = "departament")
    private String departament;
    @Size(max = 50)
    @Column(name = "coordinator")
    private String coordinator;
    @Size(max = 150)
    @Column(name = "remarks")
    private String remarks;

    public Event() {
    }

    public Event(Short eventid) {
        this.eventid = eventid;
    }

    public Short getEventid() {
        return eventid;
    }

    public void setEventid(Short eventid) {
        this.eventid = eventid;
    }

    public String getEventname() {
        return eventname;
    }

    public void setEventname(String eventname) {
        this.eventname = eventname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public String getCoordinator() {
        return coordinator;
    }

    public void setCoordinator(String coordinator) {
        this.coordinator = coordinator;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eventid != null ? eventid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Event)) {
            return false;
        }
        Event other = (Event) object;
        if ((this.eventid == null && other.eventid != null) || (this.eventid != null && !this.eventid.equals(other.eventid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Event[ eventid=" + eventid + " ]";
    }
    
}
