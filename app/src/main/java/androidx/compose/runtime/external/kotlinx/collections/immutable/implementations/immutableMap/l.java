package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import androidx.compose.ui.platform.d1;
import androidx.media3.common.util.j0;
import androidx.media3.common.util.m0;
import androidx.media3.common.util.w;
import androidx.media3.extractor.e0;
import com.caverock.androidsvg.y1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.y;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.c0;
import kotlinx.serialization.json.s;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements e0, y, androidx.core.view.accessibility.n {
    public final /* synthetic */ int e;
    public int y;
    public Object z;

    public l(int i, byte b) {
        this.e = i;
        switch (i) {
            case 7:
                this.z = new LinkedHashMap();
                break;
            default:
                this.z = new w(8);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object a(l lVar, kotlin.b bVar, kotlin.coroutines.jvm.internal.a aVar) {
        kotlinx.serialization.json.internal.l lVar2;
        byte bI;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        l lVar3;
        byte bH;
        androidx.fragment.app.h hVar;
        androidx.fragment.app.h hVar2 = (androidx.fragment.app.h) lVar.z;
        if (aVar instanceof kotlinx.serialization.json.internal.l) {
            lVar2 = (kotlinx.serialization.json.internal.l) aVar;
            int i = lVar2.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                lVar2.D = i - Integer.MIN_VALUE;
            } else {
                lVar2 = new kotlinx.serialization.json.internal.l(lVar, aVar);
            }
        } else {
            lVar2 = new kotlinx.serialization.json.internal.l(lVar, aVar);
        }
        Object obj = lVar2.B;
        int i2 = lVar2.D;
        if (i2 != 0) {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str = lVar2.A;
            linkedHashMap2 = lVar2.z;
            lVar3 = lVar2.y;
            kotlin.b bVar2 = lVar2.e;
            kotlin.a.e(obj);
            linkedHashMap2.put(str, (kotlinx.serialization.json.i) obj);
            bH = ((androidx.fragment.app.h) lVar3.z).h();
            if (bH == 4) {
                bI = bH;
                lVar = lVar3;
                linkedHashMap = linkedHashMap2;
                bVar = bVar2;
            } else if (bH != 7) {
                androidx.fragment.app.h.x((androidx.fragment.app.h) lVar3.z, "Expected end of the object or comma", 0, null, 6);
                throw null;
            }
            hVar = (androidx.fragment.app.h) lVar3.z;
            if (bH == 6) {
                hVar.i((byte) 7);
            } else if (bH == 4) {
                kotlinx.serialization.json.internal.i.f(hVar, "object");
                throw null;
            }
            return new s(linkedHashMap2);
        }
        kotlin.a.e(obj);
        bI = hVar2.i((byte) 6);
        if (hVar2.I() == 4) {
            androidx.fragment.app.h.x(hVar2, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        linkedHashMap = new LinkedHashMap();
        androidx.fragment.app.h hVar3 = (androidx.fragment.app.h) lVar.z;
        if (hVar3.e()) {
            String strL = hVar3.l();
            hVar3.i((byte) 5);
            lVar2.e = bVar;
            lVar2.y = lVar;
            lVar2.z = linkedHashMap;
            lVar2.A = strL;
            lVar2.D = 1;
            bVar.getClass();
            bVar.y = lVar2;
            return kotlin.coroutines.intrinsics.a.e;
        }
        linkedHashMap2 = linkedHashMap;
        lVar3 = lVar;
        bH = bI;
        hVar = (androidx.fragment.app.h) lVar3.z;
        if (bH == 6) {
            hVar.i((byte) 7);
        } else if (bH == 4) {
            kotlinx.serialization.json.internal.i.f(hVar, "object");
            throw null;
        }
        return new s(linkedHashMap2);
    }

    public static l c(Resources resources, int i, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        int i2;
        int i3;
        int color;
        float f;
        float f2;
        int i4;
        Shader.TileMode tileMode;
        Object radialGradient;
        Shader.TileMode tileMode2;
        int i5;
        TypedArray typedArrayObtainStyledAttributes;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            i2 = 1;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        Object obj = null;
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                return new l(obj, androidx.core.content.res.c.b(resources, xml, attributeSetAsAttributeSet, theme).getDefaultColor(), i2);
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        int[] iArr = androidx.core.a.e;
        TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr, 0, 0);
        float f3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayObtainAttributes.getFloat(8, 0.0f) : 0.0f;
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayObtainAttributes.getFloat(9, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayObtainAttributes.getFloat(10, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayObtainAttributes.getFloat(11, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayObtainAttributes.getFloat(3, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayObtainAttributes.getFloat(4, 0.0f) : 0.0f;
        int i6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArrayObtainAttributes.getInt(2, 0) : 0;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayObtainAttributes.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayObtainAttributes.getColor(7, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) {
            i3 = 0;
            color = typedArrayObtainAttributes.getColor(1, 0);
        } else {
            i3 = 0;
            color = 0;
        }
        int i7 = 1;
        int i8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayObtainAttributes.getInt(6, i3) : 0;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayObtainAttributes.getFloat(5, 0.0f) : 0.0f;
        typedArrayObtainAttributes.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f10 = f9;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = f3;
            if (next2 == i7) {
                f2 = f4;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f4;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                int[] iArr2 = androidx.core.a.f;
                if (theme == null) {
                    typedArrayObtainStyledAttributes = resources.obtainAttributes(attributeSetAsAttributeSet, iArr2);
                    i5 = 0;
                } else {
                    i5 = 0;
                    typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr2, 0, 0);
                }
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i5);
                boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayObtainStyledAttributes.getColor(0, 0);
                float f11 = typedArrayObtainStyledAttributes.getFloat(1, 0.0f);
                typedArrayObtainStyledAttributes.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f11));
            }
            f3 = f;
            f4 = f2;
            i7 = 1;
        }
        d1 d1Var = arrayList2.size() > 0 ? new d1(arrayList2, arrayList) : null;
        if (d1Var == null) {
            d1Var = z ? new d1(color2, color3, color) : new d1(color2, color);
        }
        if (i6 != 1) {
            if (i6 != 2) {
                int[] iArr3 = d1Var.a;
                float[] fArr = d1Var.b;
                if (i8 != 1) {
                    tileMode2 = i8 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(f, f2, f5, f6, iArr3, fArr, tileMode2);
            } else {
                radialGradient = new SweepGradient(f7, f8, d1Var.a, d1Var.b);
            }
            i4 = 1;
        } else {
            if (f10 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr4 = d1Var.a;
            float[] fArr2 = d1Var.b;
            i4 = 1;
            if (i8 != 1) {
                tileMode = i8 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f7, f8, f10, iArr4, fArr2, tileMode);
        }
        return new l(radialGradient, 0, i4);
    }

    public static void d(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = kotlin.jvm.internal.l.b(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    public void b() {
        int i = this.y;
        this.y = i + 1;
        if (i >= 10) {
            this.y = 0;
            Iterator it = ((LinkedHashMap) this.z).values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) it.next();
                if (arrayList.size() <= 1) {
                    coil3.memory.f fVar = (coil3.memory.f) kotlin.collections.o.M(arrayList);
                    if ((fVar != null ? (coil3.k) fVar.a.get() : null) == null) {
                        it.remove();
                    }
                } else {
                    int size = arrayList.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = i3 - i2;
                        if (((coil3.memory.f) arrayList.get(i4)).a.get() == null) {
                            arrayList.remove(i4);
                            i2++;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    @Override // com.google.common.util.concurrent.y
    public /* synthetic */ ListenableFuture call() {
        return ((y1) this.z).B0(this.y);
    }

    public void e(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.z;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.z = Arrays.copyOf(cArr, i3);
        }
    }

    public void f(int i, okio.c cVar) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            okio.c cVar2 = ((okio.c[]) this.z)[i2];
            cVar2.getClass();
            if (kotlin.jvm.internal.l.c(0L, cVar.g - cVar2.g) <= 0) {
                break;
            }
            cVar2.f = i;
            ((okio.c[]) this.z)[i] = cVar2;
            i = i2;
        }
        ((okio.c[]) this.z)[i] = cVar;
        cVar.f = i;
    }

    public void g(androidx.sqlite.db.framework.b bVar, int i, int i2) {
        ((androidx.constraintlayout.core.widgets.analyzer.e) this.z).k(new androidx.sqlite.driver.a(bVar), i, i2);
    }

    public kotlinx.serialization.json.i h() {
        kotlinx.serialization.json.i sVar;
        Object obj;
        androidx.fragment.app.h hVar = (androidx.fragment.app.h) this.z;
        byte bI = hVar.I();
        if (bI == 1) {
            return l(true);
        }
        if (bI == 0) {
            return l(false);
        }
        if (bI != 6) {
            if (bI == 8) {
                return i();
            }
            androidx.fragment.app.h.x(hVar, "Cannot read Json element because of unexpected ".concat(kotlinx.serialization.json.internal.i.k(bI)), 0, null, 6);
            throw null;
        }
        int i = this.y + 1;
        this.y = i;
        if (i == 200) {
            kotlinx.serialization.json.internal.k kVar = new kotlinx.serialization.json.internal.k(this, null);
            kotlin.b bVar = new kotlin.b();
            bVar.e = kVar;
            bVar.y = bVar;
            kotlin.coroutines.intrinsics.a aVar = kotlin.a.a;
            bVar.z = aVar;
            while (true) {
                obj = bVar.z;
                kotlin.coroutines.d dVar = bVar.y;
                if (dVar == null) {
                    break;
                }
                if (kotlin.jvm.internal.l.a(aVar, obj)) {
                    try {
                        kotlinx.serialization.json.internal.k kVar2 = bVar.e;
                        c0.c(3, kVar2);
                        kotlinx.serialization.json.internal.k kVar3 = new kotlinx.serialization.json.internal.k(kVar2.z, dVar);
                        kVar3.y = bVar;
                        Object objInvokeSuspend = kVar3.invokeSuspend(kotlin.y.a);
                        if (objInvokeSuspend != kotlin.coroutines.intrinsics.a.e) {
                            dVar.resumeWith(objInvokeSuspend);
                        }
                    } catch (Throwable th) {
                        dVar.resumeWith(new kotlin.l(th));
                    }
                } else {
                    bVar.z = aVar;
                    dVar.resumeWith(obj);
                }
            }
            kotlin.a.e(obj);
            sVar = (kotlinx.serialization.json.i) obj;
        } else {
            byte bI2 = hVar.i((byte) 6);
            if (hVar.I() == 4) {
                androidx.fragment.app.h.x(hVar, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (hVar.e()) {
                String strL = hVar.l();
                hVar.i((byte) 5);
                linkedHashMap.put(strL, h());
                bI2 = hVar.h();
                if (bI2 != 4) {
                    if (bI2 == 7) {
                        break;
                    }
                    androidx.fragment.app.h.x(hVar, "Expected end of the object or comma", 0, null, 6);
                    throw null;
                }
            }
            if (bI2 == 6) {
                hVar.i((byte) 7);
            } else if (bI2 == 4) {
                kotlinx.serialization.json.internal.i.f(hVar, "object");
                throw null;
            }
            sVar = new s(linkedHashMap);
        }
        this.y--;
        return sVar;
    }

    public kotlinx.serialization.json.d i() {
        androidx.fragment.app.h hVar = (androidx.fragment.app.h) this.z;
        byte bH = hVar.h();
        if (hVar.I() == 4) {
            androidx.fragment.app.h.x(hVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (hVar.e()) {
            arrayList.add(h());
            bH = hVar.h();
            if (bH != 4) {
                boolean z = bH == 9;
                int i = hVar.y;
                if (!z) {
                    androidx.fragment.app.h.x(hVar, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (bH == 8) {
            hVar.i((byte) 9);
        } else if (bH == 4) {
            kotlinx.serialization.json.internal.i.f(hVar, "array");
            throw null;
        }
        return new kotlinx.serialization.json.d(arrayList);
    }

    @Override // androidx.core.view.accessibility.n
    public boolean j(View view) {
        ((BottomSheetBehavior) this.z).B(this.y);
        return true;
    }

    public long k(androidx.media3.extractor.k kVar) {
        w wVar = (w) this.z;
        int i = 0;
        kVar.e(wVar.a, 0, 1, false);
        int i2 = wVar.a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        kVar.e(wVar.a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (wVar.a[i] & 255) + (i5 << 8);
        }
        this.y = i4 + 1 + this.y;
        return i5;
    }

    public kotlinx.serialization.json.w l(boolean z) {
        androidx.fragment.app.h hVar = (androidx.fragment.app.h) this.z;
        String strM = !z ? hVar.m() : hVar.l();
        return (z || !kotlin.jvm.internal.l.a(strM, "null")) ? new kotlinx.serialization.json.m(strM, z) : kotlinx.serialization.json.p.INSTANCE;
    }

    public void m() {
        kotlinx.serialization.json.internal.b bVar = kotlinx.serialization.json.internal.b.c;
        char[] cArr = (char[]) this.z;
        bVar.getClass();
        cArr.getClass();
        synchronized (bVar) {
            int i = bVar.b;
            if (cArr.length + i < kotlinx.serialization.json.internal.a.a) {
                bVar.b = i + cArr.length;
                bVar.a.addLast(cArr);
            }
        }
    }

    public void n(okio.c cVar) {
        okio.c cVar2;
        int i = cVar.f;
        if (i == -1) {
            net.luminis.tls.engine.impl.c.o("Failed requirement.");
            return;
        }
        int i2 = this.y;
        okio.c cVar3 = ((okio.c[]) this.z)[i2];
        cVar3.getClass();
        cVar.f = -1;
        ((okio.c[]) this.z)[i2] = null;
        this.y = i2 - 1;
        if (cVar == cVar3) {
            return;
        }
        int iC = kotlin.jvm.internal.l.c(0L, cVar3.g - cVar.g);
        if (iC == 0) {
            ((okio.c[]) this.z)[i] = cVar3;
            cVar3.f = i;
            return;
        }
        if (iC >= 0) {
            f(i, cVar3);
            return;
        }
        while (true) {
            int i3 = i << 1;
            int i4 = i3 + 1;
            int i5 = this.y;
            if (i4 > i5) {
                if (i3 > i5) {
                    break;
                }
                cVar2 = ((okio.c[]) this.z)[i3];
                cVar2.getClass();
            } else {
                cVar2 = ((okio.c[]) this.z)[i3];
                cVar2.getClass();
                okio.c cVar4 = ((okio.c[]) this.z)[i4];
                cVar4.getClass();
                if (kotlin.jvm.internal.l.c(0L, cVar4.g - cVar2.g) >= 0) {
                    cVar2 = cVar4;
                }
            }
            if (kotlin.jvm.internal.l.c(0L, cVar2.g - cVar3.g) <= 0) {
                break;
            }
            int i6 = cVar2.f;
            cVar2.f = i;
            ((okio.c[]) this.z)[i] = cVar2;
            i = i6;
        }
        ((okio.c[]) this.z)[i] = cVar3;
        cVar3.f = i;
    }

    public void o(coil3.memory.a aVar, coil3.k kVar, Map map, long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.z;
        Object arrayList = linkedHashMap.get(aVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(aVar, arrayList);
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        coil3.memory.f fVar = new coil3.memory.f(new WeakReference(kVar), map, j);
        if (arrayList2.isEmpty()) {
            arrayList2.add(fVar);
        } else {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                coil3.memory.f fVar2 = (coil3.memory.f) arrayList2.get(i);
                if (j >= fVar2.c) {
                    if (fVar2.a.get() == kVar) {
                        arrayList2.set(i, fVar);
                        break;
                    } else {
                        arrayList2.add(i, fVar);
                        break;
                    }
                }
            }
        }
        b();
    }

    public void p(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        e(this.y, length);
        str.getChars(0, str.length(), (char[]) this.z, this.y);
        this.y += length;
    }

    public String toString() {
        switch (this.e) {
            case 5:
                com.google.common.primitives.a aVar = (com.google.common.primitives.a) this.z;
                ArrayList arrayList = new ArrayList(aVar.y);
                int i = 0;
                while (true) {
                    int i2 = aVar.y;
                    if (i >= i2) {
                        return "UnsupportedBrands{major=" + j0.c0(this.y) + ", compatible=" + arrayList + "}";
                    }
                    com.google.android.material.motion.a.j(i, i2);
                    arrayList.add(j0.c0(aVar.e[i]));
                    i++;
                }
                break;
            case 12:
                return new String((char[]) this.z, 0, this.y);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ l(Object obj, int i, int i2) {
        this.e = i2;
        this.z = obj;
        this.y = i;
    }

    public l(m0 m0Var, androidx.fragment.app.h hVar) {
        this.e = 13;
        m0Var.getClass();
        this.z = hVar;
    }

    public l(int i, String str) {
        this.e = 11;
        this.y = i;
        this.z = str;
    }

    public /* synthetic */ l(char c, int i) {
        this.e = i;
    }

    public l(int i, int[] iArr) {
        com.google.common.primitives.a aVar;
        this.e = 5;
        this.y = i;
        if (iArr != null) {
            com.google.common.primitives.a aVar2 = com.google.common.primitives.a.z;
            aVar = iArr.length == 0 ? com.google.common.primitives.a.z : new com.google.common.primitives.a(Arrays.copyOf(iArr, iArr.length));
        } else {
            aVar = com.google.common.primitives.a.z;
        }
        this.z = aVar;
    }

    public l(androidx.constraintlayout.core.widgets.analyzer.e eVar, int i) {
        this.e = 6;
        this.z = eVar;
        this.e = 6;
        this.y = i;
    }

    public l(boolean z, boolean z2, boolean z3) {
        this.e = 2;
        this.y = (z || z2 || z3) ? 1 : 0;
    }
}
