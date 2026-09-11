package org.mozilla.javascript.ast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class XmlLiteral extends AstNode {
    private List<XmlFragment> fragments;

    public XmlLiteral() {
        this.fragments = new ArrayList();
        this.type = Token.XML;
    }

    public void addFragment(XmlFragment xmlFragment) {
        assertNotNull(xmlFragment);
        this.fragments.add(xmlFragment);
        xmlFragment.setParent(this);
    }

    public List<XmlFragment> getFragments() {
        return this.fragments;
    }

    public void setFragments(List<XmlFragment> list) {
        assertNotNull(list);
        this.fragments.clear();
        Iterator<XmlFragment> it = list.iterator();
        while (it.hasNext()) {
            addFragment(it.next());
        }
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        StringBuilder sb = new StringBuilder(Context.VERSION_ECMASCRIPT);
        Iterator<XmlFragment> it = this.fragments.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toSource(0));
        }
        return sb.toString();
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            Iterator<XmlFragment> it = this.fragments.iterator();
            while (it.hasNext()) {
                it.next().visit(nodeVisitor);
            }
        }
    }

    public XmlLiteral(int i) {
        super(i);
        this.fragments = new ArrayList();
        this.type = Token.XML;
    }

    public XmlLiteral(int i, int i2) {
        super(i, i2);
        this.fragments = new ArrayList();
        this.type = Token.XML;
    }
}
