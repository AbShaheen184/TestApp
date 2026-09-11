package org.mozilla.javascript.ast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectLiteral extends AstNode implements DestructuringForm {
    private static final List<ObjectProperty> NO_ELEMS = Collections.unmodifiableList(new ArrayList());
    private List<ObjectProperty> elements;
    boolean isDestructuring;

    public ObjectLiteral() {
        this.type = 72;
    }

    public void addElement(ObjectProperty objectProperty) {
        assertNotNull(objectProperty);
        if (this.elements == null) {
            this.elements = new ArrayList();
        }
        this.elements.add(objectProperty);
        objectProperty.setParent(this);
    }

    public List<ObjectProperty> getElements() {
        List<ObjectProperty> list = this.elements;
        return list != null ? list : NO_ELEMS;
    }

    @Override // org.mozilla.javascript.ast.DestructuringForm
    public boolean isDestructuring() {
        return this.isDestructuring;
    }

    public void setElements(List<ObjectProperty> list) {
        if (list == null) {
            this.elements = null;
            return;
        }
        List<ObjectProperty> list2 = this.elements;
        if (list2 != null) {
            list2.clear();
        }
        Iterator<ObjectProperty> it = list.iterator();
        while (it.hasNext()) {
            addElement(it.next());
        }
    }

    @Override // org.mozilla.javascript.ast.DestructuringForm
    public void setIsDestructuring(boolean z) {
        this.isDestructuring = z;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(makeIndent(i));
        sb.append("{");
        if (this.elements != null) {
            sb.append("\n");
            Iterator<ObjectProperty> it = this.elements.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                sb.append(it.next().toSource(i));
                if (sb.charAt(sb.length() - 1) == '\n') {
                    sb.deleteCharAt(sb.length() - 1);
                }
                if (i2 < this.elements.size() - 1) {
                    sb.append(",");
                }
                sb.append("\n");
                i2++;
            }
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            Iterator<ObjectProperty> it = getElements().iterator();
            while (it.hasNext()) {
                it.next().visit(nodeVisitor);
            }
        }
    }

    public ObjectLiteral(int i) {
        super(i);
        this.type = 72;
    }

    public ObjectLiteral(int i, int i2) {
        super(i, i2);
        this.type = 72;
    }
}
