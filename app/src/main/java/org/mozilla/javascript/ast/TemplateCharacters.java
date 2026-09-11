package org.mozilla.javascript.ast;

import androidx.constraintlayout.core.g;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class TemplateCharacters extends AstNode {
    private String rawValue;
    private String value;

    public TemplateCharacters() {
        this.type = Token.TEMPLATE_CHARS;
    }

    public String getRawValue() {
        return this.rawValue;
    }

    public String getValue() {
        return this.value;
    }

    public void setRawValue(String str) {
        assertNotNull(str);
        this.rawValue = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        return g.c(makeIndent(i), this.rawValue);
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }

    public TemplateCharacters(int i) {
        super(i);
        this.type = Token.TEMPLATE_CHARS;
    }

    public TemplateCharacters(int i, int i2) {
        super(i, i2);
        this.type = Token.TEMPLATE_CHARS;
    }
}
