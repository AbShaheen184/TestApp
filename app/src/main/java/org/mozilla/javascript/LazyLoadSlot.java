package org.mozilla.javascript;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class LazyLoadSlot extends Slot {
    public LazyLoadSlot(Object obj, int i) {
        super(obj, i, 0);
    }

    @Override // org.mozilla.javascript.Slot
    public LazyLoadSlot copySlot() {
        LazyLoadSlot lazyLoadSlot = new LazyLoadSlot(this);
        lazyLoadSlot.value = this.value;
        lazyLoadSlot.next = null;
        lazyLoadSlot.orderedNext = null;
        return lazyLoadSlot;
    }

    @Override // org.mozilla.javascript.Slot
    public Object getValue(Scriptable scriptable) {
        Object obj = this.value;
        if (!(obj instanceof LazilyLoadedCtor)) {
            return obj;
        }
        LazilyLoadedCtor lazilyLoadedCtor = (LazilyLoadedCtor) obj;
        try {
            lazilyLoadedCtor.init();
            return lazilyLoadedCtor.getValue();
        } finally {
            this.value = lazilyLoadedCtor.getValue();
        }
    }

    public LazyLoadSlot(Slot slot) {
        super(slot);
    }
}
