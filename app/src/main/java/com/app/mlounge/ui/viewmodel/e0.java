package com.app.mlounge.ui.viewmodel;

import com.app.mlounge.data.remote.api.TmdbMovieDetailResponse;
import com.app.mlounge.data.remote.model.MusicStreamResult;
import com.app.mlounge.data.remote.model.TmdbGenre;
import com.app.mlounge.data.remote.model.TmdbVideo;
import com.app.mlounge.data.remote.model.TmdbVideosResponse;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends androidx.lifecycle.q0 {
    public final Flow A;
    public final MutableStateFlow B;
    public final StateFlow C;
    public final MutableStateFlow D;
    public final StateFlow E;
    public final MutableStateFlow F;
    public final StateFlow G;
    public final MutableStateFlow H;
    public final StateFlow I;
    public final MutableStateFlow J;
    public final StateFlow K;
    public int L;
    public int M;
    public final com.app.mlounge.data.repository.j0 b;
    public final com.app.mlounge.data.repository.x c;
    public final com.app.mlounge.data.music.h d;
    public final StateFlow e;
    public final StateFlow f;
    public final MutableStateFlow g;
    public final StateFlow h;
    public final MutableStateFlow i;
    public final StateFlow j;
    public final MutableStateFlow k;
    public final StateFlow l;
    public final MutableStateFlow m;
    public final StateFlow n;
    public final MutableStateFlow o;
    public final StateFlow p;
    public final MutableStateFlow q;
    public final StateFlow r;
    public final MutableStateFlow s;
    public final StateFlow t;
    public final MutableStateFlow u;
    public final StateFlow v;
    public final MutableStateFlow w;
    public final StateFlow x;
    public final StateFlow y;
    public final Flow z;

    public e0(com.app.mlounge.data.repository.j0 j0Var, com.app.mlounge.data.repository.r rVar, com.app.mlounge.data.repository.x xVar, com.app.mlounge.data.local.prefs.y1 y1Var, com.app.mlounge.data.music.h hVar, com.app.mlounge.data.repository.m0 m0Var, com.app.mlounge.data.repository.q0 q0Var) {
        j0Var.getClass();
        rVar.getClass();
        xVar.getClass();
        y1Var.getClass();
        hVar.getClass();
        m0Var.getClass();
        q0Var.getClass();
        this.b = j0Var;
        this.c = xVar;
        this.d = hVar;
        com.app.mlounge.data.repository.l0 l0Var = m0Var.a;
        androidx.lifecycle.viewmodel.internal.a aVarG = androidx.lifecycle.l0.g(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        this.e = FlowKt.stateIn(l0Var, aVarG, SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), kotlin.collections.v.e);
        this.f = FlowKt.stateIn(q0Var.a, androidx.lifecycle.l0.g(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), kotlin.collections.w.e);
        kotlin.collections.u uVar = kotlin.collections.u.e;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(uVar);
        this.g = MutableStateFlow;
        this.h = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(uVar);
        this.i = MutableStateFlow2;
        this.j = FlowKt.asStateFlow(MutableStateFlow2);
        Boolean bool = Boolean.FALSE;
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(bool);
        this.k = MutableStateFlow3;
        this.l = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow MutableStateFlow4 = StateFlowKt.MutableStateFlow(bool);
        this.m = MutableStateFlow4;
        this.n = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this.o = MutableStateFlow5;
        this.p = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow MutableStateFlow6 = StateFlowKt.MutableStateFlow(null);
        this.q = MutableStateFlow6;
        this.r = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow MutableStateFlow7 = StateFlowKt.MutableStateFlow("popularity.desc");
        this.s = MutableStateFlow7;
        this.t = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow MutableStateFlow8 = StateFlowKt.MutableStateFlow(null);
        this.u = MutableStateFlow8;
        this.v = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow MutableStateFlow9 = StateFlowKt.MutableStateFlow(bool);
        this.w = MutableStateFlow9;
        this.x = FlowKt.asStateFlow(MutableStateFlow9);
        this.y = FlowKt.stateIn(FlowKt.combine(y1Var.c, y1Var.e, new e(3, 1, null)), androidx.lifecycle.l0.g(this), companion.getEagerly(), bool);
        this.z = y1Var.T;
        this.A = FlowKt.distinctUntilChanged(new com.app.mlounge.data.local.prefs.x1(y1Var.p, 2));
        MutableStateFlow MutableStateFlow10 = StateFlowKt.MutableStateFlow(null);
        this.B = MutableStateFlow10;
        this.C = FlowKt.asStateFlow(MutableStateFlow10);
        MutableStateFlow MutableStateFlow11 = StateFlowKt.MutableStateFlow(bool);
        this.D = MutableStateFlow11;
        this.E = FlowKt.asStateFlow(MutableStateFlow11);
        MutableStateFlow MutableStateFlow12 = StateFlowKt.MutableStateFlow(bool);
        this.F = MutableStateFlow12;
        this.G = FlowKt.asStateFlow(MutableStateFlow12);
        MutableStateFlow MutableStateFlow13 = StateFlowKt.MutableStateFlow(uVar);
        this.H = MutableStateFlow13;
        this.I = FlowKt.asStateFlow(MutableStateFlow13);
        MutableStateFlow MutableStateFlow14 = StateFlowKt.MutableStateFlow(bool);
        this.J = MutableStateFlow14;
        this.K = FlowKt.asStateFlow(MutableStateFlow14);
        this.L = 1;
        this.M = 1;
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(this), null, null, new com.app.mlounge.ui.screens.movies.h(this, (kotlin.coroutines.d) null, 1), 3, null);
        g();
    }

    public static final boolean e(e0 e0Var) {
        return ((Boolean) e0Var.w.getValue()).booleanValue() && ((Boolean) e0Var.y.getValue()).booleanValue();
    }

    public static final kotlin.k f(e0 e0Var) {
        TmdbGenre tmdbGenre = (TmdbGenre) e0Var.q.getValue();
        if (tmdbGenre == null || tmdbGenre.a() != -1) {
            return new kotlin.k(null, null);
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        Calendar calendar = Calendar.getInstance();
        String str = simpleDateFormat.format(calendar.getTime());
        calendar.add(6, 21);
        return new kotlin.k(str, simpleDateFormat.format(calendar.getTime()));
    }

    public final void g() {
        if (((Boolean) this.k.getValue()).booleanValue()) {
            return;
        }
        this.L = 1;
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.l0.g(this), null, null, new com.app.mlounge.ui.screens.movies.h(this, (kotlin.coroutines.d) null, 3), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:83:0x00c7 A[SYNTHETIC] */
    public final Object h(TmdbMovieDetailResponse tmdbMovieDetailResponse, kotlin.coroutines.jvm.internal.c cVar) {
        c0 c0Var;
        TmdbVideosResponse tmdbVideosResponseL;
        List listA;
        Iterator it;
        Object next;
        TmdbVideo tmdbVideo;
        String strA;
        String strB;
        String lowerCase;
        List listA2;
        Object next2;
        String lowerCase2;
        String lowerCase3;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i = c0Var.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0Var.z = i - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(this, cVar);
            }
        } else {
            c0Var = new c0(this, cVar);
        }
        Object objA = c0Var.e;
        int i2 = c0Var.z;
        MutableStateFlow mutableStateFlow = this.F;
        String strB2 = null;
        try {
            if (i2 == 0) {
                kotlin.a.e(objA);
                TmdbVideosResponse tmdbVideosResponseL2 = tmdbMovieDetailResponse.l();
                if (tmdbVideosResponseL2 == null || (listA2 = tmdbVideosResponseL2.a()) == null) {
                    tmdbVideosResponseL = tmdbMovieDetailResponse.l();
                    if (tmdbVideosResponseL != null && (listA = tmdbVideosResponseL.a()) != null) {
                        it = listA.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            strB = ((TmdbVideo) next).b();
                            if (strB != null) {
                                lowerCase = strB.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                            } else {
                                lowerCase = null;
                            }
                        } while (!kotlin.jvm.internal.l.a(lowerCase, "youtube"));
                        tmdbVideo = (TmdbVideo) next;
                        if (tmdbVideo != null) {
                            strA = tmdbVideo.a();
                        }
                    }
                    return null;
                }
                Iterator it2 = listA2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    TmdbVideo tmdbVideo2 = (TmdbVideo) next2;
                    String strB3 = tmdbVideo2.b();
                    if (strB3 != null) {
                        lowerCase2 = strB3.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                    } else {
                        lowerCase2 = null;
                    }
                    if (kotlin.jvm.internal.l.a(lowerCase2, "youtube")) {
                        String strC = tmdbVideo2.c();
                        if (strC != null) {
                            lowerCase3 = strC.toLowerCase(Locale.ROOT);
                            lowerCase3.getClass();
                        } else {
                            lowerCase3 = null;
                        }
                        if (kotlin.jvm.internal.l.a(lowerCase3, "trailer")) {
                            break;
                        }
                    }
                }
                TmdbVideo tmdbVideo3 = (TmdbVideo) next2;
                if (tmdbVideo3 == null || (strA = tmdbVideo3.a()) == null) {
                    tmdbVideosResponseL = tmdbMovieDetailResponse.l();
                    if (tmdbVideosResponseL != null) {
                        it = listA.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            strB = ((TmdbVideo) next).b();
                            if (strB != null) {
                                lowerCase = strB.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                            } else {
                                lowerCase = null;
                            }
                        } while (!kotlin.jvm.internal.l.a(lowerCase, "youtube"));
                        tmdbVideo = (TmdbVideo) next;
                        if (tmdbVideo != null) {
                            strA = tmdbVideo.a();
                        }
                    }
                    return null;
                }
                mutableStateFlow.setValue(Boolean.TRUE);
                c0Var.z = 1;
                objA = this.d.a("https://www.youtube.com/watch?v=" + strA, "", c0Var);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(objA);
            }
            MusicStreamResult musicStreamResult = (MusicStreamResult) objA;
            if (musicStreamResult != null) {
                strB2 = musicStreamResult.b();
            }
        } catch (Exception unused) {
        } finally {
            mutableStateFlow.setValue(Boolean.FALSE);
        }
        return strB2;
    }
}
