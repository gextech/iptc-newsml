
package gex.newsml.v12;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="updateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "updateType")
@XmlEnum
public enum UpdateType {

    U,
    A,
    N;

    public String value() {
        return name();
    }

    public static UpdateType fromValue(String v) {
        return valueOf(v);
    }

}
