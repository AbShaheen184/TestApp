package androidx.activity.compose;

import android.view.Choreographer;
import com.app.mlounge.ui.components.q0;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.collections.a0;
import kotlin.y;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i, int i2, kotlin.coroutines.d dVar) {
        super(i, dVar);
        this.e = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new n(2, 0, dVar);
            case 1:
                return new n(2, 1, dVar);
            case 2:
                return new n(2, 2, dVar);
            case 3:
                return new n(2, 3, dVar);
            case 4:
                return new n(2, 4, dVar);
            case 5:
                return new n(2, 5, dVar);
            case 6:
                return new n(2, 6, dVar);
            case 7:
                return new n(2, 7, dVar);
            case 8:
                return new n(2, 8, dVar);
            case 9:
                return new n(2, 9, dVar);
            case 10:
                return new n(2, 10, dVar);
            case 11:
                return new n(2, 11, dVar);
            case 12:
                return new n(2, 12, dVar);
            default:
                return new n(2, 13, dVar);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                n nVar = (n) create((Flow) obj, (kotlin.coroutines.d) obj2);
                y yVar = y.a;
                nVar.invokeSuspend(yVar);
                return yVar;
            case 1:
                return ((n) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(y.a);
            case 2:
                n nVar2 = (n) create((FlowCollector) obj, (kotlin.coroutines.d) obj2);
                y yVar2 = y.a;
                nVar2.invokeSuspend(yVar2);
                return yVar2;
            case 3:
                return ((n) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(y.a);
            case 4:
                new n(2, 4, (kotlin.coroutines.d) obj2);
                y yVar3 = y.a;
                kotlin.a.e(yVar3);
                return yVar3;
            case 5:
                ((Boolean) obj).getClass();
                new n(2, 5, (kotlin.coroutines.d) obj2);
                y yVar4 = y.a;
                kotlin.a.e(yVar4);
                return yVar4;
            case 6:
                ((Boolean) obj).getClass();
                new n(2, 6, (kotlin.coroutines.d) obj2);
                y yVar5 = y.a;
                kotlin.a.e(yVar5);
                return yVar5;
            case 7:
                new n(2, 7, (kotlin.coroutines.d) obj2);
                y yVar6 = y.a;
                kotlin.a.e(yVar6);
                return yVar6;
            case 8:
                new n(2, 8, (kotlin.coroutines.d) obj2);
                y yVar7 = y.a;
                kotlin.a.e(yVar7);
                return yVar7;
            case 9:
                ((Boolean) obj).getClass();
                new n(2, 9, (kotlin.coroutines.d) obj2);
                y yVar8 = y.a;
                kotlin.a.e(yVar8);
                return yVar8;
            case 10:
                new n(2, 10, (kotlin.coroutines.d) obj2);
                y yVar9 = y.a;
                kotlin.a.e(yVar9);
                return yVar9;
            case 11:
                new n(2, 11, (kotlin.coroutines.d) obj2);
                y yVar10 = y.a;
                kotlin.a.e(yVar10);
                return yVar10;
            case 12:
                new n(2, 12, (kotlin.coroutines.d) obj2);
                y yVar11 = y.a;
                kotlin.a.e(yVar11);
                return yVar11;
            default:
                ((Boolean) obj).getClass();
                new n(2, 13, (kotlin.coroutines.d) obj2);
                y yVar12 = y.a;
                kotlin.a.e(yVar12);
                return yVar12;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        y yVar = y.a;
        switch (i) {
            case 0:
                kotlin.a.e(obj);
                return yVar;
            case 1:
                kotlin.a.e(obj);
                return Choreographer.getInstance();
            case 2:
                kotlin.a.e(obj);
                return yVar;
            case 3:
                kotlin.a.e(obj);
                try {
                    URLConnection uRLConnectionOpenConnection = new URL("https://cinemahq.app/v/version.json").openConnection();
                    uRLConnectionOpenConnection.getClass();
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setReadTimeout(10000);
                    httpURLConnection.setRequestMethod("GET");
                    InputStream inputStream = httpURLConnection.getInputStream();
                    inputStream.getClass();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, kotlin.text.a.a), 8192);
                    try {
                        String strB = a0.B(bufferedReader);
                        bufferedReader.close();
                        httpURLConnection.disconnect();
                        JSONObject jSONObject = new JSONObject(strB);
                        int i2 = jSONObject.getInt("Version");
                        String string = jSONObject.getString("Changelog");
                        string.getClass();
                        return new q0(i2, string);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            com.google.common.base.b.d(bufferedReader, th);
                            throw th2;
                        }
                    }
                } catch (Exception unused) {
                    return null;
                }
            case 4:
                kotlin.a.e(obj);
                return yVar;
            case 5:
                kotlin.a.e(obj);
                return yVar;
            case 6:
                kotlin.a.e(obj);
                return yVar;
            case 7:
                kotlin.a.e(obj);
                return yVar;
            case 8:
                kotlin.a.e(obj);
                return yVar;
            case 9:
                kotlin.a.e(obj);
                return yVar;
            case 10:
                kotlin.a.e(obj);
                return yVar;
            case 11:
                kotlin.a.e(obj);
                return yVar;
            case 12:
                kotlin.a.e(obj);
                return yVar;
            default:
                kotlin.a.e(obj);
                return yVar;
        }
    }
}
