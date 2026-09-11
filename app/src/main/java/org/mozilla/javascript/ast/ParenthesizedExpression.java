package org.mozilla.javascript.ast;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class ParenthesizedExpression extends AstNode {
    private AstNode expression;

    public ParenthesizedExpression(AstNode astNode) {
        this(astNode != null ? astNode.getPosition() : 0, astNode != null ? astNode.getLength() : 1, astNode);
    }

    public AstNode getExpression() {
        return this.expression;
    }

    public void setExpression(AstNode astNode) {
        assertNotNull(astNode);
        this.expression = astNode;
        astNode.setParent(this);
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        return makeIndent(i) + "(" + this.expression.toSource(0) + ")";
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.expression.visit(nodeVisitor);
        }
    }

    public ParenthesizedExpression(int i) {
        super(i);
        this.type = 96;
    }

    public ParenthesizedExpression(int i, int i2) {
        super(i, i2);
        this.type = 96;
    }

    public ParenthesizedExpression() {
        this.type = 96;
    }

    public ParenthesizedExpression(int i, int i2, AstNode astNode) {
        super(i, i2);
        this.type = 96;
        setExpression(astNode);
    }
}
