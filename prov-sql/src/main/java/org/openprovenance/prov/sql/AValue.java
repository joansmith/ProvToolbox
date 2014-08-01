package org.openprovenance.prov.sql;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;
import org.openprovenance.prov.model.ProvUtilities;


/**
 * <p>Java class for AValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="int" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="string" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="long" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="short" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="double" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="float" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="decimal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="boolean" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="byte" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="anyURI" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="qname" type="{http://www.w3.org/2001/XMLSchema}QName"/>
 *         &lt;element name="unsignedInt" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="unsignedLong" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="gYear" type="{http://www.w3.org/2001/XMLSchema}gYear"/>
 *         &lt;element name="integer" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AValue", propOrder = {
    "_int",
    "string",
    "_long",
    "_short",
    "_double",
    "_float",
    "decimal",
    "_boolean",
    "_byte",
    "anyURI",
    "qname",
    "unsignedInt",
    "unsignedLong",
    "dateTime",
    "gYear",
    "integer"
})
@Embeddable
public class AValue
    implements Equals, HashCode
{

    @XmlElement(name = "int")
    protected Integer _int;
    protected String string;
    @XmlElement(name = "long")
    protected Long _long;
    @XmlElement(name = "short")
    protected Short _short;
    @XmlElement(name = "double")
    protected Double _double;
    @XmlElement(name = "float")
    protected Float _float;
    protected BigDecimal decimal;
    @XmlElement(name = "boolean")
    protected Boolean _boolean;
    @XmlElement(name = "byte")
    protected Byte _byte;
    @XmlSchemaType(name = "anyURI")
    protected String anyURI;
    protected QualifiedName qname;
    @XmlSchemaType(name = "unsignedInt")
    protected Long unsignedInt;
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger unsignedLong;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar gYear;
    protected BigInteger integer;

    
    /**
     * Gets the value of the string property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    //    @Column(name = "STRING")
    //    @Lob
//   @Column(name = "STRING", length = 255)
   @Column(name = "STRING", columnDefinition="TEXT")
    public String getString() {
        return string;
    }

    /**
     * Sets the value of the string property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString(String value) {
        this.string = value;
    }

    /**
     * Gets the value of the long property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Basic
    @Column(name = "LONG_", precision = 20, scale = 0)
    public Long getLong() {
        return _long;
    }

    /**
     * Sets the value of the long property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLong(Long value) {
        this._long = value;
    }


    /**
     * Gets the value of the double property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    @Basic
    @Column(name = "DOUBLE_", precision = 20, scale = 10)
    public Double getDouble() {
        return _double;
    }

    /**
     * Sets the value of the double property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDouble(Double value) {
        this._double = value;
    }

    /**
     * Gets the value of the float property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    @Basic
    @Column(name = "FLOAT_", precision = 20, scale = 10)
    public Float getFloat() {
        return _float;
    }

    /**
     * Sets the value of the float property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFloat(Float value) {
        this._float = value;
    }


    
    /**
     * Gets the value of the qname property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    
    @ManyToOne(targetEntity = org.openprovenance.prov.sql.QualifiedName.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "QN")
    public QualifiedName getQname() {
        return qname;
    }

    /**
     * Sets the value of the qname property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setQname(QualifiedName value) {
        this.qname = value;
    }

   
    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Transient
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the gYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Transient
    public XMLGregorianCalendar getGYear() {
        return gYear;
    }

    /**
     * Sets the value of the gYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGYear(XMLGregorianCalendar value) {
        this.gYear = value;
    }

 /*

    @Basic
    @Column(name = "QNAMEITEM")
    public String getQnameItem() {
    	QName qn=(this.getQname()==null)? null : this.getQname().toQName();
        return XmlAdapterUtils.unmarshall(QNameAsString.class, qn);
    }

    public void setQnameItem(String target) {
    	QName qname=XmlAdapterUtils.marshall(QNameAsString.class, target);
    	QualifiedName qn=(qname==null)? null : new QualifiedName(qname.getNamespaceURI(),qname.getLocalPart(),qname.getPrefix());
        setQname(qn);
    }
*/
    @Basic
    @Column(name = "DATETIMEITEM")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getDateTimeItem() {
        return ProvUtilities.toDate(this.getDateTime());

    }

    public void setDateTimeItem(Date target) {
        setDateTime(ProvUtilities.toXMLGregorianCalendar(target));
    }

    /*
    public Date getDateTimeItem() {
        return XmlAdapterUtils.unmarshall(XMLGregorianCalendarAsDateTime.class, this.getDateTime());
    }

    public void setDateTimeItem(Date target) {
        setDateTime(XmlAdapterUtils.marshall(XMLGregorianCalendarAsDateTime.class, target));
    }*/

    @Basic
    @Column(name = "GYEARITEM")
    @Temporal(TemporalType.DATE)
    public Date getGYearItem() {
        //return XmlAdapterUtils.unmarshall(XMLGregorianCalendarAsGYear.class, this.getGYear());
        return ProvUtilities.toDate(this.getGYear());

    }

    public void setGYearItem(Date target) {
        //setGYear(XmlAdapterUtils.marshall(XMLGregorianCalendarAsGYear.class, target));
        setGYear(ProvUtilities.toXMLGregorianCalendar(target));

    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AValue)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AValue that = ((AValue) object);
   
        {
            String lhsString;
            lhsString = this.getString();
            String rhsString;
            rhsString = that.getString();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "string", lhsString), LocatorUtils.property(thatLocator, "string", rhsString), lhsString, rhsString)) {
                return false;
            }
        }
        {
            Long lhsLong;
            lhsLong = this.getLong();
            Long rhsLong;
            rhsLong = that.getLong();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "_long", lhsLong), LocatorUtils.property(thatLocator, "_long", rhsLong), lhsLong, rhsLong)) {
                return false;
            }
        }
        {
            Double lhsDouble;
            lhsDouble = this.getDouble();
            Double rhsDouble;
            rhsDouble = that.getDouble();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "_double", lhsDouble), LocatorUtils.property(thatLocator, "_double", rhsDouble), lhsDouble, rhsDouble)) {
                return false;
            }
        }
        {
            Float lhsFloat;
            lhsFloat = this.getFloat();
            Float rhsFloat;
            rhsFloat = that.getFloat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "_float", lhsFloat), LocatorUtils.property(thatLocator, "_float", rhsFloat), lhsFloat, rhsFloat)) {
                return false;
            }
        }
         {
            QualifiedName lhsQname;
            lhsQname = this.getQname();
            QualifiedName rhsQname;
            rhsQname = that.getQname();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "qname", lhsQname), LocatorUtils.property(thatLocator, "qname", rhsQname), lhsQname, rhsQname)) {
                return false;
            }
        }
         {
            XMLGregorianCalendar lhsDateTime;
            lhsDateTime = this.getDateTime();
            XMLGregorianCalendar rhsDateTime;
            rhsDateTime = that.getDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateTime", lhsDateTime), LocatorUtils.property(thatLocator, "dateTime", rhsDateTime), lhsDateTime, rhsDateTime)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsGYear;
            lhsGYear = this.getGYear();
            XMLGregorianCalendar rhsGYear;
            rhsGYear = that.getGYear();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gYear", lhsGYear), LocatorUtils.property(thatLocator, "gYear", rhsGYear), lhsGYear, rhsGYear)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
       
        {
            String theString;
            theString = this.getString();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "string", theString), currentHashCode, theString);
        }
        {
            Long theLong;
            theLong = this.getLong();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_long", theLong), currentHashCode, theLong);
        }
        {
            Double theDouble;
            theDouble = this.getDouble();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_double", theDouble), currentHashCode, theDouble);
        }
        {
            Float theFloat;
            theFloat = this.getFloat();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_float", theFloat), currentHashCode, theFloat);
        }
        {
            QualifiedName theQname;
            theQname = this.getQname();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "qname", theQname), currentHashCode, theQname);
        }
        {
            XMLGregorianCalendar theDateTime;
            theDateTime = this.getDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dateTime", theDateTime), currentHashCode, theDateTime);
        }
        {
            XMLGregorianCalendar theGYear;
            theGYear = this.getGYear();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gYear", theGYear), currentHashCode, theGYear);
        }
  
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
