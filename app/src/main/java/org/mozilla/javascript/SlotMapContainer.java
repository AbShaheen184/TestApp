package org.mozilla.javascript;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
class SlotMapContainer implements SlotMap {
    private static final int DEFAULT_SIZE = 10;
    private static final int LARGE_HASH_SIZE = 2000;
    protected SlotMap map;

    public SlotMapContainer(int i) {
        if (i > LARGE_HASH_SIZE) {
            this.map = new HashSlotMap();
        } else {
            this.map = new EmbeddedSlotMap();
        }
    }

    @Override // org.mozilla.javascript.SlotMap
    public void add(Slot slot) {
        checkMapSize();
        this.map.add(slot);
    }

    public void checkMapSize() {
        SlotMap slotMap = this.map;
        if (!(slotMap instanceof EmbeddedSlotMap) || slotMap.size() < LARGE_HASH_SIZE) {
            return;
        }
        this.map = new HashSlotMap(this.map);
    }

    @Override // org.mozilla.javascript.SlotMap
    public <S extends Slot> S compute(Object obj, int i, SlotMap.SlotComputer<S> slotComputer) {
        return (S) this.map.compute(obj, i, slotComputer);
    }

    public int dirtySize() {
        return this.map.size();
    }

    @Override // org.mozilla.javascript.SlotMap
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<Slot> iterator() {
        return this.map.iterator();
    }

    @Override // org.mozilla.javascript.SlotMap
    public Slot modify(Object obj, int i, int i2) {
        checkMapSize();
        return this.map.modify(obj, i, i2);
    }

    @Override // org.mozilla.javascript.SlotMap
    public Slot query(Object obj, int i) {
        return this.map.query(obj, i);
    }

    public long readLock() {
        return 0L;
    }

    @Override // org.mozilla.javascript.SlotMap
    public int size() {
        return this.map.size();
    }

    public SlotMapContainer() {
        this(10);
    }

    public void unlockRead(long j) {
    }
}
