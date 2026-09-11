package org.schabi.newpipe.extractor.stream;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface h extends org.schabi.newpipe.extractor.d {
    String b();

    boolean c();

    String e();

    long f();

    boolean g();

    long getDuration();

    default void h() {
        List list = Collections.EMPTY_LIST;
    }

    String m();

    org.schabi.newpipe.extractor.localization.b n();

    int p();

    default void k() {
    }

    default void l() {
    }

    default void r() {
    }
}
