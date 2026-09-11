package com.app.mlounge.ui.screens.player;

import com.app.mlounge.emulator.LibretroCore;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {
    public final boolean A;
    public final boolean B;
    public final String C;
    public final String D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final int H;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final long i;
    public final long j;
    public final long k;
    public final List l;
    public final List m;
    public final b1 n;
    public final boolean o;
    public final float p;
    public final int q;
    public final int r;
    public final long s;
    public final String t;
    public final boolean u;
    public final boolean v;
    public final String w;
    public final String x;
    public final String y;
    public final boolean z;

    public o0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, long j, long j2, long j3, List list, List list2, b1 b1Var, boolean z9, float f, int i, int i2, long j4, String str, boolean z10, boolean z11, String str2, String str3, String str4, boolean z12, boolean z13, boolean z14, String str5, String str6, boolean z15, boolean z16, boolean z17, int i3) {
        list.getClass();
        list2.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = j;
        this.j = j2;
        this.k = j3;
        this.l = list;
        this.m = list2;
        this.n = b1Var;
        this.o = z9;
        this.p = f;
        this.q = i;
        this.r = i2;
        this.s = j4;
        this.t = str;
        this.u = z10;
        this.v = z11;
        this.w = str2;
        this.x = str3;
        this.y = str4;
        this.z = z12;
        this.A = z13;
        this.B = z14;
        this.C = str5;
        this.D = str6;
        this.E = z15;
        this.F = z16;
        this.G = z17;
        this.H = i3;
    }

    public static o0 a(o0 o0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, long j, long j2, long j3, ArrayList arrayList, ArrayList arrayList2, b1 b1Var, boolean z9, float f, int i, int i2, long j4, String str, boolean z10, boolean z11, String str2, String str3, String str4, boolean z12, boolean z13, String str5, String str6, boolean z14, boolean z15, boolean z16, int i3, int i4, int i5) {
        boolean z17 = (i4 & 1) != 0 ? o0Var.a : z;
        boolean z18 = (i4 & 2) != 0 ? o0Var.b : z2;
        boolean z19 = (i4 & 4) != 0 ? o0Var.c : z3;
        boolean z20 = (i4 & 8) != 0 ? o0Var.d : z4;
        boolean z21 = (i4 & 16) != 0 ? o0Var.e : z5;
        boolean z22 = (i4 & 32) != 0 ? o0Var.f : z6;
        boolean z23 = (i4 & 64) != 0 ? o0Var.g : z7;
        boolean z24 = (i4 & 128) != 0 ? o0Var.h : z8;
        long j5 = (i4 & LibretroCore.SCREEN_WIDTH) != 0 ? o0Var.i : j;
        long j6 = (i4 & 512) != 0 ? o0Var.j : j2;
        long j7 = (i4 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? o0Var.k : j3;
        boolean z25 = z17;
        List list = (i4 & 2048) != 0 ? o0Var.l : arrayList;
        List list2 = (i4 & 4096) != 0 ? o0Var.m : arrayList2;
        b1 b1Var2 = (i4 & 8192) != 0 ? o0Var.n : b1Var;
        boolean z26 = (i4 & 16384) != 0 ? o0Var.o : z9;
        float f2 = (i4 & 32768) != 0 ? o0Var.p : f;
        int i6 = (i4 & Parser.ARGC_LIMIT) != 0 ? o0Var.q : i;
        int i7 = (i4 & 131072) != 0 ? o0Var.r : i2;
        boolean z27 = z26;
        long j8 = (i4 & 262144) != 0 ? o0Var.s : j4;
        String str7 = (i4 & 524288) != 0 ? o0Var.t : str;
        boolean z28 = (i4 & 1048576) != 0 ? o0Var.u : z10;
        String str8 = str7;
        boolean z29 = (i4 & 2097152) != 0 ? o0Var.v : z11;
        String str9 = (i4 & 4194304) != 0 ? o0Var.w : str2;
        String str10 = (i4 & 8388608) != 0 ? o0Var.x : str3;
        String str11 = (i4 & 16777216) != 0 ? o0Var.y : str4;
        boolean z30 = (i4 & 33554432) != 0 ? o0Var.z : false;
        boolean z31 = (i4 & 67108864) != 0 ? o0Var.A : z12;
        boolean z32 = (i4 & 134217728) != 0 ? o0Var.B : z13;
        String str12 = (i4 & 268435456) != 0 ? o0Var.C : str5;
        String str13 = (i4 & 536870912) != 0 ? o0Var.D : str6;
        boolean z33 = (i4 & 1073741824) != 0 ? o0Var.E : z14;
        boolean z34 = (i4 & Integer.MIN_VALUE) != 0 ? o0Var.F : z15;
        boolean z35 = (i5 & 1) != 0 ? o0Var.G : z16;
        int i8 = (i5 & 2) != 0 ? o0Var.H : i3;
        o0Var.getClass();
        list.getClass();
        list2.getClass();
        return new o0(z25, z18, z19, z20, z21, z22, z23, z24, j5, j6, j7, list, list2, b1Var2, z27, f2, i6, i7, j8, str8, z28, z29, str9, str10, str11, z30, z31, z32, str12, str13, z33, z34, z35, i8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.a == o0Var.a && this.b == o0Var.b && this.c == o0Var.c && this.d == o0Var.d && this.e == o0Var.e && this.f == o0Var.f && this.g == o0Var.g && this.h == o0Var.h && this.i == o0Var.i && this.j == o0Var.j && this.k == o0Var.k && kotlin.jvm.internal.l.a(this.l, o0Var.l) && kotlin.jvm.internal.l.a(this.m, o0Var.m) && kotlin.jvm.internal.l.a(this.n, o0Var.n) && this.o == o0Var.o && Float.compare(this.p, o0Var.p) == 0 && this.q == o0Var.q && this.r == o0Var.r && this.s == o0Var.s && kotlin.jvm.internal.l.a(this.t, o0Var.t) && this.u == o0Var.u && this.v == o0Var.v && kotlin.jvm.internal.l.a(this.w, o0Var.w) && kotlin.jvm.internal.l.a(this.x, o0Var.x) && kotlin.jvm.internal.l.a(this.y, o0Var.y) && this.z == o0Var.z && this.A == o0Var.A && this.B == o0Var.B && kotlin.jvm.internal.l.a(this.C, o0Var.C) && kotlin.jvm.internal.l.a(this.D, o0Var.D) && this.E == o0Var.E && this.F == o0Var.F && this.G == o0Var.G && this.H == o0Var.H;
    }

    public final int hashCode() {
        int iHashCode = (this.m.hashCode() + ((this.l.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.c(androidx.privacysandbox.ads.adservices.java.internal.a.c(androidx.privacysandbox.ads.adservices.java.internal.a.c(androidx.privacysandbox.ads.adservices.java.internal.a.f(androidx.privacysandbox.ads.adservices.java.internal.a.f(androidx.privacysandbox.ads.adservices.java.internal.a.f(androidx.privacysandbox.ads.adservices.java.internal.a.f(androidx.privacysandbox.ads.adservices.java.internal.a.f(androidx.privacysandbox.ads.adservices.java.internal.a.f(androidx.privacysandbox.ads.adservices.java.internal.a.f(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k)) * 31)) * 31;
        b1 b1Var = this.n;
        int iC = androidx.privacysandbox.ads.adservices.java.internal.a.c(androidx.privacysandbox.ads.adservices.java.internal.a.b(this.r, androidx.privacysandbox.ads.adservices.java.internal.a.b(this.q, androidx.privacysandbox.ads.adservices.java.internal.a.a(this.p, androidx.privacysandbox.ads.adservices.java.internal.a.f((iHashCode + (b1Var == null ? 0 : b1Var.hashCode())) * 31, 31, this.o), 31), 31), 31), 31, this.s);
        String str = this.t;
        int iF = androidx.privacysandbox.ads.adservices.java.internal.a.f(androidx.privacysandbox.ads.adservices.java.internal.a.f((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.u), 31, this.v);
        String str2 = this.w;
        int iHashCode2 = (iF + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.x;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.y;
        int iF2 = androidx.privacysandbox.ads.adservices.java.internal.a.f(androidx.privacysandbox.ads.adservices.java.internal.a.f(androidx.privacysandbox.ads.adservices.java.internal.a.f((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.z), 31, this.A), 31, this.B);
        String str5 = this.C;
        int iHashCode4 = (iF2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.D;
        return Integer.hashCode(this.H) + androidx.privacysandbox.ads.adservices.java.internal.a.f(androidx.privacysandbox.ads.adservices.java.internal.a.f(androidx.privacysandbox.ads.adservices.java.internal.a.f((iHashCode4 + (str6 != null ? str6.hashCode() : 0)) * 31, 31, this.E), 31, this.F), 31, this.G);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerUiState(isPlaying=");
        sb.append(this.a);
        sb.append(", isBuffering=");
        sb.append(this.b);
        sb.append(", showControls=");
        sb.append(this.c);
        sb.append(", showResumeDialog=");
        sb.append(this.d);
        sb.append(", showAudioTrackPicker=");
        sb.append(this.e);
        sb.append(", showSubtitlePicker=");
        sb.append(this.f);
        sb.append(", showSettingsDialog=");
        sb.append(this.g);
        sb.append(", showNextEpisode=");
        sb.append(this.h);
        sb.append(", currentPosition=");
        sb.append(this.i);
        sb.append(", totalDuration=");
        sb.append(this.j);
        sb.append(", resumePositionMs=");
        sb.append(this.k);
        sb.append(", audioTracks=");
        sb.append(this.l);
        sb.append(", subtitles=");
        sb.append(this.m);
        sb.append(", activeSubtitle=");
        sb.append(this.n);
        sb.append(", subtitlesLoading=");
        sb.append(this.o);
        sb.append(", subtitleSizeSp=");
        sb.append(this.p);
        sb.append(", subtitleColor=");
        sb.append(this.q);
        sb.append(", subtitleBgColor=");
        sb.append(this.r);
        sb.append(", subtitleOffsetMs=");
        sb.append(this.s);
        sb.append(", subtitleContentCache=");
        sb.append(this.t);
        sb.append(", playbackStarted=");
        sb.append(this.u);
        sb.append(", isHlsStream=");
        sb.append(this.v);
        sb.append(", videoMimeType=");
        sb.append(this.w);
        sb.append(", errorMessage=");
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.y(sb, this.x, ", seekWarning=", this.y, ", isSeekable=");
        sb.append(this.z);
        sb.append(", showSeekRecovery=");
        sb.append(this.A);
        sb.append(", isAutoPlayingNext=");
        sb.append(this.B);
        sb.append(", autoPlayStatus=");
        sb.append(this.C);
        sb.append(", activeTitle=");
        sb.append(this.D);
        sb.append(", autoPlayEnabled=");
        sb.append(this.E);
        sb.append(", oneClickPlayEnabled=");
        sb.append(this.F);
        sb.append(", isAudioOnly=");
        sb.append(this.G);
        sb.append(", audioSessionId=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.m(this.H, ")", sb);
    }
}
