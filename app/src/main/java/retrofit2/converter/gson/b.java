package retrofit2.converter.gson;

import androidx.datastore.core.j1;
import com.google.android.material.resources.c;
import com.google.gson.f;
import com.google.gson.n;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import kotlin.text.i;
import okhttp3.c0;
import okhttp3.e0;
import okhttp3.u;
import retrofit2.m;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements m {
    public static final u z;
    public final f e;
    public final n y;

    static {
        i iVar = u.e;
        z = c.h("application/json; charset=UTF-8");
    }

    public b(f fVar, n nVar) {
        this.e = fVar;
        this.y = nVar;
    }

    @Override // retrofit2.m
    public final Object d(Object obj) throws IOException {
        okio.f fVar = new okio.f();
        com.google.gson.stream.b bVarF = this.e.f(new OutputStreamWriter(new j1(fVar), StandardCharsets.UTF_8));
        this.y.c(bVarF, obj);
        bVarF.close();
        okio.i iVarK = fVar.k(fVar.y);
        int i = e0.a;
        iVarK.getClass();
        return new c0(z, iVarK);
    }
}
