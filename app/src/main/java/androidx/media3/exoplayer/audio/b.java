package androidx.media3.exoplayer.audio;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import com.google.common.collect.a1;
import com.google.common.collect.f1;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final a1 e;
    public static final b f;
    public static final a1 g;
    public static final f1 h;
    public final SparseArray a = new SparseArray();
    public final int b;
    public final com.google.common.collect.h0 c;
    public final com.google.common.collect.h0 d;

    static {
        a1 a1VarS = com.google.common.collect.h0.s(12);
        e = a1VarS;
        f = new b(com.google.common.collect.h0.s(a.d), a1VarS, a1.B);
        Object[] objArr = {2, 5, 6};
        com.google.common.collect.q.e(3, objArr);
        g = com.google.common.collect.h0.j(3, objArr);
        androidx.appcompat.widget.x xVar = new androidx.appcompat.widget.x(4);
        xVar.q(5, 6);
        xVar.q(17, 6);
        xVar.q(7, 6);
        xVar.q(30, 10);
        xVar.q(18, 6);
        xVar.q(6, 8);
        xVar.q(8, 8);
        xVar.q(14, 8);
        h = xVar.e(true);
    }

    public b(a1 a1Var, List list, List list2) {
        for (int i = 0; i < a1Var.A; i++) {
            a aVar = (a) a1Var.get(i);
            this.a.put(aVar.a, aVar);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            iMax = Math.max(iMax, ((a) this.a.valueAt(i2)).b);
        }
        this.b = iMax;
        this.c = com.google.common.collect.h0.o(list);
        this.d = com.google.common.collect.h0.o(list2);
    }

    public static a1 a(int i, int[] iArr) {
        com.google.common.collect.d0 d0VarK = com.google.common.collect.h0.k();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            d0VarK.b(new a(i2, i));
        }
        return d0VarK.g();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d1  */
    public static b b(Context context, Intent intent, androidx.media3.common.e eVar, AudioDeviceInfo audioDeviceInfo, List list) {
        AudioManager audioManagerL = androidx.media3.common.audio.h.l(context);
        if (audioDeviceInfo == null) {
            audioDeviceInfo = Build.VERSION.SDK_INT >= 33 ? androidx.compose.ui.text.android.d.b(audioManagerL, eVar) : null;
        }
        com.google.common.collect.h0 h0VarB = audioDeviceInfo != null ? t0.b(audioDeviceInfo) : e;
        if (Build.VERSION.SDK_INT >= 33 && (androidx.media3.common.util.j0.P(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            return androidx.compose.ui.text.android.d.a(audioManagerL, eVar, h0VarB, list);
        }
        for (AudioDeviceInfo audioDeviceInfo2 : audioDeviceInfo == null ? audioManagerL.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo}) {
            if (_COROUTINE.a.C(audioDeviceInfo2.getType())) {
                return new b(com.google.common.collect.h0.s(a.d), h0VarB, list);
            }
        }
        com.google.common.collect.j0 j0Var = new com.google.common.collect.j0(4);
        j0Var.b(2);
        if (Build.VERSION.SDK_INT >= 29 && (androidx.media3.common.util.j0.P(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            a1 a1VarO = androidx.compose.ui.platform.coreshims.b.o(eVar);
            a1VarO.getClass();
            j0Var.c(a1VarO);
            return new b(a(10, kotlin.collections.a0.F(j0Var.g())), h0VarB, list);
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z) {
            String str = Build.MANUFACTURER;
            if (str.equals("Amazon") || str.equals("Xiaomi")) {
                if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                    a1 a1Var = g;
                    a1Var.getClass();
                    j0Var.c(a1Var);
                }
            }
        } else if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            a1 a1Var2 = g;
            a1Var2.getClass();
            j0Var.c(a1Var2);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new b(a(10, kotlin.collections.a0.F(j0Var.g())), h0VarB, list);
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            List listB = kotlin.collections.a0.b(intArrayExtra);
            listB.getClass();
            j0Var.c(listB);
        }
        return new b(a(intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10), kotlin.collections.a0.F(j0Var.g())), h0VarB, list);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00cd  */
    public final Pair c(androidx.media3.common.e eVar, androidx.media3.common.r rVar) {
        String str = rVar.o;
        str.getClass();
        int iD = androidx.media3.common.i0.d(str, rVar.k);
        Integer numValueOf = Integer.valueOf(iD);
        f1 f1Var = h;
        if (!f1Var.containsKey(numValueOf)) {
            return null;
        }
        int i = 6;
        SparseArray sparseArray = this.a;
        if (iD == 18 && !androidx.media3.common.util.j0.l(sparseArray, 18)) {
            iD = 6;
        } else if ((iD == 8 && !androidx.media3.common.util.j0.l(sparseArray, 8)) || (iD == 30 && !androidx.media3.common.util.j0.l(sparseArray, 30))) {
            iD = 7;
        }
        if (!androidx.media3.common.util.j0.l(sparseArray, iD)) {
            return null;
        }
        a aVar = (a) sparseArray.get(iD);
        aVar.getClass();
        int iIntValue = aVar.b;
        com.google.common.collect.k0 k0Var = aVar.c;
        int i2 = rVar.G;
        boolean zContains = false;
        if (i2 == -1 || iD == 18) {
            int i3 = rVar.H;
            if (i3 == -1) {
                i3 = 48000;
            }
            int i4 = aVar.a;
            if (k0Var == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    iIntValue = androidx.compose.ui.platform.coreshims.b.p(i4, i3, eVar);
                } else {
                    Object obj = f1Var.get(Integer.valueOf(i4));
                    iIntValue = ((Integer) (obj != null ? obj : 0)).intValue();
                }
            }
            i2 = iIntValue;
        } else if (!rVar.o.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (k0Var != null) {
                int iT = androidx.media3.common.util.j0.t(i2);
                if (iT != 0) {
                    zContains = k0Var.contains(Integer.valueOf(iT));
                }
            } else if (i2 <= iIntValue) {
                zContains = true;
            }
            if (!zContains) {
                return null;
            }
        } else if (i2 > 10) {
            return null;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 > 28) {
            i = i2;
        } else if (i2 == 7) {
            i = 8;
        } else if (i2 != 3 && i2 != 4 && i2 != 5) {
            i = i2;
        }
        if (i5 <= 26 && "fugu".equals(Build.DEVICE) && i == 1) {
            i = 2;
        }
        int iT2 = androidx.media3.common.util.j0.t(i);
        if (iT2 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iD), Integer.valueOf(iT2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return androidx.media3.common.util.j0.n(this.a, bVar.a) && this.b == bVar.b && Objects.equals(this.c, bVar.c) && Objects.equals(this.d, bVar.d);
    }

    public final int hashCode() {
        return Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((androidx.media3.common.util.j0.o(this.a) + (this.b * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + ", speakerLayoutChannelMasks=" + this.c + ", spatializerChannelMasks=" + this.d + "]";
    }
}
