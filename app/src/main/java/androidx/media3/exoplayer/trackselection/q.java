package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.w0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface q {
    boolean a(int i, long j);

    int b(androidx.media3.common.r rVar);

    w0 c();

    int d();

    default boolean e(long j, androidx.media3.exoplayer.source.chunk.f fVar, List list) {
        return false;
    }

    void f(boolean z);

    androidx.media3.common.r g(int i);

    void h();

    int i(int i);

    int j(long j, List list);

    void k();

    void l(long j, long j2, long j3, List list, androidx.media3.exoplayer.source.chunk.l[] lVarArr);

    int length();

    int m();

    androidx.media3.common.r n();

    int o();

    boolean p(int i, long j);

    void q(float f);

    Object r();

    int u(int i);

    default void s() {
    }

    default void t() {
    }
}
