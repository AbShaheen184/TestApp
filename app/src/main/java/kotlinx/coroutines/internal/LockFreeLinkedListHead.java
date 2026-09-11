package kotlinx.coroutines.internal;

import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class LockFreeLinkedListHead extends LockFreeLinkedListNode {
    public final void forEach(l lVar) {
        Object next = getNext();
        next.getClass();
        for (LockFreeLinkedListNode nextNode = (LockFreeLinkedListNode) next; !kotlin.jvm.internal.l.a(nextNode, this); nextNode = nextNode.getNextNode()) {
            lVar.invoke(nextNode);
        }
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public boolean isRemoved() {
        return false;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    /* JADX INFO: renamed from: remove, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ boolean mo85remove() {
        return ((Boolean) remove()).booleanValue();
    }

    public final Void remove() {
        throw new IllegalStateException("head cannot be removed");
    }
}
