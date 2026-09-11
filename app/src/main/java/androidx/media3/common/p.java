package androidx.media3.common;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements com.google.common.base.f {
    public final /* synthetic */ int e;

    /* JADX WARN: Code duplicated, block: B:102:0x0321  */
    /* JADX WARN: Code duplicated, block: B:104:0x0329  */
    /* JADX WARN: Code duplicated, block: B:107:0x0335  */
    /* JADX WARN: Code duplicated, block: B:108:0x0338  */
    /* JADX WARN: Code duplicated, block: B:111:0x0342  */
    /* JADX WARN: Code duplicated, block: B:114:0x0350  */
    /* JADX WARN: Code duplicated, block: B:116:0x0357  */
    /* JADX WARN: Code duplicated, block: B:119:0x0361  */
    /* JADX WARN: Code duplicated, block: B:71:0x028d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0295  */
    /* JADX WARN: Code duplicated, block: B:74:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:77:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:78:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:81:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:82:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:85:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:86:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:89:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:91:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:92:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:95:0x0302  */
    /* JADX WARN: Code duplicated, block: B:96:0x0309  */
    /* JADX WARN: Code duplicated, block: B:99:0x0313  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r2v35, types: [android.text.Spannable, android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // com.google.common.base.f
    public final Object apply(Object obj) {
        ?? r17;
        Bitmap bitmapDecodeByteArray;
        String str;
        float f;
        int i;
        String str2;
        int i2;
        String str3;
        float f2;
        String str4;
        int i3;
        String str5;
        float f3;
        int i4;
        String str6;
        float f4;
        String str7;
        int i5;
        boolean z;
        boolean z2;
        String str8;
        float f5;
        String str9;
        String str10;
        int i6 = 7;
        int i7 = 2;
        int i8 = 1;
        switch (this.e) {
            case 0:
                t tVar = (t) obj;
                return tVar.a + ": " + tVar.b;
            case 1:
                return Integer.valueOf(((androidx.media3.common.text.b) obj).r);
            case 2:
                return new androidx.media3.exoplayer.analytics.g((androidx.media3.common.util.e0) obj);
            case 3:
                return com.google.common.collect.h0.s(Integer.valueOf(((androidx.media3.exoplayer.source.chunk.h) obj).e));
            case 4:
                androidx.media3.exoplayer.hls.r rVar = (androidx.media3.exoplayer.hls.r) obj;
                rVar.b();
                return com.google.common.collect.h0.o(com.google.common.collect.q.w(rVar.f0.b, new p(i6)));
            case 5:
                androidx.media3.extractor.n nVar = (androidx.media3.extractor.n) obj;
                nVar.getClass();
                return nVar.getClass().getSimpleName();
            case 6:
                return com.google.common.collect.h0.o(com.google.common.collect.q.w(((androidx.media3.exoplayer.source.u) obj).r().b, new p(i6)));
            case 7:
                return Integer.valueOf(((w0) obj).c);
            case 8:
                return Long.valueOf(((androidx.media3.extractor.text.a) obj).b);
            case 9:
                return Long.valueOf(((androidx.media3.extractor.text.a) obj).c);
            case 10:
                return (androidx.media3.extractor.mp4.r) obj;
            case 11:
                return (androidx.media3.extractor.mp4.r) obj;
            case 12:
                Bundle bundle = (Bundle) obj;
                ?? charSequence = bundle.getCharSequence(androidx.media3.common.text.b.s);
                if (charSequence != 0) {
                    ArrayList<Bundle> parcelableArrayList = bundle.getParcelableArrayList(androidx.media3.common.text.b.t);
                    if (parcelableArrayList != null) {
                        charSequence = SpannableString.valueOf(charSequence);
                        for (Bundle bundle2 : parcelableArrayList) {
                            int i9 = bundle2.getInt(androidx.media3.common.text.d.a);
                            int i10 = bundle2.getInt(androidx.media3.common.text.d.b);
                            int i11 = bundle2.getInt(androidx.media3.common.text.d.c);
                            int i12 = bundle2.getInt(androidx.media3.common.text.d.d, -1);
                            Bundle bundle3 = bundle2.getBundle(androidx.media3.common.text.d.e);
                            if (i12 == i8) {
                                bundle3.getClass();
                                String string = bundle3.getString(androidx.media3.common.text.g.c);
                                string.getClass();
                                charSequence.setSpan(new androidx.media3.common.text.g(string, bundle3.getInt(androidx.media3.common.text.g.d)), i9, i10, i11);
                            } else if (i12 == i7) {
                                bundle3.getClass();
                                charSequence.setSpan(new androidx.media3.common.text.h(bundle3.getInt(androidx.media3.common.text.h.d), bundle3.getInt(androidx.media3.common.text.h.e), bundle3.getInt(androidx.media3.common.text.h.f)), i9, i10, i11);
                            } else if (i12 == 3) {
                                charSequence.setSpan(new androidx.media3.common.text.e(), i9, i10, i11);
                            } else if (i12 == 4) {
                                bundle3.getClass();
                                String string2 = bundle3.getString(androidx.media3.common.text.i.b);
                                string2.getClass();
                                charSequence.setSpan(new androidx.media3.common.text.i(string2), i9, i10, i11);
                            }
                            i7 = 2;
                            i8 = 1;
                        }
                    }
                } else {
                    charSequence = 0;
                }
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(androidx.media3.common.text.b.u);
                Layout.Alignment alignment2 = alignment != null ? alignment : null;
                Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(androidx.media3.common.text.b.v);
                Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
                Bitmap bitmap = (Bitmap) bundle.getParcelable(androidx.media3.common.text.b.w);
                if (bitmap == null) {
                    byte[] byteArray = bundle.getByteArray(androidx.media3.common.text.b.x);
                    if (byteArray != null) {
                        bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                    } else {
                        r17 = charSequence;
                        bitmapDecodeByteArray = null;
                    }
                    str = androidx.media3.common.text.b.y;
                    if (bundle.containsKey(str)) {
                        str10 = androidx.media3.common.text.b.z;
                        if (bundle.containsKey(str10)) {
                            f = bundle.getFloat(str);
                            i = bundle.getInt(str10);
                        } else {
                            f = -3.4028235E38f;
                            i = Integer.MIN_VALUE;
                        }
                    } else {
                        f = -3.4028235E38f;
                        i = Integer.MIN_VALUE;
                    }
                    str2 = androidx.media3.common.text.b.A;
                    if (bundle.containsKey(str2)) {
                        i2 = bundle.getInt(str2);
                    } else {
                        i2 = Integer.MIN_VALUE;
                    }
                    str3 = androidx.media3.common.text.b.B;
                    if (bundle.containsKey(str3)) {
                        f2 = bundle.getFloat(str3);
                    } else {
                        f2 = -3.4028235E38f;
                    }
                    str4 = androidx.media3.common.text.b.C;
                    if (bundle.containsKey(str4)) {
                        i3 = bundle.getInt(str4);
                    } else {
                        i3 = Integer.MIN_VALUE;
                    }
                    str5 = androidx.media3.common.text.b.E;
                    if (bundle.containsKey(str5)) {
                        str9 = androidx.media3.common.text.b.D;
                        if (bundle.containsKey(str9)) {
                            f3 = bundle.getFloat(str5);
                            i4 = bundle.getInt(str9);
                        } else {
                            f3 = -3.4028235E38f;
                            i4 = Integer.MIN_VALUE;
                        }
                    } else {
                        f3 = -3.4028235E38f;
                        i4 = Integer.MIN_VALUE;
                    }
                    str6 = androidx.media3.common.text.b.F;
                    if (bundle.containsKey(str6)) {
                        f4 = bundle.getFloat(str6);
                    } else {
                        f4 = -3.4028235E38f;
                    }
                    String str11 = androidx.media3.common.text.b.G;
                    float f6 = bundle.containsKey(str11) ? bundle.getFloat(str11) : -3.4028235E38f;
                    str7 = androidx.media3.common.text.b.H;
                    if (bundle.containsKey(str7)) {
                        i5 = bundle.getInt(str7);
                        z = true;
                    } else {
                        i5 = -16777216;
                        z = false;
                    }
                    int i13 = i5;
                    if (bundle.getBoolean(androidx.media3.common.text.b.I, false)) {
                        z2 = z;
                    } else {
                        z2 = false;
                    }
                    String str12 = androidx.media3.common.text.b.J;
                    int i14 = bundle.containsKey(str12) ? bundle.getInt(str12) : Integer.MIN_VALUE;
                    str8 = androidx.media3.common.text.b.K;
                    if (bundle.containsKey(str8)) {
                        f5 = bundle.getFloat(str8);
                    } else {
                        f5 = 0.0f;
                    }
                    float f7 = f5;
                    String str13 = androidx.media3.common.text.b.L;
                    return new androidx.media3.common.text.b(r17, alignment2, alignment4, bitmapDecodeByteArray, f, i, i2, f2, i3, i4, f3, f4, f6, z2, i13, i14, f7, bundle.containsKey(str13) ? bundle.getInt(str13) : 0);
                }
                bitmapDecodeByteArray = bitmap;
                r17 = 0;
                str = androidx.media3.common.text.b.y;
                if (bundle.containsKey(str)) {
                    str10 = androidx.media3.common.text.b.z;
                    if (bundle.containsKey(str10)) {
                        f = bundle.getFloat(str);
                        i = bundle.getInt(str10);
                    } else {
                        f = -3.4028235E38f;
                        i = Integer.MIN_VALUE;
                    }
                } else {
                    f = -3.4028235E38f;
                    i = Integer.MIN_VALUE;
                }
                str2 = androidx.media3.common.text.b.A;
                if (bundle.containsKey(str2)) {
                    i2 = bundle.getInt(str2);
                } else {
                    i2 = Integer.MIN_VALUE;
                }
                str3 = androidx.media3.common.text.b.B;
                if (bundle.containsKey(str3)) {
                    f2 = bundle.getFloat(str3);
                } else {
                    f2 = -3.4028235E38f;
                }
                str4 = androidx.media3.common.text.b.C;
                if (bundle.containsKey(str4)) {
                    i3 = bundle.getInt(str4);
                } else {
                    i3 = Integer.MIN_VALUE;
                }
                str5 = androidx.media3.common.text.b.E;
                if (bundle.containsKey(str5)) {
                    str9 = androidx.media3.common.text.b.D;
                    if (bundle.containsKey(str9)) {
                        f3 = bundle.getFloat(str5);
                        i4 = bundle.getInt(str9);
                    } else {
                        f3 = -3.4028235E38f;
                        i4 = Integer.MIN_VALUE;
                    }
                } else {
                    f3 = -3.4028235E38f;
                    i4 = Integer.MIN_VALUE;
                }
                str6 = androidx.media3.common.text.b.F;
                if (bundle.containsKey(str6)) {
                    f4 = bundle.getFloat(str6);
                } else {
                    f4 = -3.4028235E38f;
                }
                String str14 = androidx.media3.common.text.b.G;
                float f8 = bundle.containsKey(str14) ? bundle.getFloat(str14) : -3.4028235E38f;
                str7 = androidx.media3.common.text.b.H;
                if (bundle.containsKey(str7)) {
                    i5 = bundle.getInt(str7);
                    z = true;
                } else {
                    i5 = -16777216;
                    z = false;
                }
                int i15 = i5;
                if (bundle.getBoolean(androidx.media3.common.text.b.I, false)) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                String str15 = androidx.media3.common.text.b.J;
                int i16 = bundle.containsKey(str15) ? bundle.getInt(str15) : Integer.MIN_VALUE;
                str8 = androidx.media3.common.text.b.K;
                if (bundle.containsKey(str8)) {
                    f5 = bundle.getFloat(str8);
                } else {
                    f5 = 0.0f;
                }
                float f9 = f5;
                String str16 = androidx.media3.common.text.b.L;
                return new androidx.media3.common.text.b(r17, alignment2, alignment4, bitmapDecodeByteArray, f, i, i2, f2, i3, i4, f3, f4, f8, z2, i15, i16, f9, bundle.containsKey(str16) ? bundle.getInt(str16) : 0);
            case 13:
                androidx.media3.common.text.b bVar = (androidx.media3.common.text.b) obj;
                Bitmap bitmap2 = bVar.d;
                Bundle bundle4 = new Bundle();
                CharSequence charSequence2 = bVar.a;
                if (charSequence2 != null) {
                    bundle4.putCharSequence(androidx.media3.common.text.b.s, charSequence2);
                    if (charSequence2 instanceof Spanned) {
                        Spanned spanned = (Spanned) charSequence2;
                        String str17 = androidx.media3.common.text.d.a;
                        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                        for (androidx.media3.common.text.g gVar : (androidx.media3.common.text.g[]) spanned.getSpans(0, spanned.length(), androidx.media3.common.text.g.class)) {
                            gVar.getClass();
                            Bundle bundle5 = new Bundle();
                            bundle5.putString(androidx.media3.common.text.g.c, gVar.a);
                            bundle5.putInt(androidx.media3.common.text.g.d, gVar.b);
                            arrayList.add(androidx.media3.common.text.d.a(spanned, gVar, 1, bundle5));
                        }
                        for (androidx.media3.common.text.h hVar : (androidx.media3.common.text.h[]) spanned.getSpans(0, spanned.length(), androidx.media3.common.text.h.class)) {
                            hVar.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt(androidx.media3.common.text.h.d, hVar.a);
                            bundle6.putInt(androidx.media3.common.text.h.e, hVar.b);
                            bundle6.putInt(androidx.media3.common.text.h.f, hVar.c);
                            arrayList.add(androidx.media3.common.text.d.a(spanned, hVar, 2, bundle6));
                        }
                        for (androidx.media3.common.text.e eVar : (androidx.media3.common.text.e[]) spanned.getSpans(0, spanned.length(), androidx.media3.common.text.e.class)) {
                            arrayList.add(androidx.media3.common.text.d.a(spanned, eVar, 3, null));
                        }
                        for (androidx.media3.common.text.i iVar : (androidx.media3.common.text.i[]) spanned.getSpans(0, spanned.length(), androidx.media3.common.text.i.class)) {
                            iVar.getClass();
                            Bundle bundle7 = new Bundle();
                            bundle7.putString(androidx.media3.common.text.i.b, iVar.a);
                            arrayList.add(androidx.media3.common.text.d.a(spanned, iVar, 4, bundle7));
                        }
                        if (!arrayList.isEmpty()) {
                            bundle4.putParcelableArrayList(androidx.media3.common.text.b.t, arrayList);
                        }
                    }
                }
                bundle4.putSerializable(androidx.media3.common.text.b.u, bVar.b);
                bundle4.putSerializable(androidx.media3.common.text.b.v, bVar.c);
                bundle4.putFloat(androidx.media3.common.text.b.y, bVar.e);
                bundle4.putInt(androidx.media3.common.text.b.z, bVar.f);
                bundle4.putInt(androidx.media3.common.text.b.A, bVar.g);
                bundle4.putFloat(androidx.media3.common.text.b.B, bVar.h);
                bundle4.putInt(androidx.media3.common.text.b.C, bVar.i);
                bundle4.putInt(androidx.media3.common.text.b.D, bVar.n);
                bundle4.putFloat(androidx.media3.common.text.b.E, bVar.o);
                bundle4.putFloat(androidx.media3.common.text.b.F, bVar.j);
                bundle4.putFloat(androidx.media3.common.text.b.G, bVar.k);
                bundle4.putBoolean(androidx.media3.common.text.b.I, bVar.l);
                bundle4.putInt(androidx.media3.common.text.b.H, bVar.m);
                bundle4.putInt(androidx.media3.common.text.b.J, bVar.p);
                bundle4.putFloat(androidx.media3.common.text.b.K, bVar.q);
                bundle4.putInt(androidx.media3.common.text.b.L, bVar.r);
                if (bitmap2 != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    com.google.android.material.motion.a.q(bitmap2.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                    bundle4.putByteArray(androidx.media3.common.text.b.x, byteArrayOutputStream.toByteArray());
                }
                return bundle4;
            default:
                long j = ((androidx.media3.extractor.text.a) obj).b;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                return Long.valueOf(j);
        }
    }

    public /* synthetic */ p(int i) {
        this.e = i;
    }
}
