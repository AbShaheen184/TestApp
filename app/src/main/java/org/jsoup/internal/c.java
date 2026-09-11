package org.jsoup.internal;

import java.lang.ref.SoftReference;
import java.util.ArrayDeque;
import java.util.WeakHashMap;
import java.util.function.Supplier;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.jsoup.nodes.o;
import org.jsoup.nodes.p;
import org.jsoup.nodes.v;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Supplier {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i) {
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new byte[8192];
            case 1:
                return new SoftReference(new ArrayDeque());
            case 2:
                return new StringBuilder(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
            case 3:
                return new char[2];
            case 4:
                return new String[512];
            case 5:
                return new char[2048];
            case 6:
                return new org.jsoup.select.e();
            case 7:
                return new WeakHashMap();
            case 8:
                return new p(new v(""), o.class);
            case 9:
                return new org.schabi.newpipe.extractor.exceptions.f("Could not get uploader name");
            case 10:
                return new org.schabi.newpipe.extractor.exceptions.f("Could not get channel name");
            case 11:
                return new org.schabi.newpipe.extractor.exceptions.f("Could not get avatars");
            case 12:
                return new org.schabi.newpipe.extractor.exceptions.f("Could not get avatars");
            case 13:
                return new org.schabi.newpipe.extractor.exceptions.f("Could not get thumbnailOverlayBadgeViewModel");
            case 14:
                return new org.schabi.newpipe.extractor.exceptions.f("Could not get thumbnailBadgeViewModel");
            case 15:
                return new org.schabi.newpipe.extractor.exceptions.f("Could not get uploader info");
            default:
                return new org.schabi.newpipe.extractor.exceptions.f("Could not get playlist info");
        }
    }
}
