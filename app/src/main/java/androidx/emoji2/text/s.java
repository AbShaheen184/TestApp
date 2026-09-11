package androidx.emoji2.text;

import com.google.android.gms.internal.measurement.e1;
import com.google.android.gms.internal.measurement.of;
import com.google.android.gms.internal.measurement.ug;
import com.google.android.gms.internal.measurement.vg;
import com.google.android.gms.internal.measurement.xg;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Formattable;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Locale;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public final Object e;
    public Object f;
    public Object g;

    public s(com.google.android.gms.internal.measurement.g gVar, Object[] objArr, StringBuilder sb) {
        this.a = 2;
        this.b = 0;
        this.c = -1;
        e1.c(gVar, "context");
        this.e = gVar;
        this.d = 0;
        this.f = objArr;
        this.g = sb;
    }

    public static void h(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(xg.a(obj));
        sb.append("]");
    }

    public void a() {
        this.b = 1;
        this.f = (v) this.e;
        this.d = 0;
    }

    public boolean b() {
        androidx.emoji2.text.flatbuffer.a aVarB = ((v) this.f).b.b();
        int iB = aVarB.b(6);
        return !(iB == 0 || ((ByteBuffer) aVarB.A).get(iB + aVarB.e) == 0) || this.c == 65039;
    }

    public void c() {
        if (this.c == 0) {
            return;
        }
        HashMap map = ((of) this.g).d;
        int[] iArr = (int[]) this.e;
        of ofVar = (of) map.get(Integer.valueOf(iArr[this.b]));
        while (true) {
            int i = (ofVar.b - ofVar.a) + 1;
            int i2 = this.c;
            if (i > i2) {
                return;
            }
            int i3 = this.b + i;
            this.b = i3;
            this.g = ofVar;
            int i4 = i2 - i;
            this.c = i4;
            if (i4 > 0) {
                ofVar = (of) ofVar.d.get(Integer.valueOf(iArr[i3]));
            }
        }
    }

    public void d() {
        of ofVar = ((of) this.g).c;
        if (ofVar != null) {
            this.g = ofVar;
        } else {
            this.g = (of) this.f;
            int i = this.c;
            if (i > 0) {
                this.c = i - 1;
            }
            if (this.d > 0) {
                this.b++;
            }
        }
        c();
    }

    /* JADX WARN: Code duplicated, block: B:106:0x012a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0130  */
    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Code duplicated, block: B:64:0x0092  */
    public void e(Object obj, ug ugVar, vg vgVar) {
        String simpleName;
        vg vgVar2;
        boolean zIsValidCodePoint;
        StringBuilder sb = (StringBuilder) this.g;
        int i = ugVar.y;
        String string = ugVar.A;
        int iE = androidx.constraintlayout.core.g.e(i);
        if (iE != 0) {
            if (iE == 1) {
                zIsValidCodePoint = obj instanceof Boolean;
            } else if (iE != 2) {
                if (iE != 3) {
                    if (iE != 4) {
                        throw null;
                    }
                    if ((obj instanceof Double) || (obj instanceof Float) || (obj instanceof BigDecimal)) {
                        zIsValidCodePoint = true;
                    } else {
                        zIsValidCodePoint = false;
                    }
                } else if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof BigInteger)) {
                    zIsValidCodePoint = true;
                } else {
                    zIsValidCodePoint = false;
                }
            } else if (obj instanceof Character) {
                zIsValidCodePoint = true;
            } else if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
                zIsValidCodePoint = Character.isValidCodePoint(((Number) obj).intValue());
            } else {
                zIsValidCodePoint = false;
            }
            if (!zIsValidCodePoint) {
                h(sb, obj, string);
                return;
            }
        }
        int iOrdinal = ugVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                if (vgVar.a()) {
                    sb.append(obj);
                    return;
                }
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal == 5) {
                        if (vgVar.a()) {
                            vgVar2 = vgVar;
                        } else {
                            int i2 = vgVar.a;
                            int i3 = i2 & 128;
                            if (i3 == 0) {
                                vgVar2 = vg.e;
                            } else if (i3 == i2 && vgVar.b == -1 && vgVar.c == -1) {
                                vgVar2 = vgVar;
                            } else {
                                vgVar2 = new vg(i3, -1, -1);
                            }
                        }
                        if (vgVar2.equals(vgVar)) {
                            Number number = (Number) obj;
                            Locale locale = xg.a;
                            boolean zC = vgVar.c();
                            long jLongValue = number.longValue();
                            if (number instanceof Long) {
                                xg.b(sb, jLongValue, zC);
                                return;
                            }
                            if (number instanceof Integer) {
                                xg.b(sb, jLongValue & 4294967295L, zC);
                                return;
                            }
                            if (number instanceof Byte) {
                                xg.b(sb, jLongValue & 255, zC);
                                return;
                            }
                            if (number instanceof Short) {
                                xg.b(sb, jLongValue & 65535, zC);
                                return;
                            }
                            if (!(number instanceof BigInteger)) {
                                net.luminis.tls.engine.impl.c.r("unsupported number type: ".concat(String.valueOf(number.getClass())));
                                return;
                            }
                            String string2 = ((BigInteger) number).toString(16);
                            if (zC) {
                                string2 = string2.toUpperCase(xg.a);
                            }
                            sb.append(string2);
                            return;
                        }
                    }
                } else if (vgVar.a()) {
                    sb.append(obj);
                    return;
                }
            } else if (vgVar.a()) {
                if (obj instanceof Character) {
                    sb.append(obj);
                    return;
                }
                int iIntValue = ((Number) obj).intValue();
                if ((iIntValue >>> 16) == 0) {
                    sb.append((char) iIntValue);
                    return;
                } else {
                    sb.append(Character.toChars(iIntValue));
                    return;
                }
            }
        } else {
            if (obj instanceof Formattable) {
                Formattable formattable = (Formattable) obj;
                Locale locale2 = xg.a;
                int i4 = vgVar.a;
                int i5 = i4 & Token.XMLEND;
                if (i5 != 0) {
                    i5 = ((i4 & 32) == 0 ? 0 : 1) | ((i4 & 128) != 0 ? 2 : 0) | ((i4 & 2) == 0 ? 0 : 4);
                }
                int length = sb.length();
                Formatter formatter = new Formatter(sb, xg.a);
                try {
                    formattable.formatTo(formatter, i5, vgVar.b, vgVar.c);
                    return;
                } catch (RuntimeException e) {
                    sb.setLength(length);
                    try {
                        Appendable appendableOut = formatter.out();
                        try {
                            simpleName = e.toString();
                        } catch (RuntimeException e2) {
                            simpleName = e2.getClass().getSimpleName();
                        }
                        appendableOut.append(xg.c(formattable, simpleName));
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            }
            if (vgVar.a()) {
                sb.append(xg.a(obj));
                return;
            }
        }
        if (!vgVar.a()) {
            int i6 = ugVar.e;
            if (vgVar.c()) {
                i6 &= 65503;
            }
            StringBuilder sb2 = new StringBuilder("%");
            vgVar.d(sb2);
            sb2.append((char) i6);
            string = sb2.toString();
        }
        sb.append(String.format(xg.a, string, obj));
    }

    public void f(of ofVar, StringBuilder sb) {
        for (of ofVar2 : ofVar.d.values()) {
            sb.append("  ");
            sb.append(ofVar);
            sb.append(" -> ");
            sb.append(ofVar2);
            sb.append(" [label=\"");
            int[] iArr = (int[]) this.e;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, ofVar2.a, Math.min(iArr.length, ofVar2.b + 1))));
            sb.append("\"]\n");
            f(ofVar2, sb);
        }
    }

    public boolean g(int i, int i2, int i3, int i4) {
        if (i < 0 || i3 < 0) {
            return false;
        }
        int[] iArr = (int[]) this.e;
        int length = iArr.length;
        int iMin = Math.min(length, i2);
        if (iMin - i != Math.min(length, i4) - i3) {
            return false;
        }
        for (int i5 = i; i5 <= iMin; i5++) {
            if (iArr[i5] != iArr[(i3 + i5) - i]) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("digraph {\n");
                f((of) this.f, sb);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public s(int[] iArr) {
        this.a = 1;
        this.e = iArr;
        of ofVar = new of(-1, -1);
        this.f = ofVar;
        this.g = ofVar;
    }

    public s(v vVar) {
        this.a = 0;
        this.b = 1;
        this.e = vVar;
        this.f = vVar;
    }
}
