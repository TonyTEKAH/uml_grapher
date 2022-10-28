package fr.lernejo.umlgrapher;
import org.apache.maven.surefire.shade.org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.List;

public class InternalGraphRepresentation {
    private final UmlType umlType;
    private final UmlRelation umlRelation;

    public InternalGraphRepresentation(Class[] classList) {
        this.umlType = new UmlType(classList);
        this.umlRelation = new UmlRelation(this.umlType);
    }

    public UmlType getUmlType() {
        return this.umlType;
    }

    public UmlRelation getUmlRelation() {
        return this.umlRelation;
    }
}
