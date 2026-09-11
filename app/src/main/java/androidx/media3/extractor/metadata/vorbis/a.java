package androidx.media3.extractor.metadata.vorbis;

import androidx.media3.common.e0;
import androidx.media3.common.g0;
import com.google.common.base.b;
import kotlin.collections.a0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements g0 {
    public final String a;
    public final String b;

    public a(String str, String str2) {
        this.a = b.x(str);
        this.b = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.media3.common.g0
    public final void b(e0 e0Var) {
        String str = this.a;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    b = 0;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    b = 1;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    b = 2;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    b = 3;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    b = 4;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    b = 5;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    b = 6;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    b = 7;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    b = 8;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    b = 9;
                }
                break;
        }
        String str2 = this.b;
        switch (b) {
            case 0:
                Integer numJ = a0.J(str2);
                if (numJ != null) {
                    e0Var.i = numJ;
                }
                break;
            case 1:
                Integer numJ2 = a0.J(str2);
                if (numJ2 != null) {
                    e0Var.v = numJ2;
                }
                break;
            case 2:
                Integer numJ3 = a0.J(str2);
                if (numJ3 != null) {
                    e0Var.h = numJ3;
                }
                break;
            case 3:
                e0Var.c = str2;
                break;
            case 4:
                e0Var.w = str2;
                break;
            case 5:
                e0Var.a = str2;
                break;
            case 6:
                e0Var.e = str2;
                break;
            case 7:
                Integer numJ4 = a0.J(str2);
                if (numJ4 != null) {
                    e0Var.u = numJ4;
                }
                break;
            case 8:
                e0Var.d = str2;
                break;
            case 9:
                e0Var.b = str2;
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.a.equals(aVar.a) && this.b.equals(aVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.e(527, 31, this.a);
    }

    public final String toString() {
        return "VC: " + this.a + "=" + this.b;
    }
}
