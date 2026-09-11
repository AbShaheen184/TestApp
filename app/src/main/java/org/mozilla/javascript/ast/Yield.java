package org.mozilla.javascript.ast;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class Yield extends AstNode {
    private AstNode value;

    public Yield(int i, int i2, AstNode astNode, boolean z) {
        super(i, i2);
        this.type = z ? Token.YIELD_STAR : 78;
        setValue(astNode);
    }

    public AstNode getValue() {
        return this.value;
    }

    public void setValue(AstNode astNode) {
        this.value = astNode;
        if (astNode != null) {
            astNode.setParent(this);
        }
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        AstNode astNode = this.value;
        return astNode == null ? "yield" : c.h("yield ", astNode.toSource(0));
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        AstNode astNode;
        if (!nodeVisitor.visit(this) || (astNode = this.value) == null) {
            return;
        }
        astNode.visit(nodeVisitor);
    }

    public Yield(int i) {
        super(i);
        this.type = 78;
    }

    public Yield(int i, int i2) {
        super(i, i2);
        this.type = 78;
    }

    public Yield() {
        this.type = 78;
    }
}
