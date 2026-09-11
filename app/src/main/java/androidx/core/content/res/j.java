package androidx.core.content.res;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import androidx.collection.u;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    /* JADX WARN: Code duplicated, block: B:39:0x00c9  */
    public static Typeface a(Context context, int i, TypedValue typedValue, int i2, b bVar, boolean z, boolean z2) throws Exception {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceA = null;
        if (string.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            u uVar = androidx.core.graphics.f.b;
            Typeface typeface = (Typeface) uVar.h(androidx.core.graphics.f.b(resources, i, string, i3, i2));
            if (typeface != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new androidx.activity.c(2, bVar, typeface));
                }
                typefaceA = typeface;
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        d dVarG = b.g(resources.getXml(i), resources);
                        if (dVarG == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (bVar != null) {
                                bVar.a(-3);
                            }
                        } else {
                            typefaceA = androidx.core.graphics.f.a(context, dVarG, resources, i, string, typedValue.assetCookie, i2, bVar, z);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        Typeface typefaceO = androidx.core.graphics.f.a.o(context, resources, i, string, i2);
                        if (typefaceO != null) {
                            uVar.l(androidx.core.graphics.f.b(resources, i, string, i4, i2), typefaceO);
                        }
                        if (bVar != null) {
                            if (typefaceO != null) {
                                new Handler(Looper.getMainLooper()).post(new androidx.activity.c(2, bVar, typefaceO));
                            } else {
                                bVar.a(-3);
                            }
                        }
                        typefaceA = typefaceO;
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
                    if (bVar != null) {
                        bVar.a(-3);
                    }
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e2);
                    if (bVar != null) {
                        bVar.a(-3);
                    }
                }
            }
        } else if (bVar != null) {
            bVar.a(-3);
        }
        if (typefaceA != null || bVar != null || z2) {
            return typefaceA;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
