package androidx.constraintlayout.core;

import android.view.View;
import androidx.core.view.s0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.app.mlounge.data.iptv.n;
import com.app.mlounge.data.remote.model.ChqStream;
import com.app.mlounge.data.remote.model.SportsMatch;
import com.app.mlounge.data.remote.model.TmdbMultiResult;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import kotlin.k;
import org.schabi.newpipe.extractor.stream.j;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Comparator {
    public static final /* synthetic */ e y = new e(29);
    public final /* synthetic */ int e;

    public /* synthetic */ e(int i) {
        this.e = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((h) obj).y - ((h) obj2).y;
            case 1:
                Field field = s0.a;
                float z = ((View) obj).getZ();
                float z2 = ((View) obj2).getZ();
                if (z > z2) {
                    return -1;
                }
                return z < z2 ? 1 : 0;
            case 2:
                m mVar = (m) obj;
                m mVar2 = (m) obj2;
                RecyclerView recyclerView = mVar.d;
                if ((recyclerView == null) == (mVar2.d == null)) {
                    boolean z3 = mVar.a;
                    if (z3 == mVar2.a) {
                        int i = mVar2.b - mVar.b;
                        if (i != 0) {
                            return i;
                        }
                        int i2 = mVar.c - mVar2.c;
                        if (i2 != 0) {
                            return i2;
                        }
                        return 0;
                    }
                    if (!z3) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
            case 3:
                return com.google.android.material.resources.c.f((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 4:
                return com.google.android.material.resources.c.f((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 5:
                return com.google.android.material.resources.c.f(((androidx.room.util.f) obj).a, ((androidx.room.util.f) obj2).a);
            case 6:
                return com.google.android.material.resources.c.f(((androidx.room.util.h) obj).a, ((androidx.room.util.h) obj2).a);
            case 7:
                ((coil3.network.okhttp.internal.f) obj2).getClass();
                ((coil3.network.okhttp.internal.f) obj).getClass();
                return com.google.android.material.resources.c.f(2, 2);
            case 8:
                ((coil3.svg.internal.a) obj2).getClass();
                ((coil3.svg.internal.a) obj).getClass();
                return com.google.android.material.resources.c.f(0, 0);
            case 9:
                return com.google.android.material.resources.c.f(Long.valueOf(((n) obj).c()), Long.valueOf(((n) obj2).c()));
            case 10:
                return com.google.android.material.resources.c.f(Integer.valueOf(((j) obj2).D), Integer.valueOf(((j) obj).D));
            case 11:
                return com.google.android.material.resources.c.f(Integer.valueOf(((org.schabi.newpipe.extractor.stream.b) obj2).C), Integer.valueOf(((org.schabi.newpipe.extractor.stream.b) obj).C));
            case 12:
                Integer numI = ((ChqStream) obj2).i();
                Integer numValueOf = Integer.valueOf(numI != null ? numI.intValue() : 0);
                Integer numI2 = ((ChqStream) obj).i();
                return com.google.android.material.resources.c.f(numValueOf, Integer.valueOf(numI2 != null ? numI2.intValue() : 0));
            case 13:
                Integer numI3 = ((ChqStream) obj2).i();
                Integer numValueOf2 = Integer.valueOf(numI3 != null ? numI3.intValue() : 0);
                Integer numI4 = ((ChqStream) obj).i();
                return com.google.android.material.resources.c.f(numValueOf2, Integer.valueOf(numI4 != null ? numI4.intValue() : 0));
            case 14:
                Integer numI5 = ((ChqStream) obj2).i();
                Integer numValueOf3 = Integer.valueOf(numI5 != null ? numI5.intValue() : 0);
                Integer numI6 = ((ChqStream) obj).i();
                return com.google.android.material.resources.c.f(numValueOf3, Integer.valueOf(numI6 != null ? numI6.intValue() : 0));
            case 15:
                String str = (String) ((k) obj).y;
                Locale locale = Locale.ROOT;
                String lowerCase = str.toLowerCase(locale);
                lowerCase.getClass();
                String lowerCase2 = ((String) ((k) obj2).y).toLowerCase(locale);
                lowerCase2.getClass();
                return com.google.android.material.resources.c.f(lowerCase, lowerCase2);
            case 16:
                String name = ((File) obj).getName();
                name.getClass();
                Locale locale2 = Locale.ROOT;
                String lowerCase3 = name.toLowerCase(locale2);
                lowerCase3.getClass();
                String name2 = ((File) obj2).getName();
                name2.getClass();
                String lowerCase4 = name2.toLowerCase(locale2);
                lowerCase4.getClass();
                return com.google.android.material.resources.c.f(lowerCase3, lowerCase4);
            case 17:
                return com.google.android.material.resources.c.f((Integer) ((Map.Entry) obj2).getValue(), (Integer) ((Map.Entry) obj).getValue());
            case 18:
                Long lB = ((SportsMatch) obj).b();
                Long lValueOf = Long.valueOf(lB != null ? lB.longValue() : Long.MAX_VALUE);
                Long lB2 = ((SportsMatch) obj2).b();
                return com.google.android.material.resources.c.f(lValueOf, Long.valueOf(lB2 != null ? lB2.longValue() : Long.MAX_VALUE));
            case 19:
                Double dG = ((TmdbMultiResult) obj2).g();
                Double dValueOf = Double.valueOf(dG != null ? dG.doubleValue() : 0.0d);
                Double dG2 = ((TmdbMultiResult) obj).g();
                return com.google.android.material.resources.c.f(dValueOf, Double.valueOf(dG2 != null ? dG2.doubleValue() : 0.0d));
            case 20:
                Integer numI7 = ((ChqStream) obj2).i();
                Integer numValueOf4 = Integer.valueOf(numI7 != null ? numI7.intValue() : 0);
                Integer numI8 = ((ChqStream) obj).i();
                return com.google.android.material.resources.c.f(numValueOf4, Integer.valueOf(numI8 != null ? numI8.intValue() : 0));
            case 21:
                return com.google.android.material.resources.c.f(Long.valueOf(((com.app.mlounge.data.local.entity.f) obj).i), Long.valueOf(((com.app.mlounge.data.local.entity.f) obj2).i));
            case 22:
                String str2 = ((com.app.mlounge.data.local.entity.f) obj).c;
                Locale locale3 = Locale.ROOT;
                String lowerCase5 = str2.toLowerCase(locale3);
                lowerCase5.getClass();
                String lowerCase6 = ((com.app.mlounge.data.local.entity.f) obj2).c.toLowerCase(locale3);
                lowerCase6.getClass();
                return com.google.android.material.resources.c.f(lowerCase5, lowerCase6);
            case 23:
                Double d = ((com.app.mlounge.data.local.entity.f) obj).f;
                Double dValueOf2 = Double.valueOf(d != null ? d.doubleValue() : 0.0d);
                Double d2 = ((com.app.mlounge.data.local.entity.f) obj2).f;
                return com.google.android.material.resources.c.f(dValueOf2, Double.valueOf(d2 != null ? d2.doubleValue() : 0.0d));
            case 24:
                String str3 = ((com.app.mlounge.data.local.entity.f) obj).g;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = ((com.app.mlounge.data.local.entity.f) obj2).g;
                return com.google.android.material.resources.c.f(str3, str4 != null ? str4 : "");
            case 25:
                return com.google.android.material.resources.c.f(Long.valueOf(((com.app.mlounge.data.local.entity.f) obj2).i), Long.valueOf(((com.app.mlounge.data.local.entity.f) obj).i));
            case 26:
                String str5 = ((com.app.mlounge.data.local.entity.f) obj2).c;
                Locale locale4 = Locale.ROOT;
                String lowerCase7 = str5.toLowerCase(locale4);
                lowerCase7.getClass();
                String lowerCase8 = ((com.app.mlounge.data.local.entity.f) obj).c.toLowerCase(locale4);
                lowerCase8.getClass();
                return com.google.android.material.resources.c.f(lowerCase7, lowerCase8);
            case 27:
                Double d3 = ((com.app.mlounge.data.local.entity.f) obj2).f;
                Double dValueOf3 = Double.valueOf(d3 != null ? d3.doubleValue() : 0.0d);
                Double d4 = ((com.app.mlounge.data.local.entity.f) obj).f;
                return com.google.android.material.resources.c.f(dValueOf3, Double.valueOf(d4 != null ? d4.doubleValue() : 0.0d));
            case 28:
                String str6 = ((com.app.mlounge.data.local.entity.f) obj2).g;
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = ((com.app.mlounge.data.local.entity.f) obj).g;
                return com.google.android.material.resources.c.f(str6, str7 != null ? str7 : "");
            default:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
        }
    }
}
