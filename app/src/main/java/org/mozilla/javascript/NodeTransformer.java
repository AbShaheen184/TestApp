package org.mozilla.javascript;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.Jump;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.Scope;
import org.mozilla.javascript.ast.ScriptNode;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class NodeTransformer {
    private boolean hasFinally;
    private Deque<Node> loopEnds;
    private Deque<Node> loops;

    private static Node addBeforeCurrent(Node node, Node node2, Node node3, Node node4) {
        if (node2 == null) {
            if (node3 != node.getFirstChild()) {
                Kit.codeBug();
            }
            node.addChildToFront(node4);
            return node4;
        }
        if (node3 != node2.getNext()) {
            Kit.codeBug();
        }
        node.addChildAfter(node4, node2);
        return node4;
    }

    private static Node replaceCurrent(Node node, Node node2, Node node3, Node node4) {
        if (node2 == null) {
            if (node3 != node.getFirstChild()) {
                Kit.codeBug();
            }
            node.replaceChild(node3, node4);
            return node4;
        }
        if (node2.next == node3) {
            node.replaceChildAfter(node2, node4);
            return node4;
        }
        node.replaceChild(node3, node4);
        return node4;
    }

    private void transformCompilationUnit(ScriptNode scriptNode, boolean z) {
        this.loops = new ArrayDeque();
        this.loopEnds = new ArrayDeque();
        this.hasFinally = false;
        boolean z2 = scriptNode.getType() != 122 || ((FunctionNode) scriptNode).requiresActivation();
        scriptNode.flattenSymbolTable(!z2);
        transformCompilationUnit_r(scriptNode, scriptNode, scriptNode, z2, z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x018e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0195  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:108:0x01af  */
    /* JADX WARN: Code duplicated, block: B:118:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:122:0x020c  */
    /* JADX WARN: Code duplicated, block: B:178:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:180:0x02eb A[LOOP:5: B:180:0x02eb->B:182:0x02f3, LOOP_START, PHI: r2
  0x02eb: PHI (r2v13 org.mozilla.javascript.Node) = (r2v11 org.mozilla.javascript.Node), (r2v16 org.mozilla.javascript.Node) binds: [B:179:0x02e9, B:182:0x02f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:182:0x02f3 A[LOOP:5: B:180:0x02eb->B:182:0x02f3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:187:0x0308  */
    /* JADX WARN: Code duplicated, block: B:189:0x0318  */
    /* JADX WARN: Code duplicated, block: B:192:0x0324  */
    /* JADX WARN: Code duplicated, block: B:194:0x032a  */
    /* JADX WARN: Code duplicated, block: B:199:0x033d  */
    /* JADX WARN: Code duplicated, block: B:234:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:241:0x040c  */
    /* JADX WARN: Code duplicated, block: B:243:0x0417  */
    /* JADX WARN: Code duplicated, block: B:247:0x01cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x01ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0089  */
    /* JADX WARN: Code duplicated, block: B:85:0x0150  */
    /* JADX WARN: Code duplicated, block: B:87:0x015a  */
    /* JADX WARN: Code duplicated, block: B:93:0x016f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0177  */
    /* JADX WARN: Code duplicated, block: B:98:0x0184  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [org.mozilla.javascript.NodeTransformer] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [org.mozilla.javascript.Node] */
    /* JADX WARN: Type inference failed for: r3v27, types: [org.mozilla.javascript.Node] */
    /* JADX WARN: Type inference failed for: r3v28, types: [org.mozilla.javascript.Node] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30, types: [org.mozilla.javascript.Node] */
    /* JADX WARN: Type inference failed for: r3v33 */
    private void transformCompilationUnit_r(ScriptNode scriptNode, Node node, Scope scope, boolean z, boolean z2) {
        ?? AddBeforeCurrent;
        Node next;
        Node nodeReplaceCurrent;
        Scope scope2;
        Node node2;
        Node node3;
        Jump jump;
        Node firstChild;
        Node firstChild2;
        Node lastChild;
        Node firstChild3;
        Scope definingScope;
        boolean z3;
        Node node4;
        Node firstChild4;
        int i;
        Node next2;
        ?? r0 = this;
        scriptNode = scriptNode;
        scope = scope;
        Map<String, org.mozilla.javascript.ast.Symbol> map = null;
        Node node5 = null;
        while (true) {
            if (node5 == null) {
                next = node.getFirstChild();
                AddBeforeCurrent = map;
            } else {
                AddBeforeCurrent = node5;
                next = node5.getNext();
            }
            if (next == null) {
                return;
            }
            int type = next.getType();
            if (z && ((type == 143 || type == 146 || type == 171) && (next instanceof Scope))) {
                Scope scope3 = (Scope) next;
                if (scope3.getSymbolTable() != null) {
                    Node node6 = new Node(type == 171 ? 172 : 167);
                    Node node7 = new Node(Token.LET);
                    node6.addChildToBack(node7);
                    Iterator<String> it = scope3.getSymbolTable().keySet().iterator();
                    while (it.hasNext()) {
                        node7.addChildToBack(Node.newString(44, it.next()));
                    }
                    scope3.setSymbolTable(map);
                    Node nodeReplaceCurrent2 = replaceCurrent(node, AddBeforeCurrent, next, node6);
                    int type2 = nodeReplaceCurrent2.getType();
                    node6.addChildToBack(next);
                    nodeReplaceCurrent = nodeReplaceCurrent2;
                    type = type2;
                } else {
                    nodeReplaceCurrent = next;
                }
            } else {
                nodeReplaceCurrent = next;
            }
            if (type != 3) {
                boolean z4 = false;
                if (type == 4) {
                    if (scriptNode.getType() == 122 && ((FunctionNode) scriptNode).isGenerator()) {
                        z4 = true;
                    }
                    if (z4) {
                        nodeReplaceCurrent.putIntProp(20, 1);
                    }
                    if (r0.hasFinally) {
                        Node node8 = null;
                        for (Node node9 : r0.loops) {
                            int type3 = node9.getType();
                            if (type3 == 90 || type3 == 136) {
                                if (type3 == 90) {
                                    jump = new Jump(Token.JSR);
                                    jump.target = ((Jump) node9).getFinally();
                                } else {
                                    node2 = new Node(3);
                                }
                                if (node8 == null) {
                                    node3 = node2;
                                    node3 = jump;
                                    Node node10 = new Node(Token.BLOCK);
                                    node3.setLineColumnNumber(nodeReplaceCurrent.getLineno(), nodeReplaceCurrent.getColumn());
                                    node8 = node10;
                                } else {
                                    node3 = node2;
                                    node3 = jump;
                                    node8 = node8;
                                }
                                node8.addChildToBack(node3);
                            }
                        }
                        if (node8 != null) {
                            Node firstChild5 = nodeReplaceCurrent.getFirstChild();
                            Node nodeReplaceCurrent3 = replaceCurrent(node, AddBeforeCurrent, nodeReplaceCurrent, node8);
                            if (firstChild5 == null || z4) {
                                node8.addChildToBack(nodeReplaceCurrent);
                            } else {
                                Node node11 = new Node(Token.EXPR_RESULT, firstChild5);
                                node8.addChildToFront(node11);
                                node8.addChildToBack(new Node(70));
                                r0.transformCompilationUnit_r(scriptNode, node11, scope, z, z2);
                            }
                            node5 = nodeReplaceCurrent3;
                        }
                    }
                } else if (type == 7) {
                    firstChild = nodeReplaceCurrent.getFirstChild();
                    if (type == 7) {
                        while (firstChild.getType() == 26) {
                            firstChild = firstChild.getFirstChild();
                        }
                        if (firstChild.getType() != 12 || firstChild.getType() == 13) {
                            firstChild2 = firstChild.getFirstChild();
                            lastChild = firstChild.getLastChild();
                            if (firstChild2.getType() != 44 && firstChild2.getString().equals("undefined")) {
                                firstChild = lastChild;
                            } else if (lastChild.getType() == 44 && lastChild.getString().equals("undefined")) {
                                firstChild = firstChild2;
                            }
                        }
                    }
                    if (firstChild.getType() == 33) {
                        firstChild.setType(34);
                    }
                } else {
                    if (type != 8) {
                        if (type == 43) {
                            r0.visitCall(nodeReplaceCurrent, scriptNode);
                        } else if (type != 44) {
                            if (type == 72) {
                                Object[] objArr = (Object[]) nodeReplaceCurrent.getProp(12);
                                if (objArr != null) {
                                    for (Object obj : objArr) {
                                        if (obj instanceof Node) {
                                            r0.transformCompilationUnit_r(scriptNode, (Node) obj, nodeReplaceCurrent instanceof Scope ? (Scope) nodeReplaceCurrent : scope, z, z2);
                                        }
                                    }
                                }
                            } else if (type == 78) {
                                ((FunctionNode) scriptNode).addResumptionPoint(nodeReplaceCurrent);
                            } else if (type == 90) {
                                Node node12 = ((Jump) nodeReplaceCurrent).getFinally();
                                if (node12 != null) {
                                    r0.hasFinally = true;
                                    r0.loops.push(nodeReplaceCurrent);
                                    r0.loopEnds.push(node12);
                                }
                            } else if (type == 127) {
                                r0.loops.push(nodeReplaceCurrent);
                                r0.loopEnds.push(((Jump) nodeReplaceCurrent).target);
                            } else if (type == 151) {
                                Scope definingScope2 = scope.getDefiningScope(nodeReplaceCurrent.getString());
                                if (definingScope2 != null) {
                                    nodeReplaceCurrent.setScope(definingScope2);
                                }
                            } else if (type == 172) {
                                if (nodeReplaceCurrent.getFirstChild().getType() == 167) {
                                    if (scriptNode.getType() == 122 || ((FunctionNode) scriptNode).requiresActivation()) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    nodeReplaceCurrent = r0.visitLet(z3, node, AddBeforeCurrent, nodeReplaceCurrent);
                                } else {
                                    node4 = new Node(Token.BLOCK);
                                    firstChild4 = nodeReplaceCurrent.getFirstChild();
                                    while (firstChild4 != null) {
                                        Node next3 = firstChild4.getNext();
                                        if (firstChild4.getType() == 44) {
                                            if (!firstChild4.hasChildren()) {
                                                Node firstChild6 = firstChild4.getFirstChild();
                                                firstChild4.removeChild(firstChild6);
                                                firstChild4.setType(54);
                                                if (type == 168) {
                                                    i = Token.SETCONST;
                                                } else {
                                                    i = 8;
                                                }
                                                firstChild4 = new Node(i, firstChild4, firstChild6);
                                            }
                                            firstChild4 = next3;
                                        } else if (firstChild4.getType() != 172) {
                                            throw Kit.codeBug();
                                        }
                                        Node node13 = new Node(Token.EXPR_VOID, firstChild4);
                                        node13.setLineColumnNumber(nodeReplaceCurrent.getLineno(), nodeReplaceCurrent.getColumn());
                                        node4.addChildToBack(node13);
                                        firstChild4 = next3;
                                    }
                                    nodeReplaceCurrent = replaceCurrent(node, AddBeforeCurrent, nodeReplaceCurrent, node4);
                                }
                            } else if (type != 179) {
                                switch (type) {
                                    case 30:
                                        r0.visitNew(nodeReplaceCurrent, scriptNode);
                                        break;
                                    case 31:
                                        break;
                                    case 32:
                                        firstChild = nodeReplaceCurrent.getFirstChild();
                                        if (type == 7) {
                                            while (firstChild.getType() == 26) {
                                                firstChild = firstChild.getFirstChild();
                                            }
                                            if (firstChild.getType() != 12) {
                                                firstChild2 = firstChild.getFirstChild();
                                                lastChild = firstChild.getLastChild();
                                                if (firstChild2.getType() != 44) {
                                                    if (lastChild.getType() == 44) {
                                                        firstChild = firstChild2;
                                                    }
                                                } else if (lastChild.getType() == 44) {
                                                    firstChild = firstChild2;
                                                }
                                            } else {
                                                firstChild2 = firstChild.getFirstChild();
                                                lastChild = firstChild.getLastChild();
                                                if (firstChild2.getType() != 44) {
                                                    if (lastChild.getType() == 44) {
                                                        firstChild = firstChild2;
                                                    }
                                                } else if (lastChild.getType() == 44) {
                                                    firstChild = firstChild2;
                                                }
                                            }
                                        }
                                        if (firstChild.getType() == 33) {
                                            firstChild.setType(34);
                                        }
                                        break;
                                    default:
                                        switch (type) {
                                            case Token.BREAK /* 133 */:
                                            case Token.CONTINUE /* 134 */:
                                                Jump jump2 = (Jump) nodeReplaceCurrent;
                                                Jump jumpStatement = jump2.getJumpStatement();
                                                if (jumpStatement == null) {
                                                    Kit.codeBug();
                                                }
                                                if (r0.loops.isEmpty()) {
                                                    throw Kit.codeBug();
                                                }
                                                Iterator<Node> it2 = r0.loops.iterator();
                                                while (it2.hasNext() && (next2 = it2.next()) != jumpStatement) {
                                                    int type4 = next2.getType();
                                                    if (type4 == 136) {
                                                        AddBeforeCurrent = addBeforeCurrent(node, AddBeforeCurrent, nodeReplaceCurrent, new Node(3));
                                                    } else if (type4 == 90) {
                                                        Jump jump3 = new Jump(Token.JSR);
                                                        jump3.target = ((Jump) next2).getFinally();
                                                        AddBeforeCurrent = addBeforeCurrent(node, AddBeforeCurrent, nodeReplaceCurrent, jump3);
                                                    }
                                                }
                                                if (type == 133) {
                                                    jump2.target = jumpStatement.target;
                                                } else {
                                                    jump2.target = jumpStatement.getContinue();
                                                }
                                                jump2.setType(5);
                                                break;
                                                break;
                                            case Token.VAR /* 135 */:
                                                node4 = new Node(Token.BLOCK);
                                                firstChild4 = nodeReplaceCurrent.getFirstChild();
                                                while (firstChild4 != null) {
                                                    Node next4 = firstChild4.getNext();
                                                    if (firstChild4.getType() == 44) {
                                                        if (!firstChild4.hasChildren()) {
                                                            Node firstChild7 = firstChild4.getFirstChild();
                                                            firstChild4.removeChild(firstChild7);
                                                            firstChild4.setType(54);
                                                            if (type == 168) {
                                                                i = Token.SETCONST;
                                                            } else {
                                                                i = 8;
                                                            }
                                                            firstChild4 = new Node(i, firstChild4, firstChild7);
                                                        }
                                                        firstChild4 = next4;
                                                    } else if (firstChild4.getType() != 172) {
                                                        throw Kit.codeBug();
                                                    }
                                                    Node node14 = new Node(Token.EXPR_VOID, firstChild4);
                                                    node14.setLineColumnNumber(nodeReplaceCurrent.getLineno(), nodeReplaceCurrent.getColumn());
                                                    node4.addChildToBack(node14);
                                                    firstChild4 = next4;
                                                }
                                                nodeReplaceCurrent = replaceCurrent(node, AddBeforeCurrent, nodeReplaceCurrent, node4);
                                                break;
                                            case Token.WITH /* 136 */:
                                                r0.loops.push(nodeReplaceCurrent);
                                                Node next5 = nodeReplaceCurrent.getNext();
                                                if (next5.getType() != 3) {
                                                    Kit.codeBug();
                                                }
                                                r0.loopEnds.push(next5);
                                                break;
                                            default:
                                                switch (type) {
                                                    case Token.LABEL /* 144 */:
                                                    case Token.LOOP /* 146 */:
                                                        r0.loops.push(nodeReplaceCurrent);
                                                        r0.loopEnds.push(((Jump) nodeReplaceCurrent).target);
                                                        break;
                                                    case Token.TARGET /* 145 */:
                                                        if (!r0.loopEnds.isEmpty() && r0.loopEnds.peek() == nodeReplaceCurrent) {
                                                            r0.loopEnds.pop();
                                                            r0.loops.pop();
                                                        }
                                                        break;
                                                    default:
                                                        switch (type) {
                                                            case Token.LET /* 167 */:
                                                                if (nodeReplaceCurrent.getFirstChild().getType() == 167) {
                                                                    if (scriptNode.getType() == 122) {
                                                                        z3 = true;
                                                                    } else {
                                                                        z3 = true;
                                                                    }
                                                                    nodeReplaceCurrent = r0.visitLet(z3, node, AddBeforeCurrent, nodeReplaceCurrent);
                                                                } else {
                                                                    node4 = new Node(Token.BLOCK);
                                                                    firstChild4 = nodeReplaceCurrent.getFirstChild();
                                                                    while (firstChild4 != null) {
                                                                        Node next6 = firstChild4.getNext();
                                                                        if (firstChild4.getType() == 44) {
                                                                            if (!firstChild4.hasChildren()) {
                                                                                Node firstChild8 = firstChild4.getFirstChild();
                                                                                firstChild4.removeChild(firstChild8);
                                                                                firstChild4.setType(54);
                                                                                if (type == 168) {
                                                                                    i = Token.SETCONST;
                                                                                } else {
                                                                                    i = 8;
                                                                                }
                                                                                firstChild4 = new Node(i, firstChild4, firstChild8);
                                                                            }
                                                                            firstChild4 = next6;
                                                                        } else if (firstChild4.getType() != 172) {
                                                                            throw Kit.codeBug();
                                                                        }
                                                                        Node node15 = new Node(Token.EXPR_VOID, firstChild4);
                                                                        node15.setLineColumnNumber(nodeReplaceCurrent.getLineno(), nodeReplaceCurrent.getColumn());
                                                                        node4.addChildToBack(node15);
                                                                        firstChild4 = next6;
                                                                    }
                                                                    nodeReplaceCurrent = replaceCurrent(node, AddBeforeCurrent, nodeReplaceCurrent, node4);
                                                                }
                                                                break;
                                                            case Token.CONST /* 168 */:
                                                                node4 = new Node(Token.BLOCK);
                                                                firstChild4 = nodeReplaceCurrent.getFirstChild();
                                                                while (firstChild4 != null) {
                                                                    Node next7 = firstChild4.getNext();
                                                                    if (firstChild4.getType() == 44) {
                                                                        if (!firstChild4.hasChildren()) {
                                                                            Node firstChild9 = firstChild4.getFirstChild();
                                                                            firstChild4.removeChild(firstChild9);
                                                                            firstChild4.setType(54);
                                                                            if (type == 168) {
                                                                                i = Token.SETCONST;
                                                                            } else {
                                                                                i = 8;
                                                                            }
                                                                            firstChild4 = new Node(i, firstChild4, firstChild9);
                                                                        }
                                                                        firstChild4 = next7;
                                                                    } else if (firstChild4.getType() != 172) {
                                                                        throw Kit.codeBug();
                                                                    }
                                                                    Node node16 = new Node(Token.EXPR_VOID, firstChild4);
                                                                    node16.setLineColumnNumber(nodeReplaceCurrent.getLineno(), nodeReplaceCurrent.getColumn());
                                                                    node4.addChildToBack(node16);
                                                                    firstChild4 = next7;
                                                                }
                                                                nodeReplaceCurrent = replaceCurrent(node, AddBeforeCurrent, nodeReplaceCurrent, node4);
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                ((FunctionNode) scriptNode).addResumptionPoint(nodeReplaceCurrent);
                            }
                        }
                    } else if (z2) {
                        nodeReplaceCurrent.setType(80);
                        if (nodeReplaceCurrent.getFirstChild().getType() == 54) {
                            Node firstChild10 = nodeReplaceCurrent.getFirstChild();
                            if ((firstChild10 instanceof Name) && ((Name) firstChild10).getIdentifier().equals("eval")) {
                                Context.reportError("syntax error");
                            }
                        }
                    }
                    if (!z) {
                        if (type == 44) {
                            firstChild3 = nodeReplaceCurrent;
                        } else {
                            firstChild3 = nodeReplaceCurrent.getFirstChild();
                            if (firstChild3.getType() != 54) {
                                if (type != 31) {
                                    throw Kit.codeBug();
                                }
                            }
                        }
                        if (firstChild3.getScope() == null && (definingScope = scope.getDefiningScope(firstChild3.getString())) != null) {
                            firstChild3.setScope(definingScope);
                            if (type == 44) {
                                nodeReplaceCurrent.setType(60);
                            } else if (type == 8 || type == 80) {
                                nodeReplaceCurrent.setType(61);
                                firstChild3.setType(46);
                            } else if (type == 169) {
                                nodeReplaceCurrent.setType(170);
                                firstChild3.setType(46);
                            } else {
                                if (type != 31) {
                                    throw Kit.codeBug();
                                }
                                nodeReplaceCurrent = replaceCurrent(node, AddBeforeCurrent, nodeReplaceCurrent, new Node(49));
                            }
                        }
                    }
                }
                node5 = nodeReplaceCurrent;
                if (node5 instanceof Scope) {
                    scope2 = (Scope) node5;
                } else {
                    scope2 = scope;
                }
                r0.transformCompilationUnit_r(scriptNode, node5, scope2, z, z2);
                r0 = this;
            } else {
                if (!r0.loopEnds.isEmpty()) {
                    r0.loopEnds.pop();
                    r0.loops.pop();
                }
                node5 = nodeReplaceCurrent;
                if (node5 instanceof Scope) {
                    scope2 = (Scope) node5;
                } else {
                    scope2 = scope;
                }
                r0.transformCompilationUnit_r(scriptNode, node5, scope2, z, z2);
                r0 = this;
            }
            map = null;
            r0 = r0;
        }
    }

    public final void transform(ScriptNode scriptNode, boolean z, CompilerEnvirons compilerEnvirons) {
        if (compilerEnvirons.getLanguageVersion() >= 200 && scriptNode.isInStrictMode()) {
            z = true;
        }
        transformCompilationUnit(scriptNode, z);
        for (int i = 0; i != scriptNode.getFunctionCount(); i++) {
            transform(scriptNode.getFunctionNode(i), z, compilerEnvirons);
        }
    }

    public Node visitLet(boolean z, Node node, Node node2, Node node3) {
        Node node4;
        Node firstChild;
        Node node5;
        Node firstChild2;
        Node firstChild3 = node3.getFirstChild();
        Node next = firstChild3.getNext();
        node3.removeChild(firstChild3);
        node3.removeChild(next);
        int type = node3.getType();
        int i = Token.LETEXPR;
        boolean z2 = type == 172;
        int i2 = Token.LET;
        if (z) {
            Node nodeReplaceCurrent = replaceCurrent(node, node2, node3, new Node(z2 ? 173 : 143));
            ArrayList arrayList = new ArrayList();
            Node node6 = new Node(72);
            Node firstChild4 = firstChild3.getFirstChild();
            while (firstChild4 != null) {
                if (firstChild4.getType() == i) {
                    List list = (List) firstChild4.getProp(22);
                    Node firstChild5 = firstChild4.getFirstChild();
                    if (firstChild5.getType() != i2) {
                        throw Kit.codeBug();
                    }
                    node5 = z2 ? new Node(98, firstChild5.getNext(), next) : new Node(Token.BLOCK, new Node(Token.EXPR_VOID, firstChild5.getNext()), next);
                    if (list != null) {
                        arrayList.addAll(list);
                        for (int i3 = 0; i3 < list.size(); i3++) {
                            node6.addChildToBack(new Node(Token.VOID, Node.newNumber(0.0d)));
                        }
                    }
                    firstChild2 = firstChild5.getFirstChild();
                } else {
                    node5 = next;
                    firstChild2 = firstChild4;
                }
                if (firstChild2.getType() != 44) {
                    throw Kit.codeBug();
                }
                arrayList.add(ScriptRuntime.getIndexObject(firstChild2.getString()));
                Node firstChild6 = firstChild2.getFirstChild();
                if (firstChild6 == null) {
                    firstChild6 = new Node(Token.VOID, Node.newNumber(0.0d));
                }
                node6.addChildToBack(firstChild6);
                firstChild4 = firstChild4.getNext();
                next = node5;
                i = Token.LETEXPR;
                i2 = Token.LET;
            }
            node6.putProp(12, arrayList.toArray());
            nodeReplaceCurrent.addChildToBack(new Node(2, node6));
            nodeReplaceCurrent.addChildToBack(new Node(Token.WITH, next));
            nodeReplaceCurrent.addChildToBack(new Node(3));
            return nodeReplaceCurrent;
        }
        Node nodeReplaceCurrent2 = replaceCurrent(node, node2, node3, new Node(z2 ? 98 : 143));
        Node node7 = new Node(98);
        Node firstChild7 = firstChild3.getFirstChild();
        while (firstChild7 != null) {
            if (firstChild7.getType() == 172) {
                Node firstChild8 = firstChild7.getFirstChild();
                if (firstChild8.getType() != 167) {
                    throw Kit.codeBug();
                }
                node4 = z2 ? new Node(98, firstChild8.getNext(), next) : new Node(Token.BLOCK, new Node(Token.EXPR_VOID, firstChild8.getNext()), next);
                Scope.joinScopes((Scope) firstChild7, (Scope) node3);
                firstChild = firstChild8.getFirstChild();
            } else {
                node4 = next;
                firstChild = firstChild7;
            }
            if (firstChild.getType() != 44) {
                throw Kit.codeBug();
            }
            Node nodeNewString = Node.newString(firstChild.getString());
            nodeNewString.setScope((Scope) node3);
            Node firstChild9 = firstChild.getFirstChild();
            if (firstChild9 == null) {
                firstChild9 = new Node(Token.VOID, Node.newNumber(0.0d));
            }
            node7.addChildToBack(new Node(61, nodeNewString, firstChild9));
            firstChild7 = firstChild7.getNext();
            next = node4;
        }
        if (z2) {
            nodeReplaceCurrent2.addChildToBack(node7);
            node3.setType(98);
            nodeReplaceCurrent2.addChildToBack(node3);
            node3.addChildToBack(next);
            if (next instanceof Scope) {
                Scope scope = (Scope) next;
                Scope parentScope = scope.getParentScope();
                Scope scope2 = (Scope) node3;
                scope.setParentScope(scope2);
                scope2.setParentScope(parentScope);
                return nodeReplaceCurrent2;
            }
        } else {
            nodeReplaceCurrent2.addChildToBack(new Node(Token.EXPR_VOID, node7));
            node3.setType(Token.BLOCK);
            nodeReplaceCurrent2.addChildToBack(node3);
            node3.addChildrenToBack(next);
            if (next instanceof Scope) {
                Scope scope3 = (Scope) next;
                Scope parentScope2 = scope3.getParentScope();
                Scope scope4 = (Scope) node3;
                scope3.setParentScope(scope4);
                scope4.setParentScope(parentScope2);
            }
        }
        return nodeReplaceCurrent2;
    }

    public final void transform(ScriptNode scriptNode, CompilerEnvirons compilerEnvirons) {
        transform(scriptNode, false, compilerEnvirons);
    }

    public void visitCall(Node node, ScriptNode scriptNode) {
    }

    public void visitNew(Node node, ScriptNode scriptNode) {
    }
}
