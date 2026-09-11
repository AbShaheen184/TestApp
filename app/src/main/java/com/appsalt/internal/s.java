package com.appsalt.internal;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements Comparator {
    public final /* synthetic */ int e;

    public s(int i) {
        this.e = i;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0017  */
    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    /* JADX WARN: Code duplicated, block: B:20:0x002f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        InetAddress inetAddress = (InetAddress) obj;
        boolean z = inetAddress instanceof Inet4Address;
        int i2 = 0;
        int i3 = this.e;
        if (z) {
            if (i3 != 2) {
                i = -1;
            } else {
                i = 1;
            }
        } else if (!(inetAddress instanceof Inet6Address)) {
            i = 0;
        } else if (i3 != 2) {
            i = 1;
        } else {
            i = -1;
        }
        Integer numValueOf = Integer.valueOf(i);
        InetAddress inetAddress2 = (InetAddress) obj2;
        if (inetAddress2 instanceof Inet4Address) {
            if (i3 != 2) {
                i2 = -1;
            } else {
                i2 = 1;
            }
        } else if (inetAddress2 instanceof Inet6Address) {
            if (i3 != 2) {
                i2 = 1;
            } else {
                i2 = -1;
            }
        }
        return com.google.android.material.resources.c.f(numValueOf, Integer.valueOf(i2));
    }
}
