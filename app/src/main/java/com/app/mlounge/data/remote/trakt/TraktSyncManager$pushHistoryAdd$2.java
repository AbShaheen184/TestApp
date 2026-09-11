package com.app.mlounge.data.remote.trakt;

import kotlin.a;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.CoroutineScope;
import net.luminis.tls.engine.impl.c;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "com.app.mlounge.data.remote.trakt.TraktSyncManager$pushHistoryAdd$2", f = "TraktSyncManager.kt", l = {192}, m = "invokeSuspend", v = 2)
final class TraktSyncManager$pushHistoryAdd$2 extends i implements p {
    final /* synthetic */ Integer $episode;
    final /* synthetic */ Integer $season;
    final /* synthetic */ int $tmdbId;
    final /* synthetic */ String $traktType;
    int label;
    final /* synthetic */ TraktSyncManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TraktSyncManager$pushHistoryAdd$2(TraktSyncManager traktSyncManager, int i, String str, Integer num, Integer num2, d dVar) {
        super(2, dVar);
        this.this$0 = traktSyncManager;
        this.$tmdbId = i;
        this.$traktType = str;
        this.$season = num;
        this.$episode = num2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new TraktSyncManager$pushHistoryAdd$2(this.this$0, this.$tmdbId, this.$traktType, this.$season, this.$episode, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((TraktSyncManager$pushHistoryAdd$2) create((CoroutineScope) obj, (d) obj2)).invokeSuspend(y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            a.e(obj);
            TraktManager traktManager = this.this$0.traktManager;
            int i2 = this.$tmdbId;
            String str = this.$traktType;
            Integer num = this.$season;
            Integer num2 = this.$episode;
            this.label = 1;
            Object objA = traktManager.a(i2, str, num, num2, this);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a.e(obj);
        }
        return y.a;
    }
}
