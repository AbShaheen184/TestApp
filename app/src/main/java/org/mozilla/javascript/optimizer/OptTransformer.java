package org.mozilla.javascript.optimizer;

import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.NodeTransformer;
import org.mozilla.javascript.ast.ScriptNode;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
class OptTransformer extends NodeTransformer {
    private List<OptFunctionNode> directCallTargets;
    private Map<String, OptFunctionNode> possibleDirectCalls;

    public OptTransformer(Map<String, OptFunctionNode> map, List<OptFunctionNode> list) {
        this.possibleDirectCalls = map;
        this.directCallTargets = list;
    }

    private void detectDirectCall(Node node, ScriptNode scriptNode) {
        String string;
        OptFunctionNode optFunctionNode;
        if (scriptNode.getType() == 122) {
            Node firstChild = node.getFirstChild();
            int i = 0;
            if (firstChild != null) {
                Node next = firstChild.getNext();
                while (next != null) {
                    next = next.getNext();
                    i++;
                }
            }
            if (i == 0) {
                OptFunctionNode.get(scriptNode).itsContainsCalls0 = true;
            }
            if (this.possibleDirectCalls != null) {
                if (firstChild.getType() == 44) {
                    string = firstChild.getString();
                } else if (firstChild.getType() == 33) {
                    string = firstChild.getFirstChild().getNext().getString();
                } else {
                    if (firstChild.getType() == 34) {
                        throw Kit.codeBug();
                    }
                    string = null;
                }
                if (string == null || (optFunctionNode = this.possibleDirectCalls.get(string)) == null || i != optFunctionNode.fnode.getParamCount() || optFunctionNode.fnode.requiresActivation() || i > 32) {
                    return;
                }
                node.putProp(9, optFunctionNode);
                if (optFunctionNode.isTargetOfDirectCall()) {
                    return;
                }
                int size = this.directCallTargets.size();
                this.directCallTargets.add(optFunctionNode);
                optFunctionNode.setDirectTargetIndex(size);
            }
        }
    }

    @Override // org.mozilla.javascript.NodeTransformer
    public void visitCall(Node node, ScriptNode scriptNode) {
        detectDirectCall(node, scriptNode);
        super.visitCall(node, scriptNode);
    }

    @Override // org.mozilla.javascript.NodeTransformer
    public void visitNew(Node node, ScriptNode scriptNode) {
        detectDirectCall(node, scriptNode);
        super.visitNew(node, scriptNode);
    }
}
