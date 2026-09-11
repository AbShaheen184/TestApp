package androidx.media3.ui;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.SparseArray;
import android.widget.FrameLayout;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends FrameLayout implements n0 {
    public e A;
    public float B;
    public int C;
    public float D;
    public final d e;
    public final r0 y;
    public List z;

    public t0(Context context) {
        super(context, null);
        this.z = Collections.EMPTY_LIST;
        this.A = e.g;
        this.B = 0.0533f;
        this.C = 0;
        this.D = 0.08f;
        d dVar = new d(context, 0);
        this.e = dVar;
        r0 r0Var = new r0(context, null);
        this.y = r0Var;
        r0Var.setBackgroundColor(0);
        r0Var.getSettings().setAllowContentAccess(false);
        addView(dVar);
        addView(r0Var);
    }

    @Override // androidx.media3.ui.n0
    public final void a(List list, e eVar, float f, int i, float f2) {
        this.A = eVar;
        this.B = f;
        this.C = i;
        this.D = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            androidx.media3.common.text.b bVar = (androidx.media3.common.text.b) list.get(i2);
            if (bVar.d != null) {
                arrayList.add(bVar);
            } else {
                arrayList2.add(bVar);
            }
        }
        if (!this.z.isEmpty() || !arrayList2.isEmpty()) {
            this.z = arrayList2;
            c();
        }
        this.e.a(arrayList, eVar, f, i, f2);
        invalidate();
    }

    public final String b(int i, float f) {
        float fH = _COROUTINE.a.H(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (fH == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(fH / getContext().getResources().getDisplayMetrics().density)};
        String str = androidx.media3.common.util.j0.a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0247  */
    /* JADX WARN: Code duplicated, block: B:103:0x024d  */
    /* JADX WARN: Code duplicated, block: B:104:0x025e  */
    /* JADX WARN: Code duplicated, block: B:106:0x027c A[LOOP:2: B:105:0x027a->B:106:0x027c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x029f A[LOOP:3: B:108:0x0299->B:110:0x029f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:115:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:118:0x0310  */
    /* JADX WARN: Code duplicated, block: B:120:0x0316  */
    /* JADX WARN: Code duplicated, block: B:121:0x032e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0334  */
    /* JADX WARN: Code duplicated, block: B:124:0x034a  */
    /* JADX WARN: Code duplicated, block: B:126:0x0350  */
    /* JADX WARN: Code duplicated, block: B:127:0x0353  */
    /* JADX WARN: Code duplicated, block: B:129:0x0357  */
    /* JADX WARN: Code duplicated, block: B:131:0x0360  */
    /* JADX WARN: Code duplicated, block: B:132:0x0366  */
    /* JADX WARN: Code duplicated, block: B:134:0x0380  */
    /* JADX WARN: Code duplicated, block: B:136:0x0384  */
    /* JADX WARN: Code duplicated, block: B:137:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:139:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:141:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:142:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:143:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:145:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:147:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:149:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:152:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:153:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:154:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:155:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:157:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:159:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:161:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:164:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:165:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:166:0x0400  */
    /* JADX WARN: Code duplicated, block: B:167:0x0404  */
    /* JADX WARN: Code duplicated, block: B:169:0x0408  */
    /* JADX WARN: Code duplicated, block: B:170:0x040c  */
    /* JADX WARN: Code duplicated, block: B:172:0x0410  */
    /* JADX WARN: Code duplicated, block: B:174:0x0423  */
    /* JADX WARN: Code duplicated, block: B:177:0x0427  */
    /* JADX WARN: Code duplicated, block: B:178:0x042d  */
    /* JADX WARN: Code duplicated, block: B:180:0x0435  */
    /* JADX WARN: Code duplicated, block: B:182:0x0438 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:183:0x043a  */
    /* JADX WARN: Code duplicated, block: B:185:0x043d  */
    /* JADX WARN: Code duplicated, block: B:186:0x0441  */
    /* JADX WARN: Code duplicated, block: B:187:0x0447  */
    /* JADX WARN: Code duplicated, block: B:188:0x044d  */
    /* JADX WARN: Code duplicated, block: B:189:0x0453  */
    /* JADX WARN: Code duplicated, block: B:192:0x0461  */
    /* JADX WARN: Code duplicated, block: B:193:0x0464  */
    /* JADX WARN: Code duplicated, block: B:196:0x0476  */
    /* JADX WARN: Code duplicated, block: B:208:0x048e  */
    /* JADX WARN: Code duplicated, block: B:238:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:240:0x0509  */
    /* JADX WARN: Code duplicated, block: B:243:0x051e  */
    /* JADX WARN: Code duplicated, block: B:249:0x054d  */
    /* JADX WARN: Code duplicated, block: B:252:0x0579 A[LOOP:6: B:250:0x0573->B:252:0x0579, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:256:0x0594 A[LOOP:7: B:254:0x058e->B:256:0x0594, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:262:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:264:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:268:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:272:0x060d  */
    /* JADX WARN: Code duplicated, block: B:274:0x0610  */
    /* JADX WARN: Code duplicated, block: B:278:0x0617  */
    /* JADX WARN: Code duplicated, block: B:281:0x0636  */
    /* JADX WARN: Code duplicated, block: B:284:0x0657  */
    /* JADX WARN: Code duplicated, block: B:286:0x0662  */
    /* JADX WARN: Code duplicated, block: B:288:0x0665  */
    /* JADX WARN: Code duplicated, block: B:289:0x0668  */
    /* JADX WARN: Code duplicated, block: B:290:0x066b  */
    /* JADX WARN: Code duplicated, block: B:292:0x0689  */
    /* JADX WARN: Code duplicated, block: B:310:0x052b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0176  */
    /* JADX WARN: Code duplicated, block: B:55:0x0189  */
    /* JADX WARN: Code duplicated, block: B:58:0x0196  */
    /* JADX WARN: Code duplicated, block: B:59:0x019b  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x01af  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:71:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0208  */
    /* JADX WARN: Code duplicated, block: B:99:0x0230  */
    /* JADX WARN: Instruction removed from duplicated block: B:110:0x029f, please report this as an issue */
    public final void c() {
        String strConcat;
        String str;
        String str2;
        int i;
        float f;
        String str3;
        Layout.Alignment alignment;
        String str4;
        int i2;
        int i3;
        Object obj;
        int i4;
        String str5;
        int i5;
        String str6;
        String str7;
        int i6;
        String str8;
        Object obj2;
        int i7;
        CharSequence charSequence;
        float f2;
        String str9;
        String str10;
        Spanned spanned;
        HashSet hashSet;
        BackgroundColorSpan[] backgroundColorSpanArr;
        int length;
        int i8;
        HashMap map;
        Iterator it;
        String str11;
        SparseArray sparseArray;
        Object[] spans;
        int length2;
        int i9;
        StringBuilder sb;
        int i10;
        int i11;
        androidx.emoji2.text.r rVar;
        Iterator it2;
        Iterator it3;
        Object obj3;
        boolean z;
        boolean z2;
        Object[] objArr;
        androidx.media3.common.text.h hVar;
        int i12;
        int i13;
        StringBuilder sb2;
        int i14;
        String str12;
        String strQ;
        int i15;
        int style;
        String family;
        AbsoluteSizeSpan absoluteSizeSpan;
        float size;
        String str13;
        int spanStart;
        int spanEnd;
        k0 k0Var;
        k0 k0Var2;
        String str14;
        float f3;
        String str15;
        Layout.Alignment alignment2;
        int i16;
        int i17;
        String str16;
        String str17;
        String str18;
        boolean z3;
        StringBuilder sb3 = new StringBuilder();
        String strN = org.jsoup.helper.n.N(this.A.a);
        String strB = b(this.C, this.B);
        float f4 = 1.2f;
        Float fValueOf = Float.valueOf(1.2f);
        e eVar = this.A;
        int i18 = eVar.d;
        int i19 = eVar.e;
        String str19 = "unset";
        int i20 = 2;
        int i21 = 1;
        if (i18 == 1) {
            Object[] objArr2 = {org.jsoup.helper.n.N(i19)};
            String str20 = androidx.media3.common.util.j0.a;
            strConcat = String.format(Locale.US, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", objArr2);
        } else if (i18 == 2) {
            String strN2 = org.jsoup.helper.n.N(i19);
            String str21 = androidx.media3.common.util.j0.a;
            Locale locale = Locale.US;
            strConcat = "0.1em 0.12em 0.15em ".concat(strN2);
        } else if (i18 == 3) {
            String strN3 = org.jsoup.helper.n.N(i19);
            String str22 = androidx.media3.common.util.j0.a;
            Locale locale2 = Locale.US;
            strConcat = "0.06em 0.08em 0.15em ".concat(strN3);
        } else if (i18 != 4) {
            strConcat = "unset";
        } else {
            String strN4 = org.jsoup.helper.n.N(i19);
            String str23 = androidx.media3.common.util.j0.a;
            Locale locale3 = Locale.US;
            strConcat = "-0.05em -0.05em 0.15em ".concat(strN4);
        }
        Object[] objArr3 = {strN, strB, fValueOf, strConcat};
        String str24 = androidx.media3.common.util.j0.a;
        sb3.append(String.format(Locale.US, "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", objArr3));
        HashMap map2 = new HashMap();
        String strN5 = org.jsoup.helper.n.N(this.A.b);
        String str25 = "background-color:";
        StringBuilder sb4 = new StringBuilder("background-color:");
        sb4.append(strN5);
        String str26 = ";";
        sb4.append(";");
        map2.put(".default_bg,.default_bg *", sb4.toString());
        int i22 = 0;
        while (i22 < this.z.size()) {
            androidx.media3.common.text.b bVar = (androidx.media3.common.text.b) this.z.get(i22);
            float f5 = bVar.h;
            int i23 = bVar.p;
            float f6 = f5 != -3.4028235E38f ? f5 * 100.0f : 50.0f;
            float f7 = f4;
            int i24 = bVar.i;
            int i25 = -100;
            int i26 = i24 != i21 ? i24 != i20 ? 0 : -100 : -50;
            float f8 = bVar.e;
            if (f8 != r15) {
                if (bVar.f != i21) {
                    str = String.format(Locale.US, "%.2f%%", Float.valueOf(f8 * 100.0f));
                    int i27 = bVar.g;
                    if (i23 == i21) {
                        i25 = -(i27 != i21 ? i27 != i20 ? 0 : -100 : -50);
                    } else {
                        i25 = i27 != i21 ? i27 != i20 ? 0 : -100 : -50;
                    }
                } else {
                    if (f8 >= 0.0f) {
                        str2 = String.format(Locale.US, "%.2fem", Float.valueOf(f8 * f7));
                        i = 0;
                    } else {
                        str2 = String.format(Locale.US, "%.2fem", Float.valueOf(((-f8) - 1.0f) * f7));
                        i = i21;
                    }
                    i25 = 0;
                }
                f = bVar.j;
                if (f != -8388609) {
                    str3 = String.format(Locale.US, "%.2f%%", Float.valueOf(f * 100.0f));
                } else {
                    str3 = "fit-content";
                }
                String str27 = str3;
                alignment = bVar.b;
                str4 = "end";
                if (alignment == null) {
                    i4 = i21;
                    obj = "center";
                    i3 = 2;
                } else {
                    i2 = s0.a[alignment.ordinal()];
                    if (i2 != i21) {
                        i3 = 2;
                        if (i2 != 2) {
                            obj = "center";
                        } else {
                            obj = "end";
                        }
                    } else {
                        i3 = 2;
                        obj = "start";
                    }
                    i4 = 1;
                }
                if (i23 != i4) {
                    str5 = "vertical-rl";
                } else if (i23 != i3) {
                    str5 = "horizontal-tb";
                } else {
                    str5 = "vertical-lr";
                }
                String str28 = str5;
                String strB2 = b(bVar.n, bVar.o);
                if (bVar.l) {
                    i5 = bVar.m;
                } else {
                    i5 = this.A.c;
                }
                String strN6 = org.jsoup.helper.n.N(i5);
                str6 = "right";
                str7 = "left";
                i6 = i26;
                if (i23 != 1) {
                    if (i != 0) {
                        str6 = "left";
                    }
                    str8 = str6;
                    str7 = "top";
                } else if (i23 != 2) {
                    str8 = i != 0 ? "bottom" : "top";
                } else {
                    if (i == 0) {
                        str6 = "left";
                    }
                    str8 = str6;
                    str7 = "top";
                }
                if (i23 != 2 || i23 == 1) {
                    obj2 = "height";
                    i7 = i25;
                    i25 = i6;
                } else {
                    obj2 = "width";
                    i7 = i6;
                }
                charSequence = bVar.a;
                f2 = getContext().getResources().getDisplayMetrics().density;
                Pattern pattern = l0.a;
                int i28 = i7;
                int i29 = i22;
                str9 = "";
                if (charSequence == null) {
                    rVar = new androidx.emoji2.text.r(str9);
                    str10 = "";
                } else {
                    str10 = "";
                    if (charSequence instanceof Spanned) {
                        spanned = (Spanned) charSequence;
                        hashSet = new HashSet();
                        backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                        length = backgroundColorSpanArr.length;
                        i8 = 0;
                        while (i8 < length) {
                            hashSet.add(Integer.valueOf(backgroundColorSpanArr[i8].getBackgroundColor()));
                            i8++;
                            backgroundColorSpanArr = backgroundColorSpanArr;
                        }
                        map = new HashMap();
                        it = hashSet.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Integer) it.next()).intValue();
                            String strL = androidx.privacysandbox.ads.adservices.java.internal.a.l(iIntValue, "bg_");
                            Iterator it4 = it;
                            String strJ = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.j(".", strL, ",.", strL, " *");
                            String strN7 = org.jsoup.helper.n.N(iIntValue);
                            String str29 = androidx.media3.common.util.j0.a;
                            Locale locale4 = Locale.US;
                            map.put(strJ, str25 + strN7 + str26);
                            it = it4;
                            str4 = str4;
                        }
                        str11 = str4;
                        sparseArray = new SparseArray();
                        spans = spanned.getSpans(0, spanned.length(), Object.class);
                        i9 = 0;
                        for (length2 = spans.length; i9 < length2; length2 = length2) {
                            obj3 = spans[i9];
                            String str30 = str26;
                            z = obj3 instanceof StrikethroughSpan;
                            String str31 = null;
                            if (z) {
                                z2 = z;
                                strQ = "<span style='text-decoration:line-through;'>";
                            } else {
                                z2 = z;
                                if (obj3 instanceof ForegroundColorSpan) {
                                    String strN8 = org.jsoup.helper.n.N(((ForegroundColorSpan) obj3).getForegroundColor());
                                    String str32 = androidx.media3.common.util.j0.a;
                                    Locale locale5 = Locale.US;
                                    strQ = androidx.privacysandbox.ads.adservices.java.internal.a.q("<span style='color:", strN8, ";'>");
                                } else {
                                    str25 = str25;
                                    if (obj3 instanceof BackgroundColorSpan) {
                                        int backgroundColor = ((BackgroundColorSpan) obj3).getBackgroundColor();
                                        String str33 = androidx.media3.common.util.j0.a;
                                        Locale locale6 = Locale.US;
                                        objArr = spans;
                                        strQ = androidx.privacysandbox.ads.adservices.java.internal.a.p("<span class='bg_", backgroundColor, "'>");
                                    } else {
                                        objArr = spans;
                                        if (obj3 instanceof androidx.media3.common.text.e) {
                                            strQ = "<span style='text-combine-upright:all;'>";
                                        } else if (obj3 instanceof AbsoluteSizeSpan) {
                                            absoluteSizeSpan = (AbsoluteSizeSpan) obj3;
                                            if (absoluteSizeSpan.getDip()) {
                                                size = absoluteSizeSpan.getSize();
                                            } else {
                                                size = absoluteSizeSpan.getSize() / f2;
                                            }
                                            Object[] objArr4 = {Float.valueOf(size)};
                                            String str34 = androidx.media3.common.util.j0.a;
                                            strQ = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr4);
                                        } else if (obj3 instanceof RelativeSizeSpan) {
                                            Object[] objArr5 = {Float.valueOf(((RelativeSizeSpan) obj3).getSizeChange() * 100.0f)};
                                            String str35 = androidx.media3.common.util.j0.a;
                                            strQ = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr5);
                                        } else if (obj3 instanceof TypefaceSpan) {
                                            family = ((TypefaceSpan) obj3).getFamily();
                                            if (family != null) {
                                                String str36 = androidx.media3.common.util.j0.a;
                                                Locale locale7 = Locale.US;
                                                strQ = androidx.privacysandbox.ads.adservices.java.internal.a.q("<span style='font-family:\"", family, "\";'>");
                                            } else {
                                                strQ = null;
                                            }
                                        } else if (obj3 instanceof StyleSpan) {
                                            style = ((StyleSpan) obj3).getStyle();
                                            if (style != 1) {
                                                strQ = "<b>";
                                            } else if (style != 2) {
                                                strQ = "<i>";
                                            } else if (style != 3) {
                                                strQ = null;
                                            } else {
                                                strQ = "<b><i>";
                                            }
                                        } else if (obj3 instanceof androidx.media3.common.text.g) {
                                            i15 = ((androidx.media3.common.text.g) obj3).b;
                                            if (i15 != -1) {
                                                strQ = "<ruby style='ruby-position:unset;'>";
                                            } else if (i15 != 1) {
                                                strQ = "<ruby style='ruby-position:over;'>";
                                            } else if (i15 != 2) {
                                                strQ = null;
                                            } else {
                                                strQ = "<ruby style='ruby-position:under;'>";
                                            }
                                        } else if (obj3 instanceof UnderlineSpan) {
                                            strQ = "<u>";
                                        } else if (obj3 instanceof androidx.media3.common.text.h) {
                                            hVar = (androidx.media3.common.text.h) obj3;
                                            i12 = hVar.a;
                                            i13 = hVar.b;
                                            sb2 = new StringBuilder();
                                            if (i13 != 1) {
                                                i14 = 2;
                                                if (i13 == 2) {
                                                    sb2.append("open ");
                                                }
                                            } else {
                                                i14 = 2;
                                                sb2.append("filled ");
                                            }
                                            if (i12 != 0) {
                                                sb2.append("none");
                                            } else if (i12 != 1) {
                                                sb2.append("circle");
                                            } else if (i12 != i14) {
                                                sb2.append("dot");
                                            } else if (i12 != 3) {
                                                sb2.append(str19);
                                            } else {
                                                sb2.append("sesame");
                                            }
                                            String string = sb2.toString();
                                            if (hVar.c != 2) {
                                                str12 = "over right";
                                            } else {
                                                str12 = "under left";
                                            }
                                            Object[] objArr6 = {string, str12};
                                            String str37 = androidx.media3.common.util.j0.a;
                                            strQ = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr6);
                                        } else {
                                            strQ = null;
                                        }
                                    }
                                }
                                if (z2 && !(obj3 instanceof ForegroundColorSpan) && !(obj3 instanceof BackgroundColorSpan) && !(obj3 instanceof androidx.media3.common.text.e) && !(obj3 instanceof AbsoluteSizeSpan) && !(obj3 instanceof RelativeSizeSpan) && !(obj3 instanceof androidx.media3.common.text.h)) {
                                    if (obj3 instanceof TypefaceSpan) {
                                        str13 = ((TypefaceSpan) obj3).getFamily() != null ? "</span>" : null;
                                    } else {
                                        if (obj3 instanceof StyleSpan) {
                                            int style2 = ((StyleSpan) obj3).getStyle();
                                            if (style2 == 1) {
                                                str31 = "</b>";
                                            } else if (style2 == 2) {
                                                str31 = "</i>";
                                            } else if (style2 == 3) {
                                                str31 = "</i></b>";
                                            }
                                        } else if (obj3 instanceof androidx.media3.common.text.g) {
                                            str31 = "<rt>" + l0.a(((androidx.media3.common.text.g) obj3).a) + "</rt></ruby>";
                                        } else if (obj3 instanceof UnderlineSpan) {
                                            str31 = "</u>";
                                        }
                                        str13 = str31;
                                    }
                                }
                                spanStart = spanned.getSpanStart(obj3);
                                spanEnd = spanned.getSpanEnd(obj3);
                                if (strQ != null) {
                                    str13.getClass();
                                    j0 j0Var = new j0(strQ, spanStart, str13, spanEnd);
                                    k0Var = (k0) sparseArray.get(spanStart);
                                    if (k0Var == null) {
                                        k0Var = new k0();
                                        sparseArray.put(spanStart, k0Var);
                                    }
                                    k0Var.a.add(j0Var);
                                    k0Var2 = (k0) sparseArray.get(spanEnd);
                                    if (k0Var2 == null) {
                                        k0Var2 = new k0();
                                        sparseArray.put(spanEnd, k0Var2);
                                    }
                                    k0Var2.b.add(j0Var);
                                }
                                i9++;
                                str26 = str30;
                                str25 = str25;
                                spans = objArr;
                            }
                            objArr = spans;
                            str13 = z2 ? "</span>" : "</span>";
                            spanStart = spanned.getSpanStart(obj3);
                            spanEnd = spanned.getSpanEnd(obj3);
                            if (strQ != null) {
                                str13.getClass();
                                j0 j0Var2 = new j0(strQ, spanStart, str13, spanEnd);
                                k0Var = (k0) sparseArray.get(spanStart);
                                if (k0Var == null) {
                                    k0Var = new k0();
                                    sparseArray.put(spanStart, k0Var);
                                }
                                k0Var.a.add(j0Var2);
                                k0Var2 = (k0) sparseArray.get(spanEnd);
                                if (k0Var2 == null) {
                                    k0Var2 = new k0();
                                    sparseArray.put(spanEnd, k0Var2);
                                }
                                k0Var2.b.add(j0Var2);
                            }
                            i9++;
                            str26 = str30;
                            str25 = str25;
                            spans = objArr;
                        }
                        str26 = str26;
                        str25 = str25;
                        sb = new StringBuilder(spanned.length());
                        i10 = 0;
                        i11 = 0;
                        while (i11 < sparseArray.size()) {
                            int iKeyAt = sparseArray.keyAt(i11);
                            sb.append(l0.a(spanned.subSequence(i10, iKeyAt)));
                            k0 k0Var3 = (k0) sparseArray.get(iKeyAt);
                            ArrayList arrayList = k0Var3.b;
                            ArrayList arrayList2 = k0Var3.a;
                            String str38 = str19;
                            Collections.sort(arrayList, j0.f);
                            it2 = k0Var3.b.iterator();
                            while (it2.hasNext()) {
                                sb.append(((j0) it2.next()).d);
                            }
                            Collections.sort(arrayList2, j0.e);
                            it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                sb.append(((j0) it3.next()).c);
                            }
                            i11++;
                            i10 = iKeyAt;
                            str19 = str38;
                        }
                        str19 = str19;
                        sb.append(l0.a(spanned.subSequence(i10, spanned.length())));
                        rVar = new androidx.emoji2.text.r(sb.toString());
                    } else {
                        rVar = new androidx.emoji2.text.r(l0.a(charSequence));
                    }
                    str14 = rVar.e;
                    for (String str39 : map2.keySet()) {
                        str18 = (String) map2.put(str39, (String) map2.get(str39));
                        if (str18 != null || str18.equals(map2.get(str39))) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        com.google.android.material.motion.a.q(z3);
                    }
                    Integer numValueOf = Integer.valueOf(i29);
                    Float fValueOf2 = Float.valueOf(f6);
                    Integer numValueOf2 = Integer.valueOf(i28);
                    Integer numValueOf3 = Integer.valueOf(i25);
                    f3 = bVar.q;
                    if (f3 != 0.0f) {
                        if (i23 != 2 || i23 == 1) {
                            str17 = "skewY";
                        } else {
                            str17 = "skewX";
                        }
                        Object[] objArr7 = {str17, Float.valueOf(f3)};
                        String str40 = androidx.media3.common.util.j0.a;
                        str15 = String.format(Locale.US, "%s(%.2fdeg)", objArr7);
                    } else {
                        str15 = str10;
                    }
                    sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf, str7, fValueOf2, str8, str2, obj2, str27, obj, str28, strB2, strN6, numValueOf2, numValueOf3, str15));
                    sb3.append("<span class='default_bg'>");
                    alignment2 = bVar.c;
                    if (alignment2 != null) {
                        i17 = s0.a[alignment2.ordinal()];
                        if (i17 != 1) {
                            i16 = 2;
                            if (i17 != 2) {
                                str16 = "center";
                            } else {
                                str16 = str11;
                            }
                        } else {
                            i16 = 2;
                            str16 = "start";
                        }
                        sb3.append("<span style='display:inline-block; text-align:" + str16 + ";'>");
                        sb3.append(str14);
                        sb3.append("</span>");
                    } else {
                        i16 = 2;
                        sb3.append(str14);
                    }
                    sb3.append("</span></div>");
                    i22 = i29 + 1;
                    i20 = i16;
                    f4 = f7;
                    str19 = str19;
                    str26 = str26;
                    str25 = str25;
                    i21 = 1;
                }
                str11 = "end";
                str14 = rVar.e;
                while (r5.hasNext()) {
                    str18 = (String) map2.put(str39, (String) map2.get(str39));
                    if (str18 != null) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    com.google.android.material.motion.a.q(z3);
                }
                Integer numValueOf4 = Integer.valueOf(i29);
                Float fValueOf3 = Float.valueOf(f6);
                Integer numValueOf5 = Integer.valueOf(i28);
                Integer numValueOf6 = Integer.valueOf(i25);
                f3 = bVar.q;
                if (f3 != 0.0f) {
                    if (i23 != 2) {
                        str17 = "skewY";
                    } else {
                        str17 = "skewY";
                    }
                    Object[] objArr8 = {str17, Float.valueOf(f3)};
                    String str41 = androidx.media3.common.util.j0.a;
                    str15 = String.format(Locale.US, "%s(%.2fdeg)", objArr8);
                } else {
                    str15 = str10;
                }
                sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf4, str7, fValueOf3, str8, str2, obj2, str27, obj, str28, strB2, strN6, numValueOf5, numValueOf6, str15));
                sb3.append("<span class='default_bg'>");
                alignment2 = bVar.c;
                if (alignment2 != null) {
                    i17 = s0.a[alignment2.ordinal()];
                    if (i17 != 1) {
                        i16 = 2;
                        if (i17 != 2) {
                            str16 = "center";
                        } else {
                            str16 = str11;
                        }
                    } else {
                        i16 = 2;
                        str16 = "start";
                    }
                    sb3.append("<span style='display:inline-block; text-align:" + str16 + ";'>");
                    sb3.append(str14);
                    sb3.append("</span>");
                } else {
                    i16 = 2;
                    sb3.append(str14);
                }
                sb3.append("</span></div>");
                i22 = i29 + 1;
                i20 = i16;
                f4 = f7;
                str19 = str19;
                str26 = str26;
                str25 = str25;
                i21 = 1;
            } else {
                str = String.format(Locale.US, "%.2f%%", Float.valueOf((1.0f - this.D) * 100.0f));
            }
            str2 = str;
            i = 0;
            f = bVar.j;
            if (f != -8388609) {
                str3 = String.format(Locale.US, "%.2f%%", Float.valueOf(f * 100.0f));
            } else {
                str3 = "fit-content";
            }
            String str210 = str3;
            alignment = bVar.b;
            str4 = "end";
            if (alignment == null) {
                i4 = i21;
                obj = "center";
                i3 = 2;
            } else {
                i2 = s0.a[alignment.ordinal()];
                if (i2 != i21) {
                    i3 = 2;
                    if (i2 != 2) {
                        obj = "center";
                    } else {
                        obj = "end";
                    }
                } else {
                    i3 = 2;
                    obj = "start";
                }
                i4 = 1;
            }
            if (i23 != i4) {
                str5 = "vertical-rl";
            } else if (i23 != i3) {
                str5 = "horizontal-tb";
            } else {
                str5 = "vertical-lr";
            }
            String str211 = str5;
            String strB3 = b(bVar.n, bVar.o);
            if (bVar.l) {
                i5 = bVar.m;
            } else {
                i5 = this.A.c;
            }
            String strN9 = org.jsoup.helper.n.N(i5);
            str6 = "right";
            str7 = "left";
            i6 = i26;
            if (i23 != 1) {
                if (i != 0) {
                    str6 = "left";
                }
                str8 = str6;
                str7 = "top";
            } else if (i23 != 2) {
                str8 = i != 0 ? "bottom" : "top";
            } else {
                if (i == 0) {
                    str6 = "left";
                }
                str8 = str6;
                str7 = "top";
            }
            if (i23 != 2) {
                obj2 = "height";
                i7 = i25;
                i25 = i6;
            } else {
                obj2 = "height";
                i7 = i25;
                i25 = i6;
            }
            charSequence = bVar.a;
            f2 = getContext().getResources().getDisplayMetrics().density;
            Pattern pattern2 = l0.a;
            int i210 = i7;
            int i211 = i22;
            str9 = "";
            if (charSequence == null) {
                rVar = new androidx.emoji2.text.r(str9);
                str10 = "";
            } else {
                str10 = "";
                if (charSequence instanceof Spanned) {
                    rVar = new androidx.emoji2.text.r(l0.a(charSequence));
                } else {
                    spanned = (Spanned) charSequence;
                    hashSet = new HashSet();
                    backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                    length = backgroundColorSpanArr.length;
                    i8 = 0;
                    while (i8 < length) {
                        hashSet.add(Integer.valueOf(backgroundColorSpanArr[i8].getBackgroundColor()));
                        i8++;
                        backgroundColorSpanArr = backgroundColorSpanArr;
                    }
                    map = new HashMap();
                    it = hashSet.iterator();
                    while (it.hasNext()) {
                        int iIntValue2 = ((Integer) it.next()).intValue();
                        String strL2 = androidx.privacysandbox.ads.adservices.java.internal.a.l(iIntValue2, "bg_");
                        Iterator it5 = it;
                        String strJ2 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.j(".", strL2, ",.", strL2, " *");
                        String strN10 = org.jsoup.helper.n.N(iIntValue2);
                        String str212 = androidx.media3.common.util.j0.a;
                        Locale locale8 = Locale.US;
                        map.put(strJ2, str25 + strN10 + str26);
                        it = it5;
                        str4 = str4;
                    }
                    str11 = str4;
                    sparseArray = new SparseArray();
                    spans = spanned.getSpans(0, spanned.length(), Object.class);
                    i9 = 0;
                    while (i9 < length2) {
                        obj3 = spans[i9];
                        String str310 = str26;
                        z = obj3 instanceof StrikethroughSpan;
                        String str311 = null;
                        if (z) {
                            z2 = z;
                            strQ = "<span style='text-decoration:line-through;'>";
                        } else {
                            z2 = z;
                            if (obj3 instanceof ForegroundColorSpan) {
                                String strN11 = org.jsoup.helper.n.N(((ForegroundColorSpan) obj3).getForegroundColor());
                                String str312 = androidx.media3.common.util.j0.a;
                                Locale locale9 = Locale.US;
                                strQ = androidx.privacysandbox.ads.adservices.java.internal.a.q("<span style='color:", strN11, ";'>");
                            } else {
                                str25 = str25;
                                if (obj3 instanceof BackgroundColorSpan) {
                                    int backgroundColor2 = ((BackgroundColorSpan) obj3).getBackgroundColor();
                                    String str313 = androidx.media3.common.util.j0.a;
                                    Locale locale10 = Locale.US;
                                    objArr = spans;
                                    strQ = androidx.privacysandbox.ads.adservices.java.internal.a.p("<span class='bg_", backgroundColor2, "'>");
                                } else {
                                    objArr = spans;
                                    if (obj3 instanceof androidx.media3.common.text.e) {
                                        strQ = "<span style='text-combine-upright:all;'>";
                                    } else if (obj3 instanceof AbsoluteSizeSpan) {
                                        absoluteSizeSpan = (AbsoluteSizeSpan) obj3;
                                        if (absoluteSizeSpan.getDip()) {
                                            size = absoluteSizeSpan.getSize();
                                        } else {
                                            size = absoluteSizeSpan.getSize() / f2;
                                        }
                                        Object[] objArr9 = {Float.valueOf(size)};
                                        String str314 = androidx.media3.common.util.j0.a;
                                        strQ = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr9);
                                    } else if (obj3 instanceof RelativeSizeSpan) {
                                        Object[] objArr10 = {Float.valueOf(((RelativeSizeSpan) obj3).getSizeChange() * 100.0f)};
                                        String str315 = androidx.media3.common.util.j0.a;
                                        strQ = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr10);
                                    } else if (obj3 instanceof TypefaceSpan) {
                                        family = ((TypefaceSpan) obj3).getFamily();
                                        if (family != null) {
                                            String str316 = androidx.media3.common.util.j0.a;
                                            Locale locale11 = Locale.US;
                                            strQ = androidx.privacysandbox.ads.adservices.java.internal.a.q("<span style='font-family:\"", family, "\";'>");
                                        } else {
                                            strQ = null;
                                        }
                                    } else if (obj3 instanceof StyleSpan) {
                                        style = ((StyleSpan) obj3).getStyle();
                                        if (style != 1) {
                                            strQ = "<b>";
                                        } else if (style != 2) {
                                            strQ = "<i>";
                                        } else if (style != 3) {
                                            strQ = null;
                                        } else {
                                            strQ = "<b><i>";
                                        }
                                    } else if (obj3 instanceof androidx.media3.common.text.g) {
                                        i15 = ((androidx.media3.common.text.g) obj3).b;
                                        if (i15 != -1) {
                                            strQ = "<ruby style='ruby-position:unset;'>";
                                        } else if (i15 != 1) {
                                            strQ = "<ruby style='ruby-position:over;'>";
                                        } else if (i15 != 2) {
                                            strQ = null;
                                        } else {
                                            strQ = "<ruby style='ruby-position:under;'>";
                                        }
                                    } else if (obj3 instanceof UnderlineSpan) {
                                        strQ = "<u>";
                                    } else if (obj3 instanceof androidx.media3.common.text.h) {
                                        hVar = (androidx.media3.common.text.h) obj3;
                                        i12 = hVar.a;
                                        i13 = hVar.b;
                                        sb2 = new StringBuilder();
                                        if (i13 != 1) {
                                            i14 = 2;
                                            if (i13 == 2) {
                                                sb2.append("open ");
                                            }
                                        } else {
                                            i14 = 2;
                                            sb2.append("filled ");
                                        }
                                        if (i12 != 0) {
                                            sb2.append("none");
                                        } else if (i12 != 1) {
                                            sb2.append("circle");
                                        } else if (i12 != i14) {
                                            sb2.append("dot");
                                        } else if (i12 != 3) {
                                            sb2.append(str19);
                                        } else {
                                            sb2.append("sesame");
                                        }
                                        String string2 = sb2.toString();
                                        if (hVar.c != 2) {
                                            str12 = "over right";
                                        } else {
                                            str12 = "under left";
                                        }
                                        Object[] objArr11 = {string2, str12};
                                        String str317 = androidx.media3.common.util.j0.a;
                                        strQ = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr11);
                                    } else {
                                        strQ = null;
                                    }
                                }
                            }
                            if (z2) {
                            }
                            spanStart = spanned.getSpanStart(obj3);
                            spanEnd = spanned.getSpanEnd(obj3);
                            if (strQ != null) {
                                str13.getClass();
                                j0 j0Var3 = new j0(strQ, spanStart, str13, spanEnd);
                                k0Var = (k0) sparseArray.get(spanStart);
                                if (k0Var == null) {
                                    k0Var = new k0();
                                    sparseArray.put(spanStart, k0Var);
                                }
                                k0Var.a.add(j0Var3);
                                k0Var2 = (k0) sparseArray.get(spanEnd);
                                if (k0Var2 == null) {
                                    k0Var2 = new k0();
                                    sparseArray.put(spanEnd, k0Var2);
                                }
                                k0Var2.b.add(j0Var3);
                            }
                            i9++;
                            str26 = str310;
                            str25 = str25;
                            spans = objArr;
                        }
                        objArr = spans;
                        if (z2) {
                        }
                        spanStart = spanned.getSpanStart(obj3);
                        spanEnd = spanned.getSpanEnd(obj3);
                        if (strQ != null) {
                            str13.getClass();
                            j0 j0Var4 = new j0(strQ, spanStart, str13, spanEnd);
                            k0Var = (k0) sparseArray.get(spanStart);
                            if (k0Var == null) {
                                k0Var = new k0();
                                sparseArray.put(spanStart, k0Var);
                            }
                            k0Var.a.add(j0Var4);
                            k0Var2 = (k0) sparseArray.get(spanEnd);
                            if (k0Var2 == null) {
                                k0Var2 = new k0();
                                sparseArray.put(spanEnd, k0Var2);
                            }
                            k0Var2.b.add(j0Var4);
                        }
                        i9++;
                        str26 = str310;
                        str25 = str25;
                        spans = objArr;
                    }
                    str26 = str26;
                    str25 = str25;
                    sb = new StringBuilder(spanned.length());
                    i10 = 0;
                    i11 = 0;
                    while (i11 < sparseArray.size()) {
                        int iKeyAt2 = sparseArray.keyAt(i11);
                        sb.append(l0.a(spanned.subSequence(i10, iKeyAt2)));
                        k0 k0Var4 = (k0) sparseArray.get(iKeyAt2);
                        ArrayList arrayList3 = k0Var4.b;
                        ArrayList arrayList4 = k0Var4.a;
                        String str318 = str19;
                        Collections.sort(arrayList3, j0.f);
                        it2 = k0Var4.b.iterator();
                        while (it2.hasNext()) {
                            sb.append(((j0) it2.next()).d);
                        }
                        Collections.sort(arrayList4, j0.e);
                        it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            sb.append(((j0) it3.next()).c);
                        }
                        i11++;
                        i10 = iKeyAt2;
                        str19 = str318;
                    }
                    str19 = str19;
                    sb.append(l0.a(spanned.subSequence(i10, spanned.length())));
                    rVar = new androidx.emoji2.text.r(sb.toString());
                }
                str14 = rVar.e;
                while (r5.hasNext()) {
                    str18 = (String) map2.put(str39, (String) map2.get(str39));
                    if (str18 != null) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    com.google.android.material.motion.a.q(z3);
                }
                Integer numValueOf7 = Integer.valueOf(i211);
                Float fValueOf4 = Float.valueOf(f6);
                Integer numValueOf8 = Integer.valueOf(i210);
                Integer numValueOf9 = Integer.valueOf(i25);
                f3 = bVar.q;
                if (f3 != 0.0f) {
                    if (i23 != 2) {
                        str17 = "skewY";
                    } else {
                        str17 = "skewY";
                    }
                    Object[] objArr12 = {str17, Float.valueOf(f3)};
                    String str42 = androidx.media3.common.util.j0.a;
                    str15 = String.format(Locale.US, "%s(%.2fdeg)", objArr12);
                } else {
                    str15 = str10;
                }
                sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf7, str7, fValueOf4, str8, str2, obj2, str210, obj, str211, strB3, strN9, numValueOf8, numValueOf9, str15));
                sb3.append("<span class='default_bg'>");
                alignment2 = bVar.c;
                if (alignment2 != null) {
                    i17 = s0.a[alignment2.ordinal()];
                    if (i17 != 1) {
                        i16 = 2;
                        if (i17 != 2) {
                            str16 = "center";
                        } else {
                            str16 = str11;
                        }
                    } else {
                        i16 = 2;
                        str16 = "start";
                    }
                    sb3.append("<span style='display:inline-block; text-align:" + str16 + ";'>");
                    sb3.append(str14);
                    sb3.append("</span>");
                } else {
                    i16 = 2;
                    sb3.append(str14);
                }
                sb3.append("</span></div>");
                i22 = i211 + 1;
                i20 = i16;
                f4 = f7;
                str19 = str19;
                str26 = str26;
                str25 = str25;
                i21 = 1;
            }
            str11 = "end";
            str14 = rVar.e;
            while (r5.hasNext()) {
                str18 = (String) map2.put(str39, (String) map2.get(str39));
                if (str18 != null) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                com.google.android.material.motion.a.q(z3);
            }
            Integer numValueOf10 = Integer.valueOf(i211);
            Float fValueOf5 = Float.valueOf(f6);
            Integer numValueOf11 = Integer.valueOf(i210);
            Integer numValueOf12 = Integer.valueOf(i25);
            f3 = bVar.q;
            if (f3 != 0.0f) {
                if (i23 != 2) {
                    str17 = "skewY";
                } else {
                    str17 = "skewY";
                }
                Object[] objArr13 = {str17, Float.valueOf(f3)};
                String str43 = androidx.media3.common.util.j0.a;
                str15 = String.format(Locale.US, "%s(%.2fdeg)", objArr13);
            } else {
                str15 = str10;
            }
            sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf10, str7, fValueOf5, str8, str2, obj2, str210, obj, str211, strB3, strN9, numValueOf11, numValueOf12, str15));
            sb3.append("<span class='default_bg'>");
            alignment2 = bVar.c;
            if (alignment2 != null) {
                i17 = s0.a[alignment2.ordinal()];
                if (i17 != 1) {
                    i16 = 2;
                    if (i17 != 2) {
                        str16 = "center";
                    } else {
                        str16 = str11;
                    }
                } else {
                    i16 = 2;
                    str16 = "start";
                }
                sb3.append("<span style='display:inline-block; text-align:" + str16 + ";'>");
                sb3.append(str14);
                sb3.append("</span>");
            } else {
                i16 = 2;
                sb3.append(str14);
            }
            sb3.append("</span></div>");
            i22 = i211 + 1;
            i20 = i16;
            f4 = f7;
            str19 = str19;
            str26 = str26;
            str25 = str25;
            i21 = 1;
        }
        sb3.append("</div></body></html>");
        StringBuilder sb5 = new StringBuilder();
        sb5.append("<html><head><style>");
        for (String str44 : map2.keySet()) {
            sb5.append(str44);
            sb5.append("{");
            sb5.append((String) map2.get(str44));
            sb5.append("}");
        }
        sb5.append("</style></head>");
        sb3.insert(0, (CharSequence) sb5);
        this.y.loadData(Base64.encodeToString(sb3.toString().getBytes(StandardCharsets.UTF_8), 1), "text/html", "base64");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.z.isEmpty()) {
            return;
        }
        c();
    }
}
