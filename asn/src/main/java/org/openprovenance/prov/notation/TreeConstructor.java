package org.openprovenance.prov.notation;
import java.util.List;

public interface TreeConstructor {
    /* Component 1 */

    public Object convertEntity(Object id, Object attrs);
    public Object convertActivity(Object id,Object startTime,Object endTime, Object aAttrs);
    public Object convertStart(String start);
    public Object convertEnd(String end);
    public Object convertUsed(Object id, Object id2,Object id1, Object time, Object aAttrs);
    public Object convertWasGeneratedBy(Object id, Object id2,Object id1, Object time, Object aAttrs);
    public Object convertWasStartedBy(Object id, Object id2,Object id1, Object time, Object aAttrs);
    public Object convertWasEndedBy(Object id, Object id2,Object id1, Object time, Object aAttrs);
    public Object convertWasInformedBy(Object id, Object id2, Object id1, Object aAttrs);
    public Object convertWasStartedByActivity(Object id, Object id2, Object id1, Object aAttrs);


    /* Component 2 */

    public Object convertAgent(Object id, Object attrs);
    public Object convertWasAttributedTo(Object id, Object id2,Object id1, Object aAttrs);
    public Object convertWasAssociatedWith(Object id, Object id2,Object id1, Object pl, Object aAttrs);
    public Object convertActedOnBehalfOf(Object id, Object id2,Object id1, Object a, Object aAttrs);

    /* Component 3 */
    public Object convertWasDerivedFrom(Object id, Object id2,Object id1, Object pe, Object q2, Object q1, Object dAttrs);
    public Object convertWasRevisionOf(Object id, Object id2,Object id1, Object ag, Object dAttrs);
    public Object convertWasQuotedFrom(Object id, Object id2,Object id1, Object ag2, Object ag1, Object dAttrs);
    public Object convertHadOriginalSource(Object id, Object id2,Object id1, Object dAttrs);
    public Object convertTracedTo(Object id, Object id2, Object id1, Object dAttrs);


    /* Component 4 */
    public Object convertAlternateOf(Object id2,Object id1);
    public Object convertSpecializationOf(Object id2,Object id1);

    /* Component 5 */
    /* Component 6 */

    public Object convertNote(Object id, Object attrs);
    public Object convertHasAnnotation(Object something, Object note);

    /* Other conversions */

    public Object convertContainer(Object nss, List<Object> records);
    public Object convertAttributes(List<Object> attributes);
    public Object convertId(String id);
    public Object convertAttribute(Object name, Object value);
    public Object convertString(String s);
    public Object convertInt(int i);
    public Object convertQNAME(String qname);
    public Object convertIRI(String iri);
    public Object convertPrefix(String pre);
    public Object convertTypedLiteral(String datatype, Object value);
    public Object convertNamespace(Object pre, Object iri);
    public Object convertDefaultNamespace(Object iri);
    public Object convertNamespaces(List<Object> namespaces);
}