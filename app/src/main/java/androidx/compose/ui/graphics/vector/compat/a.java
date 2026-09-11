package androidx.compose.ui.graphics.vector.compat;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.TypedValue;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l;
import com.google.firebase.platforminfo.c;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final XmlPullParser a;
    public int b = 0;
    public final c c;

    public a(XmlResourceParser xmlResourceParser) {
        this.a = xmlResourceParser;
        c cVar = new c();
        cVar.e = new float[64];
        this.c = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    public final l a(TypedArray typedArray, Resources.Theme theme, String str, int i) {
        l lVar;
        if (androidx.core.content.res.b.b(this.a, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 < 28 || i2 > 31) {
                try {
                    lVar = l.c(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
                } catch (Exception e) {
                    Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                    lVar = null;
                }
                if (lVar == null) {
                    lVar = new l((Object) null, 0, 1);
                }
            } else {
                lVar = new l((Object) null, typedValue.data, 1);
            }
        } else {
            lVar = new l((Object) null, 0, 1);
        }
        c(typedArray.getChangingConfigurations());
        return lVar;
    }

    public final float b(TypedArray typedArray, String str, int i, float f) {
        if (androidx.core.content.res.b.b(this.a, str)) {
            f = typedArray.getFloat(i, f);
        }
        c(typedArray.getChangingConfigurations());
        return f;
    }

    public final void c(int i) {
        this.b = i | this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.l.a(this.a, aVar.a) && this.b == aVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.a);
        sb.append(", config=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.s(sb, this.b, ')');
    }
}
