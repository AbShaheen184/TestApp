package androidx.compose.ui.platform;

import java.text.BreakIterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends androidx.activity.compose.internal.b {
    public static b e;
    public static b f;
    public static b g;
    public static final androidx.compose.ui.text.style.j h = androidx.compose.ui.text.style.j.y;
    public static final androidx.compose.ui.text.style.j i = androidx.compose.ui.text.style.j.e;
    public final /* synthetic */ int c;
    public Object d;

    @Override // androidx.activity.compose.internal.b
    public final int[] a(int i2) {
        int iD;
        switch (this.c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i2 >= length) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator == null) {
                        kotlin.jvm.internal.l.f("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i2);
                    BreakIterator breakIterator2 = (BreakIterator) this.d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            kotlin.jvm.internal.l.f("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i2);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return b(i2, iFollowing);
                    }
                    if (breakIterator2 == null) {
                        kotlin.jvm.internal.l.f("impl");
                        throw null;
                    }
                    i2 = breakIterator2.following(i2);
                } while (i2 != -1);
                return null;
            case 1:
                if (c().length() <= 0 || i2 >= c().length()) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                while (!m(i2) && (!m(i2) || (i2 != 0 && m(i2 - 1)))) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 == null) {
                        kotlin.jvm.internal.l.f("impl");
                        throw null;
                    }
                    i2 = breakIterator3.following(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 == null) {
                    kotlin.jvm.internal.l.f("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator4.following(i2);
                if (iFollowing2 == -1 || !l(iFollowing2)) {
                    return null;
                }
                return b(i2, iFollowing2);
            default:
                if (c().length() <= 0 || i2 >= c().length()) {
                    return null;
                }
                androidx.compose.ui.text.j0 j0Var = (androidx.compose.ui.text.j0) this.d;
                androidx.compose.ui.text.style.j jVar = h;
                if (i2 < 0) {
                    if (j0Var == null) {
                        kotlin.jvm.internal.l.f("layoutResult");
                        throw null;
                    }
                    iD = j0Var.b.d(0);
                } else {
                    if (j0Var == null) {
                        kotlin.jvm.internal.l.f("layoutResult");
                        throw null;
                    }
                    int iD2 = j0Var.b.d(i2);
                    iD = j(iD2, jVar) == i2 ? iD2 : iD2 + 1;
                }
                androidx.compose.ui.text.j0 j0Var2 = (androidx.compose.ui.text.j0) this.d;
                if (j0Var2 == null) {
                    kotlin.jvm.internal.l.f("layoutResult");
                    throw null;
                }
                if (iD >= j0Var2.b.f) {
                    return null;
                }
                return b(j(iD, jVar), j(iD, i) + 1);
        }
    }

    @Override // androidx.activity.compose.internal.b
    public final int[] i(int i2) {
        int iD;
        switch (this.c) {
            case 0:
                int length = c().length();
                if (length <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length) {
                    i2 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator == null) {
                        kotlin.jvm.internal.l.f("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i2);
                    BreakIterator breakIterator2 = (BreakIterator) this.d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            kotlin.jvm.internal.l.f("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i2);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return b(iPreceding, i2);
                    }
                    if (breakIterator2 == null) {
                        kotlin.jvm.internal.l.f("impl");
                        throw null;
                    }
                    i2 = breakIterator2.preceding(i2);
                } while (i2 != -1);
                return null;
            case 1:
                int length2 = c().length();
                if (length2 <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length2) {
                    i2 = length2;
                }
                while (i2 > 0 && !m(i2 - 1) && !l(i2)) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 == null) {
                        kotlin.jvm.internal.l.f("impl");
                        throw null;
                    }
                    i2 = breakIterator3.preceding(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 == null) {
                    kotlin.jvm.internal.l.f("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator4.preceding(i2);
                if (iPreceding2 == -1 || !m(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !m(iPreceding2 - 1)) {
                    return b(iPreceding2, i2);
                }
                return null;
            default:
                if (c().length() <= 0 || i2 <= 0) {
                    return null;
                }
                int length3 = c().length();
                androidx.compose.ui.text.j0 j0Var = (androidx.compose.ui.text.j0) this.d;
                androidx.compose.ui.text.style.j jVar = i;
                if (i2 > length3) {
                    if (j0Var == null) {
                        kotlin.jvm.internal.l.f("layoutResult");
                        throw null;
                    }
                    iD = j0Var.b.d(c().length());
                } else {
                    if (j0Var == null) {
                        kotlin.jvm.internal.l.f("layoutResult");
                        throw null;
                    }
                    int iD2 = j0Var.b.d(i2);
                    iD = j(iD2, jVar) + 1 == i2 ? iD2 : iD2 - 1;
                }
                if (iD < 0) {
                    return null;
                }
                return b(j(iD, h), j(iD, jVar) + 1);
        }
    }

    public int j(int i2, androidx.compose.ui.text.style.j jVar) {
        androidx.compose.ui.text.j0 j0Var = (androidx.compose.ui.text.j0) this.d;
        if (j0Var == null) {
            kotlin.jvm.internal.l.f("layoutResult");
            throw null;
        }
        int iF = j0Var.f(i2);
        androidx.compose.ui.text.j0 j0Var2 = (androidx.compose.ui.text.j0) this.d;
        if (j0Var2 == null) {
            kotlin.jvm.internal.l.f("layoutResult");
            throw null;
        }
        androidx.compose.ui.text.style.j jVarG = j0Var2.g(iF);
        androidx.compose.ui.text.j0 j0Var3 = (androidx.compose.ui.text.j0) this.d;
        if (jVar != jVarG) {
            if (j0Var3 != null) {
                return j0Var3.f(i2);
            }
            kotlin.jvm.internal.l.f("layoutResult");
            throw null;
        }
        if (j0Var3 != null) {
            return j0Var3.b.c(i2, false) - 1;
        }
        kotlin.jvm.internal.l.f("layoutResult");
        throw null;
    }

    public void k(String str) {
        switch (this.c) {
            case 0:
                this.a = str;
                BreakIterator breakIterator = (BreakIterator) this.d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    kotlin.jvm.internal.l.f("impl");
                    throw null;
                }
            default:
                this.a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    kotlin.jvm.internal.l.f("impl");
                    throw null;
                }
        }
    }

    public boolean l(int i2) {
        if (i2 <= 0 || !m(i2 - 1)) {
            return false;
        }
        return i2 == c().length() || !m(i2);
    }

    public boolean m(int i2) {
        if (i2 < 0 || i2 >= c().length()) {
            return false;
        }
        return Character.isLetterOrDigit(c().codePointAt(i2));
    }
}
