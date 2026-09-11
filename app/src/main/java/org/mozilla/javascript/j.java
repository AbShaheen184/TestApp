package org.mozilla.javascript;

import org.mozilla.javascript.ast.AstNode;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Parser.Transformer, ContextAction {
    public final /* synthetic */ Object e;

    public /* synthetic */ j(Object obj) {
        this.e = obj;
    }

    @Override // org.mozilla.javascript.ContextAction
    public Object run(Context context) {
        return JavaAdapter.lambda$runScript$1((Script) this.e, context);
    }

    @Override // org.mozilla.javascript.Parser.Transformer
    public Node transform(AstNode astNode) {
        return ((IRFactory) this.e).transform(astNode);
    }
}
