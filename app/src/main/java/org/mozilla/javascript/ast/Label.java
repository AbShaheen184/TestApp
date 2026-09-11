package org.mozilla.javascript.ast;

import androidx.privacysandbox.ads.adservices.java.internal.a;
import net.luminis.tls.engine.impl.c;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class Label extends Jump {
    private String name;

    public Label(int i, int i2) {
        this.type = Token.LABEL;
        this.position = i;
        this.length = i2;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        String strTrim = str == null ? null : str.trim();
        if (strTrim == null || "".equals(strTrim)) {
            c.o("invalid label name");
        } else {
            this.name = strTrim;
        }
    }

    @Override // org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(makeIndent(i));
        return a.u(sb, this.name, ":\n");
    }

    @Override // org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }

    public Label(int i) {
        this(i, -1);
    }

    public Label() {
        this.type = Token.LABEL;
    }

    public Label(int i, int i2, String str) {
        this(i, i2);
        setName(str);
    }
}
