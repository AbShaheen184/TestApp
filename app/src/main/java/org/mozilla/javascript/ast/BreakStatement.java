package org.mozilla.javascript.ast;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class BreakStatement extends Jump {
    private Name breakLabel;
    private AstNode targetNode;

    public BreakStatement(int i, int i2) {
        this.type = Token.BREAK;
        this.position = i;
        this.length = i2;
    }

    public Name getBreakLabel() {
        return this.breakLabel;
    }

    public AstNode getBreakTarget() {
        return this.targetNode;
    }

    public void setBreakLabel(Name name) {
        this.breakLabel = name;
        if (name != null) {
            name.setParent(this);
        }
    }

    public void setBreakTarget(Jump jump) {
        assertNotNull(jump);
        this.targetNode = jump;
        setJumpStatement(jump);
    }

    @Override // org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(makeIndent(i));
        sb.append("break");
        if (this.breakLabel != null) {
            sb.append(" ");
            sb.append(this.breakLabel.toSource(0));
        }
        sb.append(";\n");
        return sb.toString();
    }

    @Override // org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        Name name;
        if (!nodeVisitor.visit(this) || (name = this.breakLabel) == null) {
            return;
        }
        name.visit(nodeVisitor);
    }

    public BreakStatement(int i) {
        this.type = Token.BREAK;
        this.position = i;
    }

    public BreakStatement() {
        this.type = Token.BREAK;
    }
}
