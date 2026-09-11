package org.mozilla.javascript.ast;

import androidx.constraintlayout.core.g;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class XmlString extends XmlFragment {
    private String xml;

    public XmlString(int i, String str) {
        super(i);
        setXml(str);
    }

    public String getXml() {
        return this.xml;
    }

    public void setXml(String str) {
        assertNotNull(str);
        this.xml = str;
        setLength(str.length());
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        return g.c(makeIndent(i), this.xml);
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }

    public XmlString(int i) {
        super(i);
    }

    public XmlString() {
    }
}
