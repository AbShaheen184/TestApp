package androidx.compose.ui.text;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.h1;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final androidx.compose.ui.text.platform.d a;
    public final int b;
    public final long c;
    public final androidx.compose.ui.text.android.l d;
    public final CharSequence e;
    public final Object f;

    /* JADX WARN: Code duplicated, block: B:100:0x012f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0143  */
    /* JADX WARN: Code duplicated, block: B:105:0x014e  */
    /* JADX WARN: Code duplicated, block: B:117:0x019a  */
    /* JADX WARN: Code duplicated, block: B:137:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:140:0x020d  */
    /* JADX WARN: Code duplicated, block: B:141:0x0210  */
    /* JADX WARN: Code duplicated, block: B:143:0x022a  */
    /* JADX WARN: Code duplicated, block: B:145:0x0244  */
    /* JADX WARN: Code duplicated, block: B:147:0x0248 A[LOOP:1: B:146:0x0246->B:147:0x0248, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:150:0x0273  */
    /* JADX WARN: Code duplicated, block: B:151:0x0277  */
    /* JADX WARN: Code duplicated, block: B:153:0x028f  */
    /* JADX WARN: Code duplicated, block: B:155:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:156:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:159:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:162:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:165:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:166:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:168:0x02d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:170:0x02db  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x0101  */
    /* JADX WARN: Code duplicated, block: B:92:0x011a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0123  */
    /* JADX WARN: Code duplicated, block: B:96:0x0126  */
    /* JADX WARN: Code duplicated, block: B:97:0x0129  */
    /* JADX WARN: Code duplicated, block: B:99:0x012c  */
    /* JADX WARN: Instruction removed from duplicated block: B:145:0x0244, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:151:0x0277, please report this as an issue */
    public a(androidx.compose.ui.text.platform.d dVar, int i, int i2, long j) {
        int i3;
        CharSequence charSequence;
        int i4;
        int i5;
        int i6;
        char c;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        androidx.compose.ui.text.android.l lVarA;
        int i7;
        a aVar;
        int i8;
        int i9;
        int i10;
        Layout layout;
        Spanned spanned;
        androidx.compose.ui.text.platform.style.b[] bVarArr;
        CharSequence charSequence2;
        Spanned spanned2;
        ArrayList arrayList;
        int i11;
        Object obj;
        int spanEnd;
        int lineForOffset;
        boolean z;
        boolean z2;
        boolean z3;
        androidx.compose.ui.geometry.c cVar;
        float fH;
        int i12;
        int i13;
        this.a = dVar;
        this.b = i;
        this.c = j;
        if (androidx.compose.ui.unit.a.i(j) != 0 || androidx.compose.ui.unit.a.j(j) != 0) {
            androidx.compose.ui.text.internal.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            androidx.compose.ui.text.internal.a.a("maxLines should be greater than 0");
        }
        m0 m0Var = dVar.y;
        CharSequence charSequence3 = dVar.E;
        if (i2 == 2) {
            i3 = 0;
            if (!androidx.compose.ui.unit.o.a(m0Var.a.h, h1.r(0)) && !androidx.compose.ui.unit.o.a(m0Var.a.h, androidx.compose.ui.unit.o.c) && (i13 = m0Var.b.a) != 0 && i13 != 5 && i13 != 4 && charSequence3.length() != 0) {
                Spannable spannableString = charSequence3 instanceof Spannable ? (Spannable) charSequence3 : null;
                if (spannableString == null) {
                    charSequence = charSequence3;
                    charSequence = charSequence3;
                    spannableString = new SpannableString(charSequence3);
                }
                charSequence = charSequence3;
                charSequence = charSequence3;
                Spannable spannable = spannableString;
                boolean zX = com.google.firebase.b.x(spannable, androidx.compose.ui.text.android.style.c.class);
                charSequence = spannable;
                if (!zX) {
                    spannable.setSpan(new androidx.compose.ui.text.android.style.c(), spannable.length() - 1, spannable.length() - 1, 33);
                    charSequence = spannable;
                }
            }
        } else {
            i3 = 0;
            charSequence = charSequence3;
        }
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        charSequence = charSequence3;
        CharSequence charSequence4 = charSequence;
        this.e = charSequence4;
        s sVar = m0Var.b;
        e0 e0Var = m0Var.a;
        int i14 = sVar.a;
        int i15 = 3;
        int i16 = i14 == 1 ? 3 : i14 == 2 ? 4 : i14 == 3 ? 2 : (i14 != 5 && i14 == 6) ? 1 : i3;
        int i17 = i14 == 4 ? 1 : i3;
        int i18 = sVar.h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i3;
        int i19 = sVar.g;
        int i20 = i19 & 255;
        if (i20 == 1) {
            i4 = i3;
        } else if (i20 == 2) {
            i4 = 1;
        } else if (i20 == 3) {
            i4 = 2;
        } else {
            i4 = i3;
        }
        int i21 = (i19 >> 8) & 255;
        if (i21 == 1) {
            i15 = i3;
        } else if (i21 == 2) {
            i15 = 1;
        } else if (i21 == 3) {
            i15 = 2;
        } else if (i21 != 4) {
            i15 = i3;
        }
        int i22 = (i19 >> 16) & 255;
        if (i22 != 1) {
            i5 = 2;
            i6 = i22 == 2 ? 1 : i6;
            if (i2 == i5) {
                truncateAt2 = TextUtils.TruncateAt.END;
            } else {
                if (i2 == 5) {
                    if (i2 == 4) {
                        truncateAt2 = TextUtils.TruncateAt.START;
                    } else {
                        c = ' ';
                        truncateAt = null;
                    }
                    lVarA = a(i16, i17, truncateAt, i, i18, i4, i15, i6, charSequence4);
                    Layout layout2 = lVarA.f;
                    i7 = i16;
                    if (Build.VERSION.SDK_INT < 35 || dVar.D.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                        aVar = this;
                        i8 = i;
                        i9 = i7;
                        i10 = 2;
                    } else {
                        int ellipsisStart = layout2.getEllipsisStart(0);
                        i10 = 2;
                        CharSequence[] charSequenceArr = {charSequence4.subSequence(0, ellipsisStart), "…", charSequence4.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence4.length())};
                        a aVar2 = this;
                        i8 = i;
                        i9 = i7;
                        lVarA = aVar2.a(i9, i17, truncateAt, i8, i18, i4, i15, i6, TextUtils.concat(charSequenceArr));
                        aVar = aVar2;
                    }
                    int i23 = lVarA.g;
                    if (i2 == i10 || lVarA.a() <= androidx.compose.ui.unit.a.g(j) || i8 <= 1) {
                        aVar.d = lVarA;
                    } else {
                        int iG = androidx.compose.ui.unit.a.g(j);
                        int i24 = 0;
                        while (true) {
                            if (i24 >= i23) {
                                i24 = i23;
                                break;
                            } else if (lVarA.e(i24) > iG) {
                                break;
                            } else {
                                i24++;
                            }
                        }
                        if (i24 >= 0 && i24 != aVar.b) {
                            lVarA = aVar.a(i9, i17, truncateAt, i24 < 1 ? 1 : i24, i18, i4, i15, i6, aVar.e);
                        }
                        aVar.d = lVarA;
                    }
                    aVar.a.D.c(e0Var.a.c(), (((long) Float.floatToRawIntBits(aVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(aVar.d())) << c), e0Var.a.a());
                    layout = aVar.d.f;
                    if (layout.getText() instanceof Spanned) {
                        CharSequence text = layout.getText();
                        text.getClass();
                        spanned = (Spanned) text;
                        if (spanned.nextSpanTransition(-1, spanned.length(), androidx.compose.ui.text.platform.style.b.class) != spanned.length()) {
                            CharSequence text2 = layout.getText();
                            text2.getClass();
                            bVarArr = (androidx.compose.ui.text.platform.style.b[]) ((Spanned) text2).getSpans(0, layout.getText().length(), androidx.compose.ui.text.platform.style.b.class);
                        } else {
                            bVarArr = null;
                        }
                    } else {
                        bVarArr = null;
                    }
                    if (bVarArr != null) {
                        for (androidx.compose.ui.text.platform.style.b bVar : bVarArr) {
                            bVar.z.setValue(new androidx.compose.ui.geometry.e((((long) Float.floatToRawIntBits(aVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(aVar.d())) << c)));
                        }
                    }
                    charSequence2 = aVar.e;
                    if (charSequence2 instanceof Spanned) {
                        spanned2 = (Spanned) charSequence2;
                        Object[] spans = spanned2.getSpans(0, charSequence2.length(), androidx.compose.ui.text.android.style.i.class);
                        arrayList = new ArrayList(spans.length);
                        for (Object obj2 : spans) {
                            androidx.compose.ui.text.android.style.i iVar = (androidx.compose.ui.text.android.style.i) obj2;
                            int spanStart = spanned2.getSpanStart(iVar);
                            spanEnd = spanned2.getSpanEnd(iVar);
                            lineForOffset = aVar.d.f.getLineForOffset(spanStart);
                            if (lineForOffset >= aVar.b) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (aVar.d.f.getEllipsisCount(lineForOffset) > 0 || spanEnd <= aVar.d.f.getEllipsisStart(lineForOffset) + aVar.d.f.getLineStart(lineForOffset)) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (spanEnd > aVar.d.f(lineForOffset)) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z2 && !z3 && !z) {
                                int iOrdinal = (aVar.d.f.isRtlCharAt(spanStart) ? androidx.compose.ui.text.style.j.y : androidx.compose.ui.text.style.j.e).ordinal();
                                if (iOrdinal == 0) {
                                    fH = aVar.d.h(spanStart, false);
                                } else {
                                    if (iOrdinal != 1) {
                                        coil3.g.a();
                                        throw null;
                                    }
                                    float fH2 = aVar.d.h(spanStart, false);
                                    if (!iVar.A) {
                                        androidx.compose.ui.text.internal.a.b("PlaceholderSpan is not laid out yet.");
                                    }
                                    fH = fH2 - iVar.y;
                                }
                                if (!iVar.A) {
                                    androidx.compose.ui.text.internal.a.b("PlaceholderSpan is not laid out yet.");
                                }
                                float f = iVar.y + fH;
                                float fD = aVar.d.d(lineForOffset) - iVar.b();
                                cVar = new androidx.compose.ui.geometry.c(fH, fD, f, iVar.b() + fD);
                            }
                            arrayList.add(cVar);
                        }
                        obj = arrayList;
                    } else {
                        obj = kotlin.collections.u.e;
                    }
                    aVar.f = obj;
                }
                truncateAt2 = TextUtils.TruncateAt.MIDDLE;
            }
            c = ' ';
            truncateAt = truncateAt2;
            lVarA = a(i16, i17, truncateAt, i, i18, i4, i15, i6, charSequence4);
            Layout layout3 = lVarA.f;
            i7 = i16;
            if (Build.VERSION.SDK_INT < 35) {
                aVar = this;
                i8 = i;
                i9 = i7;
                i10 = 2;
            } else {
                aVar = this;
                i8 = i;
                i9 = i7;
                i10 = 2;
            }
            int i25 = lVarA.g;
            if (i2 == i10) {
                aVar.d = lVarA;
            } else {
                aVar.d = lVarA;
            }
            aVar.a.D.c(e0Var.a.c(), (((long) Float.floatToRawIntBits(aVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(aVar.d())) << c), e0Var.a.a());
            layout = aVar.d.f;
            if (layout.getText() instanceof Spanned) {
                bVarArr = null;
            } else {
                CharSequence text3 = layout.getText();
                text3.getClass();
                spanned = (Spanned) text3;
                if (spanned.nextSpanTransition(-1, spanned.length(), androidx.compose.ui.text.platform.style.b.class) != spanned.length()) {
                    CharSequence text4 = layout.getText();
                    text4.getClass();
                    bVarArr = (androidx.compose.ui.text.platform.style.b[]) ((Spanned) text4).getSpans(0, layout.getText().length(), androidx.compose.ui.text.platform.style.b.class);
                } else {
                    bVarArr = null;
                }
            }
            if (bVarArr != null) {
                while (i12 < r2) {
                    bVar.z.setValue(new androidx.compose.ui.geometry.e((((long) Float.floatToRawIntBits(aVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(aVar.d())) << c)));
                }
            }
            charSequence2 = aVar.e;
            if (charSequence2 instanceof Spanned) {
                obj = kotlin.collections.u.e;
            } else {
                spanned2 = (Spanned) charSequence2;
                Object[] spans2 = spanned2.getSpans(0, charSequence2.length(), androidx.compose.ui.text.android.style.i.class);
                arrayList = new ArrayList(spans2.length);
                while (i11 < r4) {
                    androidx.compose.ui.text.android.style.i iVar2 = (androidx.compose.ui.text.android.style.i) obj2;
                    int spanStart2 = spanned2.getSpanStart(iVar2);
                    spanEnd = spanned2.getSpanEnd(iVar2);
                    lineForOffset = aVar.d.f.getLineForOffset(spanStart2);
                    if (lineForOffset >= aVar.b) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (aVar.d.f.getEllipsisCount(lineForOffset) > 0) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (spanEnd > aVar.d.f(lineForOffset)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    cVar = z2 ? null : null;
                    arrayList.add(cVar);
                }
                obj = arrayList;
            }
            aVar.f = obj;
        }
        i5 = 2;
        i6 = i3;
        if (i2 == i5) {
            truncateAt2 = TextUtils.TruncateAt.END;
        } else {
            if (i2 == 5) {
                if (i2 == 4) {
                    truncateAt2 = TextUtils.TruncateAt.START;
                } else {
                    c = ' ';
                    truncateAt = null;
                }
                lVarA = a(i16, i17, truncateAt, i, i18, i4, i15, i6, charSequence4);
                Layout layout4 = lVarA.f;
                i7 = i16;
                if (Build.VERSION.SDK_INT < 35) {
                    aVar = this;
                    i8 = i;
                    i9 = i7;
                    i10 = 2;
                } else {
                    aVar = this;
                    i8 = i;
                    i9 = i7;
                    i10 = 2;
                }
                int i26 = lVarA.g;
                if (i2 == i10) {
                    aVar.d = lVarA;
                } else {
                    aVar.d = lVarA;
                }
                aVar.a.D.c(e0Var.a.c(), (((long) Float.floatToRawIntBits(aVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(aVar.d())) << c), e0Var.a.a());
                layout = aVar.d.f;
                if (layout.getText() instanceof Spanned) {
                    bVarArr = null;
                } else {
                    CharSequence text5 = layout.getText();
                    text5.getClass();
                    spanned = (Spanned) text5;
                    if (spanned.nextSpanTransition(-1, spanned.length(), androidx.compose.ui.text.platform.style.b.class) != spanned.length()) {
                        CharSequence text6 = layout.getText();
                        text6.getClass();
                        bVarArr = (androidx.compose.ui.text.platform.style.b[]) ((Spanned) text6).getSpans(0, layout.getText().length(), androidx.compose.ui.text.platform.style.b.class);
                    } else {
                        bVarArr = null;
                    }
                }
                if (bVarArr != null) {
                    while (i12 < r2) {
                        bVar.z.setValue(new androidx.compose.ui.geometry.e((((long) Float.floatToRawIntBits(aVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(aVar.d())) << c)));
                    }
                }
                charSequence2 = aVar.e;
                if (charSequence2 instanceof Spanned) {
                    obj = kotlin.collections.u.e;
                } else {
                    spanned2 = (Spanned) charSequence2;
                    Object[] spans3 = spanned2.getSpans(0, charSequence2.length(), androidx.compose.ui.text.android.style.i.class);
                    arrayList = new ArrayList(spans3.length);
                    while (i11 < r4) {
                        androidx.compose.ui.text.android.style.i iVar3 = (androidx.compose.ui.text.android.style.i) obj2;
                        int spanStart3 = spanned2.getSpanStart(iVar3);
                        spanEnd = spanned2.getSpanEnd(iVar3);
                        lineForOffset = aVar.d.f.getLineForOffset(spanStart3);
                        if (lineForOffset >= aVar.b) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (aVar.d.f.getEllipsisCount(lineForOffset) > 0) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (spanEnd > aVar.d.f(lineForOffset)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z2) {
                        }
                        arrayList.add(cVar);
                    }
                    obj = arrayList;
                }
                aVar.f = obj;
            }
            truncateAt2 = TextUtils.TruncateAt.MIDDLE;
        }
        c = ' ';
        truncateAt = truncateAt2;
        lVarA = a(i16, i17, truncateAt, i, i18, i4, i15, i6, charSequence4);
        Layout layout5 = lVarA.f;
        i7 = i16;
        if (Build.VERSION.SDK_INT < 35) {
            aVar = this;
            i8 = i;
            i9 = i7;
            i10 = 2;
        } else {
            aVar = this;
            i8 = i;
            i9 = i7;
            i10 = 2;
        }
        int i27 = lVarA.g;
        if (i2 == i10) {
            aVar.d = lVarA;
        } else {
            aVar.d = lVarA;
        }
        aVar.a.D.c(e0Var.a.c(), (((long) Float.floatToRawIntBits(aVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(aVar.d())) << c), e0Var.a.a());
        layout = aVar.d.f;
        if (layout.getText() instanceof Spanned) {
            bVarArr = null;
        } else {
            CharSequence text7 = layout.getText();
            text7.getClass();
            spanned = (Spanned) text7;
            if (spanned.nextSpanTransition(-1, spanned.length(), androidx.compose.ui.text.platform.style.b.class) != spanned.length()) {
                CharSequence text8 = layout.getText();
                text8.getClass();
                bVarArr = (androidx.compose.ui.text.platform.style.b[]) ((Spanned) text8).getSpans(0, layout.getText().length(), androidx.compose.ui.text.platform.style.b.class);
            } else {
                bVarArr = null;
            }
        }
        if (bVarArr != null) {
            while (i12 < r2) {
                bVar.z.setValue(new androidx.compose.ui.geometry.e((((long) Float.floatToRawIntBits(aVar.b())) & 4294967295L) | (((long) Float.floatToRawIntBits(aVar.d())) << c)));
            }
        }
        charSequence2 = aVar.e;
        if (charSequence2 instanceof Spanned) {
            obj = kotlin.collections.u.e;
        } else {
            spanned2 = (Spanned) charSequence2;
            Object[] spans4 = spanned2.getSpans(0, charSequence2.length(), androidx.compose.ui.text.android.style.i.class);
            arrayList = new ArrayList(spans4.length);
            while (i11 < r4) {
                androidx.compose.ui.text.android.style.i iVar4 = (androidx.compose.ui.text.android.style.i) obj2;
                int spanStart4 = spanned2.getSpanStart(iVar4);
                spanEnd = spanned2.getSpanEnd(iVar4);
                lineForOffset = aVar.d.f.getLineForOffset(spanStart4);
                if (lineForOffset >= aVar.b) {
                    z = true;
                } else {
                    z = false;
                }
                if (aVar.d.f.getEllipsisCount(lineForOffset) > 0) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (spanEnd > aVar.d.f(lineForOffset)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2) {
                }
                arrayList.add(cVar);
            }
            obj = arrayList;
        }
        aVar.f = obj;
    }

    public final androidx.compose.ui.text.android.l a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        u uVar;
        float fD = d();
        androidx.compose.ui.text.platform.d dVar = this.a;
        androidx.compose.ui.text.platform.f fVar = dVar.D;
        int i8 = dVar.I;
        androidx.compose.ui.text.android.h hVar = dVar.F;
        m0 m0Var = dVar.y;
        androidx.compose.ui.text.platform.a aVar = androidx.compose.ui.text.platform.b.a;
        w wVar = m0Var.c;
        return new androidx.compose.ui.text.android.l(charSequence, fD, fVar, i, truncateAt, i8, (wVar == null || (uVar = wVar.b) == null) ? false : uVar.a, i3, i5, i6, i7, i4, i2, hVar);
    }

    public final float b() {
        return this.d.a();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00aa  */
    public final long c(androidx.compose.ui.geometry.c cVar, int i, androidx.compose.ui.graphics.a aVar) {
        androidx.compose.ui.text.android.selection.d bVar;
        int i2;
        int[] iArrF;
        RectF rectFX = androidx.compose.ui.graphics.a0.x(cVar);
        int i3 = (i != 0 && i == 1) ? 1 : 0;
        androidx.compose.animation.core.g0 g0Var = new androidx.compose.animation.core.g0(aVar, 14);
        androidx.compose.ui.text.android.l lVar = this.d;
        Layout layout = lVar.f;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            iArrF = androidx.compose.ui.text.android.b.f(lVar, rectFX, i3, g0Var);
        } else {
            androidx.compose.runtime.internal.c cVarC = lVar.c();
            if (i3 == 1) {
                bVar = new androidx.compose.foundation.text.input.internal.o(19, layout.getText(), lVar.j());
            } else {
                CharSequence text = layout.getText();
                bVar = i4 >= 29 ? new androidx.compose.ui.text.android.selection.b(text, lVar.a) : new androidx.compose.ui.text.android.selection.c(text);
            }
            androidx.compose.ui.text.android.selection.d dVar = bVar;
            int lineForVertical = layout.getLineForVertical((int) rectFX.top);
            if (rectFX.top <= lVar.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < lVar.g) {
                int i5 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) rectFX.bottom);
                if (lineForVertical2 != 0 || rectFX.bottom >= lVar.g(0)) {
                    int iX = kotlin.math.a.x(lVar, layout, cVarC, i5, rectFX, dVar, g0Var, true);
                    while (true) {
                        i2 = i5;
                        if (iX != -1 || i2 >= lineForVertical2) {
                            break;
                        }
                        i5 = i2 + 1;
                        iX = kotlin.math.a.x(lVar, layout, cVarC, i5, rectFX, dVar, g0Var, true);
                    }
                    if (iX == -1) {
                        iArrF = null;
                    } else {
                        int i6 = lineForVertical2;
                        int iX2 = kotlin.math.a.x(lVar, layout, cVarC, i6, rectFX, dVar, g0Var, false);
                        while (iX2 == -1 && i2 < i6) {
                            i6--;
                            iX2 = kotlin.math.a.x(lVar, layout, cVarC, i6, rectFX, dVar, g0Var, false);
                        }
                        if (iX2 == -1) {
                            iArrF = null;
                        } else {
                            iArrF = new int[]{dVar.g(iX + 1), dVar.i(iX2 - 1)};
                        }
                    }
                } else {
                    iArrF = null;
                }
            } else {
                iArrF = null;
            }
        }
        return iArrF == null ? l0.b : d0.b(iArrF[0], iArrF[1]);
    }

    public final float d() {
        return androidx.compose.ui.unit.a.h(this.c);
    }

    public final void e(androidx.compose.ui.graphics.r rVar) {
        Canvas canvasA = androidx.compose.ui.graphics.d.a(rVar);
        androidx.compose.ui.text.android.l lVar = this.d;
        if (lVar.d) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, d(), b());
        }
        int i = lVar.h;
        if (canvasA.getClipBounds(lVar.p)) {
            if (i != 0) {
                canvasA.translate(0.0f, i);
            }
            ThreadLocal threadLocal = androidx.compose.ui.text.android.m.a;
            Object kVar = threadLocal.get();
            if (kVar == null) {
                kVar = new androidx.compose.ui.text.android.k();
                threadLocal.set(kVar);
            }
            androidx.compose.ui.text.android.k kVar2 = (androidx.compose.ui.text.android.k) kVar;
            kVar2.a = canvasA;
            try {
                lVar.f.draw(kVar2);
                kVar2.a = null;
                if (i != 0) {
                    canvasA.translate(0.0f, (-1) * i);
                }
            } catch (Throwable th) {
                kVar2.a = null;
                throw th;
            }
        }
        if (lVar.d) {
            canvasA.restore();
        }
    }

    public final void f(androidx.compose.ui.graphics.r rVar, long j, androidx.compose.ui.graphics.m0 m0Var, androidx.compose.ui.text.style.l lVar, androidx.compose.ui.graphics.drawscope.e eVar) {
        androidx.compose.ui.text.platform.f fVar = this.a.D;
        int i = fVar.c;
        fVar.d(j);
        fVar.f(m0Var);
        fVar.g(lVar);
        fVar.e(eVar);
        fVar.b(3);
        e(rVar);
        fVar.b(i);
    }

    public final void g(androidx.compose.ui.graphics.r rVar, androidx.compose.ui.graphics.p pVar, float f, androidx.compose.ui.graphics.m0 m0Var, androidx.compose.ui.text.style.l lVar, androidx.compose.ui.graphics.drawscope.e eVar) {
        androidx.compose.ui.text.platform.f fVar = this.a.D;
        int i = fVar.c;
        float fD = d();
        fVar.c(pVar, (((long) Float.floatToRawIntBits(b())) & 4294967295L) | (Float.floatToRawIntBits(fD) << 32), f);
        fVar.f(m0Var);
        fVar.g(lVar);
        fVar.e(eVar);
        fVar.b(3);
        e(rVar);
        fVar.b(i);
    }
}
