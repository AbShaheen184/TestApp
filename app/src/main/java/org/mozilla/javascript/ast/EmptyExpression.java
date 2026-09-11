package org.mozilla.javascript.ast;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class EmptyExpression extends AstNode {
    public EmptyExpression() {
        this.type = Token.EMPTY;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        return makeIndent(i);
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }

    public EmptyExpression(int i) {
        super(i);
        this.type = Token.EMPTY;
    }

    public EmptyExpression(int i, int i2) {
        super(i, i2);
        this.type = Token.EMPTY;
    }
}
