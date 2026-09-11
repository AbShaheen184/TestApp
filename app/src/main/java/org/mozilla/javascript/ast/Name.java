package org.mozilla.javascript.ast;

import androidx.constraintlayout.core.g;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class Name extends AstNode {
    private String identifier;
    private Scope scope;

    public Name(int i, String str) {
        super(i);
        this.type = 44;
        setIdentifier(str);
        setLength(str.length());
    }

    public Scope getDefiningScope() {
        Scope enclosingScope = getEnclosingScope();
        String identifier = getIdentifier();
        if (enclosingScope == null) {
            return null;
        }
        return enclosingScope.getDefiningScope(identifier);
    }

    public String getIdentifier() {
        return this.identifier;
    }

    @Override // org.mozilla.javascript.Node
    public Scope getScope() {
        return this.scope;
    }

    public boolean isLocalName() {
        Scope definingScope = getDefiningScope();
        return (definingScope == null || definingScope.getParentScope() == null) ? false : true;
    }

    public int length() {
        String str = this.identifier;
        if (str == null) {
            return 0;
        }
        return str.length();
    }

    public void setIdentifier(String str) {
        assertNotNull(str);
        this.identifier = str;
        setLength(str.length());
    }

    @Override // org.mozilla.javascript.Node
    public void setScope(Scope scope) {
        this.scope = scope;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        String strMakeIndent = makeIndent(i);
        String str = this.identifier;
        if (str == null) {
            str = "<null>";
        }
        return g.c(strMakeIndent, str);
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }

    public Name(int i) {
        super(i);
        this.type = 44;
    }

    public Name(int i, int i2) {
        super(i, i2);
        this.type = 44;
    }

    public Name(int i, int i2, String str) {
        super(i, i2);
        this.type = 44;
        setIdentifier(str);
    }

    public Name() {
        this.type = 44;
    }
}
