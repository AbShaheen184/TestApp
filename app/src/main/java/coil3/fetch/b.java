package coil3.fetch;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import coil3.decode.s;
import coil3.m;
import coil3.request.n;
import coil3.w;
import com.google.android.gms.measurement.internal.f0;
import com.google.android.material.textfield.p;
import java.io.IOException;
import java.util.Locale;
import kotlin.collections.o;
import kotlin.jvm.internal.l;
import kotlin.text.r;
import okio.b0;
import okio.x;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements i {
    public final /* synthetic */ int a;
    public final w b;
    public final n c;

    public /* synthetic */ b(w wVar, n nVar, int i) {
        this.a = i;
        this.b = wVar;
        this.c = nVar;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0331  */
    /* JADX WARN: Code duplicated, block: B:193:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:21:0x0071  */
    @Override // coil3.fetch.i
    public final Object a(coil3.intercept.d dVar) throws XmlPullParserException, IOException {
        String mimeTypeFromExtension;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Object obj;
        int i6;
        Integer numQ;
        String mimeTypeFromExtension2;
        Drawable drawable;
        int i7 = this.a;
        int i8 = 1;
        int i9 = 0;
        coil3.decode.h hVar = coil3.decode.h.z;
        w wVar = this.b;
        n nVar = this.c;
        String mimeTypeFromExtension3 = null;
        switch (i7) {
            case 0:
                String strR = o.R(o.H(m.g(wVar)), "/", null, null, null, 62);
                s sVar = new s(new b0(okio.b.e(nVar.a.getAssets().open(strR))), nVar.f, new coil3.decode.a(strR));
                if (kotlin.text.k.d0(strR)) {
                    mimeTypeFromExtension = null;
                } else {
                    String strW0 = kotlin.text.k.w0(kotlin.text.k.w0(strR, '#'), '?');
                    String strR0 = kotlin.text.k.r0('.', kotlin.text.k.r0('/', strW0, strW0), "");
                    if (kotlin.text.k.d0(strR0)) {
                        mimeTypeFromExtension = null;
                    } else {
                        String lowerCase = strR0.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        mimeTypeFromExtension = (String) coil3.util.i.a.get(lowerCase);
                        if (mimeTypeFromExtension == null) {
                            mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                        }
                    }
                }
                return new k(sVar, mimeTypeFromExtension, hVar);
            case 1:
                String str = wVar.a;
                String str2 = wVar.a;
                int iB0 = kotlin.text.k.b0(str, ";base64,", 0, false, 6);
                if (iB0 == -1) {
                    net.luminis.tls.engine.impl.c.e(wVar, "invalid data uri: ");
                    return null;
                }
                int iA0 = kotlin.text.k.a0(str2, ':', 0, 6);
                if (iA0 == -1) {
                    net.luminis.tls.engine.impl.c.e(wVar, "invalid data uri: ");
                    return null;
                }
                String strSubstring = str2.substring(iA0 + 1, iB0);
                kotlin.io.encoding.a aVar = kotlin.io.encoding.c.c;
                int i10 = iB0 + 8;
                int length = str2.length();
                aVar.getClass();
                boolean z = aVar.b;
                p.c(i10, length, str2.length());
                byte[] bytes = str2.substring(i10, length).getBytes(kotlin.text.a.d);
                bytes.getClass();
                int length2 = bytes.length;
                p.c(0, length2, bytes.length);
                int i11 = -2;
                if (length2 == 0) {
                    i = 1;
                } else {
                    if (length2 == 1) {
                        net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(length2, "Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: "));
                        return null;
                    }
                    if (z) {
                        i3 = length2;
                        int i12 = 0;
                        while (true) {
                            i = i8;
                            if (i12 < length2) {
                                int i13 = kotlin.io.encoding.d.a[bytes[i12] & 255];
                                if (i13 < 0) {
                                    if (i13 == -2) {
                                        i3 -= length2 - i12;
                                    } else {
                                        i3--;
                                    }
                                }
                                i12++;
                                i8 = i;
                            }
                        }
                    } else {
                        i = 1;
                        if (bytes[length2 - 1] == 61) {
                            i3 = length2 - 1;
                            if (bytes[length2 - 2] == 61) {
                                i3 = length2 - 2;
                            }
                        } else {
                            i2 = length2;
                        }
                        i9 = (int) ((((long) i2) * ((long) 6)) / ((long) 8));
                    }
                    i2 = i3;
                    i9 = (int) ((((long) i2) * ((long) 6)) / ((long) 8));
                }
                byte[] bArr = new byte[i9];
                int[] iArr = aVar.a ? kotlin.io.encoding.d.b : kotlin.io.encoding.d.a;
                int i14 = -8;
                int i15 = 8;
                int i16 = -8;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    if (i17 < length2) {
                        if (i16 == i14 && (i6 = i17 + 3) < length2) {
                            int i20 = i17 + 4;
                            int i21 = (iArr[bytes[i17 + 2] & 255] << 6) | (iArr[bytes[i17] & 255] << 18) | (iArr[bytes[i17 + 1] & 255] << 12) | iArr[bytes[i6] & 255];
                            if (i21 >= 0) {
                                bArr[i18] = (byte) (i21 >> 16);
                                int i22 = i18 + 2;
                                bArr[i18 + 1] = (byte) (i21 >> 8);
                                i18 += 3;
                                bArr[i22] = (byte) i21;
                                i17 = i20;
                            }
                            i11 = -2;
                            i14 = -8;
                        }
                        int i23 = bytes[i17] & 255;
                        int i24 = iArr[i23];
                        if (i24 >= 0) {
                            i17++;
                            i19 = (i19 << 6) | i24;
                            int i25 = i16 + 6;
                            if (i25 >= 0) {
                                bArr[i18] = (byte) (i19 >>> i25);
                                i19 &= (i << i25) - 1;
                                i16 -= 2;
                                i18++;
                                i11 = -2;
                                i14 = -8;
                                i15 = 8;
                            } else {
                                i16 = i25;
                                i11 = -2;
                                i14 = -8;
                                i15 = 8;
                            }
                        } else {
                            if (i24 == -2) {
                                if (i16 == -8) {
                                    net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(i17, "Redundant pad character at index "));
                                } else if (i16 == -6) {
                                    i17++;
                                    i5 = i;
                                    i4 = -2;
                                } else if (i16 == -4) {
                                    int i26 = i17 + 1;
                                    if (z) {
                                        while (i26 < length2) {
                                            if (kotlin.io.encoding.d.a[bytes[i26] & 255] == -1) {
                                                i26++;
                                            }
                                        }
                                    }
                                    if (i26 == length2 || bytes[i26] != 61) {
                                        net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(i26, "Missing one pad character at index "));
                                    } else {
                                        i17 = i26 + 1;
                                        i5 = i;
                                        i4 = -2;
                                    }
                                } else if (i16 == -2) {
                                    i17++;
                                    i5 = i;
                                    i4 = -2;
                                } else {
                                    net.luminis.tls.engine.impl.c.r("Unreachable");
                                }
                                return null;
                            }
                            if (!z) {
                                char c = (char) i23;
                                com.google.android.material.shape.e.a(i15);
                                String string = Integer.toString(i23, i15);
                                string.getClass();
                                throw new IllegalArgumentException("Invalid symbol '" + c + "'(" + string + ") at index " + i17);
                            }
                            i17++;
                            i11 = -2;
                            i14 = -8;
                        }
                    } else {
                        i4 = i11;
                        i5 = 0;
                    }
                }
                if (i16 == i4) {
                    obj = null;
                    net.luminis.tls.engine.impl.c.o("The last unit of input does not have enough bits");
                } else {
                    if (i16 != -8 && i5 == 0) {
                        net.luminis.tls.engine.impl.c.o("The padding option is set to PRESENT, but the input is not properly padded");
                        return null;
                    }
                    if (i19 == 0) {
                        if (z) {
                            while (i17 < length2) {
                                if (kotlin.io.encoding.d.a[bytes[i17] & 255] == -1) {
                                    i17++;
                                }
                            }
                        }
                        if (i17 < length2) {
                            obj = null;
                            int i27 = bytes[i17] & 255;
                            StringBuilder sb = new StringBuilder("Symbol '");
                            sb.append((char) i27);
                            sb.append("'(");
                            com.google.android.material.shape.e.a(8);
                            String string2 = Integer.toString(i27, 8);
                            string2.getClass();
                            sb.append(string2);
                            sb.append(") at index ");
                            net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.m(i17 - 1, " is prohibited after the pad character", sb));
                        } else {
                            if (i18 == i9) {
                                okio.f fVar = new okio.f();
                                fVar.write(bArr, 0, i9);
                                return new k(new s(fVar, nVar.f, null), strSubstring, coil3.decode.h.y);
                            }
                            obj = null;
                            net.luminis.tls.engine.impl.c.r("Check failed.");
                        }
                    } else {
                        obj = null;
                        net.luminis.tls.engine.impl.c.o("The pad bits must be zeros");
                    }
                }
                return obj;
            case 2:
                String str3 = x.y;
                String strF = m.f(wVar);
                if (strF == null) {
                    net.luminis.tls.engine.impl.c.r("filePath == null");
                    return null;
                }
                x xVarI = f0.i(strF);
                coil3.decode.p pVarC = _COROUTINE.a.c(xVarI, nVar.f, null, null, 28);
                String strR1 = kotlin.text.k.r0('.', xVarI.d(), "");
                if (!kotlin.text.k.d0(strR1)) {
                    String lowerCase2 = strR1.toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    mimeTypeFromExtension3 = (String) coil3.util.i.a.get(lowerCase2);
                    if (mimeTypeFromExtension3 == null) {
                        mimeTypeFromExtension3 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase2);
                    }
                }
                return new k(pVarC, mimeTypeFromExtension3, hVar);
            case 3:
                String str4 = wVar.e;
                if (str4 == null) {
                    str4 = "";
                }
                int iA1 = kotlin.text.k.a0(str4, '!', 0, 6);
                if (iA1 == -1) {
                    net.luminis.tls.engine.impl.c.e(wVar, "Invalid jar:file URI: ");
                    return null;
                }
                String str5 = x.y;
                x xVarI2 = f0.i(str4.substring(0, iA1));
                x xVarI3 = f0.i(str4.substring(iA1 + 1, str4.length()));
                okio.k kVar = nVar.f;
                kVar.getClass();
                coil3.decode.p pVarC2 = _COROUTINE.a.c(xVarI3, okio.internal.b.e(xVarI2, kVar, new okio.internal.j(0)), null, null, 28);
                String strR2 = kotlin.text.k.r0('.', xVarI3.d(), "");
                if (!kotlin.text.k.d0(strR2)) {
                    String lowerCase3 = strR2.toLowerCase(Locale.ROOT);
                    lowerCase3.getClass();
                    mimeTypeFromExtension3 = (String) coil3.util.i.a.get(lowerCase3);
                    if (mimeTypeFromExtension3 == null) {
                        mimeTypeFromExtension3 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase3);
                    }
                }
                return new k(pVarC2, mimeTypeFromExtension3, hVar);
            default:
                String str6 = wVar.d;
                if (str6 != null) {
                    if (kotlin.text.k.d0(str6)) {
                        str6 = null;
                    }
                    if (str6 != null) {
                        String str7 = (String) o.T(m.g(wVar));
                        if (str7 == null || (numQ = r.Q(str7)) == null) {
                            com.google.gson.b.m(wVar, "Invalid android.resource URI: ");
                            return null;
                        }
                        int iIntValue = numQ.intValue();
                        Context context = nVar.a;
                        Resources resources = str6.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(str6);
                        TypedValue typedValue = new TypedValue();
                        resources.getValue(iIntValue, typedValue, true);
                        String string3 = typedValue.string.toString();
                        if (kotlin.text.k.d0(string3)) {
                            mimeTypeFromExtension2 = null;
                        } else {
                            String strW1 = kotlin.text.k.w0(kotlin.text.k.w0(string3, '#'), '?');
                            String strR3 = kotlin.text.k.r0('.', kotlin.text.k.r0('/', strW1, strW1), "");
                            if (kotlin.text.k.d0(strR3)) {
                                mimeTypeFromExtension2 = null;
                            } else {
                                String lowerCase4 = strR3.toLowerCase(Locale.ROOT);
                                lowerCase4.getClass();
                                mimeTypeFromExtension2 = (String) coil3.util.i.a.get(lowerCase4);
                                if (mimeTypeFromExtension2 == null) {
                                    mimeTypeFromExtension2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase4);
                                }
                            }
                        }
                        if (!l.a(mimeTypeFromExtension2, "text/xml")) {
                            return new k(new s(new b0(okio.b.e(resources.openRawResource(iIntValue, new TypedValue()))), nVar.f, new coil3.decode.r(str6, iIntValue)), mimeTypeFromExtension2, hVar);
                        }
                        if (str6.equals(context.getPackageName())) {
                            drawable = coil3.network.g.p(context, iIntValue);
                            if (drawable == null) {
                                net.luminis.tls.engine.impl.c.c(androidx.privacysandbox.ads.adservices.java.internal.a.l(iIntValue, "Invalid resource ID: "));
                                return null;
                            }
                        } else {
                            XmlResourceParser xml = resources.getXml(iIntValue);
                            int next = xml.next();
                            while (next != 2 && next != 1) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found.");
                            }
                            Resources.Theme theme = context.getTheme();
                            ThreadLocal threadLocal = androidx.core.content.res.j.a;
                            drawable = resources.getDrawable(iIntValue, theme);
                            if (drawable == null) {
                                net.luminis.tls.engine.impl.c.c(androidx.privacysandbox.ads.adservices.java.internal.a.l(iIntValue, "Invalid resource ID: "));
                                return null;
                            }
                        }
                        Bitmap.Config[] configArr = coil3.util.m.a;
                        boolean z2 = drawable instanceof VectorDrawable;
                        if (z2) {
                            drawable = new BitmapDrawable(context.getResources(), com.google.firebase.b.l(drawable, (Bitmap.Config) m.e(nVar, coil3.request.i.b), nVar.b, nVar.c, (coil3.size.h) m.e(nVar, coil3.request.h.b), nVar.d == coil3.size.d.y));
                        }
                        return new j(m.c(drawable), z2, hVar);
                    }
                }
                com.google.gson.b.m(wVar, "Invalid android.resource URI: ");
                return null;
        }
    }
}
