package coil3.svg;

import android.util.Log;
import androidx.datastore.preferences.protobuf.h1;
import com.caverock.androidsvg.i2;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.j;
import okio.h;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements kotlin.jvm.internal.g {
    public static final c e = new c();

    public final coil3.memory.c a(h hVar) {
        InputStream inputStreamV = hVar.V();
        i2 i2Var = new i2();
        i2Var.a = null;
        i2Var.b = null;
        i2Var.c = false;
        i2Var.e = false;
        i2Var.f = null;
        i2Var.g = null;
        i2Var.h = false;
        i2Var.i = null;
        if (!inputStreamV.markSupported()) {
            inputStreamV = new BufferedInputStream(inputStreamV);
        }
        try {
            inputStreamV.mark(3);
            int i = inputStreamV.read() + (inputStreamV.read() << 8);
            inputStreamV.reset();
            if (i == 35615) {
                inputStreamV = new BufferedInputStream(new GZIPInputStream(inputStreamV));
            }
        } catch (IOException unused) {
        }
        try {
            inputStreamV.mark(4096);
            i2Var.B(inputStreamV);
            return new coil3.memory.c(i2Var.a);
        } finally {
            try {
                inputStreamV.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }

    @Override // kotlin.jvm.internal.g
    public final kotlin.d b() {
        return new j(1, h1.class, "parseSvg", "parseSvg(Lokio/BufferedSource;)Lcoil3/svg/Svg;", 1);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof c) && (obj instanceof kotlin.jvm.internal.g)) {
            return b().equals(((kotlin.jvm.internal.g) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
