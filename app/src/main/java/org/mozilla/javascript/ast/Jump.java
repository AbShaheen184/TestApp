package org.mozilla.javascript.ast;

import org.mozilla.javascript.Node;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class Jump extends AstNode {
    private Jump jumpNode;
    public Node target;
    private Node target2;

    public Jump() {
        this.type = -1;
    }

    public Node getContinue() {
        if (this.type != 146) {
            AstNode.codeBug();
        }
        return this.target2;
    }

    public Node getDefault() {
        if (this.type != 127) {
            AstNode.codeBug();
        }
        return this.target2;
    }

    public Node getFinally() {
        if (this.type != 90) {
            AstNode.codeBug();
        }
        return this.target2;
    }

    public Jump getJumpStatement() {
        int i = this.type;
        if (i != 133 && i != 134) {
            AstNode.codeBug();
        }
        return this.jumpNode;
    }

    public Jump getLoop() {
        if (this.type != 144) {
            AstNode.codeBug();
        }
        return this.jumpNode;
    }

    public void setContinue(Node node) {
        if (this.type != 146) {
            AstNode.codeBug();
        }
        if (node.getType() != 145) {
            AstNode.codeBug();
        }
        if (this.target2 != null) {
            AstNode.codeBug();
        }
        this.target2 = node;
    }

    public void setDefault(Node node) {
        if (this.type != 127) {
            AstNode.codeBug();
        }
        if (node.getType() != 145) {
            AstNode.codeBug();
        }
        if (this.target2 != null) {
            AstNode.codeBug();
        }
        this.target2 = node;
    }

    public void setFinally(Node node) {
        if (this.type != 90) {
            AstNode.codeBug();
        }
        if (node.getType() != 145) {
            AstNode.codeBug();
        }
        if (this.target2 != null) {
            AstNode.codeBug();
        }
        this.target2 = node;
    }

    public void setJumpStatement(Jump jump) {
        int i = this.type;
        if (i != 133 && i != 134) {
            AstNode.codeBug();
        }
        if (jump == null) {
            AstNode.codeBug();
        }
        if (this.jumpNode != null) {
            AstNode.codeBug();
        }
        this.jumpNode = jump;
    }

    public void setLoop(Jump jump) {
        if (this.type != 144) {
            AstNode.codeBug();
        }
        if (jump == null) {
            AstNode.codeBug();
        }
        if (this.jumpNode != null) {
            AstNode.codeBug();
        }
        this.jumpNode = jump;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        throw new UnsupportedOperationException(toString());
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        throw new UnsupportedOperationException(toString());
    }

    public Jump(int i) {
        this.type = i;
    }

    public Jump(int i, Node node) {
        this(i);
        addChildToBack(node);
    }
}
