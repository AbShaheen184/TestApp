package org.mozilla.javascript.ast;

import org.mozilla.javascript.ScriptRuntime;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class StringLiteral extends AstNode {
    private char quoteChar;
    private String value;

    public StringLiteral() {
        this.type = 46;
    }

    public char getQuoteCharacter() {
        return this.quoteChar;
    }

    public String getValue(boolean z) {
        if (!z) {
            return this.value;
        }
        char c = this.quoteChar;
        return c + this.value + c;
    }

    public void setQuoteCharacter(char c) {
        this.quoteChar = c;
    }

    public void setValue(String str) {
        assertNotNull(str);
        this.value = str;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        String strMakeIndent = makeIndent(i);
        char c = this.quoteChar;
        return strMakeIndent + c + ScriptRuntime.escapeString(this.value, c) + this.quoteChar;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }

    public StringLiteral(int i) {
        super(i);
        this.type = 46;
    }

    public StringLiteral(int i, int i2) {
        super(i, i2);
        this.type = 46;
    }

    public String getValue() {
        return this.value;
    }
}
