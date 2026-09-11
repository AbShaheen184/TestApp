package org.mozilla.javascript.ast;

import androidx.privacysandbox.ads.adservices.java.internal.a;
import net.luminis.tls.engine.impl.c;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class KeywordLiteral extends AstNode {
    public KeywordLiteral(int i, int i2, int i3) {
        super(i, i2);
        setType(i3);
    }

    public boolean isBooleanLiteral() {
        int i = this.type;
        return i == 50 || i == 49;
    }

    @Override // org.mozilla.javascript.Node
    public KeywordLiteral setType(int i) {
        if (i == 48 || i == 79 || i == 47 || i == 50 || i == 49 || i == 174) {
            this.type = i;
            return this;
        }
        c.o(a.l(i, "Invalid node type: "));
        return null;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(makeIndent(i));
        int type = getType();
        if (type == 79) {
            sb.append("super");
        } else if (type != 174) {
            switch (type) {
                case Token.NULL /* 47 */:
                    sb.append("null");
                    break;
                case Token.THIS /* 48 */:
                    sb.append("this");
                    break;
                case Token.FALSE /* 49 */:
                    sb.append("false");
                    break;
                case Token.TRUE /* 50 */:
                    sb.append("true");
                    break;
                default:
                    c.r(a.l(getType(), "Invalid keyword literal type: "));
                    return null;
            }
        } else {
            sb.append("debugger;\n");
        }
        return sb.toString();
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }

    public KeywordLiteral(int i) {
        super(i);
    }

    public KeywordLiteral(int i, int i2) {
        super(i, i2);
    }

    public KeywordLiteral() {
    }
}
