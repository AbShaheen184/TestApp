package com.google.android.material.internal;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.widget.x;
import androidx.compose.ui.platform.t1;
import androidx.core.view.r;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.base.q;
import com.google.common.base.s;
import com.google.common.util.concurrent.g0;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.MissingFormatArgumentException;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import okhttp3.internal.connection.n;
import okhttp3.j0;
import org.json.JSONArray;
import org.json.JSONException;
import org.jsoup.nodes.o;
import org.jsoup.nodes.v;
import org.jsoup.parser.f0;
import org.jsoup.select.u;
import retrofit2.m;
import retrofit2.r0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements s, com.google.firebase.crashlytics.internal.analytics.a, com.google.android.gms.tasks.h, u, retrofit2.g, m {
    public final Object e;

    public b(int i, boolean z) {
        switch (i) {
            case 13:
                this.e = new LinkedHashSet();
                break;
            case 14:
            default:
                this.e = new ConcurrentHashMap(16);
                break;
            case 15:
                this.e = new r[3];
                break;
        }
    }

    public static String A(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public static boolean w(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    @Override // com.google.common.base.s
    public Iterator a(t1 t1Var, CharSequence charSequence) {
        return new q(this, t1Var, charSequence, 0);
    }

    @Override // retrofit2.g
    public void b(retrofit2.d dVar, Throwable th) {
        ((CancellableContinuationImpl) this.e).resumeWith(new kotlin.l(th));
    }

    public String c(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            com.google.firebase.encoders.json.d dVar = (com.google.firebase.encoders.json.d) this.e;
            com.google.firebase.encoders.json.e eVar = new com.google.firebase.encoders.json.e(stringWriter, dVar.a, dVar.b, dVar.c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override // retrofit2.m
    public Object d(Object obj) {
        return Optional.ofNullable(((m) this.e).d((j0) obj));
    }

    @Override // com.google.android.gms.tasks.h
    public com.google.android.gms.tasks.q e(Object obj) {
        com.google.firebase.crashlytics.internal.settings.a aVar = (com.google.firebase.crashlytics.internal.settings.a) obj;
        com.google.firebase.crashlytics.internal.common.m mVar = ((com.google.firebase.crashlytics.internal.common.k) this.e).e;
        if (aVar != null) {
            return kotlin.math.a.M(Arrays.asList(com.google.firebase.crashlytics.internal.common.m.a(mVar), mVar.m.l(null, mVar.e.a)));
        }
        Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
        return kotlin.math.a.t(null);
    }

    @Override // org.jsoup.select.u
    public void f(o oVar, int i) {
        char c;
        StringBuilder sb = (StringBuilder) this.e;
        if (oVar instanceof v) {
            org.jsoup.nodes.j.M(sb, (v) oVar);
            return;
        }
        if (oVar instanceof org.jsoup.nodes.j) {
            org.jsoup.nodes.j jVar = (org.jsoup.nodes.j) oVar;
            if (sb.length() > 0) {
                if (!jVar.Y() && !jVar.s("br")) {
                    if (!jVar.A.b(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) || jVar.B.size() <= 0) {
                        return;
                    }
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    o oVarI = jVar;
                    int i2 = 0;
                    while (oVarI != null) {
                        char c2 = 1;
                        if (!(oVarI instanceof v) || org.jsoup.internal.k.f(((v) oVarI).J())) {
                            c = 1;
                        } else {
                            atomicBoolean.set(true);
                            c = 5;
                        }
                        if (c == 5) {
                            break;
                        }
                        if (c != 1 || oVarI.j() <= 0) {
                            while (oVarI.u() == null && i2 > 0) {
                                if (c == 1 || c == 2) {
                                    c = 1;
                                }
                                org.jsoup.nodes.j jVar2 = oVarI.e;
                                i2--;
                                if (c == 4) {
                                    oVarI.F();
                                }
                                c = 1;
                                oVarI = jVar2;
                            }
                            if (c != 1 && c != 2) {
                                c2 = c;
                            }
                            if (oVarI == jVar) {
                                break;
                            }
                            o oVarU = oVarI.u();
                            if (c2 == 4) {
                                oVarI.F();
                            }
                            oVarI = oVarU;
                        } else {
                            oVarI = oVarI.i(0);
                            i2++;
                        }
                    }
                    if (!atomicBoolean.get()) {
                        return;
                    }
                }
                if (v.O(sb)) {
                    return;
                }
                sb.append(' ');
            }
        }
    }

    @Override // retrofit2.g
    public void g(retrofit2.d dVar, r0 r0Var) {
        boolean z = r0Var.a.N;
        CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.e;
        if (z) {
            cancellableContinuationImpl.resumeWith(r0Var.b);
        } else {
            cancellableContinuationImpl.resumeWith(new kotlin.l(new retrofit2.q(r0Var)));
        }
    }

    public void h() {
        Socket socket;
        androidx.compose.ui.graphics.vector.a aVar = (androidx.compose.ui.graphics.vector.a) this.e;
        Iterator it = ((ConcurrentLinkedQueue) aVar.e).iterator();
        it.getClass();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            nVar.getClass();
            synchronized (nVar) {
                if (nVar.q.isEmpty()) {
                    it.remove();
                    nVar.k = true;
                    socket = nVar.e;
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                okhttp3.internal.g.c(socket);
            }
        }
        if (((ConcurrentLinkedQueue) aVar.e).isEmpty()) {
            ((okhttp3.internal.concurrent.c) aVar.c).a();
        }
    }

    @Override // org.jsoup.select.u
    public void i(o oVar, int i) {
        StringBuilder sb = (StringBuilder) this.e;
        if (oVar instanceof org.jsoup.nodes.j) {
            org.jsoup.nodes.j jVar = (org.jsoup.nodes.j) oVar;
            f0 f0Var = jVar.A;
            o oVarU = oVar.u();
            if (!f0Var.b(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) && (f0Var.A & 4) == 0) {
                for (int i2 = 0; i2 < jVar.B.size(); i2++) {
                    o oVarI = jVar.i(i2);
                    if (!(oVarI instanceof org.jsoup.nodes.j) || !((org.jsoup.nodes.j) oVarI).Y()) {
                    }
                }
                return;
            }
            if (((oVarU instanceof v) || ((oVarU instanceof org.jsoup.nodes.j) && (((org.jsoup.nodes.j) oVarU).A.A & 4) == 0)) && !v.O(sb)) {
                sb.append(' ');
            }
        }
    }

    public Object k(String str) throws com.grack.nanojson.d {
        com.grack.nanojson.f fVar = new com.grack.nanojson.f(new StringReader(str));
        x xVar = new x(13, (byte) 0);
        xVar.A = fVar;
        Class cls = (Class) this.e;
        xVar.c(false, false);
        Object objH = xVar.h();
        if (xVar.c(false, false) != 0) {
            throw fVar.e(null, "Expected end of input, got " + xVar.y, true);
        }
        if (cls == Object.class || (objH != null && cls.isAssignableFrom(objH.getClass()))) {
            return cls.cast(objH);
        }
        throw fVar.e(null, "JSON did not contain the correct type, expected " + cls.getSimpleName() + ".", true);
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.a
    public void l(Bundle bundle) {
        ((com.google.firebase.analytics.connector.b) ((com.google.firebase.analytics.connector.a) this.e)).a("clx", "_ae", bundle);
    }

    public boolean m(String str) {
        String strU = u(str);
        return "1".equals(strU) || Boolean.parseBoolean(strU);
    }

    public Integer n(String str) {
        String strU = u(str);
        if (TextUtils.isEmpty(strU)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strU));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + A(str) + "(" + strU + ") into an int");
            return null;
        }
    }

    public JSONArray o(String str) {
        String strU = u(str);
        if (TextUtils.isEmpty(strU)) {
            return null;
        }
        try {
            return new JSONArray(strU);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + A(str) + ": " + strU + ", falling back to default");
            return null;
        }
    }

    public int[] p() {
        JSONArray jSONArrayO = o("gcm.n.light_settings");
        if (jSONArrayO == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayO.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int color = Color.parseColor(jSONArrayO.optString(0));
            if (color == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArrayO.optInt(1);
            iArr[2] = jSONArrayO.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayO + ". " + e.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayO + ". Skipping setting LightSettings");
            return null;
        }
    }

    public Object[] q(String str) {
        JSONArray jSONArrayO = o(str.concat("_loc_args"));
        if (jSONArrayO == null) {
            return null;
        }
        int length = jSONArrayO.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArrayO.optString(i);
        }
        return strArr;
    }

    public String r(String str) {
        return u(str.concat("_loc_key"));
    }

    public Long s() {
        String strU = u("gcm.n.event_time");
        if (TextUtils.isEmpty(strU)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strU));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + A("gcm.n.event_time") + "(" + strU + ") into a long");
            return null;
        }
    }

    public String t(Resources resources, String str, String str2) {
        String strU = u(str2);
        if (!TextUtils.isEmpty(strU)) {
            return strU;
        }
        String strR = r(str2);
        if (TextUtils.isEmpty(strR)) {
            return null;
        }
        int identifier = resources.getIdentifier(strR, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", A(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] objArrQ = q(str2);
        if (objArrQ == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrQ);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + A(str2) + ": " + Arrays.toString(objArrQ) + " Default value will be used.", e);
            return null;
        }
    }

    public String u(String str) {
        Bundle bundle = (Bundle) this.e;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public long[] v() {
        JSONArray jSONArrayO = o("gcm.n.vibrate_timings");
        if (jSONArrayO == null) {
            return null;
        }
        try {
            if (jSONArrayO.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayO.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = jSONArrayO.optLong(i);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayO + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    public Bundle x() {
        Bundle bundle = (Bundle) this.e;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    /* JADX WARN: Instruction removed from duplicated block: B:22:0x005f, please report this as an issue */
    public void y(ByteBuffer byteBuffer, net.luminis.quic.packet.f fVar) {
        int iPosition;
        net.luminis.quic.packet.a aVar = (net.luminis.quic.packet.a) this.e;
        net.luminis.quic.log.a aVar2 = aVar.e;
        while (byteBuffer.remaining() > 0) {
            try {
                net.luminis.quic.packet.g gVarA = aVar.a(byteBuffer);
                aVar2.getClass();
                byteBuffer.position();
                byteBuffer.remaining();
                aVar.d.g(gVarA, new net.luminis.quic.packet.f(fVar, byteBuffer.hasRemaining()));
            } catch (net.luminis.quic.crypto.g e) {
                e = e;
                iPosition = byteBuffer.position();
                if (iPosition == 0) {
                    iPosition = byteBuffer.remaining();
                }
                if (!((Boolean) aVar.g.apply(byteBuffer, e)).booleanValue()) {
                    if ((e instanceof net.luminis.quic.crypto.g) || !androidx.constraintlayout.core.g.b(((net.luminis.quic.crypto.g) e).e, 2)) {
                        aVar2.d("Discarding packet (" + iPosition + " bytes) that cannot be decrypted (" + e + ")");
                    } else {
                        e.getMessage();
                        aVar2.getClass();
                    }
                }
            } catch (net.luminis.quic.impl.b e2) {
                e = e2;
                iPosition = byteBuffer.position();
                if (iPosition == 0) {
                    iPosition = byteBuffer.remaining();
                }
                if (!((Boolean) aVar.g.apply(byteBuffer, e)).booleanValue()) {
                    if (e instanceof net.luminis.quic.crypto.g) {
                        aVar2.d("Discarding packet (" + iPosition + " bytes) that cannot be decrypted (" + e + ")");
                    } else {
                        aVar2.d("Discarding packet (" + iPosition + " bytes) that cannot be decrypted (" + e + ")");
                    }
                }
            } catch (net.luminis.quic.impl.e unused) {
                aVar2.getClass();
                return;
            }
            if (byteBuffer.position() == 0) {
                return;
            } else {
                byteBuffer = byteBuffer.slice();
            }
        }
    }

    public void z(r rVar) {
        int i = 0;
        while (i < 3) {
            r[] rVarArr = (r[]) this.e;
            r rVar2 = rVarArr[i];
            rVarArr[i] = rVar;
            i++;
            rVar = rVar2;
        }
    }

    public b(AppMeasurementSdk appMeasurementSdk, g0 g0Var) {
        this.e = g0Var;
        appMeasurementSdk.a(new com.google.firebase.analytics.connector.internal.b(this, 1));
    }

    public /* synthetic */ b(Object obj) {
        this.e = obj;
    }

    public b(Bundle bundle) {
        if (bundle != null) {
            this.e = new Bundle(bundle);
        } else {
            com.google.gson.b.h("data");
            throw null;
        }
    }

    public b(int i) {
        TimeUnit.MINUTES.getClass();
        okhttp3.internal.concurrent.d dVar = okhttp3.internal.concurrent.d.l;
        dVar.getClass();
        this.e = new androidx.compose.ui.graphics.vector.a(dVar, i);
    }

    public b(com.google.firebase.crashlytics.internal.common.k kVar, String str) {
        this.e = kVar;
    }
}
