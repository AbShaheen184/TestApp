package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.t0;
import androidx.transition.k;
import java.io.IOException;
import org.jsoup.helper.n;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public d(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        ColorStateList colorStateList;
        int resourceId;
        c cVar = new c(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                } else {
                    org.mozilla.javascript.c.b("Expecting menu, got ".concat(name));
                    return;
                }
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                org.mozilla.javascript.c.b("Unexpected end of document");
                return;
            }
            if (eventType == i) {
                if (!z2) {
                    String name2 = xmlPullParser.getName();
                    boolean zEquals = name2.equals("group");
                    Context context = this.c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.appcompat.a.m);
                        cVar.b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        cVar.c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        cVar.d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        cVar.e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        cVar.f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        cVar.g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, androidx.appcompat.a.n);
                        cVar.i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                        cVar.j = (typedArrayObtainStyledAttributes2.getInt(5, cVar.c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, cVar.d) & 65535);
                        cVar.k = typedArrayObtainStyledAttributes2.getText(7);
                        cVar.l = typedArrayObtainStyledAttributes2.getText(8);
                        cVar.m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes2.getString(9);
                        cVar.n = string == null ? (char) 0 : string.charAt(0);
                        cVar.o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                        String string2 = typedArrayObtainStyledAttributes2.getString(10);
                        cVar.p = string2 == null ? (char) 0 : string2.charAt(0);
                        cVar.q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                        if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                            cVar.r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            cVar.r = cVar.e;
                        }
                        cVar.s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                        cVar.t = typedArrayObtainStyledAttributes2.getBoolean(4, cVar.f);
                        cVar.u = typedArrayObtainStyledAttributes2.getBoolean(1, cVar.g);
                        cVar.v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                        cVar.y = typedArrayObtainStyledAttributes2.getString(12);
                        cVar.w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                        cVar.x = typedArrayObtainStyledAttributes2.getString(15);
                        String string3 = typedArrayObtainStyledAttributes2.getString(14);
                        boolean z3 = string3 != null;
                        if (z3 && cVar.w == 0 && cVar.x == null) {
                            if (cVar.a(string3, f, this.b) != null) {
                                k.i();
                                return;
                            }
                        } else if (z3) {
                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                        }
                        cVar.z = typedArrayObtainStyledAttributes2.getText(17);
                        cVar.A = typedArrayObtainStyledAttributes2.getText(22);
                        if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                            cVar.C = t0.b(typedArrayObtainStyledAttributes2.getInt(19, -1), cVar.C);
                        } else {
                            cVar.C = null;
                        }
                        if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                            if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = n.t(context, resourceId)) == null) {
                                colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                            }
                            cVar.B = colorStateList;
                        } else {
                            cVar.B = null;
                        }
                        typedArrayObtainStyledAttributes2.recycle();
                        cVar.h = false;
                        xmlPullParser = xmlPullParser;
                    } else if (name2.equals("menu")) {
                        cVar.h = true;
                        SubMenu subMenuAddSubMenu = cVar.a.addSubMenu(cVar.b, cVar.i, cVar.j, cVar.k);
                        cVar.b(subMenuAddSubMenu.getItem());
                        xmlPullParser = xmlPullParser;
                        b(xmlPullParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlPullParser = xmlPullParser;
                        str = name2;
                        z2 = true;
                    }
                }
                z = z;
            } else if (eventType != 3) {
                z = z;
            } else {
                String name3 = xmlPullParser.getName();
                if (z2 && name3.equals(str)) {
                    xmlPullParser = xmlPullParser;
                    z2 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        cVar.b = 0;
                        cVar.c = 0;
                        cVar.d = 0;
                        cVar.e = 0;
                        cVar.f = true;
                        cVar.g = true;
                    } else if (name3.equals("item")) {
                        if (!cVar.h) {
                            cVar.h = true;
                            cVar.b(cVar.a.add(cVar.b, cVar.i, cVar.j, cVar.k));
                        }
                    } else if (name3.equals("menu")) {
                        z = true;
                    }
                    z = z;
                }
            }
            eventType = xmlPullParser.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof j)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                j jVar = (j) menu;
                if (!jVar.n) {
                    jVar.s();
                    z = true;
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((j) menu).r();
                }
                layout.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((j) menu).r();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
