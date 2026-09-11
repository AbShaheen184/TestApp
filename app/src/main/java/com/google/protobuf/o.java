package com.google.protobuf;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o extends ByteString {
    public abstract boolean b(ByteString byteString, int i, int i2);

    @Override // com.google.protobuf.ByteString
    public final int getTreeDepth() {
        return 0;
    }

    @Override // com.google.protobuf.ByteString
    public final boolean isBalanced() {
        return true;
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        return super.iterator2();
    }

    @Override // com.google.protobuf.ByteString
    public final void writeToReverse(f fVar) {
        writeTo(fVar);
    }
}
