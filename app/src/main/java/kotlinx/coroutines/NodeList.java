package kotlinx.coroutines;

import kotlin.jvm.internal.l;
import kotlinx.coroutines.internal.LockFreeLinkedListHead;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class NodeList extends LockFreeLinkedListHead implements Incomplete {
    public final String getString(String str) {
        StringBuilder sbX = androidx.privacysandbox.ads.adservices.java.internal.a.x("List{", str, "}[");
        Object next = getNext();
        next.getClass();
        boolean z = true;
        for (LockFreeLinkedListNode nextNode = (LockFreeLinkedListNode) next; !l.a(nextNode, this); nextNode = nextNode.getNextNode()) {
            if (nextNode instanceof JobNode) {
                if (z) {
                    z = false;
                } else {
                    sbX.append(", ");
                }
                sbX.append(nextNode);
            }
        }
        sbX.append("]");
        return sbX.toString();
    }

    @Override // kotlinx.coroutines.Incomplete
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public String toString() {
        return super.toString();
    }

    @Override // kotlinx.coroutines.Incomplete
    public NodeList getList() {
        return this;
    }
}
