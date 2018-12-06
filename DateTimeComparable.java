import java.time.ZonedDateTime;
import java.util.GregorianCalendar;
/**
 * 
 * @author Alexi Musick
 * 
 * 
 * @version 12-6-2018
 * Project 4
 * 
 * 
 */
public interface DateTimeComparable {

    /**
     * interface methods implemented by statistics
     * 
     * @param inDateTimeUTC
     * 
     */
    boolean newerThan(GregorianCalendar inDateTimeUTC);
    
    boolean olderThan(GregorianCalendar inDateTimeUTC);
    
    boolean sameAs(GregorianCalendar inDateTimeUTC);
    
    boolean newerThan(ZonedDateTime inDateTimeUTC);
    
  
    boolean olderThan(ZonedDateTime inDateTimeUTC);
    
    
    boolean sameAs(ZonedDateTime inDateTimeUTC);
}
    