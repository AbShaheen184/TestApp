package com.app.mlounge.ui.screens.movies;

import androidx.lifecycle.l0;
import com.app.mlounge.data.remote.model.TmdbGenre;
import com.app.mlounge.data.remote.model.TmdbMovie;
import com.app.mlounge.data.remote.model.TmdbPagedResponse;
import com.app.mlounge.data.repository.j0;
import com.app.mlounge.ui.screens.player.s0;
import com.app.mlounge.ui.viewmodel.e0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.o;
import kotlin.jvm.functions.p;
import kotlin.sequences.n;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends kotlin.coroutines.jvm.internal.i implements p {
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ e0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e0 e0Var, int i, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = 0;
        this.z = e0Var;
        this.y = i;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new h(this.z, this.y, dVar);
            case 1:
                return new h(this.z, dVar, 1);
            case 2:
                return new h(this.z, dVar, 2);
            default:
                return new h(this.z, dVar, 3);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                h hVar = (h) create(coroutineScope, dVar);
                y yVar = y.a;
                hVar.invokeSuspend(yVar);
                return yVar;
            case 1:
                return ((h) create(coroutineScope, dVar)).invokeSuspend(y.a);
            case 2:
                return ((h) create(coroutineScope, dVar)).invokeSuspend(y.a);
            default:
                return ((h) create(coroutineScope, dVar)).invokeSuspend(y.a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        TmdbGenre tmdbGenre;
        Object objDiscoverMovies;
        TmdbGenre tmdbGenre2;
        Object objDiscoverMovies2;
        switch (this.e) {
            case 0:
                kotlin.a.e(obj);
                int i = this.y;
                e0 e0Var = this.z;
                BuildersKt__Builders_commonKt.launch$default(l0.g(e0Var), null, null, new s0(e0Var, i, (kotlin.coroutines.d) null, 1), 3, null);
                return y.a;
            case 1:
                int i2 = this.y;
                e0 e0Var2 = this.z;
                try {
                    if (i2 == 0) {
                        kotlin.a.e(obj);
                        j0 j0Var = e0Var2.b;
                        this.y = 1;
                        objD = j0Var.d(this);
                        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                        if (objD == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                        objD = obj;
                    }
                    e0Var2.i.setValue(o.X(com.google.common.base.c.p(new TmdbGenre()), (List) objD));
                    break;
                } catch (Exception unused) {
                }
                return y.a;
            case 2:
                e0 e0Var3 = this.z;
                MutableStateFlow mutableStateFlow = e0Var3.g;
                MutableStateFlow mutableStateFlow2 = e0Var3.m;
                int i3 = this.y;
                try {
                    if (i3 == 0) {
                        kotlin.a.e(obj);
                        mutableStateFlow2.setValue(Boolean.TRUE);
                        kotlin.k kVarF = e0.f(e0Var3);
                        String str = (String) kVarF.e;
                        String str2 = (String) kVarF.y;
                        j0 j0Var2 = e0Var3.b;
                        int i4 = e0Var3.L + 1;
                        String str3 = (String) e0Var3.s.getValue();
                        Integer num = null;
                        String strValueOf = (str == null && (tmdbGenre = (TmdbGenre) e0Var3.q.getValue()) != null) ? String.valueOf(tmdbGenre.a()) : null;
                        if (str == null) {
                            num = (Integer) e0Var3.u.getValue();
                        }
                        boolean zE = e0.e(e0Var3);
                        this.y = 1;
                        objDiscoverMovies = j0Var2.a.discoverMovies(i4, str3, strValueOf, num, zE, str, str2, this);
                        kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                        if (objDiscoverMovies == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i3 != 1) {
                            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                        objDiscoverMovies = obj;
                    }
                    Set setS = kotlin.sequences.k.s(new n(o.D((Iterable) mutableStateFlow.getValue()), new com.app.mlounge.ui.screens.player.j0(7), 1));
                    List listB = ((TmdbPagedResponse) objDiscoverMovies).b();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listB) {
                        if (!setS.contains(new Integer(((TmdbMovie) obj2).a()))) {
                            arrayList.add(obj2);
                        }
                    }
                    mutableStateFlow.setValue(o.X((Collection) mutableStateFlow.getValue(), arrayList));
                    e0Var3.L++;
                    break;
                } catch (Exception unused2) {
                } finally {
                    mutableStateFlow2.setValue(Boolean.FALSE);
                }
                return y.a;
            default:
                e0 e0Var4 = this.z;
                MutableStateFlow mutableStateFlow3 = e0Var4.o;
                MutableStateFlow mutableStateFlow4 = e0Var4.k;
                int i5 = this.y;
                try {
                    if (i5 == 0) {
                        kotlin.a.e(obj);
                        mutableStateFlow4.setValue(Boolean.TRUE);
                        mutableStateFlow3.setValue(null);
                        kotlin.k kVarF2 = e0.f(e0Var4);
                        String str4 = (String) kVarF2.e;
                        String str5 = (String) kVarF2.y;
                        j0 j0Var3 = e0Var4.b;
                        String str6 = (String) e0Var4.s.getValue();
                        String strValueOf2 = (str4 == null && (tmdbGenre2 = (TmdbGenre) e0Var4.q.getValue()) != null) ? String.valueOf(tmdbGenre2.a()) : null;
                        Integer num2 = str4 == null ? (Integer) e0Var4.u.getValue() : null;
                        boolean zE2 = e0.e(e0Var4);
                        this.y = 1;
                        objDiscoverMovies2 = j0Var3.a.discoverMovies(1, str6, strValueOf2, num2, zE2, str4, str5, this);
                        kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                        if (objDiscoverMovies2 == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i5 != 1) {
                            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                        objDiscoverMovies2 = obj;
                    }
                    TmdbPagedResponse tmdbPagedResponse = (TmdbPagedResponse) objDiscoverMovies2;
                    e0Var4.g.setValue(tmdbPagedResponse.b());
                    e0Var4.M = tmdbPagedResponse.c();
                    e0Var4.L = 1;
                    break;
                } catch (Exception e) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = "Failed to load movies";
                    }
                    mutableStateFlow3.setValue(message);
                    break;
                } finally {
                    mutableStateFlow4.setValue(Boolean.FALSE);
                }
                return y.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(e0 e0Var, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = e0Var;
    }
}
