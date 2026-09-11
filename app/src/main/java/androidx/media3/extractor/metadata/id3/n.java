package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.e0;
import androidx.media3.common.util.j0;
import com.google.common.collect.a1;
import com.google.common.collect.h0;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.collections.a0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends i {
    public final String b;
    public final h0 c;

    public n(String str, String str2, a1 a1Var) {
        super(str);
        com.google.android.material.motion.a.f(!a1Var.isEmpty());
        this.b = str2;
        h0 h0VarO = h0.o(a1Var);
        this.c = h0VarO;
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    @Override // androidx.media3.common.g0
    public final void b(e0 e0Var) {
        byte b;
        switch (this.a) {
            case "TAL":
                b = 0;
                break;
            case "TCM":
                b = 1;
                break;
            case "TDA":
                b = 2;
                break;
            case "TP1":
                b = 3;
                break;
            case "TP2":
                b = 4;
                break;
            case "TP3":
                b = 5;
                break;
            case "TRK":
                b = 6;
                break;
            case "TT2":
                b = 7;
                break;
            case "TXT":
                b = 8;
                break;
            case "TYE":
                b = 9;
                break;
            case "TALB":
                b = 10;
                break;
            case "TCOM":
                b = 11;
                break;
            case "TCON":
                b = 12;
                break;
            case "TDAT":
                b = 13;
                break;
            case "TDRC":
                b = 14;
                break;
            case "TDRL":
                b = 15;
                break;
            case "TEXT":
                b = 16;
                break;
            case "TIT2":
                b = 17;
                break;
            case "TPE1":
                b = 18;
                break;
            case "TPE2":
                b = 19;
                break;
            case "TPE3":
                b = 20;
                break;
            case "TRCK":
                b = 21;
                break;
            case "TYER":
                b = 22;
                break;
            default:
                b = -1;
                break;
        }
        h0 h0Var = this.c;
        try {
            switch (b) {
                case 0:
                case 10:
                    e0Var.c = (CharSequence) h0Var.get(0);
                    break;
                case 1:
                case 11:
                    e0Var.s = (CharSequence) h0Var.get(0);
                    break;
                case 2:
                case 13:
                    String str = (String) h0Var.get(0);
                    int i = Integer.parseInt(str.substring(2, 4));
                    int i2 = Integer.parseInt(str.substring(0, 2));
                    e0Var.m = Integer.valueOf(i);
                    e0Var.n = Integer.valueOf(i2);
                    break;
                case 3:
                case 18:
                    e0Var.b = (CharSequence) h0Var.get(0);
                    break;
                case 4:
                case 19:
                    e0Var.d = (CharSequence) h0Var.get(0);
                    break;
                case 5:
                case 20:
                    e0Var.t = (CharSequence) h0Var.get(0);
                    break;
                case 6:
                case 21:
                    String str2 = (String) h0Var.get(0);
                    String str3 = j0.a;
                    String[] strArrSplit = str2.split("/", -1);
                    int i3 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    e0Var.h = Integer.valueOf(i3);
                    e0Var.i = numValueOf;
                    break;
                case 7:
                case 17:
                    e0Var.a = (CharSequence) h0Var.get(0);
                    break;
                case 8:
                case 16:
                    e0Var.r = (CharSequence) h0Var.get(0);
                    break;
                case 9:
                case 22:
                    e0Var.l = Integer.valueOf(Integer.parseInt((String) h0Var.get(0)));
                    break;
                case 12:
                    Integer numJ = a0.J((String) h0Var.get(0));
                    if (numJ != null) {
                        String strA = j.a(numJ.intValue());
                        if (strA != null) {
                            e0Var.w = strA;
                        }
                    } else {
                        e0Var.w = (CharSequence) h0Var.get(0);
                    }
                    break;
                case 14:
                    ArrayList arrayListD = d((String) h0Var.get(0));
                    int size = arrayListD.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                e0Var.n = (Integer) arrayListD.get(2);
                            }
                        }
                        e0Var.m = (Integer) arrayListD.get(1);
                    }
                    e0Var.l = (Integer) arrayListD.get(0);
                    break;
                case 15:
                    ArrayList arrayListD2 = d((String) h0Var.get(0));
                    int size2 = arrayListD2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                e0Var.q = (Integer) arrayListD2.get(2);
                            }
                        }
                        e0Var.p = (Integer) arrayListD2.get(1);
                    }
                    e0Var.o = (Integer) arrayListD2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.a.equals(nVar.a) && Objects.equals(this.b, nVar.b) && this.c.equals(nVar.c);
    }

    public final int hashCode() {
        int iE = androidx.privacysandbox.ads.adservices.java.internal.a.e(527, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((iE + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // androidx.media3.extractor.metadata.id3.i
    public final String toString() {
        return this.a + ": description=" + this.b + ": values=" + this.c;
    }
}
