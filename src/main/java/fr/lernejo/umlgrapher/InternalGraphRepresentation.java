package fr.lernejo.umlgrapher;
import org.apache.maven.surefire.shade.org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.List;

public class InternalGraphRepresentation {
    private final UmlRelation relation;
    private final UmlType type;

    public InternalGraphRepresentation(Class[] classes) {
        this.type = new UmlType(classes);
        this.relation = new UmlRelation(this.type);
    }

    public UmlRelation getRelation() {
        return this.relation;
    }

    public UmlType getType() {
        return this.type;
    }
}
