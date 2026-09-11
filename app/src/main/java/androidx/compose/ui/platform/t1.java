package androidx.compose.ui.platform;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 {
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public final Object d;
    public final Object e;

    public t1(Context context, p pVar) {
        this.a = 0;
        this.d = pVar;
        this.c = 0;
        this.e = new GestureDetector(context, new s1(this));
    }

    public static t1 b(char c) {
        return new t1(new com.google.android.material.internal.b(new com.google.common.base.d(c)));
    }

    public static t1 c(String str) {
        com.google.android.material.motion.a.e("The separator may not be the empty string.", str.length() != 0);
        return str.length() == 1 ? b(str.charAt(0)) : new t1(new androidx.media3.container.a(str, false));
    }

    public void a(int i) {
        switch (this.a) {
            case 2:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.e;
                WeakReference weakReference = bottomSheetBehavior.W;
                if (weakReference != null && weakReference.get() != null) {
                    this.c = i;
                    if (!this.b) {
                        ((View) bottomSheetBehavior.W.get()).postOnAnimation((androidx.appcompat.widget.z0) this.d);
                        this.b = true;
                    }
                    break;
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.e;
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.c = i;
                    if (!this.b) {
                        ((View) sideSheetBehavior.p.get()).postOnAnimation((com.google.android.datatransport.runtime.scheduling.jobscheduling.k) this.d);
                        this.b = true;
                    }
                    break;
                }
                break;
        }
    }

    public List d(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itA = ((com.google.common.base.s) this.e).a(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            com.google.common.base.q qVar = (com.google.common.base.q) itA;
            if (!qVar.hasNext()) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add((String) qVar.next());
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder(128);
                sb.append("BackStackEntry{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                if (this.c >= 0) {
                    sb.append(" #");
                    sb.append(this.c);
                }
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t1(com.google.common.base.s sVar) {
        this(sVar, false, com.google.common.base.e.y, Integer.MAX_VALUE);
        this.a = 4;
    }

    public t1(androidx.fragment.app.h hVar) {
        this.a = 1;
        hVar.getClass();
        this.d = new ArrayList();
        this.c = -1;
        this.e = hVar;
    }

    public t1(SideSheetBehavior sideSheetBehavior) {
        this.a = 3;
        this.e = sideSheetBehavior;
        this.d = new com.google.android.datatransport.runtime.scheduling.jobscheduling.k(this, 3);
    }

    public t1(BottomSheetBehavior bottomSheetBehavior) {
        this.a = 2;
        this.e = bottomSheetBehavior;
        this.d = new androidx.appcompat.widget.z0(this, 27);
    }

    public t1(com.google.common.base.s sVar, boolean z, com.google.common.base.c cVar, int i) {
        this.a = 4;
        this.e = sVar;
        this.b = z;
        this.d = cVar;
        this.c = i;
    }
}
