package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class i extends d implements SortedMap {
    public SortedSet B;
    public final /* synthetic */ x0 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(x0 x0Var, SortedMap sortedMap) {
        super(x0Var, sortedMap);
        this.C = x0Var;
    }

    public SortedSet b() {
        return new j(this.C, d());
    }

    @Override // com.google.common.collect.d, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.B;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetB = b();
        this.B = sortedSetB;
        return sortedSetB;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.z;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new i(this.C, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new i(this.C, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new i(this.C, d().tailMap(obj));
    }
}
