package org.mozilla.javascript.ast;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class GeneratorMethodDefinition extends AstNode {
    private AstNode methodName;

    public GeneratorMethodDefinition(int i, int i2, AstNode astNode) {
        super(i, i2);
        setType(23);
        setMethodName(astNode);
    }

    public AstNode getMethodName() {
        return this.methodName;
    }

    public void setMethodName(AstNode astNode) {
        assertNotNull(astNode);
        this.methodName = astNode;
        astNode.setParent(this);
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        return c.i(makeIndent(i), "*", this.methodName.toSource(i));
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.methodName.visit(nodeVisitor);
        }
    }
}
