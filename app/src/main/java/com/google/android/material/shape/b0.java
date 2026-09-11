package com.google.android.material.shape;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.app.mlounge.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {
    public final int a;
    public final o b;
    public final int[][] c;
    public final o[] d;
    public final z e;
    public final z f;
    public final z g;
    public final z h;

    public b0(a0 a0Var) {
        this.a = a0Var.b;
        this.b = (o) a0Var.c;
        this.c = (int[][]) a0Var.d;
        this.d = (o[]) a0Var.e;
        this.e = (z) a0Var.f;
        this.f = (z) a0Var.g;
        this.g = (z) a0Var.h;
        this.h = (z) a0Var.i;
    }

    public static void a(a0 a0Var, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = com.google.android.material.a.m;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                o oVarA = o.a(context, typedArrayObtainAttributes.getResourceId(0, 0), typedArrayObtainAttributes.getResourceId(1, 0), new a(0)).a();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i3;
                    }
                }
                a0Var.b(StateSet.trimStateSet(iArr2, i), oVarA);
            }
        }
    }

    public static b0 b(Context context, TypedArray typedArray, int i) {
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        a0 a0Var = new a0(0);
        a0Var.e();
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    a(a0Var, context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
                if (a0Var.b == 0) {
                    return null;
                }
                return new b0(a0Var);
            } catch (Throwable th) {
                if (xml != null) {
                    try {
                        xml.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            a0Var.e();
        }
    }

    public final o c() {
        o oVar = this.b;
        z zVar = this.h;
        z zVar2 = this.g;
        z zVar3 = this.f;
        z zVar4 = this.e;
        if (zVar4 == null && zVar3 == null && zVar2 == null && zVar == null) {
            return oVar;
        }
        n nVarF = oVar.f();
        if (zVar4 != null) {
            nVarF.e = zVar4.b;
        }
        if (zVar3 != null) {
            nVarF.f = zVar3.b;
        }
        if (zVar2 != null) {
            nVarF.h = zVar2.b;
        }
        if (zVar != null) {
            nVarF.g = zVar.b;
        }
        return nVarF.a();
    }

    public final boolean d() {
        z zVar;
        z zVar2;
        z zVar3;
        z zVar4;
        return this.a > 1 || ((zVar = this.e) != null && zVar.a > 1) || (((zVar2 = this.f) != null && zVar2.a > 1) || (((zVar3 = this.g) != null && zVar3.a > 1) || ((zVar4 = this.h) != null && zVar4.a > 1)));
    }
}
