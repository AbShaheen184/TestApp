package com.google.common.base;

import androidx.compose.ui.platform.t1;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Iterator {
    public final c A;
    public final boolean B;
    public int D;
    public final /* synthetic */ int E;
    public final /* synthetic */ s F;
    public String y;
    public final CharSequence z;
    public int e = 2;
    public int C = 0;

    public q(s sVar, t1 t1Var, CharSequence charSequence, int i) {
        this.E = i;
        this.F = sVar;
        this.A = (c) t1Var.d;
        this.B = t1Var.b;
        this.D = t1Var.c;
        this.z = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        int length;
        c cVar;
        com.google.android.material.motion.a.q(this.e != 4);
        int iE = androidx.constraintlayout.core.g.e(this.e);
        if (iE == 0) {
            return true;
        }
        if (iE != 2) {
            this.e = 4;
            int i = this.C;
            while (true) {
                int length2 = this.C;
                if (length2 != -1) {
                    switch (this.E) {
                        case 0:
                            d dVar = (d) ((com.google.android.material.internal.b) this.F).e;
                            CharSequence charSequence = this.z;
                            int length3 = charSequence.length();
                            com.google.android.material.motion.a.n(length2, length3);
                            while (true) {
                                if (length2 >= length3) {
                                    length2 = -1;
                                } else if (!dVar.r(charSequence.charAt(length2))) {
                                    length2++;
                                }
                                break;
                            }
                            break;
                        default:
                            String str = ((androidx.media3.container.a) this.F).e;
                            int length4 = str.length();
                            CharSequence charSequence2 = this.z;
                            int length5 = charSequence2.length() - length4;
                            while (true) {
                                if (length2 > length5) {
                                    length2 = -1;
                                    break;
                                } else {
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 >= length4) {
                                            break;
                                        } else if (charSequence2.charAt(i2 + length2) != str.charAt(i2)) {
                                            length2++;
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                            }
                            break;
                    }
                    CharSequence charSequence3 = this.z;
                    if (length2 == -1) {
                        length2 = charSequence3.length();
                        this.C = -1;
                    } else {
                        switch (this.E) {
                            case 0:
                                length = length2 + 1;
                                break;
                            default:
                                length = ((androidx.media3.container.a) this.F).e.length() + length2;
                                break;
                        }
                        this.C = length;
                    }
                    int i3 = this.C;
                    if (i3 == i) {
                        int i4 = i3 + 1;
                        this.C = i4;
                        if (i4 > charSequence3.length()) {
                            this.C = -1;
                        }
                    } else {
                        while (true) {
                            cVar = this.A;
                            if (i < length2 && cVar.r(charSequence3.charAt(i))) {
                                i++;
                            }
                        }
                        while (length2 > i && cVar.r(charSequence3.charAt(length2 - 1))) {
                            length2--;
                        }
                        if (this.B && i == length2) {
                            i = this.C;
                        } else {
                            int i5 = this.D;
                            if (i5 == 1) {
                                length2 = charSequence3.length();
                                this.C = -1;
                                while (length2 > i && cVar.r(charSequence3.charAt(length2 - 1))) {
                                    length2--;
                                }
                            } else {
                                this.D = i5 - 1;
                            }
                            string = charSequence3.subSequence(i, length2).toString();
                        }
                    }
                } else {
                    this.e = 3;
                    string = null;
                }
            }
            this.y = string;
            if (this.e != 3) {
                this.e = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            org.mozilla.javascript.typedarrays.c.a();
            return null;
        }
        this.e = 2;
        String str = this.y;
        this.y = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
