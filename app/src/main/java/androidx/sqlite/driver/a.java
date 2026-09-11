package androidx.sqlite.driver;

import androidx.datastore.preferences.protobuf.h1;
import java.io.IOException;
import java.util.Locale;
import kotlin.jvm.internal.l;
import kotlin.text.k;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements androidx.sqlite.a {
    public final androidx.sqlite.db.framework.b e;

    public a(androidx.sqlite.db.framework.b bVar) {
        bVar.getClass();
        this.e = bVar;
    }

    @Override // androidx.sqlite.a
    public final boolean H() {
        return this.e.H();
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ca  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.sqlite.a
    public final androidx.sqlite.c U(String str) {
        c cVar;
        int i;
        str.getClass();
        androidx.sqlite.db.framework.b bVar = this.e;
        b bVar2 = null;
        if (!bVar.isOpen()) {
            h1.y(21, "connection is closed");
            throw null;
        }
        String upperCase = k.A0(str).toString().toUpperCase(Locale.ROOT);
        upperCase.getClass();
        int length = upperCase.length() - 2;
        int i2 = -1;
        if (length >= 0) {
            int iA0 = 0;
            loop0: while (iA0 < length) {
                char cCharAt = upperCase.charAt(iA0);
                if (l.b(cCharAt, 32) > 0) {
                    if (cCharAt != '-') {
                        if (cCharAt == '/') {
                            int iA1 = iA0 + 1;
                            if (upperCase.charAt(iA1) == '*') {
                                do {
                                    iA1 = k.a0(upperCase, '*', iA1 + 1, 4);
                                    if (iA1 < 0) {
                                        break loop0;
                                    }
                                    i = iA1 + 1;
                                    if (i >= length) {
                                        break;
                                    }
                                } while (upperCase.charAt(i) != '/');
                                iA0 = iA1 + 2;
                            }
                        }
                        i2 = iA0;
                        break;
                    }
                    if (upperCase.charAt(iA0 + 1) != '-') {
                        i2 = iA0;
                        break;
                    }
                    iA0 = k.a0(upperCase, '\n', iA0 + 2, 4);
                    if (iA0 < 0) {
                        break;
                    }
                }
                iA0++;
            }
        }
        String strSubstring = (i2 < 0 || i2 > upperCase.length()) ? null : upperCase.substring(i2, Math.min(i2 + 3, upperCase.length()));
        if (strSubstring == null) {
            return new d(bVar, str);
        }
        switch (strSubstring.hashCode()) {
            case 65636:
                if (!strSubstring.equals("BEG")) {
                    cVar = null;
                } else if (!k.T(upperCase, "EXCLUSIVE", false)) {
                    cVar = !k.T(upperCase, "IMMEDIATE", false) ? c.B : c.A;
                } else {
                    cVar = c.z;
                }
                break;
            case 66913:
                if (!strSubstring.equals("COM")) {
                    cVar = null;
                } else {
                    cVar = c.e;
                }
                break;
            case 68795:
                if (!strSubstring.equals("END")) {
                    cVar = null;
                } else {
                    cVar = c.e;
                }
                break;
            case 81327:
                cVar = (!strSubstring.equals("ROL") || k.T(upperCase, " TO ", false)) ? null : c.y;
                break;
            default:
                cVar = null;
                break;
        }
        if (cVar != null) {
            return new d(bVar, str, cVar);
        }
        if (strSubstring.equals("PRA")) {
            String lowerCase = upperCase.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (k.T(k.q0(lowerCase, "journal_mode", ""), "=", false)) {
                bVar2 = b.a;
            }
        }
        if (bVar2 != null) {
            return new d(bVar, str, new e(bVar, str));
        }
        int iHashCode = strSubstring.hashCode();
        return (iHashCode == 79487 ? !strSubstring.equals("PRA") : iHashCode == 81978 ? !strSubstring.equals("SEL") : !(iHashCode == 85954 && strSubstring.equals("WIT"))) ? new d(bVar, str) : new e(bVar, str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.e.close();
    }
}
