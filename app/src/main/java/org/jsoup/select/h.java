package org.jsoup.select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends p {
    public final /* synthetic */ int a;
    public final String b;

    public h(String str, int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = org.jsoup.internal.b.c(str);
                break;
            case 4:
                StringBuilder sbB = org.jsoup.internal.k.b();
                org.jsoup.internal.k.a(str, sbB, false);
                this.b = org.jsoup.internal.b.c(org.jsoup.internal.k.l(sbB));
                break;
            case 5:
                StringBuilder sbB2 = org.jsoup.internal.k.b();
                org.jsoup.internal.k.a(str, sbB2, false);
                this.b = org.jsoup.internal.b.c(org.jsoup.internal.k.l(sbB2));
                break;
            default:
                this.b = org.jsoup.internal.b.c(str);
                break;
        }
    }

    @Override // org.jsoup.select.p
    public int a() {
        switch (this.a) {
            case 0:
                return 2;
            case 1:
                return 6;
            case 2:
                return 8;
            case 3:
            case 4:
            case 6:
            default:
                return super.a();
            case 5:
                return 10;
            case 7:
                return 10;
            case 8:
                return 2;
            case 9:
                return 1;
        }
    }

    @Override // org.jsoup.select.p
    public final boolean b(org.jsoup.nodes.j jVar, org.jsoup.nodes.j jVar2) {
        switch (this.a) {
            case 0:
                return jVar2.q(this.b);
            case 1:
                org.jsoup.nodes.b bVarF = jVar2.f();
                bVarF.getClass();
                ArrayList arrayList = new ArrayList(bVarF.e);
                for (int i = 0; i < bVarF.e; i++) {
                    String str = bVarF.y[i];
                    if (!org.jsoup.nodes.b.o(str)) {
                        arrayList.add(new org.jsoup.nodes.a(str, (String) bVarF.z[i], bVarF));
                    }
                }
                Iterator it = Collections.unmodifiableList(arrayList).iterator();
                while (it.hasNext()) {
                    if (org.jsoup.internal.b.c(((org.jsoup.nodes.a) it.next()).e).startsWith(this.b)) {
                        return true;
                    }
                }
                return false;
            case 2:
                org.jsoup.nodes.b bVar = jVar2.C;
                if (bVar == null) {
                    return false;
                }
                String strI = bVar.i("class");
                int length = strI.length();
                String str2 = this.b;
                int length2 = str2.length();
                if (length == 0 || length < length2) {
                    return false;
                }
                if (length == length2) {
                    return str2.equalsIgnoreCase(strI);
                }
                boolean z = false;
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    if (Character.isWhitespace(strI.charAt(i3))) {
                        if (!z) {
                            continue;
                        } else {
                            if (i3 - i2 == length2 && strI.regionMatches(true, i2, str2, 0, length2)) {
                                return true;
                            }
                            z = false;
                        }
                    } else if (!z) {
                        i2 = i3;
                        z = true;
                    }
                }
                if (z && length - i2 == length2) {
                    return strI.regionMatches(true, i2, str2, 0, length2);
                }
                return false;
            case 3:
                jVar2.getClass();
                StringBuilder sbB = org.jsoup.internal.k.b();
                new com.google.android.datatransport.runtime.scheduling.jobscheduling.l(sbB, 16).j(jVar2);
                return org.jsoup.internal.b.c(org.jsoup.internal.k.l(sbB)).contains(this.b);
            case 4:
                return org.jsoup.internal.b.c(jVar2.a0()).contains(this.b);
            case 5:
                return org.jsoup.internal.b.c(jVar2.d0()).contains(this.b);
            case 6:
                return ((String) jVar2.B.stream().map(new androidx.media3.exoplayer.audio.f(7)).collect(org.jsoup.internal.k.k(""))).contains(this.b);
            case 7:
                jVar2.getClass();
                return ((String) com.google.android.material.shape.e.j(jVar2, org.jsoup.nodes.o.class).map(new androidx.media3.exoplayer.audio.f(7)).collect(org.jsoup.internal.k.k(""))).contains(this.b);
            case 8:
                org.jsoup.nodes.b bVar2 = jVar2.C;
                return this.b.equals(bVar2 != null ? bVar2.i("id") : "");
            case 9:
                return jVar2.s(this.b);
            case 10:
                return jVar2.A.z.endsWith(this.b);
            default:
                return jVar2.A.z.startsWith(this.b);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return androidx.privacysandbox.ads.adservices.java.internal.a.q("[", this.b, "]");
            case 1:
                return androidx.privacysandbox.ads.adservices.java.internal.a.q("[^", this.b, "]");
            case 2:
                return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h(".", this.b);
            case 3:
                return androidx.privacysandbox.ads.adservices.java.internal.a.q(":containsData(", this.b, ")");
            case 4:
                return androidx.privacysandbox.ads.adservices.java.internal.a.q(":containsOwn(", this.b, ")");
            case 5:
                return androidx.privacysandbox.ads.adservices.java.internal.a.q(":contains(", this.b, ")");
            case 6:
                return androidx.privacysandbox.ads.adservices.java.internal.a.q(":containsWholeOwnText(", this.b, ")");
            case 7:
                return androidx.privacysandbox.ads.adservices.java.internal.a.q(":containsWholeText(", this.b, ")");
            case 8:
                return "#".concat(this.b);
            case 9:
                return this.b;
            case 10:
                return "*|".concat(this.b);
            default:
                return this.b.concat("|*");
        }
    }

    public /* synthetic */ h(int i, String str, boolean z) {
        this.a = i;
        this.b = str;
    }
}
