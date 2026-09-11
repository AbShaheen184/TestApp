package org.mozilla.javascript.ast;

import androidx.constraintlayout.core.g;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class BigIntLiteral extends AstNode {
    private BigInteger bigInt;
    private String value;

    public BigIntLiteral(int i, String str) {
        super(i);
        this.type = 89;
        setValue(str);
        setLength(str.length());
    }

    @Override // org.mozilla.javascript.Node
    public BigInteger getBigInt() {
        return this.bigInt;
    }

    public String getValue() {
        return this.value;
    }

    @Override // org.mozilla.javascript.Node
    public void setBigInt(BigInteger bigInteger) {
        this.bigInt = bigInteger;
    }

    public void setValue(String str) {
        assertNotNull(str);
        this.value = str;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        String strMakeIndent = makeIndent(i);
        BigInteger bigInteger = this.bigInt;
        return g.c(strMakeIndent, bigInteger == null ? "<null>" : g.c(bigInteger.toString(), "n"));
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }

    public BigIntLiteral(int i) {
        super(i);
        this.type = 89;
    }

    public BigIntLiteral(int i, int i2) {
        super(i, i2);
        this.type = 89;
    }

    public BigIntLiteral() {
        this.type = 89;
    }

    public BigIntLiteral(int i, String str, BigInteger bigInteger) {
        this(i, str);
        setBigInt(bigInteger);
    }
}
