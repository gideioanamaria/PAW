package entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-13T23:41:48")
@StaticMetamodel(Event.class)
public class Event_ { 

    public static volatile SingularAttribute<Event, Short> eventid;
    public static volatile SingularAttribute<Event, Date> enddate;
    public static volatile SingularAttribute<Event, String> coordinator;
    public static volatile SingularAttribute<Event, String> adress;
    public static volatile SingularAttribute<Event, Date> startdate;
    public static volatile SingularAttribute<Event, String> eventname;
    public static volatile SingularAttribute<Event, String> remarks;
    public static volatile SingularAttribute<Event, String> departament;

}