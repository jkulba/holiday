package us.kulba.holiday.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * Base model object used to include an override to the toString for all implementations.
 *
 * @author James Kulba, jkulba@gmail.com
 */
public class BaseObject implements Serializable {
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}
