package org.mozilla.javascript.ast;

import androidx.privacysandbox.ads.adservices.java.internal.a;
import net.luminis.tls.engine.impl.c;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class UpdateExpression extends AstNode {
    private boolean isPostfix;
    private AstNode operand;

    public UpdateExpression(int i, int i2, AstNode astNode, boolean z) {
        assertNotNull(astNode);
        setBounds(z ? astNode.getPosition() : i2, z ? i2 + 2 : astNode.getPosition() + astNode.getLength());
        setOperator(i);
        setOperand(astNode);
        this.isPostfix = z;
    }

    public AstNode getOperand() {
        return this.operand;
    }

    public int getOperator() {
        return this.type;
    }

    public boolean isPostfix() {
        return this.isPostfix;
    }

    public boolean isPrefix() {
        return !this.isPostfix;
    }

    public void setIsPostfix(boolean z) {
        this.isPostfix = z;
    }

    public void setOperand(AstNode astNode) {
        assertNotNull(astNode);
        this.operand = astNode;
        astNode.setParent(this);
    }

    public void setOperator(int i) {
        if (Token.isValidToken(i)) {
            setType(i);
        } else {
            c.o(a.l(i, "Invalid token: "));
        }
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(makeIndent(i));
        int type = getType();
        if (!this.isPostfix) {
            sb.append(AstNode.operatorToString(type));
        }
        sb.append(this.operand.toSource());
        if (this.isPostfix) {
            sb.append(AstNode.operatorToString(type));
        }
        return sb.toString();
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.operand.visit(nodeVisitor);
        }
    }

    public UpdateExpression(int i) {
        super(i);
    }

    public UpdateExpression(int i, int i2) {
        super(i, i2);
    }

    public UpdateExpression(int i, int i2, AstNode astNode) {
        this(i, i2, astNode, false);
    }

    public UpdateExpression() {
    }
}
