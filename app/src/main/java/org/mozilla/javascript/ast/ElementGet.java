package org.mozilla.javascript.ast;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class ElementGet extends AstNode {
    private AstNode element;
    private int lb;
    private int rb;
    private AstNode target;

    public ElementGet(AstNode astNode, AstNode astNode2) {
        this.lb = -1;
        this.rb = -1;
        this.type = 39;
        setTarget(astNode);
        setElement(astNode2);
    }

    public AstNode getElement() {
        return this.element;
    }

    public int getLb() {
        return this.lb;
    }

    public int getRb() {
        return this.rb;
    }

    public AstNode getTarget() {
        return this.target;
    }

    public void setElement(AstNode astNode) {
        assertNotNull(astNode);
        this.element = astNode;
        astNode.setParent(this);
    }

    public void setLb(int i) {
        this.lb = i;
    }

    public void setParens(int i, int i2) {
        this.lb = i;
        this.rb = i2;
    }

    public void setRb(int i) {
        this.rb = i;
    }

    public void setTarget(AstNode astNode) {
        assertNotNull(astNode);
        this.target = astNode;
        astNode.setParent(this);
        setLineColumnNumber(astNode.getLineno(), astNode.getColumn());
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        return makeIndent(i) + this.target.toSource(0) + "[" + this.element.toSource(0) + "]";
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.target.visit(nodeVisitor);
            this.element.visit(nodeVisitor);
        }
    }

    public ElementGet(int i) {
        super(i);
        this.lb = -1;
        this.rb = -1;
        this.type = 39;
    }

    public ElementGet(int i, int i2) {
        super(i, i2);
        this.lb = -1;
        this.rb = -1;
        this.type = 39;
    }

    public ElementGet() {
        this.lb = -1;
        this.rb = -1;
        this.type = 39;
    }
}
