package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class gc implements Comparable {
    public static final AtomicReferenceFieldUpdater z = AtomicReferenceFieldUpdater.newUpdater(gc.class, Object.class, "y");
    public final String e;
    public volatile Object y;

    public /* synthetic */ gc(String str, byte[] bArr) {
        this.e = str;
        this.y = bArr;
    }

    public final /* synthetic */ void a(byte[] bArr) {
        byte[][] bArr2;
        int i = 0;
        while (true) {
            Object obj = this.y;
            if (!(obj instanceof byte[])) {
                byte[][] bArr3 = (byte[][]) obj;
                while (true) {
                    int length = bArr3.length;
                    if (i >= length) {
                        bArr2 = (byte[][]) Arrays.copyOf(bArr3, length + 1);
                        bArr2[length] = bArr;
                        break;
                    } else if (Arrays.equals(bArr, bArr3[i])) {
                        return;
                    } else {
                        i++;
                    }
                }
            } else {
                byte[] bArr4 = (byte[]) obj;
                if (Arrays.equals(bArr, bArr4)) {
                    return;
                }
                i = 1;
                bArr2 = new byte[][]{bArr4, bArr};
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = z;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, bArr2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
            return;
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.e.compareTo((String) obj);
    }
}
