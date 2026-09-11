package org.mozilla.javascript;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements SlotMap.SlotComputer {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i) {
        this.a = i;
    }

    public static /* synthetic */ void a() {
        throw new IllegalStateException();
    }

    public static /* synthetic */ void b(String str) {
        throw new RuntimeException(str);
    }

    @Override // org.mozilla.javascript.SlotMap.SlotComputer
    public Slot compute(Object obj, int i, Slot slot) {
        switch (this.a) {
            case 2:
                return ScriptableObject.checkSlotRemoval(obj, i, slot);
            case 3:
                return ScriptableObject.ensureLazySlot(obj, i, slot);
            case 4:
                return ScriptableObject.ensureAccessorSlot(obj, i, slot);
            default:
                return ScriptableObject.ensureLambdaSlot(obj, i, slot);
        }
    }
}
