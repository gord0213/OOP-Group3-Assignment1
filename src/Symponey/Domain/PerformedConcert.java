package Symponey.Domain;

import java.sql.Time;
import java.util.Date;

public class PerformedConcert extends ScheduledConcert{

	private Date performedDate;
	private Time performedTime;
	
	public PerformedConcert(ScheduledConcert scheduledCon, Date perDate, Time perTime) {
		
		super(scheduledCon.getConcert(),scheduledCon.getDate(),scheduledCon.getTime(),scheduledCon.getVenue());
		performedDate = perDate;
		performedTime = perTime;
	}//end of constructor
	
	public Date getPerformedDate(){
		
		return performedDate;
	}//end of get performed date
	
	public Time getPerformedTime(){
		
		return performedTime;
	}//end of get performed time

}//end of class