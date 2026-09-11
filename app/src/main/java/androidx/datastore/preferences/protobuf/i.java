package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public i(int i, int i2, int i3, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sbM = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.m(i, "Pos: ", ", limit: ");
        sbM.append(i2);
        sbM.append(", len: ");
        sbM.append(i3);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbM.toString()), indexOutOfBoundsException);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i(long j, long j2, int i, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sbM = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.m(j, "Pos: ", ", limit: ");
        sbM.append(j2);
        sbM.append(", len: ");
        sbM.append(i);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbM.toString()), indexOutOfBoundsException);
    }

    public i(int i, String str) {
        super("HTTP error fetching URL. Status=" + i + ", URL=[" + str + "]");
    }

    public /* synthetic */ i(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
