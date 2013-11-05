package org.openprovenance.prov.model;

import javax.xml.namespace.QName;

import org.w3c.dom.Element;


public interface TypedValue {

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public abstract Object getValue();

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public abstract void setValue(Object value);

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public abstract QName getType();

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public abstract Object getValueAsObject(ValueConverter vconv);

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public abstract void setValueAsObject(Object valueAsJava);

    /*
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public abstract void setType(QName value);

    public abstract Object getValueAsObject();

}