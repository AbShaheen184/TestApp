package com.app.mlounge.data.iptv;

import com.app.mlounge.data.remote.model.IptvChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import okhttp3.g0;
import okhttp3.j0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class EarthCamProvider {
    private static final String EARTHCAM_API_URL = "https://chq-api.ddns.me/api/earthcam";
    private static final String TAG = "EarthCam";
    private static final String UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36";
    private final okhttp3.y client;
    private final kotlin.text.i domainRegex;
    private final com.google.gson.f gson;
    private final kotlin.text.i pathRegex;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final List<String> SOURCES = com.google.common.base.c.q("https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=AK", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=AZ", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=CA", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=CO", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=CT", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=DC", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=FL", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=GA", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=HI", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=ID", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=IL", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=IN", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=IA", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=KY", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=LA", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=ME", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=MD", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=MA", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=MI", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=MN", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=MS", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=MO", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=MT", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=NE", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=NV", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=NH", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=NJ", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=NM", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=NY", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=NC", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=ND", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=OH", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=OK", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=OR", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=PA", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=SC", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=TN", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=TX", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=UT", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=VT", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=VA", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=WA", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=WI", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=US&state=WY", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=Anguilla&state=undefined", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=Aruba&state=undefined", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=Bahamas&state=undefined", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=Bermuda&state=undefined", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=Botswana&state=undefined", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=Canada&state=undefined", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=Cayman%20Islands&state=undefined", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=Costa%20Rica&state=undefined", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=England&state=undefined", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=Georgia&state=undefined", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=Germany&state=undefined", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=Honduras&state=undefined", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=Hong%20Kong&state=undefined", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=Hungary&state=undefined", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=Indonesia&state=undefined", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=Ireland&state=undefined", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=Israel&state=undefined", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=Italy&state=undefined", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=Jamaica&state=undefined", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=Netherlands&state=undefined", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=New%20Zealand&state=undefined", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=Northern%20Mariana%20Islands&state=undefined", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=Peru&state=undefined", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=Puerto%20Rico&state=undefined", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=Russian%20Federation&state=undefined", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=Sint%20Maarten&state=undefined", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=South%20Africa&state=undefined", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=South%20Korea&state=undefined", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=Spain&state=undefined", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=Taiwan&state=undefined", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=Tanzania&state=undefined", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=Virgin%20Islands%2C%20British&state=undefined", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=Virgin%20Islands%2C%20U.S.&state=undefined", "https://www.earthcam.com/api/dotcom/network_search.php?r=ecn&a=fetch&country=Wales&state=undefined");

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class EarthCamStreamResult {
        public static final int $stable = 8;
        private final Map<String, String> headers;
        private final String url;

        public EarthCamStreamResult(String str, Map<String, String> map) {
            str.getClass();
            map.getClass();
            this.url = str;
            this.headers = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EarthCamStreamResult copy$default(EarthCamStreamResult earthCamStreamResult, String str, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = earthCamStreamResult.url;
            }
            if ((i & 2) != 0) {
                map = earthCamStreamResult.headers;
            }
            return earthCamStreamResult.copy(str, map);
        }

        public final String component1() {
            return this.url;
        }

        public final Map<String, String> component2() {
            return this.headers;
        }

        public final EarthCamStreamResult copy(String str, Map<String, String> map) {
            str.getClass();
            map.getClass();
            return new EarthCamStreamResult(str, map);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EarthCamStreamResult)) {
                return false;
            }
            EarthCamStreamResult earthCamStreamResult = (EarthCamStreamResult) obj;
            return kotlin.jvm.internal.l.a(this.url, earthCamStreamResult.url) && kotlin.jvm.internal.l.a(this.headers, earthCamStreamResult.headers);
        }

        public final Map<String, String> getHeaders() {
            return this.headers;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.headers.hashCode() + (this.url.hashCode() * 31);
        }

        public String toString() {
            return "EarthCamStreamResult(url=" + this.url + ", headers=" + this.headers + ")";
        }
    }

    /* JADX INFO: renamed from: com.app.mlounge.data.iptv.EarthCamProvider$fetchAllCams$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "com.app.mlounge.data.iptv.EarthCamProvider$fetchAllCams$2", f = "EarthCamProvider.kt", l = {199, 209}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        public AnonymousClass2(kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<kotlin.y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return EarthCamProvider.this.new AnonymousClass2(dVar);
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(CoroutineScope coroutineScope, kotlin.coroutines.d<? super List<IptvChannel>> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0072  */
        /* JADX WARN: Code duplicated, block: B:20:0x0099  */
        /* JADX WARN: Code duplicated, block: B:21:0x009a A[Catch: Exception -> 0x0044, PHI: r0 r5 r6 r7 r8 r13
  0x009a: PHI (r0v8 int) = (r0v9 int), (r0v10 int) binds: [B:19:0x0097, B:10:0x0040] A[DONT_GENERATE, DONT_INLINE]
  0x009a: PHI (r5v3 int) = (r5v4 int), (r5v5 int) binds: [B:19:0x0097, B:10:0x0040] A[DONT_GENERATE, DONT_INLINE]
  0x009a: PHI (r6v4 java.util.Iterator) = (r6v5 java.util.Iterator), (r6v9 java.util.Iterator) binds: [B:19:0x0097, B:10:0x0040] A[DONT_GENERATE, DONT_INLINE]
  0x009a: PHI (r7v3 java.util.Set) = (r7v4 java.util.Set), (r7v6 java.util.Set) binds: [B:19:0x0097, B:10:0x0040] A[DONT_GENERATE, DONT_INLINE]
  0x009a: PHI (r8v3 java.util.List) = (r8v4 java.util.List), (r8v6 java.util.List) binds: [B:19:0x0097, B:10:0x0040] A[DONT_GENERATE, DONT_INLINE]
  0x009a: PHI (r13v12 java.lang.Object) = (r13v19 java.lang.Object), (r13v0 java.lang.Object) binds: [B:19:0x0097, B:10:0x0040] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0044, blocks: (B:18:0x007a, B:21:0x009a, B:22:0x00a0, B:24:0x00a6, B:26:0x00b2, B:27:0x00b6, B:29:0x00bc, B:10:0x0040), top: B:40:0x0040 }] */
        /* JADX WARN: Code duplicated, block: B:24:0x00a6 A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:18:0x007a, B:21:0x009a, B:22:0x00a0, B:24:0x00a6, B:26:0x00b2, B:27:0x00b6, B:29:0x00bc, B:10:0x0040), top: B:40:0x0040 }] */
        /* JADX WARN: Code duplicated, block: B:26:0x00b2 A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:18:0x007a, B:21:0x009a, B:22:0x00a0, B:24:0x00a6, B:26:0x00b2, B:27:0x00b6, B:29:0x00bc, B:10:0x0040), top: B:40:0x0040 }] */
        /* JADX WARN: Code duplicated, block: B:34:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:37:0x0104  */
        /* JADX WARN: Code duplicated, block: B:44:0x00bc A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:46:0x00a0 A[SYNTHETIC] */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 269
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.iptv.EarthCamProvider.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.app.mlounge.data.iptv.EarthCamProvider$fetchFromApi$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "com.app.mlounge.data.iptv.EarthCamProvider$fetchFromApi$2", f = "EarthCamProvider.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C00062 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
        int label;

        public C00062(kotlin.coroutines.d<? super C00062> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<kotlin.y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return EarthCamProvider.this.new C00062(dVar);
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(CoroutineScope coroutineScope, kotlin.coroutines.d<? super List<IptvChannel>> dVar) {
            return ((C00062) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String strZ;
            kotlin.collections.u uVar = kotlin.collections.u.e;
            if (this.label != 0) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
            try {
                kotlin.o oVar = com.app.mlounge.util.a.a;
                okhttp3.a0 a0Var = new okhttp3.a0();
                a0Var.d(EarthCamProvider.EARTHCAM_API_URL);
                a0Var.b("User-Agent", EarthCamProvider.UA);
                a0Var.b("Accept", "application/json");
                okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
                okhttp3.y yVar = EarthCamProvider.this.client;
                yVar.getClass();
                g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
                EarthCamProvider earthCamProvider = EarthCamProvider.this;
                try {
                    if (g0VarE.N) {
                        j0 j0Var = g0VarE.D;
                        if (j0Var != null && (strZ = j0Var.z()) != null) {
                            EarthCamApiResponse earthCamApiResponse = (EarthCamApiResponse) earthCamProvider.gson.d(EarthCamApiResponse.class, strZ);
                            if (earthCamApiResponse.getStatus() == 200 && !earthCamApiResponse.getData().isEmpty()) {
                                earthCamApiResponse.getData().size();
                                List<IptvChannel> data = earthCamApiResponse.getData();
                                g0VarE.close();
                                return data;
                            }
                            com.app.mlounge.util.a.f(EarthCamProvider.TAG, "API returned status " + earthCamApiResponse.getStatus() + ", " + earthCamApiResponse.getData().size() + " cams");
                        }
                    } else {
                        com.app.mlounge.util.a.f(EarthCamProvider.TAG, "API HTTP " + g0VarE.A);
                    }
                    g0VarE.close();
                    return uVar;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        com.google.common.base.b.d(g0VarE, th);
                        throw th2;
                    }
                }
            } catch (Exception e) {
                kotlin.o oVar2 = com.app.mlounge.util.a.a;
                coil3.compose.internal.f.i("Error fetching from API: ", e.getMessage(), EarthCamProvider.TAG);
                return uVar;
            }
        }
    }

    /* JADX INFO: renamed from: com.app.mlounge.data.iptv.EarthCamProvider$resolveStream$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @kotlin.coroutines.jvm.internal.e(c = "com.app.mlounge.data.iptv.EarthCamProvider$resolveStream$2", f = "EarthCamProvider.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C00072 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
        final /* synthetic */ String $pageUrl;
        int label;
        final /* synthetic */ EarthCamProvider this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00072(String str, EarthCamProvider earthCamProvider, kotlin.coroutines.d<? super C00072> dVar) {
            super(2, dVar);
            this.$pageUrl = str;
            this.this$0 = earthCamProvider;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<kotlin.y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C00072(this.$pageUrl, this.this$0, dVar);
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(CoroutineScope coroutineScope, kotlin.coroutines.d<? super EarthCamStreamResult> dVar) {
            return ((C00072) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String strZ;
            if (this.label != 0) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
            try {
                kotlin.o oVar = com.app.mlounge.util.a.a;
                okhttp3.a0 a0Var = new okhttp3.a0();
                a0Var.d(this.$pageUrl);
                a0Var.b("User-Agent", EarthCamProvider.UA);
                a0Var.b("Accept", "text/html");
                a0Var.b("Referer", "https://www.earthcam.com/");
                okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
                okhttp3.y yVar = this.this$0.client;
                yVar.getClass();
                g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
                EarthCamProvider earthCamProvider = this.this$0;
                try {
                    if (g0VarE.N) {
                        j0 j0Var = g0VarE.D;
                        if (j0Var != null && (strZ = j0Var.z()) != null) {
                            kotlin.text.g gVarA = earthCamProvider.domainRegex.a(strZ);
                            kotlin.text.g gVarA2 = earthCamProvider.pathRegex.a(strZ);
                            if (gVarA != null && gVarA2 != null) {
                                EarthCamStreamResult earthCamStreamResult = new EarthCamStreamResult(kotlin.text.r.M((String) ((kotlin.collections.b0) gVarA.a()).get(1), "\\/", "/", false).concat(kotlin.text.r.M((String) ((kotlin.collections.b0) gVarA2.a()).get(1), "\\/", "/", false)), kotlin.collections.a0.v(new kotlin.k("Origin", "https://www.earthcam.com"), new kotlin.k("Referer", "https://www.earthcam.com/")));
                                g0VarE.close();
                                return earthCamStreamResult;
                            }
                            com.app.mlounge.util.a.f(EarthCamProvider.TAG, "Could not find stream fields in page");
                        }
                    } else {
                        com.app.mlounge.util.a.f(EarthCamProvider.TAG, "Resolve HTTP " + g0VarE.A);
                    }
                    g0VarE.close();
                    return null;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        com.google.common.base.b.d(g0VarE, th);
                        throw th2;
                    }
                }
            } catch (Exception e) {
                kotlin.o oVar2 = com.app.mlounge.util.a.a;
                coil3.compose.internal.f.i("Error resolving stream: ", e.getMessage(), EarthCamProvider.TAG);
                return null;
            }
        }
    }

    public EarthCamProvider(okhttp3.y yVar) {
        yVar.getClass();
        this.client = yVar;
        this.gson = new com.google.gson.f();
        this.domainRegex = new kotlin.text.i("\"html5_streamingdomain\"\\s*:\\s*\"([^\"]+)\"");
        this.pathRegex = new kotlin.text.i("\"html5_streampath\"\\s*:\\s*\"([^\"]+)\"");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<IptvChannel> fetchSource(String str) {
        String strZ;
        IptvChannel iptvChannel;
        String string;
        String url;
        String string2;
        okhttp3.a0 a0Var = new okhttp3.a0();
        a0Var.d(str);
        a0Var.b("User-Agent", UA);
        a0Var.b("Accept", "application/json");
        a0Var.b("Referer", "https://www.earthcam.com/");
        okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
        okhttp3.y yVar = this.client;
        yVar.getClass();
        g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
        try {
            boolean z = g0VarE.N;
            kotlin.collections.u uVar = kotlin.collections.u.e;
            if (!z) {
                g0VarE.close();
                return uVar;
            }
            j0 j0Var = g0VarE.D;
            if (j0Var != null && (strZ = j0Var.z()) != null) {
                EarthCamSourceResponse earthCamSourceResponse = (EarthCamSourceResponse) this.gson.d(EarthCamSourceResponse.class, strZ);
                if (kotlin.jvm.internal.l.a(earthCamSourceResponse.getStatus(), "200")) {
                    EarthCamSourceData data = earthCamSourceResponse.getData();
                    if ((data != null ? data.getCamItems() : null) != null) {
                        List<EarthCamCamItem> camItems = earthCamSourceResponse.getData().getCamItems();
                        ArrayList arrayList = new ArrayList();
                        for (EarthCamCamItem earthCamCamItem : camItems) {
                            String title = earthCamCamItem.getTitle();
                            if (title == null || (string = kotlin.text.k.A0(title).toString()) == null || (url = earthCamCamItem.getUrl()) == null || (string2 = kotlin.text.k.A0(url).toString()) == null) {
                                iptvChannel = null;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                String city = earthCamCamItem.getCity();
                                if (city != null) {
                                    sb.append(city);
                                }
                                String stateFull = earthCamCamItem.getStateFull();
                                if (stateFull == null && (stateFull = earthCamCamItem.getState()) == null) {
                                    stateFull = earthCamCamItem.getCountry();
                                }
                                if (stateFull != null && !stateFull.equals("undefined")) {
                                    if (sb.length() > 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(stateFull);
                                }
                                String string3 = sb.toString();
                                if (string3.length() == 0) {
                                    string3 = "Unknown";
                                }
                                String str2 = string3;
                                String thumbnailLarge = earthCamCamItem.getThumbnailLarge();
                                if (thumbnailLarge == null) {
                                    thumbnailLarge = earthCamCamItem.getThumbnail();
                                }
                                iptvChannel = new IptvChannel(string, string2, thumbnailLarge, str2, "earthcam", earthCamCamItem.getId());
                            }
                            if (iptvChannel != null) {
                                arrayList.add(iptvChannel);
                            }
                        }
                        g0VarE.close();
                        return arrayList;
                    }
                }
                g0VarE.close();
                return uVar;
            }
            g0VarE.close();
            return uVar;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                com.google.common.base.b.d(g0VarE, th);
                throw th2;
            }
        }
    }

    @kotlin.c
    public final Object fetchAllCams(kotlin.coroutines.d<? super List<IptvChannel>> dVar) {
        return SupervisorKt.supervisorScope(new AnonymousClass2(null), dVar);
    }

    public final Object fetchFromApi(kotlin.coroutines.d<? super List<IptvChannel>> dVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C00062(null), dVar);
    }

    public final Object resolveStream(String str, kotlin.coroutines.d<? super EarthCamStreamResult> dVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C00072(str, this, null), dVar);
    }

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final List<String> getSOURCES() {
            return EarthCamProvider.SOURCES;
        }

        private Companion() {
        }
    }
}
