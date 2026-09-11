package org.mozilla.javascript.ast;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class XmlExpression extends XmlFragment {
    private AstNode expression;
    private boolean isXmlAttribute;

    public XmlExpression(int i, AstNode astNode) {
        super(i);
        setExpression(astNode);
    }

    public AstNode getExpression() {
        return this.expression;
    }

    public boolean isXmlAttribute() {
        return this.isXmlAttribute;
    }

    public void setExpression(AstNode astNode) {
        assertNotNull(astNode);
        this.expression = astNode;
        astNode.setParent(this);
    }

    public void setIsXmlAttribute(boolean z) {
        this.isXmlAttribute = z;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        return makeIndent(i) + "{" + this.expression.toSource(i) + "}";
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.expression.visit(nodeVisitor);
        }
    }

    public XmlExpression(int i) {
        super(i);
    }

    public XmlExpression(int i, int i2) {
        super(i, i2);
    }

    public XmlExpression() {
    }
}
