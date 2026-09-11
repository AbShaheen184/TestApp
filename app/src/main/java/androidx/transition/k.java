package androidx.transition;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.ColorSpace;
import android.util.Base64;
import androidx.appcompat.widget.c2;
import com.app.mlounge.MainActivity;
import com.app.mlounge.ui.screens.player.a1;
import com.caverock.androidsvg.z1;
import com.google.android.gms.internal.measurement.s1;
import com.google.android.gms.internal.measurement.t1;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements l, androidx.activity.result.b, okhttp3.logging.b, androidx.media3.extractor.q, com.google.android.datatransport.f, com.google.android.datatransport.runtime.scheduling.persistence.e, com.google.android.material.textfield.x, com.google.common.base.t, com.google.firebase.inject.a {
    public final /* synthetic */ int e;

    public /* synthetic */ k(int i) {
        this.e = i;
    }

    public static /* bridge */ /* synthetic */ ColorSpace h(Object obj) {
        return (ColorSpace) obj;
    }

    public static /* synthetic */ void i() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void j(int i, int i2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append((Object) "serialized size must be non-negative, was ");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void k(int i, Object obj, Object obj2, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(i);
        sb.append((Object) " parameters found ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void l(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void m(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void n() {
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void o(String str) throws z1 {
        throw new z1(str);
    }

    public static /* synthetic */ void p() throws s1 {
        throw new s1();
    }

    public static /* synthetic */ void q(String str) throws t1 {
        throw new t1(str);
    }

    @Override // androidx.media3.extractor.q
    public androidx.media3.extractor.n[] a() {
        return new a1[]{new a1(0L)};
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.e
    public Object apply(Object obj) {
        Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorRawQuery.moveToNext()) {
                c2 c2VarA = com.google.android.datatransport.runtime.i.a();
                c2VarA.Y(cursorRawQuery.getString(1));
                c2VarA.A = com.google.android.datatransport.runtime.util.a.b(cursorRawQuery.getInt(2));
                String string = cursorRawQuery.getString(3);
                c2VarA.z = string == null ? null : Base64.decode(string, 0);
                arrayList.add(c2VarA.q());
            }
            return arrayList;
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // androidx.activity.result.b
    public void c(Object obj) {
        ((Boolean) obj).booleanValue();
        int i = MainActivity.G;
    }

    @Override // okhttp3.logging.b
    public void d(String str) {
        kotlin.o oVar = com.app.mlounge.util.a.a;
    }

    @Override // androidx.transition.l
    public void f(j jVar, m mVar) {
        switch (this.e) {
            case 0:
                jVar.d(mVar);
                break;
            case 1:
                jVar.e(mVar);
                break;
            case 2:
                jVar.a();
                break;
            default:
                jVar.f();
                break;
        }
    }

    @Override // com.google.common.base.t
    public Object get() {
        throw new IllegalStateException();
    }

    @Override // com.google.firebase.inject.a
    public void e(com.google.firebase.inject.b bVar) {
    }

    @Override // com.google.android.datatransport.f
    public void g(Exception exc) {
    }
}
