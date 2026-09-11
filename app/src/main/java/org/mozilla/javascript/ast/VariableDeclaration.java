package org.mozilla.javascript.ast;

import androidx.privacysandbox.ads.adservices.java.internal.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import net.luminis.tls.engine.impl.c;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class VariableDeclaration extends AstNode {
    private boolean isStatement;
    private List<VariableInitializer> variables;

    public VariableDeclaration() {
        this.variables = new ArrayList();
        this.type = Token.VAR;
    }

    private String declTypeName() {
        return Token.typeToName(this.type).toLowerCase(Locale.ROOT);
    }

    public void addVariable(VariableInitializer variableInitializer) {
        assertNotNull(variableInitializer);
        this.variables.add(variableInitializer);
        variableInitializer.setParent(this);
    }

    public List<VariableInitializer> getVariables() {
        return this.variables;
    }

    public boolean isConst() {
        return this.type == 168;
    }

    public boolean isLet() {
        return this.type == 167;
    }

    public boolean isStatement() {
        return this.isStatement;
    }

    public boolean isVar() {
        return this.type == 135;
    }

    public void setIsStatement(boolean z) {
        this.isStatement = z;
    }

    @Override // org.mozilla.javascript.Node
    public Node setType(int i) {
        if (i == 135 || i == 168 || i == 167) {
            return super.setType(i);
        }
        c.o(a.l(i, "invalid decl type: "));
        return null;
    }

    public void setVariables(List<VariableInitializer> list) {
        assertNotNull(list);
        this.variables.clear();
        Iterator<VariableInitializer> it = list.iterator();
        while (it.hasNext()) {
            addVariable(it.next());
        }
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(makeIndent(i));
        sb.append(declTypeName());
        sb.append(" ");
        printList(this.variables, sb);
        if (isStatement()) {
            sb.append(";");
        }
        if (getInlineComment() != null) {
            sb.append(getInlineComment().toSource(i));
            sb.append("\n");
        } else if (isStatement()) {
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            Iterator<VariableInitializer> it = this.variables.iterator();
            while (it.hasNext()) {
                it.next().visit(nodeVisitor);
            }
        }
    }

    public VariableDeclaration(int i) {
        super(i);
        this.variables = new ArrayList();
        this.type = Token.VAR;
    }

    public VariableDeclaration(int i, int i2) {
        super(i, i2);
        this.variables = new ArrayList();
        this.type = Token.VAR;
    }
}
